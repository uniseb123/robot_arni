def call(String filePath, String excelFileArchived, Map rationalLogs){
    currentBuild.result = "SUCCESS"
    rtp parserName: 'HTML', stableText: "<a href='${filePath}'>RAPORT</a>"
    rtp parserName: 'HTML', stableText: "<a href='${excelFileArchived}'>DANE WEJSCIOWE</a>"

    rtp parserName: 'HTML', stableText: "<br><br>LOGS: "
    String basetRow = ""
    String stableText = ""
    
    stableText += "<br><br><b>ROW 1</b>"
    stableText += "<br><br><b>WINDOWS</b>"
    stableText += "<br><a href='${rationalLog.value}'>Logowanie</a>"
    stableText += "<br><a href='${rationalLog.value}'>Weryfikacja kontrahenta</a>"
    stableText += "<br><a href='${rationalLog.value}'>Zmiany na koncie</a>"
    stableText += "<br><b>LINUX</b>"
    stableText += "<br><a href='${rationalLog.value}'>Logowanie SAP</a>"
    stableText += "<br><a href='${rationalLog.value}'>Ksiegowanie</a>"
    stableText += "<br><a href='${rationalLog.value}'>Zapisanie</a>"
    
    stableText += "<br><br><b>ROW 1</b>"
    stableText += "<br><b>WINDOWS</b>"
    stableText += "<br><a href='${rationalLog.value}'>Logowanie</a>"
    stableText += "<br><a href='${rationalLog.value}'>Weryfikacja kontrahenta</a>"
    stableText += "<br><a href='${rationalLog.value}'>Zmiany na koncie</a>"
    stableText += "<br><b>LINUX</b>"
    stableText += "<br><a href='${rationalLog.value}'>Logowanie SAP</a>"
    stableText += "<br><a href='${rationalLog.value}'>Ksiegowanie</a>"
    stableText += "<br><a href='${rationalLog.value}'>Zapisanie</a>"
    
    stableText += "<br><br><b>ROW 2</b>"
    stableText += "<br><b>WINDOWS</b>"
    stableText += "<br><a href='${rationalLog.value}'>Logowanie</a>"
    stableText += "<br><a href='${rationalLog.value}'>Weryfikacja kontrahenta</a>"
    stableText += "<br><a href='${rationalLog.value}'>Zmiany na koncie</a>"
    stableText += "<br><b>LINUX</b>"
    stableText += "<br><a href='${rationalLog.value}'>Logowanie SAP</a>"
    stableText += "<br><a href='${rationalLog.value}'>Ksiegowanie</a>"
    stableText += "<br><a href='${rationalLog.value}'>Zapisanie</a>"
    
    stableText += "<br><br><b>ROW 3</b>"
    stableText += "<br><b>WINDOWS</b>"
    stableText += "<br><a href='${rationalLog.value}'>Logowanie</a>"
    stableText += "<br><a href='${rationalLog.value}'>Weryfikacja kontrahenta</a>"
    stableText += "<br><a href='${rationalLog.value}'>Zmiany na koncie</a>"
    stableText += "<br><b>LINUX</b>"
    stableText += "<br><a href='${rationalLog.value}'>Logowanie SAP</a>"
    stableText += "<br><a href='${rationalLog.value}'>Ksiegowanie</a>"
    stableText += "<br><a href='${rationalLog.value}'>Zapisanie</a>
    

    rtp parserName: 'HTML', stableText: "${stableText}"
}
