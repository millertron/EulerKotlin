import java.util.*

fun main(args: Array<String>) {
    print("Select Project Euler problem number:")
    with(Scanner(System.`in`)) {
        when(nextInt()){
            1 -> print(multiplesOfThree())
            6 -> print(sumSquareDifference())
            else -> print("Option unavailable")
        }
    }
}