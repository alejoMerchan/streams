val vector = Vector(Vector('S', 'T'), Vector('o', 'o'), Vector('o', 'o')).reverse

val y = vector.indexWhere(x => x.contains('S'))
val x = vector(y).indexWhere(x => x == 'S')

