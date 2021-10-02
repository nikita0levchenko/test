object FileReader extends App{
    import scala.io.Source
    def readFile(path: String): Unit = if(path.nonEmpty)Source.fromFile(path).getLines().toList.foreach(x => 
    println(x.trim.length + " " * (Source.fromFile(path).getLines().toList.map(_.trim.length).max.toString.length
     - x.trim.length.toString.length) + " | " + x.trim))
    else Console.err.println("Please input path of file")
    readFile(args(0))
}
