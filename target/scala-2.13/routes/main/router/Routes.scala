// @GENERATOR:play-routes-compiler
// @SOURCE:/home/xeno/xWs/Scala/play-app/conf/routes
// @DATE:Sun May 24 15:09:41 CEST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_2: controllers.HomeController,
  // @LINE:10
  Assets_1: controllers.Assets,
  // @LINE:12
  TodoList_0: controllers.TodoList,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_2: controllers.HomeController,
    // @LINE:10
    Assets_1: controllers.Assets,
    // @LINE:12
    TodoList_0: controllers.TodoList
  ) = this(errorHandler, HomeController_2, Assets_1, TodoList_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, Assets_1, TodoList_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """load""", """controllers.TodoList.load"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.TodoList.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todoList""", """controllers.TodoList.todoList"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validate""", """controllers.TodoList.validate"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create""", """controllers.TodoList.createUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteTask""", """controllers.TodoList.deleteTask"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTask""", """controllers.TodoList.addTask"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sortTasks""", """controllers.TodoList.sortTasks"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.TodoList.logout"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_TodoList_load2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("load")))
  )
  private[this] lazy val controllers_TodoList_load2_invoker = createInvoker(
    TodoList_0.load,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoList",
      "load",
      Nil,
      "GET",
      this.prefix + """load""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_TodoList_login3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_TodoList_login3_invoker = createInvoker(
    TodoList_0.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoList",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_TodoList_todoList4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todoList")))
  )
  private[this] lazy val controllers_TodoList_todoList4_invoker = createInvoker(
    TodoList_0.todoList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoList",
      "todoList",
      Nil,
      "GET",
      this.prefix + """todoList""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_TodoList_validate5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validate")))
  )
  private[this] lazy val controllers_TodoList_validate5_invoker = createInvoker(
    TodoList_0.validate,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoList",
      "validate",
      Nil,
      "POST",
      this.prefix + """validate""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_TodoList_createUser6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create")))
  )
  private[this] lazy val controllers_TodoList_createUser6_invoker = createInvoker(
    TodoList_0.createUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoList",
      "createUser",
      Nil,
      "POST",
      this.prefix + """create""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_TodoList_deleteTask7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteTask")))
  )
  private[this] lazy val controllers_TodoList_deleteTask7_invoker = createInvoker(
    TodoList_0.deleteTask,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoList",
      "deleteTask",
      Nil,
      "POST",
      this.prefix + """deleteTask""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_TodoList_addTask8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTask")))
  )
  private[this] lazy val controllers_TodoList_addTask8_invoker = createInvoker(
    TodoList_0.addTask,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoList",
      "addTask",
      Nil,
      "POST",
      this.prefix + """addTask""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_TodoList_sortTasks9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sortTasks")))
  )
  private[this] lazy val controllers_TodoList_sortTasks9_invoker = createInvoker(
    TodoList_0.sortTasks,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoList",
      "sortTasks",
      Nil,
      "GET",
      this.prefix + """sortTasks""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_TodoList_logout10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_TodoList_logout10_invoker = createInvoker(
    TodoList_0.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoList",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:10
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:12
    case controllers_TodoList_load2_route(params@_) =>
      call { 
        controllers_TodoList_load2_invoker.call(TodoList_0.load)
      }
  
    // @LINE:13
    case controllers_TodoList_login3_route(params@_) =>
      call { 
        controllers_TodoList_login3_invoker.call(TodoList_0.login)
      }
  
    // @LINE:14
    case controllers_TodoList_todoList4_route(params@_) =>
      call { 
        controllers_TodoList_todoList4_invoker.call(TodoList_0.todoList)
      }
  
    // @LINE:15
    case controllers_TodoList_validate5_route(params@_) =>
      call { 
        controllers_TodoList_validate5_invoker.call(TodoList_0.validate)
      }
  
    // @LINE:16
    case controllers_TodoList_createUser6_route(params@_) =>
      call { 
        controllers_TodoList_createUser6_invoker.call(TodoList_0.createUser)
      }
  
    // @LINE:17
    case controllers_TodoList_deleteTask7_route(params@_) =>
      call { 
        controllers_TodoList_deleteTask7_invoker.call(TodoList_0.deleteTask)
      }
  
    // @LINE:18
    case controllers_TodoList_addTask8_route(params@_) =>
      call { 
        controllers_TodoList_addTask8_invoker.call(TodoList_0.addTask)
      }
  
    // @LINE:19
    case controllers_TodoList_sortTasks9_route(params@_) =>
      call { 
        controllers_TodoList_sortTasks9_invoker.call(TodoList_0.sortTasks)
      }
  
    // @LINE:20
    case controllers_TodoList_logout10_route(params@_) =>
      call { 
        controllers_TodoList_logout10_invoker.call(TodoList_0.logout)
      }
  }
}
