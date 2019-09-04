# simple-counter

This a simple implementation of a counter custom view 

## Usage

Add the counter view to your layout to get started.

```xml
 <com.davidodari.simplecounter.SimpleCounter
        android:id="@+id/simpleCounter"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>

```
Then to get the current value implement the listener 
```kotlin
 simpleCounter.setListener { value ->
            Toast.makeText(this,"$value",Toast.LENGTH_SHORT).show()
  }
```

## Download

Add jitpack to project level build.gradle

```groovy
allprojects {
 repositories {
    maven { url "https://jitpack.io" }
 }
}
```

Then add the library to module level build.gradle.
```groovy
 implementation 'com.github.Davidodari:simple-counter:$latest_release'
```

|![Counter Gif](art/counter.gif)|Simple Counter|
|:--:|:--:|

<i>&copy; David Odari</i>

