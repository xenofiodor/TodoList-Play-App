package models

import scala.collection.mutable

object Memory {
  private val users = mutable.Map[String, String]("xeno" -> "1234")
  private val tasks = mutable.Map[String, List[Task]]("xeno" ->
    List(new Task("Scala", "2020-05-25"), new Task("Angular", "2020-05-29")))

  def validateUser(username: String, password: String): Boolean =
    users.get(username).contains(password)

  def createUser(username: String, password: String): Boolean =
    if (users.contains(username)) false
    else {
      users(username) = password
      true
    }

  def getTasks(username: String): Seq[Task] =
    tasks.getOrElse(username, Nil)

  def addTask(username: String, task: Task): Unit = {
    tasks(username) = task :: tasks.getOrElse(username, Nil)
  }

  def removeTask(username: String, index: Int): Boolean = {
    if (index < 0 || tasks.get(username).isEmpty || index >= tasks(username).length) false
    else {
      tasks(username) = tasks(username).patch(index, Nil, 1)
      true
    }
  }

  def sort(username: String): Unit = {
    val userTasks = getTasks(username)
    if (userTasks != Nil)
      tasks(username) = userTasks.filter(_.dateString != "").sortBy(_.date).toList ++
        userTasks.filter(_.dateString == "")
  }
}
