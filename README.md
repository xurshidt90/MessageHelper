# MessageHelper

[![](https://jitpack.io/v/xurshidt90/MessageHelper.svg)](https://jitpack.io/#xurshidt90/MessageHelper)

Message helper for Android


> Step 1. Add the JitPack repository to your build file
```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

> Step 2. Add the dependency
```gradle
dependencies {
	implementation 'com.github.xurshidt90:MessageHelper:1.0.0'
}
```


> How to use
```kotlin
button.setOnClicListener{
	MessageHelper.showMessage(this, "Show test message")
}
```
