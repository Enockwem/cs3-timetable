package modal

import java.io.BufferedReader
import java.io.FileReader
import java.util.*

// This is the display function
fun displayMenu(){
    println("*****Welcome to the Timetable Application*******")
    println("1.Show timetable\n" +
            "2.Change timetable\n")
}

// Reading the csv files
fun giveFile(filename: String): BufferedReader{
    var fileReader: BufferedReader? = null
    try{
        // Reading data from the csv file
        fileReader = BufferedReader(FileReader(filename))

    }catch (e: Exception){
        println("!Error in reading the file")
    }
    return fileReader!!
}

fun displayTable(readLectures: BufferedReader,readCourseUnits: BufferedReader){
    readLectures.readLine()
    readCourseUnits.readLine()


    while (readLectures.readLine() != null && readCourseUnits.readLine() != null){
        for (i in readLectures.readLine().split(",")){

        }
    }

}
fun main(args: Array<String>?){

    val filenameLectures = "src/data/Lectures.csv"
    val filenameCourseUnits = "src/data/courseUnits.csv"

    // Using the method giveFile() to read the csv files
    val readLectures = giveFile(filenameLectures)
    val readCourseUnits = giveFile(filenameCourseUnits)

    // reading the heading of the csv files read
    val lectureHeaders = readLectures.readLine().split(",")
    val courseUnitsHeaders = readCourseUnits.readLine().split(",")

    // The process starts here
    // By displaying the menu
    displayMenu()
    // Get the user input to select
    print("Choose<1 or 2>: ")
    val scan = Scanner(System.`in`)
    val choosenValue: Int = scan.nextInt()


    when(choosenValue){
        1 -> {
            displayTable(giveFile(filenameLectures), giveFile(filenameCourseUnits))
        }
        2 -> {

        }
    }
}