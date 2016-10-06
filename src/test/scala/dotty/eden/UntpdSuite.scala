package dotty.eden

class UntpdSuite extends EdenSuite {
  // terms
  checkUntpd("""println("hello, world")""")
  checkUntpd("println(42)")
  checkUntpd("f(this)")
  checkUntpd("f(A.this)")
  checkUntpd("this.age")
  checkUntpd("f[Int](3)")
  checkUntpd("f(x = 3)")
  checkUntpd("f(x = 3, y = 6 * 8)")
  checkUntpd("f(x:_*)")
  checkUntpd("a.f(this.age)")
  checkUntpd("a + b")
  checkUntpd("a + b + c + this.age")
  checkUntpd("a :+ b")
  checkUntpd("a +: b")
  checkUntpd("a*")
  checkUntpd("a++")
  checkUntpd("a = b")
  checkUntpd("{ a = 1; b += 2 }")
  checkUntpd("{ }")
  checkUntpd("if (cond) a else b")
  checkUntpd("while (a > 5) { println(a); a++; }")
  checkUntpd("do { println(a); a++; } while (a > 5)")
  checkUntpd("new List(5)")
  checkUntpd("new List[Int](5)")
  checkUntpd("new List[List[Int]](List(5))")
  checkUntpd("new Map[Int, String]()")

  // patterns
  checkUntpd("a match { case 5 => ; case 6 => }")
  checkUntpd("a match { case Some(x) => x; case None => y }")
  checkUntpd("a match { case Some(x) => x; case _ => y }")
  checkUntpd("a match { case m @ Some(x) => x; case _ => y }")
  checkUntpd("a match { case m @ Some(t @ Some(x)) => x; case _ => y }")
  checkUntpd("a match { case m : Int => x; case _ => y }")
  checkUntpd("a match { case Some(x: Int) | Some(x: String) => x; case _ => y }")
  checkUntpd("a match { case Some(x: Int) | Some(x: String) | Some(x: Boolean) => x; case _ => y }")
  checkUntpd("a match { case Some(x: Int) | Some(x: String) | x: Boolean => x; case _ => y }")

  // definitions
  checkUntpd("val a = 3")
  checkUntpd("val a: Int = 3")
  checkUntpd("val a: List[List[Int]] = List(List(3))")
  checkUntpd("val a: Int")
  checkUntpd("val a, b: Int")
  checkUntpd("val a, b = 3")
  checkUntpd("val Some(Some(x)) = a")
  checkUntpd("var a = 3")
  checkUntpd("var a: List[Int] = List(3)")
  checkUntpd("var a: Int")
  checkUntpd("var a, b: Int")
  checkUntpd("var a, b = 3")
  checkUntpd("var Some(Some(x)) = a")

  // modifiers
}

