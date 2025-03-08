package fdraft

import com.raquo.laminar.api.L.{*, given}
import fdraft.layout.BaseLayout
import fdraft.view.DraftView
import org.scalajs.dom

object Main extends App {
  // TODO: maybe Nuxt-esque layout (layout has injectable element) is the way to go. Investigate when exploring routing
  private val appElement = dom.document.getElementById("app")
  render(appElement, BaseLayout.element)
  render(appElement, DraftView.element)
}
