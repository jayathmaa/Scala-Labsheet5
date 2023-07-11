package Tutorial5

import scala.io.StdIn

object Question5 {
  def isEven(x:Int):Boolean=if(x%2==0){return true}else{return false}
  def addEven(n:Int):Int=if(n==0){return 0}else if(n==1){return 0}else if(isEven(n)){return (n+addEven(n-2))}else{return addEven(n-1)}



  def main(args: Array[String]): Unit= {
    printf("Enter n : ");
    val n=scala.io.StdIn.readInt();
    printf("%d",addEven(n));

  }
}
