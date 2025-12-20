import kotlin.math.absoluteValue

fun main() {
    fun part1(input: List<String>): Int {
        var dial = List(100, {i -> (i * 1)})
        var currentIndexDial = 50
        var zeroCounter = 0
        for (line in input) {
            val distance = line.split("R", "L").last().toInt() % 100;
            val direction = line.first().toString();
            if (direction == "R") {
                currentIndexDial = currentIndexDial + distance
                if (currentIndexDial >= dial.size) {
                    currentIndexDial = 0 + (currentIndexDial - dial.size)
                }
            } else {
                currentIndexDial = currentIndexDial - distance
                if (currentIndexDial < 0) {
                    currentIndexDial = 100 - currentIndexDial.absoluteValue
                }
            }
            if (dial[currentIndexDial] == 0) {
                zeroCounter++
            }
        }


        return zeroCounter
    }

    fun cleanDistance(number: Int) {
        val finalNumber: Int
        if (number > 100) {
            val divider = number % 100
        }
    }

//    fun part2(input: List<String>): Int {
//        return input.size
//    }
    val testInput = readInput("day1_test")

//     Test if implementation meets criteria from the description, like:
    check(part1(testInput) == 3)

    // Or read a large test input from the `src/Day01_test.txt` file:
//    val testInput = readInput("day1_input")
//    check(part1(testInput) == 1)
    val input = readInput("day1_input")

    // Read the input from the `src/Day01.txt` file.
    part1(input).println()
//    part2(input).println()
}
