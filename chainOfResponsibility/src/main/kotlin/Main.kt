/*
SWE303 DESIGN PATTERNS
HOMEWORK 3
MUHAMMAD ZUL IMAN BIN ZUL WIZARATAIN
B221202906

The design pattern used in this project is Chain Of Responsibility,
the pattern can pass request through chain of handlers.
An example of 3 players run from 3 different spot, the beginning, the middle and the last.
Each starting point have a point have a checkpoint, if the player start from the beginning
he gets 3 checkpoint and the other will get according to how many checkpoint they pass.
 */
fun main() {
    val beginning = Beginning("Passed the first checkpoint")
    val middle = Middle("Passed the second checkpoint")
    val last = Last("Passed the third checkpoint")

    beginning.next = middle
    middle.next = last

    val Player1 :String = beginning.addHeader("The Runner Start from the Beginning")
    println(Player1)

    println("---------------------------------------")

    val Player2 :String = middle.addHeader("The Runner Start from the Middle")
    println(Player2)

    println("---------------------------------------")

    val Player3 :String = last.addHeader("The Runner Start from the Last")
    println(Player3)
}