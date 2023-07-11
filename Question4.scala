package Tutorial5

import scala.io.StdIn

object Question4 {
  def isEven(x:Int):Boolean=if(x==0){return true}else if(x==1){return false}else{return (isEven(x-2))}
  def printEvenOrOdd(n:Int)=if(isEven(n)){printf("Even")}else{printf("Odd")}



  def main(args: Array[String]): Unit= {
    printf("Enter n : ");
    val n=scala.io.StdIn.readInt();
    printEvenOrOdd(n);

  }
}
