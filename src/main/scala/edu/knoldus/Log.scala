package edu.knoldus

class Log {
  def log(message:String,level:String="INFO"):String={
    ("["+level+"]:"+message)
  }
}
