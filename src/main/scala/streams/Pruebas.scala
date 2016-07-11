package streams




/**
 * Created by abelmeos on 2016/07/06.
 */
object Pruebas extends  App{

  prueba.hola()


}

object prueba extends Solver with StringParserTerrain {

  val level =
    """ooo-------
      |oSoooo----
      |ooooooooo-
      |-ooooooooo
      |-----ooToo
      |------ooo-""".stripMargin

  def hola() = println("hola mundo")

  println(startPos)
  println(goal)

  neighborsWithHistory(Block(Pos(1,1),Pos(1,1)), List(Left,Up))

}
