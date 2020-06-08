# ReleasesApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**releaseCreate**](ReleasesApi.md#releaseCreate) | **POST** /accounts/{account_id}/distributions/{distribution_id}/releases | Create a release
[**releaseDelete**](ReleasesApi.md#releaseDelete) | **DELETE** /accounts/{account_id}/distributions/{distribution_id}/releases/{id} | Delete a release
[**releasePublish**](ReleasesApi.md#releasePublish) | **POST** /accounts/{account_id}/distributions/{distribution_id}/releases/{id}/publish | Publish a release
[**releaseShow**](ReleasesApi.md#releaseShow) | **GET** /accounts/{account_id}/distributions/{distribution_id}/releases/{id} | Get a single release
[**releaseUpdate**](ReleasesApi.md#releaseUpdate) | **PATCH** /accounts/{account_id}/distributions/{distribution_id}/releases/{id} | Update a release
[**releasesList**](ReleasesApi.md#releasesList) | **GET** /accounts/{account_id}/distributions/{distribution_id}/releases | List releases


<a name="releaseCreate"></a>
# **releaseCreate**
> Release releaseCreate(accountId, distributionId, releaseCreateParameters, xminusPhraseAppMinusOTP)

Create a release

Create a new release.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = ReleasesApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val distributionId : kotlin.String = distributionId_example // kotlin.String | Distribution ID
val releaseCreateParameters : ReleaseCreateParameters =  // ReleaseCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Release = apiInstance.releaseCreate(accountId, distributionId, releaseCreateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReleasesApi#releaseCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReleasesApi#releaseCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **distributionId** | **kotlin.String**| Distribution ID |
 **releaseCreateParameters** | [**ReleaseCreateParameters**](ReleaseCreateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Release**](Release.md)

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

<a name="releaseDelete"></a>
# **releaseDelete**
> releaseDelete(accountId, distributionId, id, xminusPhraseAppMinusOTP)

Delete a release

Delete an existing release.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = ReleasesApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val distributionId : kotlin.String = distributionId_example // kotlin.String | Distribution ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.releaseDelete(accountId, distributionId, id, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling ReleasesApi#releaseDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReleasesApi#releaseDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **distributionId** | **kotlin.String**| Distribution ID |
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

<a name="releasePublish"></a>
# **releasePublish**
> Release releasePublish(accountId, distributionId, id, xminusPhraseAppMinusOTP)

Publish a release

Publish a release for production.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = ReleasesApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val distributionId : kotlin.String = distributionId_example // kotlin.String | Distribution ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Release = apiInstance.releasePublish(accountId, distributionId, id, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReleasesApi#releasePublish")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReleasesApi#releasePublish")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **distributionId** | **kotlin.String**| Distribution ID |
 **id** | **kotlin.String**| ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Release**](Release.md)

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

<a name="releaseShow"></a>
# **releaseShow**
> Release releaseShow(accountId, distributionId, id, xminusPhraseAppMinusOTP)

Get a single release

Get details on a single release.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = ReleasesApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val distributionId : kotlin.String = distributionId_example // kotlin.String | Distribution ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Release = apiInstance.releaseShow(accountId, distributionId, id, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReleasesApi#releaseShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReleasesApi#releaseShow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **distributionId** | **kotlin.String**| Distribution ID |
 **id** | **kotlin.String**| ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Release**](Release.md)

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

<a name="releaseUpdate"></a>
# **releaseUpdate**
> Release releaseUpdate(accountId, distributionId, id, releaseUpdateParameters, xminusPhraseAppMinusOTP)

Update a release

Update an existing release.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = ReleasesApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val distributionId : kotlin.String = distributionId_example // kotlin.String | Distribution ID
val id : kotlin.String = id_example // kotlin.String | ID
val releaseUpdateParameters : ReleaseUpdateParameters =  // ReleaseUpdateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Release = apiInstance.releaseUpdate(accountId, distributionId, id, releaseUpdateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReleasesApi#releaseUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReleasesApi#releaseUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **distributionId** | **kotlin.String**| Distribution ID |
 **id** | **kotlin.String**| ID |
 **releaseUpdateParameters** | [**ReleaseUpdateParameters**](ReleaseUpdateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Release**](Release.md)

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

<a name="releasesList"></a>
# **releasesList**
> kotlin.Array&lt;ReleasePreview&gt; releasesList(accountId, distributionId, xminusPhraseAppMinusOTP, page, perPage)

List releases

List all releases for the given distribution.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = ReleasesApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val distributionId : kotlin.String = distributionId_example // kotlin.String | Distribution ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
try {
    val result : kotlin.Array<ReleasePreview> = apiInstance.releasesList(accountId, distributionId, xminusPhraseAppMinusOTP, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReleasesApi#releasesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReleasesApi#releasesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **distributionId** | **kotlin.String**| Distribution ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **kotlin.Int**| Page number | [optional]
 **perPage** | **kotlin.Int**| allows you to specify a page size up to 100 items, 10 by default | [optional]

### Return type

[**kotlin.Array&lt;ReleasePreview&gt;**](ReleasePreview.md)

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

