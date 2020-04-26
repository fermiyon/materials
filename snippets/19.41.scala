// Arithmetic.sc
 def number[_: P] = P(
   "zero" | "one" | "two" | "three" | "four" |
   "five" | "six" | "seven" | "eight" | "nine"
 ).!.map{
   case "zero"  => Number(0); case "one"   => Number(1)
   ...
-}
+}.log

 def ws[_: P] = P( " ".rep(1) )

-def operator[_: P] = P( "plus" | "minus" | "times" | "divide" ).!
+def operator[_: P] = P( "plus" | "minus" | "times" | "divide" ).!.log

-def expr[_: P] = P( "(" ~ parser ~ ")" | number )
+def expr[_: P] = P( "(" ~ parser ~ ")" | number ).log

 def parser[_: P]: P[Expr] = P( expr ~ ws ~ operator ~ ws ~ expr ).map{
   case (lhs, op, rhs) => BinOp(lhs, op, rhs)
-}
+}.log
