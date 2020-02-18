[![](https://jitpack.io/v/blastercoil/FeatherIcons-iconfont-lib.svg)](https://jitpack.io/#blastercoil/FeatherIcons-iconfont-lib)

# FeatherIconsLib

Feather iconfont wrapped in a library for convenience.  
Font sourced from https://github.com/AT-UI/feather-font

<img src = "media/feather_icon_lib1.png" width = "400">&nbsp;<img src = "media/feather_icon_lib2.png" width = "400">  

## Dependency

Add this in your project level `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
        maven { url "https://jitpack.io" }
    }
}
```

Add library dependency to your module (usually `app`) `build.gradle`
```gradle
dependencies {
    implementation 'com.github.blastercoil:FeatherIcons-iconfont-lib:<current version, e.g. 1.0.0>'
}
```

## Usage:

In XML:
```XML
<TextView
  style="@style/feather_font"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
  android:text="@string/feather_help_circle"
/>
```

In code:
```kotlin
text_view?.text = FeatherIcons.feather_shopping_cart.glyph
  ```


## [License](LICENSE)
