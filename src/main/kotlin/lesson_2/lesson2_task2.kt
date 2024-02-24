package lesson_2

fun main() {

    val workers = 50
    val workersSalary = 30000
    val trainees = 30
    val traineesSalary = 20000

    val totalWorkersSalary = workers * workersSalary
    val totalSalary = totalWorkersSalary + (trainees * traineesSalary)
    val averageSalary = totalSalary / (workers + trainees)

    println("Зарплата постоянных сотрудников: $totalWorkersSalary")
    println("Общая сумма расходов на зарплату: $totalSalary")
    println("Средняя зарплата сотрудника: $averageSalary")

}