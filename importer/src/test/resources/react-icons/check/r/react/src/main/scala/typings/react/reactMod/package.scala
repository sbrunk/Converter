package typings.react

import typings.react.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactMod {
  type ComponentState = js.Object
  type DOMFactory[P /* <: DOMAttributes[T] */, T /* <: Element */] = js.Function2[
    /* props */ js.UndefOr[(ClassAttributes[T] with P) | Null], 
    /* repeated */ ReactNode, 
    DOMElement[P, T]
  ]
  type Key = String | Double
  type ReactNode = js.UndefOr[String | Double | Boolean]
  type Ref[T] = String | (js.Function1[/* instance */ T | Null, js.Any])
  type SFC[P] = StatelessComponent[P]
  type SVGProps[T] = ClassAttributes[T]
}