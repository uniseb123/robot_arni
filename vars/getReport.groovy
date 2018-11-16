def call(){
    currentBuild.result = "SUCCESS"
    rtp parserName: 'HTML', stableText: "<a href='www.google.pl'>RAPORT</a>"
    rtp parserName: 'HTML', stableText: "<a href='www.google.pl'>DANE WEJSCIOWE</a>"

    rtp parserName: 'HTML', stableText: "<br><br>LOGS: "
    String basetRow = ""
    String stableText = ""
    
    stableText += "<br><br><b>ROW 1</b>"
    stableText += "<br><b>WINDOWS</b>"
    stableText += "<br><a href='www.google.pl'>Logowanie</a>"
    stableText += "<br><a href='www.google.pl'>Weryfikacja kontrahenta</a>"
    stableText += "<br><a href='www.google.pl'>Zmiany na koncie</a>"
    stableText += "<br><b>LINUX</b>"
    stableText += "<br><a href='www.google.pl'>Logowanie SAP</a>"
    stableText += "<br><a href='www.google.pl'>Ksiegowanie</a>"
    stableText += "<br><a href='www.google.pl'>Zapisanie</a>"
    
    stableText += "<br><br><b>ROW 2</b>"
    stableText += "<br><b>WINDOWS</b>"
    stableText += "<br><a href='www.google.pl'>Logowanie</a>"
    stableText += "<br><a href='www.google.pl'>Weryfikacja kontrahenta</a>"
    stableText += "<br><a href='www.google.pl'>Zmiany na koncie</a>"
    stableText += "<br><b>LINUX</b>"
    stableText += "<br><a href='www.google.pl'>Logowanie SAP</a>"
    stableText += "<br><a href='www.google.pl'>Ksiegowanie</a>"
    stableText += "<br><a href='www.google.pl'>Zapisanie</a>"
    
    stableText += "<br><br><b>ROW 3</b>"
    stableText += "<br><b>WINDOWS</b>"
    stableText += "<br><a href='www.google.pl'>Logowanie</a>"
    stableText += "<br><a href='www.google.pl'>Weryfikacja kontrahenta</a>"
    stableText += "<br><a href='www.google.pl'>Zmiany na koncie</a>"
    stableText += "<br><b>LINUX</b>"
    stableText += "<br><a href='www.google.pl'>Logowanie SAP</a>"
    stableText += "<br><a href='www.google.pl'>Ksiegowanie</a>"
    stableText += "<br><a href='www.google.pl'>Zapisanie</a>"
    

    rtp parserName: 'HTML', stableText: "${stableText}"
}
