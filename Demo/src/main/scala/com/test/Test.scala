package com.test

object Test {
  def main(args: Array[String]): Unit = {
    val array = Some(Array(1,2,3,4,5))
    val result = array.map(_.iterator)
    println(array.map(_.mkString(",")))
  }
}
