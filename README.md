# GoogleNewsApp

This is an app which you can get news about your country agenda.
You can download app and install from **[here.](https://github.com/SaidAtmaca/GoogleNewsApp/raw/master/apk(s)/newsApp.apk)** 


## Screenshots

<table><tr>
<td> 
  <p align="center" style="padding: 10px">
    <img alt="Forwarding" src="https://user-images.githubusercontent.com/54797582/206423151-af66afb3-ee85-4ea5-a77c-fe3584da0299.png" width="400">
    <br>
    <em style="color: grey">Feed</em>
  </p> 
</td>
<td> 
  <p align="center">
    <img alt="Routing" src="https://user-images.githubusercontent.com/54797582/206423455-f2c02cb9-231b-45c5-bf35-80c79de1a7e2.gif" width="400">
    <br>
    <em style="color: grey">Flow</em>
  </p> 
</td>
</tr></table>


## Tech Stack

* [Kotlin](https://kotlinlang.org/) - Kotlin programming language.
* [MVVM Architecture](https://developer.android.com/jetpack/guide) - Modern, maintainable, and Google suggested app architecture
* [Data Binding](https://developer.android.com/topic/libraries/data-binding) - The Data Binding Library is a support library that allows you to bind UI components in your layouts to data sources in your app
* [Live Data](https://developer.android.com/topic/libraries/architecture/livedata) - LiveData is an observable data holder class.
* [Retrofit2 & OkHttp3](https://github.com/square/retrofit) - A type-safe HTTP client for Android and the JVM.
* [Gson](https://github.com/google/gson) - Gson is a Java library that can be used to convert Java Objects into their JSON representation. 
* [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - ViewModel class is designed to store and manage UI-related data in a lifecycle conscious way.
* [Swipe Refresh Layout](https://developer.android.com/jetpack/androidx/releases/swiperefreshlayout)

## Architecture

* Model: This layer is responsible for the abstraction of the data sources. Model and ViewModel work together to get and save the data.
* View: The purpose of this layer is to inform the ViewModel about the user’s action. This layer observes the ViewModel and does not contain any kind of application logic.
* ViewModel: It exposes those data streams which are relevant to the View. Moreover, it serves as a link between the Model and the View.


<table align="center"><tr>
<td> 
  <p align="center" style="padding: 10px">
    <img alt="Forwarding" src="https://user-images.githubusercontent.com/54797582/206427767-095ed800-0e5b-4e69-a19c-5302861de80d.png" width="400">
    <br>
    <em style="color: grey">Architecture Diagram</em>
  </p> 
</td>
</tr></table>


## For Development

- Open this repository with Android Studio
- You need to add **News API Key.** You can get Api Key from [here.](https://newsapi.org/s/turkey-news-api)



