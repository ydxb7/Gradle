# ud867: Gradle for Android and Java

Welcome to the demos and exercises accompanying ud867 at Udacity!

Each directory contains a README.md or solution.gradle that will explain either
the concept being explored or the exercise at hand. For each exercise, hints
and a solution.gradle file are also provided.

This course is specifically concerned with the app build process, not writing
apps in the first place. If you're just starting out on your Android journey,
you might want to take Udacity's [Developing Android
Apps](https://www.udacity.com/course/ud853) course.

## My Note

* 1.02 install Gradle
* 1.03 **Groovy fundamentals**: use java to run groovy
* 1.04 **Groovy fundamentals**: closures(闭包): Closures have two interesting features. First, they are just values that can be assigned to a variable, just like a number or a string. Second, they can capture variables from the scope in which they're declared.
* 1.06 **Create Gradle task, Add an action to your task**
* 1.08 **Task Dependencies**: relationships between tasks `dependsOn`, `finalizedBy`, `shouldRunAfter`, `mustRunAfter`
* 1.09 Exercise Task Dependencies
* 1.10 **Copying, zip and delete** files in Gradle
* 1.11 Exercise Copying, zip and delete
* 1.12 **incremental build** only build the task which is new or modified.
* 1.13 **gradle.properties** parametrize your build by adding properties to the
project object from outside your build script.
* 1.14 Exercise gradle.properties
* 1.15 **custom task type**
* 1.16 Exercise custom task type
* 1.17 **Logging** `logger.info`
* 1.18 **BuildLifecycle** 在 `doLast` 外面的都会在 Configuration 的时候就print出来，因为Configuration的时候会给task的执行顺序排序。在 `doLast` 里面的，只有在执行那个task的时候才print

---
#### java

* 2.01 **Applying the Java plugin and Run task** [Java plugin tasks relationships](https://docs.gradle.org/current/userguide/java_plugin.html) `task execute(type: JavaExec)`
* 2.02 Exercise: `apply plugin: "java"`
* 2.03 **add additional configuration to Java plugin**
* 2.04 **use local / remote libs**
* 2.05 **define dependencies**
* 2.06 Exercise define dependencies
* 2.07 **visualize dependencies** `gradle dependencies` `gradle dependencies --configuration runtime` `gradle dependencyInsight --dependency commons-logging`
* 2.08 **add dependencies to the 'compile' / 'testCompile' configuration / create a custom configuration.** Configurations are really just fancy file collections and can be used anywhere a file collection can be used, such as in Copy tasks.
* 2.09 Exercise: working with configurations. 1. Create a new configuration called 'deps'. 2. Make 'compile' extend from 'deps'. 3. Add 'guava' dependency. 5. Add Zip task to bundle dependencies from 'deps'
* 2.10 **unit test**
* 2.11 Exercise: test
* [third party plugin](https://plugins.gradle.org/)
* 2.12 **Gradle wrapper** put your build tool under version control. `gradle wrapper` `./gradlew --version`
* 2.13 Exercise: Gradle wrapper

---
#### different flavors

* 3.01 **import Gradle project into Android Studio** `$ chmod +x gradlew` `./gradlew tellJoke`
* 3.02 Exercise: import Gradle project into Android Studio
* 3.04 **`buildTypes`** (debug, release) add new build types of our own
* 3.05 Exercise: buildTypes. Set the application id suffix for the 'debug' build type to 'debug'.
* 3.06 **`productFlavors`** free or paid: total 4 types: freeDebug, freeRelease, paidDebug, paidRelease. `Build > Select Build Variant`
* 3.07 Exercise: productFlavors. flavor dimension: 例如各个版本都根据分辨率不同生成多个版本。
* 3.08 **Use different flavors(free, debug) to run the app.** We'll make an app where both flavors present a "Tell Joke" button. `Build > Select Build Variant`
  * **paid flavor** that button will launch a new activity that displays a joke.
  * **free flavor** will display a toast telling the user to upgrade to the paid version.

---
#### multi project builds

* 4.01 **Creating a Java library, Add a Java library project to an Android studio build**.`settings.gradle` : tell Gradle what sub-projects to include in the multi-project build. `include ':app', ':javaJokes'`,`./gradlew projects`, project dependency: `implementation project(':javaJokes')`
* 4.02 Exercise: **Create android library and add it to app**
* 4.03 Create android library and add it to app
* 4.04 **Create and add a Java lib and an Android lib**
* 4.05 **Add a signing configuration** [https://classroom.udacity.com/courses/ud867/lessons/3983839023/concepts/43260001280923](https://classroom.udacity.com/courses/ud867/lessons/3983839023/concepts/43260001280923)
* 4.06 Exercise: Add a signing configuration
* 4.07 more than 65,000 methods `multiDexEnabled true`
* 4.08 **Proguard** 去除多余代码或resources `minifyEnabled true``shrinkResources true`
* 4.09 **Unit test and Connect(Android) test** 一个只需要java(对应 test)，一个需要android框架(对应 androidTest)
* 4.10 Exercise: add a Unit test and an Android test.