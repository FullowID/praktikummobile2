package modul1

fun main(){
    print("Input Bilangan = ")
    var bilangan = Integer.valueOf(readLine())
    var kelipatan = bilangan
    var banyakOutput = 5
    var i = 0

    while (i < banyakOutput){
        bilangan += kelipatan
        if (bilangan %2 == 0 || bilangan %3 == 0){
            print("${bilangan} ")
        }else {
            banyakOutput++
        }
        i++
    }
}