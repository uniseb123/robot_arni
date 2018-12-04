def call(int currentRow){
    prepareDataBase(currentRow)
    println bat(script:"runRobot.bat ${currentRow}", returnStdout: true)
}
