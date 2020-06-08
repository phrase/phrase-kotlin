# BlacklistedKeysApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**blacklistedKeyCreate**](BlacklistedKeysApi.md#blacklistedKeyCreate) | **POST** /projects/{project_id}/blacklisted_keys | Create a blacklisted key
[**blacklistedKeyDelete**](BlacklistedKeysApi.md#blacklistedKeyDelete) | **DELETE** /projects/{project_id}/blacklisted_keys/{id} | Delete a blacklisted key
[**blacklistedKeyShow**](BlacklistedKeysApi.md#blacklistedKeyShow) | **GET** /projects/{project_id}/blacklisted_keys/{id} | Get a single blacklisted key
[**blacklistedKeyUpdate**](BlacklistedKeysApi.md#blacklistedKeyUpdate) | **PATCH** /projects/{project_id}/blacklisted_keys/{id} | Update a blacklisted key
[**blacklistedKeysList**](BlacklistedKeysApi.md#blacklistedKeysList) | **GET** /projects/{project_id}/blacklisted_keys | List blacklisted keys


<a name="blacklistedKeyCreate"></a>
# **blacklistedKeyCreate**
> BlacklistedKey blacklistedKeyCreate(projectId, blacklistedKeyCreateParameters, xminusPhraseAppMinusOTP)

Create a blacklisted key

Create a new rule for blacklisting keys.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = BlacklistedKeysApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val blacklistedKeyCreateParameters : BlacklistedKeyCreateParameters =  // BlacklistedKeyCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : BlacklistedKey = apiInstance.blacklistedKeyCreate(projectId, blacklistedKeyCreateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlacklistedKeysApi#blacklistedKeyCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlacklistedKeysApi#blacklistedKeyCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **blacklistedKeyCreateParameters** | [**BlacklistedKeyCreateParameters**](BlacklistedKeyCreateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**BlacklistedKey**](BlacklistedKey.md)

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

<a name="blacklistedKeyDelete"></a>
# **blacklistedKeyDelete**
> blacklistedKeyDelete(projectId, id, xminusPhraseAppMinusOTP)

Delete a blacklisted key

Delete an existing rule for blacklisting keys.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = BlacklistedKeysApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.blacklistedKeyDelete(projectId, id, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling BlacklistedKeysApi#blacklistedKeyDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlacklistedKeysApi#blacklistedKeyDelete")
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

<a name="blacklistedKeyShow"></a>
# **blacklistedKeyShow**
> BlacklistedKey blacklistedKeyShow(projectId, id, xminusPhraseAppMinusOTP)

Get a single blacklisted key

Get details on a single rule for blacklisting keys for a given project.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = BlacklistedKeysApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : BlacklistedKey = apiInstance.blacklistedKeyShow(projectId, id, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlacklistedKeysApi#blacklistedKeyShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlacklistedKeysApi#blacklistedKeyShow")
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

[**BlacklistedKey**](BlacklistedKey.md)

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

<a name="blacklistedKeyUpdate"></a>
# **blacklistedKeyUpdate**
> BlacklistedKey blacklistedKeyUpdate(projectId, id, blacklistedKeyUpdateParameters, xminusPhraseAppMinusOTP)

Update a blacklisted key

Update an existing rule for blacklisting keys.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = BlacklistedKeysApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val blacklistedKeyUpdateParameters : BlacklistedKeyUpdateParameters =  // BlacklistedKeyUpdateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : BlacklistedKey = apiInstance.blacklistedKeyUpdate(projectId, id, blacklistedKeyUpdateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlacklistedKeysApi#blacklistedKeyUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlacklistedKeysApi#blacklistedKeyUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **blacklistedKeyUpdateParameters** | [**BlacklistedKeyUpdateParameters**](BlacklistedKeyUpdateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**BlacklistedKey**](BlacklistedKey.md)

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

<a name="blacklistedKeysList"></a>
# **blacklistedKeysList**
> kotlin.Array&lt;BlacklistedKey&gt; blacklistedKeysList(projectId, xminusPhraseAppMinusOTP, page, perPage)

List blacklisted keys

List all rules for blacklisting keys for the given project.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = BlacklistedKeysApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
try {
    val result : kotlin.Array<BlacklistedKey> = apiInstance.blacklistedKeysList(projectId, xminusPhraseAppMinusOTP, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlacklistedKeysApi#blacklistedKeysList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlacklistedKeysApi#blacklistedKeysList")
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

[**kotlin.Array&lt;BlacklistedKey&gt;**](BlacklistedKey.md)

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

