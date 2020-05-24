/*1. The temperature is 35C; convert this temperature into Fahrenheit.

ºF =ºC * 1.8000 + 32.00

*/
object Q1 extends App {
  def CeltoFe(c : Double):Double=c*1.8 + 32
  print("35 Celsius = "+ CeltoFe (35) + " Fahrenheit");
}