# Movie World (Jetpack Compose) 
![badge-Android](https://img.shields.io/badge/Platform-Android-brightgreen)
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)
[![Kotlin](https://img.shields.io/badge/Kotlin-1.8.20-blue.svg?style=flat&logo=kotlin)](https://kotlinlang.org)
[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](https://www.apache.org/licenses/LICENSE-2.0)
<a href="https://github.com/piashcse"><img alt="License" src="https://img.shields.io/static/v1?label=GitHub&message=piashcse&color=C51162"/></a>

Movie World app using [The Movie DB](https://www.themoviedb.org) built with jetpack Compose and MVVM architecture.<br>


<p float="left">
  <img width="30%" height="50%" src="https://github.com/piashcse/Hilt-MVVM-Compose-Movie/blob/master/screenshots/Screenshot_20220420_022455.png" />
  <img width="30%" height="50%" src="https://github.com/piashcse/Hilt-MVVM-Compose-Movie/blob/master/screenshots/Screenshot_20220420_022546.png" />
  <img width="30%" height="50%" src="https://github.com/piashcse/Hilt-MVVM-Compose-Movie/blob/master/screenshots/Screenshot_20220420_021842.png" />
</p>

# Main Features
- Movie List 
- Filter with genre 
- Pagination with paging3
- Movie detail
- Artist info and artist detail
- Bottom navigation
- Search filter for movie
- Genre movie in navigation drawer
- Network connection state with SnackBar

## Architecture
  - MVVM Architecture (Model - ComposableView - ViewModel)
  - Repository pattern
  - Hilt - dependency injection
 <p align="center" width="100%">
   <img width="30%" height="50%" src="https://github.com/piashcse/Hilt-MVVM-Compose-Movie/blob/master/screenshots/composemovie.gif" />
 </p>

## Built With 🛠
- [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
- [Jetpack Compose](https://developer.android.com/jetpack/compose) - Jetpack Compose is Android’s modern toolkit for building native UI.
- [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - For asynchronous and more..
- [Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/) - A cold asynchronous data stream that sequentially emits values and completes normally or with an exception.
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
  - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Data objects that notify views when the underlying database changes.
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes.
  - [Paging3](https://developer.android.com/topic/libraries/architecture/paging/v3-overview) - The Paging library helps you load and display pages of data from a larger dataset from local storage or over network
- [Dependency Injection](https://developer.android.com/training/dependency-injection)
  - [Hilt](https://dagger.dev/hilt) - Easier way to incorporate Dagger DI into Android apps.
- [Retrofit](https://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java.
- [Material Components for Android](https://github.com/material-components/material-components-android) - Modular and customizable Material Design UI components for Android.
- [Timber](https://github.com/JakeWharton/timber) - A logger with a small, extensible API which provides utility on top of Android's normal Log class.


