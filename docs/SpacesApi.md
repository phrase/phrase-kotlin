# SpacesApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**spaceCreate**](SpacesApi.md#spaceCreate) | **POST** /accounts/{account_id}/spaces | Create a Space
[**spaceDelete**](SpacesApi.md#spaceDelete) | **DELETE** /accounts/{account_id}/spaces/{id} | Delete Space
[**spaceShow**](SpacesApi.md#spaceShow) | **GET** /accounts/{account_id}/spaces/{id} | Get Space
[**spaceUpdate**](SpacesApi.md#spaceUpdate) | **PATCH** /accounts/{account_id}/spaces/{id} | Update Space
[**spacesList**](SpacesApi.md#spacesList) | **GET** /accounts/{account_id}/spaces | List Spaces
[**spacesProjectsCreate**](SpacesApi.md#spacesProjectsCreate) | **POST** /accounts/{account_id}/spaces/{space_id}/projects | Add Project
[**spacesProjectsDelete**](SpacesApi.md#spacesProjectsDelete) | **DELETE** /accounts/{account_id}/spaces/{space_id}/projects/{id} | Remove Project
[**spacesProjectsList**](SpacesApi.md#spacesProjectsList) | **GET** /accounts/{account_id}/spaces/{space_id}/projects | List Projects


<a name="spaceCreate"></a>
# **spaceCreate**
> spaceCreate(accountId, spaceCreateParameters, xminusPhraseAppMinusOTP)

Create a Space

Create a new Space.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = SpacesApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val spaceCreateParameters : SpaceCreateParameters =  // SpaceCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.spaceCreate(accountId, spaceCreateParameters, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling SpacesApi#spaceCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpacesApi#spaceCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **spaceCreateParameters** | [**SpaceCreateParameters**](SpaceCreateParameters.md)|  |
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

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="spaceDelete"></a>
# **spaceDelete**
> spaceDelete(accountId, id, xminusPhraseAppMinusOTP)

Delete Space

Delete the specified Space.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = SpacesApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.spaceDelete(accountId, id, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling SpacesApi#spaceDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpacesApi#spaceDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
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

<a name="spaceShow"></a>
# **spaceShow**
> Space spaceShow(accountId, id, xminusPhraseAppMinusOTP)

Get Space

Show the specified Space.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = SpacesApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Space = apiInstance.spaceShow(accountId, id, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpacesApi#spaceShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpacesApi#spaceShow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **id** | **kotlin.String**| ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Space**](Space.md)

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

<a name="spaceUpdate"></a>
# **spaceUpdate**
> Space spaceUpdate(accountId, id, spaceUpdateParameters, xminusPhraseAppMinusOTP)

Update Space

Update the specified Space.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = SpacesApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val id : kotlin.String = id_example // kotlin.String | ID
val spaceUpdateParameters : SpaceUpdateParameters =  // SpaceUpdateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Space = apiInstance.spaceUpdate(accountId, id, spaceUpdateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpacesApi#spaceUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpacesApi#spaceUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **id** | **kotlin.String**| ID |
 **spaceUpdateParameters** | [**SpaceUpdateParameters**](SpaceUpdateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Space**](Space.md)

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

<a name="spacesList"></a>
# **spacesList**
> kotlin.Array&lt;Space&gt; spacesList(accountId, xminusPhraseAppMinusOTP, page, perPage)

List Spaces

List all Spaces for the given account.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = SpacesApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
try {
    val result : kotlin.Array<Space> = apiInstance.spacesList(accountId, xminusPhraseAppMinusOTP, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpacesApi#spacesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpacesApi#spacesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **kotlin.Int**| Page number | [optional]
 **perPage** | **kotlin.Int**| allows you to specify a page size up to 100 items, 10 by default | [optional]

### Return type

[**kotlin.Array&lt;Space&gt;**](Space.md)

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

<a name="spacesProjectsCreate"></a>
# **spacesProjectsCreate**
> spacesProjectsCreate(accountId, spaceId, spacesProjectsCreateParameters, xminusPhraseAppMinusOTP)

Add Project

Adds an existing project to the space.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = SpacesApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val spaceId : kotlin.String = spaceId_example // kotlin.String | Space ID
val spacesProjectsCreateParameters : SpacesProjectsCreateParameters =  // SpacesProjectsCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.spacesProjectsCreate(accountId, spaceId, spacesProjectsCreateParameters, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling SpacesApi#spacesProjectsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpacesApi#spacesProjectsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **spaceId** | **kotlin.String**| Space ID |
 **spacesProjectsCreateParameters** | [**SpacesProjectsCreateParameters**](SpacesProjectsCreateParameters.md)|  |
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

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="spacesProjectsDelete"></a>
# **spacesProjectsDelete**
> spacesProjectsDelete(accountId, spaceId, id, xminusPhraseAppMinusOTP)

Remove Project

Removes a specified project from the specified space.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = SpacesApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val spaceId : kotlin.String = spaceId_example // kotlin.String | Space ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.spacesProjectsDelete(accountId, spaceId, id, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling SpacesApi#spacesProjectsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpacesApi#spacesProjectsDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **spaceId** | **kotlin.String**| Space ID |
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

<a name="spacesProjectsList"></a>
# **spacesProjectsList**
> kotlin.Array&lt;Project&gt; spacesProjectsList(accountId, spaceId, xminusPhraseAppMinusOTP, page, perPage)

List Projects

List all projects for the specified Space.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = SpacesApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val spaceId : kotlin.String = spaceId_example // kotlin.String | Space ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
try {
    val result : kotlin.Array<Project> = apiInstance.spacesProjectsList(accountId, spaceId, xminusPhraseAppMinusOTP, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpacesApi#spacesProjectsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpacesApi#spacesProjectsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **spaceId** | **kotlin.String**| Space ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **kotlin.Int**| Page number | [optional]
 **perPage** | **kotlin.Int**| allows you to specify a page size up to 100 items, 10 by default | [optional]

### Return type

[**kotlin.Array&lt;Project&gt;**](Project.md)

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

