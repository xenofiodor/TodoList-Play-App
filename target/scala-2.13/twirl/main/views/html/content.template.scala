
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

object content extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(startRoute: String)(implicit request: RequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Todo list")/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""
  """),format.raw/*4.3*/("""<div id="contents"></div>

  <input type="hidden" id="csrfToken" value=""""),_display_(/*6.47*/helper/*6.53*/.CSRF.getToken.value),format.raw/*6.73*/(""""/>
  <input type="hidden" id="loginRoute" value=""""),_display_(/*7.48*/startRoute),format.raw/*7.58*/(""""/>
  <input type="hidden" id="validateRoute" value=""""),_display_(/*8.51*/routes/*8.57*/.TodoList.validate()),format.raw/*8.77*/(""""/>
  <input type="hidden" id="createUserRoute" value=""""),_display_(/*9.53*/routes/*9.59*/.TodoList.createUser()),format.raw/*9.81*/(""""/>
  <input type="hidden" id="addTaskRoute" value=""""),_display_(/*10.50*/routes/*10.56*/.TodoList.addTask()),format.raw/*10.75*/(""""/>
  <input type="hidden" id="deleteTaskRoute" value=""""),_display_(/*11.53*/routes/*11.59*/.TodoList.deleteTask()),format.raw/*11.81*/(""""/>
  <input type="hidden" id="sortTasksRoute" value=""""),_display_(/*12.52*/routes/*12.58*/.TodoList.sortTasks()),format.raw/*12.79*/(""""/>
""")))}))
      }
    }
  }

  def render(startRoute:String,request:RequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(startRoute)(request,flash)

  def f:((String) => (RequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (startRoute) => (request,flash) => apply(startRoute)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-24T15:09:41.286
                  SOURCE: /home/xeno/xWs/Scala/play-app/app/views/content.scala.html
                  HASH: 3d91f3d6dace67680d58f731514cfef6bc7cc3be
                  MATRIX: 751->1|912->69|939->71|964->88|1002->89|1031->92|1130->165|1144->171|1184->191|1261->242|1291->252|1371->306|1385->312|1425->332|1507->388|1521->394|1563->416|1643->469|1658->475|1698->494|1781->550|1796->556|1839->578|1921->633|1936->639|1978->660
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|30->6|30->6|30->6|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12
                  -- GENERATED --
              */
          