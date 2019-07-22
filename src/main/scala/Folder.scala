class Folder {

  def getDirectoryName {
    val filesHere = (new java.io.File("/home/knoldus/Desktop/GivenFolder")).listFiles

    for (file <- filesHere) {
      val fp = file.toPath
      print(fp.getFileName )
      val list =file.listFiles.filter(_.isDirectory).toList
      println(" " +list)

      val list1 =file.listFiles.filter(_.isFile).toList
  println(list1)

    }
  }

}
object  Folder extends App{
  val obj =new Folder
  obj.getDirectoryName
}