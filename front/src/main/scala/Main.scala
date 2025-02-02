import com.raquo.laminar.api.L.{*, given}
import layout.BaseLayout
import org.scalajs.dom
import view.DraftView

object Main extends App {
  // TODO: maybe Nuxt-esque layout (layout has injectable element) is the way to go. Investigate when exploring routing
  private val appElement = dom.document.getElementById("app")
  render(appElement, BaseLayout.element)
  render(appElement, DraftView.element)
}
