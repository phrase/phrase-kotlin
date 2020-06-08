# ScreenshotsApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**screenshotCreate**](ScreenshotsApi.md#screenshotCreate) | **POST** /projects/{project_id}/screenshots | Create a screenshot
[**screenshotDelete**](ScreenshotsApi.md#screenshotDelete) | **DELETE** /projects/{project_id}/screenshots/{id} | Delete a screenshot
[**screenshotShow**](ScreenshotsApi.md#screenshotShow) | **GET** /projects/{project_id}/screenshots/{id} | Get a single screenshot
[**screenshotUpdate**](ScreenshotsApi.md#screenshotUpdate) | **PATCH** /projects/{project_id}/screenshots/{id} | Update a screenshot
[**screenshotsList**](ScreenshotsApi.md#screenshotsList) | **GET** /projects/{project_id}/screenshots | List screenshots


<a name="screenshotCreate"></a>
# **screenshotCreate**
> Screenshot screenshotCreate(projectId, screenshotCreateParameters, xminusPhraseAppMinusOTP)

Create a screenshot

Create a new screenshot.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = ScreenshotsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val screenshotCreateParameters : ScreenshotCreateParameters =  // ScreenshotCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Screenshot = apiInstance.screenshotCreate(projectId, screenshotCreateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreenshotsApi#screenshotCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreenshotsApi#screenshotCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **screenshotCreateParameters** | [**ScreenshotCreateParameters**](ScreenshotCreateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Screenshot**](Screenshot.md)

### Authorization


Configure Basic:
    ApiClient.username = ""
    ApiClient.password = ""
Configure Token:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="screenshotDelete"></a>
# **screenshotDelete**
> screenshotDelete(projectId, id, xminusPhraseAppMinusOTP)

Delete a screenshot

Delete an existing screenshot.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = ScreenshotsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.screenshotDelete(projectId, id, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling ScreenshotsApi#screenshotDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreenshotsApi#screenshotDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

null (empty response body)

### Authorization


Configure Basic:
    ApiClient.username = ""
    ApiClient.password = ""
Configure Token:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="screenshotShow"></a>
# **screenshotShow**
> Screenshot screenshotShow(projectId, id, xminusPhraseAppMinusOTP)

Get a single screenshot

Get details on a single screenshot for a given project.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = ScreenshotsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Screenshot = apiInstance.screenshotShow(projectId, id, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreenshotsApi#screenshotShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreenshotsApi#screenshotShow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Screenshot**](Screenshot.md)

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

<a name="screenshotUpdate"></a>
# **screenshotUpdate**
> Screenshot screenshotUpdate(projectId, id, screenshotUpdateParameters, xminusPhraseAppMinusOTP)

Update a screenshot

Update an existing screenshot.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = ScreenshotsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val screenshotUpdateParameters : ScreenshotUpdateParameters =  // ScreenshotUpdateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Screenshot = apiInstance.screenshotUpdate(projectId, id, screenshotUpdateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreenshotsApi#screenshotUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreenshotsApi#screenshotUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **screenshotUpdateParameters** | [**ScreenshotUpdateParameters**](ScreenshotUpdateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Screenshot**](Screenshot.md)

### Authorization


Configure Basic:
    ApiClient.username = ""
    ApiClient.password = ""
Configure Token:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="screenshotsList"></a>
# **screenshotsList**
> kotlin.Array&lt;Screenshot&gt; screenshotsList(projectId, xminusPhraseAppMinusOTP, page, perPage)

List screenshots

List all screenshots for the given project.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = ScreenshotsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
try {
    val result : kotlin.Array<Screenshot> = apiInstance.screenshotsList(projectId, xminusPhraseAppMinusOTP, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreenshotsApi#screenshotsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreenshotsApi#screenshotsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **kotlin.Int**| Page number | [optional]
 **perPage** | **kotlin.Int**| allows you to specify a page size up to 100 items, 10 by default | [optional]

### Return type

[**kotlin.Array&lt;Screenshot&gt;**](Screenshot.md)

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

