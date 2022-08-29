import model.Student
import utils.IOUtils

class App {

    private val student : MutableList<Student> = mutableListOf()

    private fun printHeader(){
        println("=============================")
        println("Siswa Score App")
        println("=============================")
    }

    private fun inputDataStudent(){
        println("Masukkan total Siswa")
        val totalStudent = IOUtils.readInt()
        println("------------------------------")
        var scoreStudent = 0.0
        for (index in 1..totalStudent){
            println("Masukkan siswa ke - $index")
            println("Nama Siswa : ")
            val nameStudent = IOUtils.readString()

            do {

                println("Score Siswa : $nameStudent")
                scoreStudent = IOUtils.readDouble()

                if(scoreStudent < 0 || scoreStudent > 100) {
                    println("---------------------------------------")
                    println("Score must between 0 .. 100 and Number")
                    println("---------------------------------------")
                }
            } while (scoreStudent.isNaN() || scoreStudent < 0 || scoreStudent > 100)
            student.add(Student(nameStudent, scoreStudent))
            println("------------------------------")
        }


        println("===========================")
    }

    private fun printResultScore(){

        println("---------------------------")
        println("Hasil Ujian Anda :")
        println("---------------------------")
        var resultTest : String = ""
        student.forEach { product ->
            println("Nama Siswa :  ${product.Name}")
            println("Score Siswa :  ${product.Score}")
            if (product.Score > 71 ) {
                resultTest = "PASSED"
            }else {
                resultTest = "FAILED"
            }
            println("Hasil Kelulusan :  $resultTest")
            println("---------------------------")
        }




        println("===========================")
    }

    fun run(){
        printHeader()
        inputDataStudent()
        printResultScore()
    }

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
         App().run()

        }
    }
}



