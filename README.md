## 🚀📘 MVI Library for Compose Multiplatform

The **MVI Compose Multiplatform Library** is designed to facilitate the implementation of the MVI (
Model-View-Intent) architecture using Jetpack Compose for Multiplatform. It allows developers to
create scalable, maintainable, and testable applications with a clear separation of concerns.

## Features

- **Multiplatform Support**: Shared codebase for Android, and iOS.
- **Jetpack Compose Integration**: Leverages Jetpack Compose for building reactive UIs.
- **MVI Architecture**: Simplifies state management and UI updates.
- **Asynchronous Operations**: Seamless handling of asynchronous tasks.

### Installation

Add the library to your project's dependencies.

#### Version catalog

```kotlin
mvi-compose = "<version>"
mvi-compose-common = { module = "io.github.linx64:mvicompose", version.ref = "mvi-compose" }
```

#### Gradle (Kotlin DSL)

```kotlin
dependencies {
    implementation("io.github.linx64:mvicompose:1.5") //Find the latest version here: https://central.sonatype.com/artifact/io.github.linx64/mvicompose
}
```

### Usage

To use this library, you need to create a `ViewModel` class that extends the `MviViewModel` class,
and overrides an onEvent method. This method will be called whenever an event is dispatched to the
`ViewModel`. The `ViewModel` will then update its state and emit it to the UI.

```kotlin
class MainViewModel : MviViewModel<MainViewEvent, MainState, MainNavigationEffect>(MainState.Loading) {

    // TODO: Implement the ViewModel
    override fun handleEvent(event: MainViewEvent) {
        when(event) {
            MainViewEvent.OnLoadRates -> setState { MainState.Loading }
        }
    }
}
```
Also, for Effects, you can use `ComposeScreen` component inside the Composable screens to handle the navigation and side effects.

```kotlin
HandleNavigationEffect(mainViewModel) { effect ->
    when (effect) {
        is MainNavigationEffect.NavigateToSettings -> onNavigateToSettings()
    }
}
```

Please see the [sample app](https://github.com/LinX64/MVI-Library/tree/develop/sample) for a complete example of how to use this library.
