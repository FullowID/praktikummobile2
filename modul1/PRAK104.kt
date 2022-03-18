package modul1

fun main(){
    val otomotif = Otomotif()
    otomotif.tampil()
}

class Otomotif(var nama: String = "Mobil", var bahanBakar: String = "Bensin", var jumlah: Int = 4){
    fun tampil(){
        println("""
        Nama: $nama
        Bahan Bakar: $bahanBakar
        Jumlah: $jumlah
        """)
    }
}