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

* 2.01 **Applying the Java plugin** [Java plugin tasks relationships](https://docs.gradle.org/current/userguide/java_plugin.html)
* 2.02 Exercise: `apply plugin: "java"`
* 2.03 **add additional configuration to Java plugin**
* 2.04 **use local / remote libs**
* 2.05 **define dependencies**
* 2.06 Exercise define dependencies
* 