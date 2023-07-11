package Tutorial5

import scala.io.StdIn

object Question3 {
  def printAddition(n:Int):Int=if(n==0){return(0)}else if(n==1){return(1)}else{return(n+printAddition(n-1))}



  def main(args: Array[String]): Unit= {
    printf("Enter n : ");
    val n=scala.io.StdIn.readInt();
    printf("%d",printAddition(n));

  }
}
