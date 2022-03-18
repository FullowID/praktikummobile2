package modul1

fun main(){
    print("Input Bilangan = ")
    var bilangan = Integer.valueOf(readLine())
    var kelipatan = bilangan

    repeat(7){
        bilangan += kelipatan

        if (bilangan %2 == 0 || bilangan %3 == 0){
            print("${bilangan} ")
        }
    }
}