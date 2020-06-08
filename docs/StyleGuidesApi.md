# StyleGuidesApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**styleguideCreate**](StyleGuidesApi.md#styleguideCreate) | **POST** /projects/{project_id}/styleguides | Create a style guide
[**styleguideDelete**](StyleGuidesApi.md#styleguideDelete) | **DELETE** /projects/{project_id}/styleguides/{id} | Delete a style guide
[**styleguideShow**](StyleGuidesApi.md#styleguideShow) | **GET** /projects/{project_id}/styleguides/{id} | Get a single style guide
[**styleguideUpdate**](StyleGuidesApi.md#styleguideUpdate) | **PATCH** /projects/{project_id}/styleguides/{id} | Update a style guide
[**styleguidesList**](StyleGuidesApi.md#styleguidesList) | **GET** /projects/{project_id}/styleguides | List style guides


<a name="styleguideCreate"></a>
# **styleguideCreate**
> StyleguideDetails styleguideCreate(projectId, styleguideCreateParameters, xminusPhraseAppMinusOTP)

Create a style guide

Create a new style guide.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = StyleGuidesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val styleguideCreateParameters : StyleguideCreateParameters =  // StyleguideCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : StyleguideDetails = apiInstance.styleguideCreate(projectId, styleguideCreateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StyleGuidesApi#styleguideCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StyleGuidesApi#styleguideCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **styleguideCreateParameters** | [**StyleguideCreateParameters**](StyleguideCreateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**StyleguideDetails**](StyleguideDetails.md)

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

<a name="styleguideDelete"></a>
# **styleguideDelete**
> styleguideDelete(projectId, id, xminusPhraseAppMinusOTP)

Delete a style guide

Delete an existing style guide.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = StyleGuidesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.styleguideDelete(projectId, id, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling StyleGuidesApi#styleguideDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StyleGuidesApi#styleguideDelete")
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

<a name="styleguideShow"></a>
# **styleguideShow**
> StyleguideDetails styleguideShow(projectId, id, xminusPhraseAppMinusOTP)

Get a single style guide

Get details on a single style guide.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = StyleGuidesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : StyleguideDetails = apiInstance.styleguideShow(projectId, id, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StyleGuidesApi#styleguideShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StyleGuidesApi#styleguideShow")
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

[**StyleguideDetails**](StyleguideDetails.md)

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

<a name="styleguideUpdate"></a>
# **styleguideUpdate**
> StyleguideDetails styleguideUpdate(projectId, id, styleguideUpdateParameters, xminusPhraseAppMinusOTP)

Update a style guide

Update an existing style guide.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = StyleGuidesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val styleguideUpdateParameters : StyleguideUpdateParameters =  // StyleguideUpdateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : StyleguideDetails = apiInstance.styleguideUpdate(projectId, id, styleguideUpdateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StyleGuidesApi#styleguideUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StyleGuidesApi#styleguideUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **styleguideUpdateParameters** | [**StyleguideUpdateParameters**](StyleguideUpdateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**StyleguideDetails**](StyleguideDetails.md)

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

<a name="styleguidesList"></a>
# **styleguidesList**
> kotlin.Array&lt;Styleguide&gt; styleguidesList(projectId, xminusPhraseAppMinusOTP, page, perPage)

List style guides

List all styleguides for the given project.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = StyleGuidesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
try {
    val result : kotlin.Array<Styleguide> = apiInstance.styleguidesList(projectId, xminusPhraseAppMinusOTP, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StyleGuidesApi#styleguidesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StyleGuidesApi#styleguidesList")
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

[**kotlin.Array&lt;Styleguide&gt;**](Styleguide.md)

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

