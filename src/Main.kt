import java.util.*

fun main() {
    val ticket = Ticket()
    ticket.buy_tc()
    ticket.print()
}

class Ticket{
    val oneround = 1000
    val allround = oneround*2*0.9
    var sheets = 0
    var sheets_back=0
    val scanner = Scanner(System.`in`)
    fun buy_tc(){
        println("Please enter number of tickets:")
        sheets = scanner.nextInt()
        println("How many round-trip tickets:")
        do {
            sheets_back = scanner.nextInt()
            if (sheets_back > sheets) {
                println("Error please try again")
                println("How many round-trip tickets:")
            }
        } while (sheets < sheets_back)}
    fun cost_tc(): Int {
            return (sheets_back * allround + (sheets - sheets_back) * oneround).toInt()
    }
    fun sum_tc():Int{
            return (sheets+sheets_back)
    }
    fun print(){
        println("Total ticket:" + sum_tc())
        println("Round-trip:$sheets_back")
        println("Total cost:" + cost_tc())
    }
}