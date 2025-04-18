package fdraft.layout

import com.raquo.laminar.api.L.{*, given}

object BaseLayout {

  def element: Element = navTag(
    cls := "navbar fixed-top bg-body-tertiary", // flex-grow-1 flex-shrink-1 flex-basis-auto,
    div(
      cls := "container-fluid",
      a(
        cls := "navbar-brand", // TODO: the issue is that - https://stackoverflow.com/a/10336221/15204150
        // TODO: this is stupid
        href := "",
        "F-Draft"
      )
    )
  )
}
