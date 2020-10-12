package typingsSlinky.componentstest

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.componentstest.anon.Equals
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("componentstest", "Card")
  @js.native
  val Card: CardInterface = js.native
  
  @JSImport("componentstest", "Component")
  @js.native
  val Component: ReactComponentClass[Props] = js.native
  
  @JSImport("componentstest", "Grid")
  @js.native
  val Grid: ReactComponentClass[CardGridProps] = js.native
  
  @JSImport("componentstest", "ObjectNames")
  @js.native
  val ObjectNames: ReactComponentClass[Equals] = js.native
  
  @js.native
  trait A extends Props {
    
    def aCallback(): Double = js.native
    
    var aMember: Double = js.native
  }
  object A {
    
    @scala.inline
    def apply(aCallback: () => Double, aMember: Double): A = {
      val __obj = js.Dynamic.literal(aCallback = js.Any.fromFunction0(aCallback), aMember = aMember.asInstanceOf[js.Any])
      __obj.asInstanceOf[A]
    }
    
    @scala.inline
    implicit class AOps[Self <: A] (val x: Self) extends AnyVal {
      
      @scala.inline
      def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
      
      @scala.inline
      def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
      
      @scala.inline
      def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
      }
      
      @scala.inline
      def setACallback(value: () => Double): Self = this.set("aCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAMember(value: Double): Self = this.set("aMember", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait B extends Props {
    
    var bCallback: js.UndefOr[js.Function0[String]] = js.native
    
    var bMember: String = js.native
  }
  object B {
    
    @scala.inline
    def apply(bMember: String): B = {
      val __obj = js.Dynamic.literal(bMember = bMember.asInstanceOf[js.Any])
      __obj.asInstanceOf[B]
    }
    
    @scala.inline
    implicit class BOps[Self <: B] (val x: Self) extends AnyVal {
      
      @scala.inline
      def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
      
      @scala.inline
      def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
      
      @scala.inline
      def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
      }
      
      @scala.inline
      def setBMember(value: String): Self = this.set("bMember", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBCallback(value: () => String): Self = this.set("bCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def deleteBCallback: Self = this.set("bCallback", js.undefined)
    }
  }
  
  @js.native
  trait CardGridProps extends js.Object {
    
    var className: js.UndefOr[String] = js.native
    
    var hoverable: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object CardGridProps {
    
    @scala.inline
    def apply(): CardGridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardGridProps]
    }
    
    @scala.inline
    implicit class CardGridPropsOps[Self <: CardGridProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
      
      @scala.inline
      def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
      
      @scala.inline
      def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
      }
      
      @scala.inline
      def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteClassName: Self = this.set("className", js.undefined)
      
      @scala.inline
      def setHoverable(value: Boolean): Self = this.set("hoverable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteHoverable: Self = this.set("hoverable", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteStyle: Self = this.set("style", js.undefined)
    }
  }
  
  @js.native
  trait CardInterface extends FunctionComponent[CardProps] {
    
    var Grid2: ReactComponentClass[CardGridProps] = js.native
  }
  
  /* Inlined parent std.Omit<std.Pick<react.react.HTMLAttributes<std.HTMLDivElement>, 'title' | 'onClick'>, 'title'> */
  @js.native
  trait CardProps extends js.Object {
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
  }
  object CardProps {
    
    @scala.inline
    def apply(): CardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardProps]
    }
    
    @scala.inline
    implicit class CardPropsOps[Self <: CardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
      
      @scala.inline
      def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
      
      @scala.inline
      def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
      }
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def deleteOnClick: Self = this.set("onClick", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.componentstest.mod.A
    - typingsSlinky.componentstest.mod.B
  */
  trait Props extends js.Object
  object Props {
    
    @scala.inline
    def A(aCallback: () => Double, aMember: Double): Props = {
      val __obj = js.Dynamic.literal(aCallback = js.Any.fromFunction0(aCallback), aMember = aMember.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    def B(bMember: String): Props = {
      val __obj = js.Dynamic.literal(bMember = bMember.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
  }
}