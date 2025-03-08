package fdraft.layout

import com.raquo.laminar.api.L.{*, given}

object BaseLayout {

  def element: Element = navTag(
    cls := "navbar sticky-top bg-body-tertiary flex-grow-0 flex-shrink-1 flex-basis-auto",
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
