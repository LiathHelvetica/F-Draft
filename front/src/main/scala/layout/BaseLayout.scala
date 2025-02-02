package layout

import com.raquo.laminar.api.L.{*, given}

object BaseLayout {

  def element: Element = navTag(
    cls := "navbar sticky-top bg-body-tertiary",
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
