def call(int currentRow){
    prepareDataBase(currentRow, script)
    println "Database prepared for ${currentRow}"
    println bat(script:"runRobot.bat ${currentRow}", returnStdout: true)
}
