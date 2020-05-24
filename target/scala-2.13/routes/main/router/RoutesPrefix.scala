// @GENERATOR:play-routes-compiler
// @SOURCE:/home/xeno/xWs/Scala/play-app/conf/routes
// @DATE:Sun May 24 15:09:41 CEST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
