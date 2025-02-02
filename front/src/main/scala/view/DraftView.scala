package view

import com.raquo.laminar.api.L.{*, given}

object DraftView {

  def element: Element = div(
    cls := "container-fluid",
    div(
      cls := "row",
      div(
        cls := "col-3",
        div(
          cls := "d-flex flex-column",
          div(
            "BANS"
          ),
          div(
            cls := "flex-grow-1",
            "P1"
          ),
          div(
            cls := "flex-grow-1",
            "P2"
          ),
          div(
            cls := "flex-grow-1",
            "P3"
          ),
          div(
            cls := "flex-grow-1",
            "P4"
          ),
          div(
            cls := "flex-grow-1",
            "P5"
          )
        )
      ),
      div(
        cls := "col"
      ),
      div(
        cls := "col-3"
      )
    )
  )
}
