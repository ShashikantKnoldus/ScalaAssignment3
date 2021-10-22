package edu.knoldus
import org.scalatest.flatspec.AnyFlatSpec

class TestLog extends AnyFlatSpec {
  val obj = new Log
  val temp=obj.log("Hey","XYZ")
  "Log " should "be [level]:message"in{
    assert(temp=="[XYZ]:Hey")
  }
  val temp1=obj.log("Hey")
  "Log" should "take level as by default"in{
    assert(temp1=="[INFO]:Hey")
  }

}
