object FileReader extends App{
    import scala.io.Source
    def readFile(path: String): Unit =
     if(path.nonEmpty) Source.fromFile(path).getLines().toList.foreach(println) else Console.err.println("Please input the path")

    readFile(args(0))
}