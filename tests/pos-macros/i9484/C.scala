import scala.quoted._

object C {
  inline def m: Any = ${ mExpr }
  def mExpr(using Quotes): Expr[Any] = Expr(1)
}
