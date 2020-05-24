// @GENERATOR:play-routes-compiler
// @SOURCE:/home/xeno/xWs/Scala/play-app/conf/routes
// @DATE:Sun May 24 15:09:41 CEST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:12
  class ReverseTodoList(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def createUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "create")
    }
  
    // @LINE:18
    def addTask(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addTask")
    }
  
    // @LINE:17
    def deleteTask(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "deleteTask")
    }
  
    // @LINE:20
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:15
    def validate(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "validate")
    }
  
    // @LINE:19
    def sortTasks(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sortTasks")
    }
  
    // @LINE:14
    def todoList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "todoList")
    }
  
    // @LINE:12
    def load(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "load")
    }
  
    // @LINE:13
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
