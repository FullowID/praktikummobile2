package modul1

fun main(){
    print("Nilai x = ")
    val x = Integer.valueOf(readLine())
    hitung(x)
}

fun hitung(x: Int){
    val hasil = 2 * (x * x) + 5 * x - 8
    print(hasil)
}