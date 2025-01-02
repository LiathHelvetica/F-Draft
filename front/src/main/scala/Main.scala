import scala.scalajs.js
import scala.scalajs.js.annotation._

import org.scalajs.dom

object Main extends App {

  @js.native @JSImport("~/javascript.svg", JSImport.Default)
  val javascriptLogo: String = js.native
  @js.native @JSImport("~/vite.svg", JSImport.Default)
  val viteLogo: String = js.native

  dom.document.querySelector("#app").innerHTML = s"""
    <div>
      <div>QWE QWE QWE QWE QWE QWE QWE QWE QWE QWE</div>
      <a href="https://vitejs.dev" target="_blank">
        <img src="$viteLogo" class="logo" alt="Vite logo" />
      </a>
      <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript" target="_blank">
        <img src="$javascriptLogo" class="logo vanilla" alt="JavaScript logo" />
      </a>
      <h1>Hello Scala.js!</h1>
      <div class="card">
        <button id="counter" type="button"></button>
      </div>
      <p class="read-the-docs">
        Click on the Vite logo to learn more
      </p>
    </div>
  """

  def setupCounter(element: dom.Element): Unit = {
    var counter = 0

    def setCounter(count: Int): Unit = {
      counter = count
      element.innerHTML = s"count is $counter"
    }

    element.addEventListener(
      "click",
      e => {
        setCounter(counter + 1)
      }
    )
    setCounter(0)
  }

  setupCounter(dom.document.getElementById("counter"))
}
