/**
 * Created by sebwent on 01/04/2019.
 */
// https://mvnrepository.com/artifact/commons-io/commons-io
@Grapes(
        @Grab(group='commons-io', module='commons-io', version='2.6')
)

import groovy.json.JsonSlurper
import groovy.json.JsonOutput
import org.apache.commons.io.*


def call(String issueKey, int result, String testFile){

    try {

        def now = new Date()
        def timestamp = now.format("yyyyMMddHHmmssSSS").toString()

        String source = "C:\\Projects\\Proces_Testowy\\Demo\\WindowsA\\workspace\\TwojaPolisa\\report";
        File srcDir = new File(source);

        String destination = "C:\\tmp\\atlassian\\${timestamp}_report\\";
        File destDir = new File(destination);

        try {
            FileUtils.copyDirectory(srcDir, destDir);
        } catch (IOException e) {
            e.printStackTrace();
        }


        def json = JsonOutput.toJson([issueKey: "$issueKey", result: "$result", testFile: "$testFile", report: "$destination\\WeryfikacjaKosztowWariantowTest.html"])
        def http = new URL("http://localhost:8080/rest/scriptrunner/latest/custom/setTestResult").openConnection() as HttpURLConnection
        http.setRequestMethod('POST')
        http.setDoOutput(true)
        http.setRequestProperty("Accept", 'application/json')
        http.setRequestProperty("Content-Type", 'application/json')

        http.outputStream.write(json.getBytes("UTF-8"))
        http.connect()

        def response = [:]

        if (http.responseCode == 200) {
            response = new JsonSlurper().parseText(http.inputStream.getText('UTF-8'))
        } else {
            response = new JsonSlurper().parseText(http.errorStream.getText('UTF-8'))
        }

        println "response: ${response}"
    } catch (Exception e) {
        throw e
    }
}