# MessageHelper
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
	implementation 'com.github.xurshidt90:MessageHelper:Tag'
}
```


> How to use
```kotlin
button.setOnClicListener{
	MessageHelper.showMessage(this, "Show test message")
}
```
