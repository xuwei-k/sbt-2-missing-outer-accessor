package example

import sbt.{given, *}

object MyPlugin extends AutoPlugin with MyPluginCompat {

  object autoImport {
    val myTask = taskKey[Int]("")
  }

}

