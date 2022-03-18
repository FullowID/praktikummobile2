package modul1

import kotlin.random.Random

fun main(){
    print("Waktu Sekarang: ")
    val waktu = readLine()
    print("Nama Anda: ")
    val nama = readLine()
    print("Umur Anda: ")
    val umur = readLine()
    var suhu = String.format("%.2f", Random.nextDouble(35.00, 37.00))
    print("Suhu Anda: $suhu")

    println()
    println("Selamat Pagi, ${nama}. Umur anda ${umur} Tahun.")
    println("Suhu Tubuh anda ${suhu} derajat Celcius")
}