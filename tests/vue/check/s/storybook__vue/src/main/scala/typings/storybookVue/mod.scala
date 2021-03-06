package typings.storybookVue

import org.scalablytyped.runtime.StringDictionary
import typings.storybookVue.anon.Kind
import typings.vue.optionsMod.ComponentOptions
import typings.vue.optionsMod.DefaultComputed
import typings.vue.optionsMod.DefaultData
import typings.vue.optionsMod.DefaultMethods
import typings.vue.optionsMod.DefaultProps
import typings.vue.optionsMod.PropsDefinition
import typings.vue.vueMod.Vue
import typings.webpackEnv.NodeModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/vue", "addDecorator")
  @js.native
  def addDecorator(decorator: StoryDecorator): Unit = js.native
  
  @JSImport("@storybook/vue", "configure")
  @js.native
  def configure(loaders: js.Function0[Unit], module: NodeModule): Unit = js.native
  
  @JSImport("@storybook/vue", "getStorybook")
  @js.native
  def getStorybook(): js.Array[StoryStore] = js.native
  
  @JSImport("@storybook/vue", "setAddon")
  @js.native
  def setAddon(addon: Addon): Unit = js.native
  
  @JSImport("@storybook/vue", "storiesOf")
  @js.native
  def storiesOf(kind: String, module: NodeModule): Story = js.native
  
  @js.native
  trait Story extends StObject {
    
    def add(storyName: String, getStory: StoryFunction): this.type = js.native
    
    def addDecorator(decorator: StoryDecorator): this.type = js.native
    
    val kind: String = js.native
  }
  object Story {
    
    @scala.inline
    def apply(add: (String, StoryFunction) => Story, addDecorator: StoryDecorator => Story, kind: String): Story = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addDecorator = js.Any.fromFunction1(addDecorator), kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[Story]
    }
    
    @scala.inline
    implicit class StoryMutableBuilder[Self <: Story] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: (String, StoryFunction) => Story): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddDecorator(value: StoryDecorator => Story): Self = StObject.set(x, "addDecorator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StoryObject extends StObject {
    
    var name: String = js.native
    
    def render(): (ComponentOptions[
        Vue, 
        DefaultData[Vue], 
        DefaultMethods[Vue], 
        DefaultComputed, 
        PropsDefinition[DefaultProps]
      ]) | String = js.native
    @JSName("render")
    var render_Original: StoryFunction = js.native
  }
  
  @js.native
  trait StoryStore extends StObject {
    
    var fileName: js.UndefOr[String] = js.native
    
    var kind: String = js.native
    
    var stories: js.Array[StoryObject] = js.native
  }
  object StoryStore {
    
    @scala.inline
    def apply(kind: String, stories: js.Array[StoryObject]): StoryStore = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryStore]
    }
    
    @scala.inline
    implicit class StoryStoreMutableBuilder[Self <: StoryStore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStories(value: js.Array[StoryObject]): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoriesVarargs(value: StoryObject*): Self = StObject.set(x, "stories", js.Array(value :_*))
    }
  }
  
  type Addon = StringDictionary[js.Function2[/* storyName */ String, /* storyFn */ StoryFunction, Unit]]
  
  type StoryDecorator = js.Function2[
    /* story */ js.Function0[
      ComponentOptions[
        Vue, 
        DefaultData[Vue], 
        DefaultMethods[Vue], 
        DefaultComputed, 
        PropsDefinition[DefaultProps]
      ]
    ], 
    /* context */ Kind, 
    (ComponentOptions[
      Vue, 
      DefaultData[Vue], 
      DefaultMethods[Vue], 
      DefaultComputed, 
      PropsDefinition[DefaultProps]
    ]) | Null
  ]
  
  type StoryFunction = js.Function0[
    (ComponentOptions[
      Vue, 
      DefaultData[Vue], 
      DefaultMethods[Vue], 
      DefaultComputed, 
      PropsDefinition[DefaultProps]
    ]) | String
  ]
}
