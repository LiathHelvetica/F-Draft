package fdraft.layout

import com.raquo.laminar.api.L.{*, given}
import fdraft.layout.LayoutComponents.AppNav
import org.scalajs.dom.Element as NativeElement

object BasicLayout {

  def renderInLayout(appE: NativeElement, mainElements: Element): Unit = {
    render(appE, AppNav)
    render(appE, mainElements)
  }
}
