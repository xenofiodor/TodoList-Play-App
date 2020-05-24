
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<h1>Welcome to Play!</h1>
""")))}),format.raw/*5.2*/("""
"""))
      }
    }
  }

  def render(flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply()(flash)

  def f:(() => (Flash) => play.twirl.api.HtmlFormat.Appendable) = () => (flash) => apply()(flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-22T18:29:49.001
                  SOURCE: /home/xeno/xWs/Scala/play-app/app/views/index.scala.html
                  HASH: 4c3f3f671ad84b0aebc514c49fe5a18f7216f033
                  MATRIX: 728->1|847->27|874->29|905->52|944->54|973->57|1029->84
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|29->5
                  -- GENERATED --
              */
          