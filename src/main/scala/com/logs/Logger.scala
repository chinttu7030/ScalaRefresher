package com.logs

object Logger {
  def info(message: String): Unit = println(s"INFO: $message")
}
