package p01_introductorio.sobrecarga.java_kotlin

const val DEFAULT_CHARACTER = '='
const val DEFAULT_LENGHT = 15

fun displayBorder(character: Char = DEFAULT_CHARACTER, length: Int = DEFAULT_LENGHT) {
    for (i in 1..length) {
        print(character)
    }
    println()
}

fun main(args: Array<String>) {
    displayBorder()
    displayBorder('*')
    displayBorder(length = 5)
    displayBorder('*',20)

}