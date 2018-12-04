def call(int currentRow){
    prepareDataBase(currentRow)
    println "Database prepared for ${currentRow}"
    println bat(script:"runRobot.bat ${currentRow}", returnStdout: true)
}
