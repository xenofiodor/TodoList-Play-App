
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Html,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html)(implicit flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">

            <!-- css -->
        <link rel="stylesheet" media="screen" href=""""),_display_(/*18.54*/routes/*18.60*/.Assets.versioned("stylesheets/login.css")),format.raw/*18.102*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*19.54*/routes/*19.60*/.Assets.versioned("stylesheets/todolist.css")),format.raw/*19.105*/("""">

            <!-- Bootstrap -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

            <!-- jQuery -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

            <!-- Bootstrap once again -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    </head>
    <body class="bg-dark">
        """),format.raw/*37.32*/("""
        """),_display_(/*38.10*/content),format.raw/*38.17*/("""
        """),_display_(/*39.10*/flash/*39.15*/.get("error")),format.raw/*39.28*/("""
        """),_display_(/*40.10*/flash/*40.15*/.get("success")),format.raw/*40.30*/("""
      """),format.raw/*41.7*/("""<script src=""""),_display_(/*41.21*/routes/*41.27*/.Assets.versioned("javascripts/main.js")),format.raw/*41.67*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(flash)

  def f:((String) => (Html) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (flash) => apply(title)(content)(flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-22T18:30:38.748
                  SOURCE: /home/xeno/xWs/Scala/play-app/app/views/main.scala.html
                  HASH: 7bfb884adec2ac2257e512d15502dabd920c629a
                  MATRIX: 993->260|1140->314|1167->315|1247->420|1283->429|1318->437|1344->442|1433->504|1448->510|1511->551|1599->612|1614->618|1675->657|1784->739|1799->745|1863->787|1946->843|1961->849|2028->894|3447->2375|3484->2385|3512->2392|3549->2402|3563->2407|3597->2420|3634->2430|3648->2435|3684->2450|3718->2457|3759->2471|3774->2477|3835->2517
                  LINES: 26->7|31->8|32->9|35->12|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|38->15|41->18|41->18|41->18|42->19|42->19|42->19|59->37|60->38|60->38|61->39|61->39|61->39|62->40|62->40|62->40|63->41|63->41|63->41|63->41
                  -- GENERATED --
              */
          