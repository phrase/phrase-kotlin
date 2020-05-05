# FormatsApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**formatsList**](FormatsApi.md#formatsList) | **GET** /formats | List formats


<a name="formatsList"></a>
# **formatsList**
> kotlin.Array&lt;Format&gt; formatsList(xminusPhraseAppMinusOTP)

List formats

Get a handy list of all localization file formats supported in Phrase.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = FormatsApi()
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : kotlin.Array<Format> = apiInstance.formatsList(xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FormatsApi#formatsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FormatsApi#formatsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**kotlin.Array&lt;Format&gt;**](Format.md)

### Authorization


Configure Basic:
    ApiClient.username = ""
    ApiClient.password = ""
Configure Token:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

