<p align="center">
  <img src="https://github.com/LinX64/MVI-Library/actions/workflows/publish.yaml/badge.svg" alt="master CI">
</p>

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
mvi-compose-common = { group = "io.github.linx64", name = "mvicompose", version.ref = "mvi-compose" }
```

#### Gradle (Kotlin DSL)

```kotlin
dependencies {
    implementation("io.github.linx64:mvi-compose:1.0")
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
 ComposeScreen(
        viewModel = mainViewModel,
        onEffect = { effect ->
            when (effect) {
                MainNavigationEffect.NavigateToSettings -> onNavigateToSettings()
            }
        }
    ) { state ->
        // Your UI that uses the state
        // Example: Text(text = state.someProperty)
    }
```

Please see the [sample app](https://github.com/LinX64/MVI-Library/tree/develop/sample) for a complete example of how to use this library.
