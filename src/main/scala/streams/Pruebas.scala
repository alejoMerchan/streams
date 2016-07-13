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



  //from(streamTest,List().toSet)




  solution



  /**
  streamTest.toList.map{

    y => println(y._1)
      println(y._2)

  }
    **/

  println("..............................................")
 // println(streamsNeiborsWithHistory)




  /**
  println(neighborsWithHistory(Block(Pos(1,1),Pos(1,1)), List(Left,Up)).toList)
  println(neighborsWithHistory(Block(Pos(1,2),Pos(1,3)),List(Right, Left, Up)).toList)
  println(neighborsWithHistory(Block(Pos(2,1),Pos(3,1)),List(Down, Left, Up)).toList)
    **/

  /**
  println(newNeighborsOnly(Set(
    (Block(Pos(1,2),Pos(1,3)), List(Right,Left,Up)),
    (Block(Pos(2,1),Pos(3,1)), List(Down,Left,Up))
  ).toStream,Set(Block(Pos(1,2),Pos(1,3)), Block(Pos(1,1),Pos(1,1)))).toSet)

    **/
}
