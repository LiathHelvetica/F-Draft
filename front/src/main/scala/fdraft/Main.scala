package fdraft

import com.raquo.laminar.api.L.{*, given}
import fdraft.layout.BasicLayout
import fdraft.view.DraftView
import org.scalajs.dom

object Main extends App {
  private val appElement = dom.document.getElementById("app")
  BasicLayout.renderInLayout(appElement, DraftView.element)
}
