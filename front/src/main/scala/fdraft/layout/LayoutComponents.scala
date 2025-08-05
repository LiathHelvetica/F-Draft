package fdraft.layout

import com.raquo.laminar.api.L.{*, given}

object LayoutComponents {

  val AppNav: HtmlElement = navTag(
    cls := "navbar sticky-top bg-body-tertiary flex-grow-0",
    idAttr := "navbar",
    div(
      cls := "container-fluid",
      a(
        cls := "navbar-brand",
        href := "",
        "F-Draft"
      )
    )
  )
}
