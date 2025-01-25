import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom
import view.DraftView

object Main extends App {
/*
  renderOnDomContentLoaded(
    dom.document.getElementById("app"),
    DraftView.element
  )
*/
  dom.document.querySelector("#app").innerHTML ="""
  <header class="mdc-top-app-bar">
    <div class="mdc-top-app-bar__row">
      <section class="mdc-top-app-bar__section mdc-top-app-bar__section--align-start">
        <span class="mdc-top-app-bar__title">MDC Web Example</span>
      </section>
    </div>
  </header>

  <main class="container">
    <button class="mdc-button mdc-button--raised">
      <span class="mdc-button__label">Click Me</span>
    </button>

    <div class="mdc-card card">
      <div class="mdc-card__primary-action" tabindex="0">
        <div style="padding: 16px;">
          <h2 class="mdc-typography--headline6">Card Title</h2>
          <p class="mdc-typography--body2">This is an example of a Material Design card.</p>
        </div>
      </div>
      <div class="mdc-card__actions">
        <button class="mdc-button mdc-card__action mdc-card__action--button">
          <span class="mdc-button__label">Action 1</span>
        </button>
        <button class="mdc-button mdc-card__action mdc-card__action--button">
          <span class="mdc-button__label">Action 2</span>
        </button>
      </div>
    </div>

    <div class="mdc-text-field mdc-text-field--outlined">
      <span class="mdc-notched-outline">
        <span class="mdc-notched-outline__leading"></span>
        <span class="mdc-notched-outline__notch">
          <label class="mdc-floating-label" for="text-field">Your Name</label>
        </span>
        <span class="mdc-notched-outline__trailing"></span>
      </span>
      <input type="text" id="text-field" class="mdc-text-field__input">
    </div>
  </main>

  <script>
    // Initialize all MDC components
    mdc.autoInit();
  </script>
  """
}
