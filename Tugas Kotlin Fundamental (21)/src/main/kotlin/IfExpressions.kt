package main.kotlin

fun main(){
    val kkm = 75
    val nilai = 90
    val hasil : String
    hasil = if (nilai >= kkm){
        "Nilai kamu $nilai, selamat ya!"
    } else {
        "Nilai kamu $nilai, silakan ikuti remidial"
    }
    print (hasil)

}