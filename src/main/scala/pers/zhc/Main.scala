package pers.zhc

import java.util.Scanner
import scala.util.Random

object Main extends App {
  val sc = new Scanner(System.in)
  var generated = Random.nextInt(100)
  while (true) {
    print("Guess a number: ")
    System.out.flush()
    val i = sc.nextInt()
    if (i < generated) {
      println("Less")
    } else if (i > generated) {
      println("Bigger")
    } else {
      println("Bingo!")
      generated = Random.nextInt(100)
    }
  }
}