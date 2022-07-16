

object q4 {
   def main(args:Array[String])
   {
     
     def BookPrice(x:Int):Double=x*24.95
     
     def Discount(x:Int):Double=BookPrice(x)*.4
     
     def Shipping(x:Int):Double=x*3+(x-50)*.75
     
     
     println(BookPrice(60) -Discount(60)+Shipping(60))
  }
}
