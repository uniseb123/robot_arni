/**
 * Created by sebwent on 01/04/2019.
 */

import groovy.json.JsonSlurper
import groovy.json.JsonOutput

def call(String issueKey, int result, String testFile){

    try {

        def json = JsonOutput.toJson([issueKey: "$issueKey", result: "$result", testFile: "$testFile"])
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

this.call("PTU-1", 1, "asd")