import java.lang.NumberFormatException
import java.util.*

fun main() {
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    val sc = Scanner(System.`in`)
    println("Zadejte pocet slov")
    val count = sc.nextLine().toInt()

    val list = List(count) {
        println("Zadej " + (it + 1) + ". slovo")
        sc.nextLine()
    }

    println("Zadej pocet slabik nebo end pro konec")

    while (true) {
        try {
            println(list.groupBy {
                it.count { char ->
                    char in vowels
                }
            }[sc.nextLine().toInt()])
            println("Zadejte dalsi cislo nebo end pro konec")
        } catch (e: NumberFormatException) {
            break
        }
    }
}