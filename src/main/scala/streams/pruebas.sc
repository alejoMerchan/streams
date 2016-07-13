val vector = List(Vector('o','o', 'o', '-', '-', '-', '-', '-', '-', '-'), Vector('o', 'S', 'o', 'o', 'o', 'o', '-', '-', '-', '-'), Vector('o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', '-'), Vector('-', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'), Vector('-', '-', '-', '-', '-', 'o', 'o', 'T', 'o', 'o'), Vector('-', '-', '-', '-', '-', '-', 'o', 'o', 'o', '-'))

val x = vector.zipWithIndex
val y = vector.zipWithIndex.map(y => y._1.zipWithIndex)

