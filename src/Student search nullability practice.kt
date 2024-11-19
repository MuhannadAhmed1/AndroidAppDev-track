//
//data class Student(val id: Int, val name: String, val grade: Double )
//
//fun getStudentById(id: Int): Student{
//    return studentsList.find { it.id == id } !!
//}
//fun searchInStudents(name: String): Student?{
//    return studentsList.find { it.name.lowercase() == name.lowercase() }
//}
//var s1: Student = Student(223, "John", 140.0)
//var s2: Student = Student(548, "Mark", 120.0)
//var s3: Student = Student(342, "Natali", 150.0)
//var s4: Student = Student(781, "Sara", 130.0)
//
//val studentsList = listOf<Student>(s1,s2,s3,s4)

// the initialization of the list can be better done using this:
//val students = listOf<Student>(
//    Student("John", 223,140.0),
//    Student("Mark", 548,120.0),
//    Student("Natali", 342,150.0),
//    Student("Sara", 781,130.0)
//)
//fun main() {
//    println("Please, Enter the ID of the student")
//    val id: Int= readln().toInt()
//    val student = getStudentById(id)
//    println(student)
//    println("Please, Enter the student's name")
//    val name= readln()
//    println(searchInStudents(name)?:"The student is not found")
//}