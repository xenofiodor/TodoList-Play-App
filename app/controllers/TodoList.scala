package controllers

import javax.inject._
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}
import models._

@Singleton
class TodoList @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def load: Action[AnyContent] = Action { implicit request =>
    val usernameOption = request.session.get("username")
    usernameOption.map { username =>
      Ok(views.html.content(routes.TodoList.todoList().toString))
    }.getOrElse(Ok(views.html.content(routes.TodoList.login().toString)))
  }

  def login: Action[AnyContent] = Action {
    Ok(views.html.login(""))
  }

  def todoList: Action[AnyContent] = Action { implicit request =>
    val usernameOption = request.session.get("username")
    usernameOption.map { username =>
      Ok(views.html.todoList(Memory.getTasks(username)))
    }.getOrElse(Ok(views.html.login("")))
  }

  def validate: Action[AnyContent] = Action { implicit request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map { args =>
      val username = args("username").head
      val password = args("password").head
      if (Memory.validateUser(username, password))
        Ok(views.html.todoList(Memory.getTasks(username)))
          .withSession("username" -> username, "csrfToken" -> play.filters.csrf.CSRF.getToken.get.value)
      else Ok(views.html.login("login failed"))
    }.getOrElse(Ok(views.html.login("login failed")))
  }

  def createUser: Action[AnyContent] = Action { implicit request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map { args =>
      val username = args("username").head
      val password = args("password").head
      if (Memory.createUser(username, password))
        Ok(views.html.todoList(Memory.getTasks(username)))
          .withSession("username" -> username, "csrfToken" -> play.filters.csrf.CSRF.getToken.get.value)
      else Ok(views.html.login("user creation failed"))
    }.getOrElse(Ok(views.html.login("user creation failed")))
  }

  def deleteTask(): Action[AnyContent] = Action { implicit request =>
    val usernameOption = request.session.get("username")
    usernameOption.map { username =>
      val postVals = request.body.asFormUrlEncoded
      postVals.map { args =>
        val index = args("index").head.toInt
        Memory.removeTask(username, index);
        Ok(views.html.todoList(Memory.getTasks(username)))
      }.getOrElse(Ok(views.html.login("")))
    }.getOrElse(Ok(views.html.login("")))
  }

  def addTask(): Action[AnyContent] = Action { implicit request =>
    val usernameOption = request.session.get("username")
    usernameOption.map { username =>
      val postVals = request.body.asFormUrlEncoded
      postVals.map { args =>
        val task = args("task").head
        val deadLine = args("date").head
        Memory.addTask(username, new Task(task, deadLine));
        Ok(views.html.todoList(Memory.getTasks(username)))
      }.getOrElse(Ok(views.html.login("")))
    }.getOrElse(Ok(views.html.login("")))
  }

  def logout: Action[AnyContent] = Action {
    Redirect(routes.TodoList.load()).withNewSession
  }

  def sortTasks(): Action[AnyContent] = Action { implicit request =>
    val usernameOption = request.session.get("username")
    usernameOption.map { username =>
      Memory.sort(username)
      Ok(views.html.content(routes.TodoList.todoList().toString))
    }.getOrElse(Ok(views.html.login("")))
  }
}
