
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object todoList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[Task],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tasks: Seq[Task]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="collapse navbar-collapse" id="navigation">
    <ul class="navbar-nav">
      <li class="nav-item item-link">
        <a class="nav-link" href=""""),_display_(/*7.36*/routes/*7.42*/.TodoList.logout()),format.raw/*7.60*/("""">Logout</a>
      </li>
      <li class="nav-item item-link">
        <a class="nav-link" href=""""),_display_(/*10.36*/routes/*10.42*/.TodoList.sortTasks()),format.raw/*10.63*/("""">Sort tasks</a>
      </li>
      <li class="nav-item item-link first-item-link">
        <label class="nav-input" for="newTask">New task: </label>
      </li>
      <li class="nav-item item-link">
        <input class="text-dark nav-input" type="text" id="newTask"/><br>
      </li>
      <li class="nav-item item-link">
        <label class="nav-input" for="newTaskDate">Deadline: </label>
      </li>
      <li class="nav-item item-link">
        <input class="text-dark nav-input" type="text" id="newTaskDate"/><br>
      </li>
      <li class="nav-item item-link">
        <a class="nav-link" href="#" onclick="addTask()">Add task </a>
      </li>
    </ul>
  </div>
</nav>

<div class="todo-list-container text-light mt-5 ml-5">
  <h2>Todo list</h2>
  <ul class="mt-5 todo-list">
    """),_display_(/*34.6*/for((task, i) <- tasks.zipWithIndex) yield /*34.42*/ {_display_(Seq[Any](format.raw/*34.44*/("""
      """),format.raw/*35.7*/("""<li class="item">
        <div class="d-inline-flex">
          <input id="check"""),_display_(/*37.28*/i),format.raw/*37.29*/("""" type="checkbox" class="mr-3 mb-2" onclick="check("""),_display_(/*37.81*/i),format.raw/*37.82*/(""")">
          <p class="task-text" id="task"""),_display_(/*38.41*/i),format.raw/*38.42*/(""""> """),_display_(/*38.46*/task/*38.50*/.task),format.raw/*38.55*/(""" """),format.raw/*38.56*/("""</p>
          <p class="task-date"> """),_display_(/*39.34*/task/*39.38*/.dateString),format.raw/*39.49*/(""" """),format.raw/*39.50*/("""</p>
          <button type="button" class="btn btn-danger btn-sm" onclick="deleteTask("""),_display_(/*40.84*/i),format.raw/*40.85*/(""")">
            <span class="glyphicon glyphicon-trash"></span>
          </button>
        </div>
      </li>

    """)))}),format.raw/*46.6*/("""
  """),format.raw/*47.3*/("""</ul>
</div>


"""))
      }
    }
  }

  def render(tasks:Seq[Task]): play.twirl.api.HtmlFormat.Appendable = apply(tasks)

  def f:((Seq[Task]) => play.twirl.api.HtmlFormat.Appendable) = (tasks) => apply(tasks)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-22T20:16:00.711
                  SOURCE: /home/xeno/xWs/Scala/play-app/app/views/todoList.scala.html
                  HASH: ae907fbd265f818897ac461436961a22609e654c
                  MATRIX: 735->1|847->20|874->21|1118->239|1132->245|1170->263|1295->361|1310->367|1352->388|2170->1180|2222->1216|2262->1218|2296->1225|2404->1306|2426->1307|2505->1359|2527->1360|2598->1404|2620->1405|2651->1409|2664->1413|2690->1418|2719->1419|2784->1457|2797->1461|2829->1472|2858->1473|2973->1561|2995->1562|3142->1679|3172->1682
                  LINES: 21->1|26->2|27->3|31->7|31->7|31->7|34->10|34->10|34->10|58->34|58->34|58->34|59->35|61->37|61->37|61->37|61->37|62->38|62->38|62->38|62->38|62->38|62->38|63->39|63->39|63->39|63->39|64->40|64->40|70->46|71->47
                  -- GENERATED --
              */
          