package example

import sbt.{Configuration, Def, given}
import sbt.Keys.fullClasspath

trait MyPluginCompat { self: MyPlugin.type =>
  import autoImport.myTask

  def myTaskFullClasspath: Def.Setting[?] = {
    (myTask / fullClasspath) := fullClasspath.value
  }
}
