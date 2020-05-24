
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<div class="text-light main-container container-fluid mt-5">
  <div class="user-container bg-secondary mt-5">
    <h2 class="header">Login</h2>
    <label class="mylabel" for="loginName">Username: </label>
    <input class="mb-3 text-dark" type="text" id="loginName" value="xeno"/>
    <br>
    <label class="mylabel" for="loginPass">Password: </label>
    <input class="text-dark" type="password" id="loginPass" value="1234"/>
    <br>
    <button class="mybtn btn btn-success" onclick="login()">Login</button>
    <br>
  </div>
  <p id="message" class="text-danger"> """),_display_(/*15.41*/message),format.raw/*15.48*/(""" """),format.raw/*15.49*/("""</p>
  <p class="user-text">Or if you have not registered yet</p>
  <div class="user-container bg-secondary">
    <h2 class="header">Create user</h2>
    <label class="mylabel" for="createName">Username: </label><input class="mb-3 text-dark" type="text" id="createName"/>
    <br>
    <label class="mylabel" for="createPass">Password: </label><input class="text-dark" type="password" id="createPass"/>
    <br>
    <button class="mybtn btn btn-info" onclick="createUser()">Create user</button>
    <br>
  </div>
</div>
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-22T19:12:03.301
                  SOURCE: /home/xeno/xWs/Scala/play-app/app/views/login.scala.html
                  HASH: da0e60094d8fd5fecde11a3325e2cd34bb857f0c
                  MATRIX: 729->1|840->19|867->20|1464->590|1492->597|1521->598
                  LINES: 21->1|26->2|27->3|39->15|39->15|39->15
                  -- GENERATED --
              */
          