import scala.`meta`._

class main extends scala.annotation.MacrosAnnotation {
  def apply(defn: Any): Any = meta {
    /*val q"object $name { ..$stats }" = defn
    val main = q"""
      def main(args: Array[String]): Unit = { ..$stats }
    """
    q"object $name { $main }" */
    // val q"object $name { ..$stats }" = q"object Test { println(1024) }"
    q"object Test { println(1024) }"
    // q"object Test { def main(args: Array[String]): Unit = println(1024) }"
  }
}
