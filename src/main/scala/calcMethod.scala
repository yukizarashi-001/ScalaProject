object calcMethod {
  def main(args: Array[String]) = {
    print(calc((x,y) => x + y, 10))
  }
  def calc(f:(Int, Int) => Int, num:Int):Int = f(num, num)
}

