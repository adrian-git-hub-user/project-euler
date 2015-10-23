/*https://projecteuler.net/problem=251
*/

object CardanoTriplets extends App {

  var counter = 0;
  
  1 to 110000000 foreach {
    _ => println(cardanoTriplet(2, 1, 5))
    println(counter)
    counter = counter + 1;
  }

  def cardanoTriplet(a: Double, b: Double, c: Double) = {
    nthroot(3, (a + (b * math.sqrt(c)))) + nthroot(3, (a - (b * math.sqrt(c))))
  }

  def nthroot(n: Int, a: Double): Double = {
    def loop(x0: Double): Double = {
      val x1 = (1.0d / n * ((n - 1) * x0 + a / math.pow(x0, n - 1)))
      if (x0 <= x1) x0
      else loop(x1)
    }

    return loop(a / 2)
  }

}
