class App {

    private var studentScore = 0
    private var totalStudent = 0

    fun run() {
        printHeader()
        inputTotalStudent()
        checkInputTotalStudent(totalStudent)
        calculateScoreStudent()
        printResult()
    }

    private fun printHeader() {
        println("=============================================")
        println("Aplikasi Penghitung Rata-Rata Nilai Mahasiswa")
        println("=============================================")
    }

    private fun inputTotalStudent() {
        println("Masukkan Jumlah Mahasiswa ?")
        totalStudent = try {
            readLine()?.toInt() ?: 0
        } catch (e: NumberFormatException) {
            0
        }
    }

    private fun checkInputTotalStudent(totalStudent: Int) {
        if (totalStudent <= 0) {
            println("Nilai Tidak Valid, Silahkan Masukkan Jumlah Mahasiswa Berupa Angka !")
            inputTotalStudent()
            checkInputTotalStudent(this.totalStudent)
        }
    }

    private fun calculateScoreStudent() {
        for (index in 1..totalStudent) {
            println("Masukkan Nilai Mahasiswa Ke-$index?")
            val score = readLine()?.toInt() ?: 0
            studentScore += score // -> studentScore = studentScore + score
        }
    }

    private fun printResult() {
        println("-----------------------------------")
        println("Total Mahasiswa = $totalStudent")
        println("Total Nilai = $studentScore")
        println("Rata-Rata Nilai Mahasiswa = ${studentScore/totalStudent}")
        println("-----------------------------------")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().run()
        }
    }
}