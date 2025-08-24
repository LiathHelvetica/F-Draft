package fdraft.bootstrap

import com.raquo.laminar.api.L.htmlAttr
import com.raquo.laminar.codecs.StringAsIsCodec
import com.raquo.laminar.keys.HtmlAttr

object Attributes {

  // TODO: there probably is a way to create custom L (Laminar object) with custom attributes
  // this works for now
  @inline private def stringHtmlAttr(name: String): HtmlAttr[String] = htmlAttr(name, StringAsIsCodec)

  lazy val dataBsToggle: HtmlAttr[String] = stringHtmlAttr("data-bs-toggle")
}
