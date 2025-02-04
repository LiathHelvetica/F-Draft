package view

import bootstrap.Attributes.*
import scala.scalajs.js

import com.raquo.laminar.api.L.{*, given}
import scala.scalajs.js.annotation.*

object DraftView {

  def element: Element = div(
    cls := "container-fluid flex-grow-1 flex-shrink-1 flex-basis-auto",
    div(
      cls := "row draft-view-row",
      div(
        cls := "col-3 d-flex flex-column",
        div(
          "Blue team"
        ),
        div(
          "b1 b2 b3 b4 b5"
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
      ),
      div(
        cls := "col d-flex flex-column",
        div(
          cls := "d-flex",
          div(
            cls := "flex-grow-1 progress",
            role := "progressbar",
            aria.label := "Blue team time left",
            // TODO: dynamic valuemax, valuenow, label
            aria.valueMin := 0,
            div(
              cls := "progress-bar bg-blue-team",
              styleAttr := "width: 25%"
            )
          ),
          div(99),
          div(
            cls := "flex-grow-1 progress",
            role := "progressbar",
            aria.label := "Red team time left",
            aria.valueMin := 0,
            div(
              cls := "progress-bar bg-red-team",
              styleAttr := "width: 75%"
            )
          )
        ),
        div(
          cls := "d-flex",
          div(cls := "me-1", "T"),
          div(cls := "me-1", "J"),
          div(cls := "me-1", "M"),
          div(cls := "me-1", "A"),
          div(cls := "me-1", "S"),
          div(cls := "flex-grow-1"),
          div(
            cls := "dropdown",
            button(
              cls := "btn dropdown-toggle",
              tpe := "button",
              aria.expanded := false,
              dataBsToggle := "dropdown",
              "Sort thingy"
            ),
            ul(
              cls := "dropdown-menu",
              li(cls := "dropdown-item", "Option 1"),
              li(cls := "dropdown-item", "Option 2"),
              li(cls := "dropdown-item", "Option 3")
            )
          ),
          div(
            cls := "input-group search-champion-input",
            span(cls := "input-group-text", "$"),
            input(
              tpe := "text",
              cls := "form-control",
              placeholder := "Search",
              aria.label := "Search",
              size := 20
            )
          )
        )
      ),
      div(
        cls := "col-3"
      )
    )
  )
}
