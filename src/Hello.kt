import java.util.Arrays

fun main(args: Array<String>) {
    val ints = (1..100).toList()
    val evenInts2 = mutableListOf<Int>()
    for (i in ints) {
        if (i % 2 == 0) {
            evenInts2.add(i)
        }
    }
    val evenInts = ints.filter { it <20  }
    println(evenInts)
}