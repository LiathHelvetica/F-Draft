package fdraft.view

import com.raquo.laminar.api.L.{*, given}
import fdraft.ChampionId.Aatrox
import fdraft.{ChampionBasicInfo, ChampionId}
import fdraft.bootstrap.Attributes.*
import fdraft.img.ChampionIcon

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object DraftView {

  private def renderChampIcon(
      id: ChampionId,
      initialIconData: ChampionIcon,
      iconDataSignal: Signal[ChampionIcon]
  ): HtmlElement = div(
    img(
      src <-- iconDataSignal.map(_.url)
    ),
    span(text <-- iconDataSignal.map(ci => ChampionBasicInfo(ci.id).name), cls := "text-center"),
    cls := "d-flex flex-column champion-icon px-3 pt-2"
  )

  val championsInView: Signal[List[HtmlElement]] =
    EventStream.fromValue(ChampionIcon.all).split(_.id)(renderChampIcon)

  def element: Element =
      role := "main",
      cls := "d-flex flex-grow-1",
      styleAttr := "height: 1px",
      div(
        cls := "d-flex flex-column draft-team-column",
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
        cls := "d-flex flex-column draft-champ-select-column",
        div(
          cls := "flex-grow-0",
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
          cls := "d-flex flex-wrap flex-grow-1 align-content-start draft-champ-select-list",
          children <-- championsInView
        )
      ),
      div(
        cls := "d-flex flex-column draft-team-column",
        div(
          "Red team"
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
      )
    )

}
