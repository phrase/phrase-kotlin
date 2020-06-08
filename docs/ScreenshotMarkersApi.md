# ScreenshotMarkersApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**screenshotMarkerCreate**](ScreenshotMarkersApi.md#screenshotMarkerCreate) | **POST** /projects/{project_id}/screenshots/{screenshot_id}/markers | Create a screenshot marker
[**screenshotMarkerDelete**](ScreenshotMarkersApi.md#screenshotMarkerDelete) | **DELETE** /projects/{project_id}/screenshots/{screenshot_id}/markers | Delete a screenshot marker
[**screenshotMarkerShow**](ScreenshotMarkersApi.md#screenshotMarkerShow) | **GET** /projects/{project_id}/screenshots/{screenshot_id}/markers/{id} | Get a single screenshot marker
[**screenshotMarkerUpdate**](ScreenshotMarkersApi.md#screenshotMarkerUpdate) | **PATCH** /projects/{project_id}/screenshots/{screenshot_id}/markers | Update a screenshot marker
[**screenshotMarkersList**](ScreenshotMarkersApi.md#screenshotMarkersList) | **GET** /projects/{project_id}/screenshots/{id}/markers | List screenshot markers


<a name="screenshotMarkerCreate"></a>
# **screenshotMarkerCreate**
> ScreenshotMarker screenshotMarkerCreate(projectId, screenshotId, screenshotMarkerCreateParameters, xminusPhraseAppMinusOTP)

Create a screenshot marker

Create a new screenshot marker.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = ScreenshotMarkersApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val screenshotId : kotlin.String = screenshotId_example // kotlin.String | Screenshot ID
val screenshotMarkerCreateParameters : ScreenshotMarkerCreateParameters =  // ScreenshotMarkerCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : ScreenshotMarker = apiInstance.screenshotMarkerCreate(projectId, screenshotId, screenshotMarkerCreateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreenshotMarkersApi#screenshotMarkerCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreenshotMarkersApi#screenshotMarkerCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **screenshotId** | **kotlin.String**| Screenshot ID |
 **screenshotMarkerCreateParameters** | [**ScreenshotMarkerCreateParameters**](ScreenshotMarkerCreateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**ScreenshotMarker**](ScreenshotMarker.md)

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

<a name="screenshotMarkerDelete"></a>
# **screenshotMarkerDelete**
> screenshotMarkerDelete(projectId, screenshotId, xminusPhraseAppMinusOTP)

Delete a screenshot marker

Delete an existing screenshot marker.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = ScreenshotMarkersApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val screenshotId : kotlin.String = screenshotId_example // kotlin.String | Screenshot ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.screenshotMarkerDelete(projectId, screenshotId, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling ScreenshotMarkersApi#screenshotMarkerDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreenshotMarkersApi#screenshotMarkerDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **screenshotId** | **kotlin.String**| Screenshot ID |
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

<a name="screenshotMarkerShow"></a>
# **screenshotMarkerShow**
> ScreenshotMarker screenshotMarkerShow(projectId, screenshotId, id, xminusPhraseAppMinusOTP)

Get a single screenshot marker

Get details on a single screenshot marker for a given project.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = ScreenshotMarkersApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val screenshotId : kotlin.String = screenshotId_example // kotlin.String | Screenshot ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : ScreenshotMarker = apiInstance.screenshotMarkerShow(projectId, screenshotId, id, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreenshotMarkersApi#screenshotMarkerShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreenshotMarkersApi#screenshotMarkerShow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **screenshotId** | **kotlin.String**| Screenshot ID |
 **id** | **kotlin.String**| ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**ScreenshotMarker**](ScreenshotMarker.md)

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

<a name="screenshotMarkerUpdate"></a>
# **screenshotMarkerUpdate**
> ScreenshotMarker screenshotMarkerUpdate(projectId, screenshotId, screenshotMarkerUpdateParameters, xminusPhraseAppMinusOTP)

Update a screenshot marker

Update an existing screenshot marker.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = ScreenshotMarkersApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val screenshotId : kotlin.String = screenshotId_example // kotlin.String | Screenshot ID
val screenshotMarkerUpdateParameters : ScreenshotMarkerUpdateParameters =  // ScreenshotMarkerUpdateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : ScreenshotMarker = apiInstance.screenshotMarkerUpdate(projectId, screenshotId, screenshotMarkerUpdateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreenshotMarkersApi#screenshotMarkerUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreenshotMarkersApi#screenshotMarkerUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **screenshotId** | **kotlin.String**| Screenshot ID |
 **screenshotMarkerUpdateParameters** | [**ScreenshotMarkerUpdateParameters**](ScreenshotMarkerUpdateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**ScreenshotMarker**](ScreenshotMarker.md)

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

<a name="screenshotMarkersList"></a>
# **screenshotMarkersList**
> kotlin.Array&lt;ScreenshotMarker&gt; screenshotMarkersList(projectId, id, xminusPhraseAppMinusOTP, page, perPage)

List screenshot markers

List all screenshot markers for the given project.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = ScreenshotMarkersApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
try {
    val result : kotlin.Array<ScreenshotMarker> = apiInstance.screenshotMarkersList(projectId, id, xminusPhraseAppMinusOTP, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreenshotMarkersApi#screenshotMarkersList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreenshotMarkersApi#screenshotMarkersList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **kotlin.Int**| Page number | [optional]
 **perPage** | **kotlin.Int**| allows you to specify a page size up to 100 items, 10 by default | [optional]

### Return type

[**kotlin.Array&lt;ScreenshotMarker&gt;**](ScreenshotMarker.md)

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

