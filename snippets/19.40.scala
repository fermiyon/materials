@ import $file.Arithmetic, Arithmetic.parser

@ fastparse.parse("(two plus ten) times seven", parser(_))
res7: Parsed[Int] = Parsed.Failure(Position 1:1, found "(two plus ")
