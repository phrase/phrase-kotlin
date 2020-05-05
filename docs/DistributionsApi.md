# DistributionsApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**distributionCreate**](DistributionsApi.md#distributionCreate) | **POST** /accounts/{account_id}/distributions | Create a distribution
[**distributionDelete**](DistributionsApi.md#distributionDelete) | **DELETE** /accounts/{account_id}/distributions/{id} | Delete a distribution
[**distributionShow**](DistributionsApi.md#distributionShow) | **GET** /accounts/{account_id}/distributions/{id} | Get a single distribution
[**distributionUpdate**](DistributionsApi.md#distributionUpdate) | **PATCH** /accounts/{account_id}/distributions/{id} | Update a distribution
[**distributionsList**](DistributionsApi.md#distributionsList) | **GET** /accounts/{account_id}/distributions | List distributions


<a name="distributionCreate"></a>
# **distributionCreate**
> distributionCreate(accountId, distributionCreateParameters, xminusPhraseAppMinusOTP)

Create a distribution

Create a new distribution.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = DistributionsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val distributionCreateParameters : DistributionCreateParameters =  // DistributionCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.distributionCreate(accountId, distributionCreateParameters, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling DistributionsApi#distributionCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DistributionsApi#distributionCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **distributionCreateParameters** | [**DistributionCreateParameters**](DistributionCreateParameters.md)|  |
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

<a name="distributionDelete"></a>
# **distributionDelete**
> distributionDelete(accountId, id, xminusPhraseAppMinusOTP)

Delete a distribution

Delete an existing distribution.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = DistributionsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.distributionDelete(accountId, id, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling DistributionsApi#distributionDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DistributionsApi#distributionDelete")
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

<a name="distributionShow"></a>
# **distributionShow**
> Distribution distributionShow(accountId, id, xminusPhraseAppMinusOTP)

Get a single distribution

Get details on a single distribution.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = DistributionsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Distribution = apiInstance.distributionShow(accountId, id, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DistributionsApi#distributionShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DistributionsApi#distributionShow")
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

[**Distribution**](Distribution.md)

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

<a name="distributionUpdate"></a>
# **distributionUpdate**
> Distribution distributionUpdate(accountId, id, distributionUpdateParameters, xminusPhraseAppMinusOTP)

Update a distribution

Update an existing distribution.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = DistributionsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val id : kotlin.String = id_example // kotlin.String | ID
val distributionUpdateParameters : DistributionUpdateParameters =  // DistributionUpdateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Distribution = apiInstance.distributionUpdate(accountId, id, distributionUpdateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DistributionsApi#distributionUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DistributionsApi#distributionUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **id** | **kotlin.String**| ID |
 **distributionUpdateParameters** | [**DistributionUpdateParameters**](DistributionUpdateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Distribution**](Distribution.md)

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

<a name="distributionsList"></a>
# **distributionsList**
> kotlin.Array&lt;DistributionPreview&gt; distributionsList(accountId, xminusPhraseAppMinusOTP, page, perPage)

List distributions

List all distributions for the given account.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = DistributionsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
try {
    val result : kotlin.Array<DistributionPreview> = apiInstance.distributionsList(accountId, xminusPhraseAppMinusOTP, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DistributionsApi#distributionsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DistributionsApi#distributionsList")
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

[**kotlin.Array&lt;DistributionPreview&gt;**](DistributionPreview.md)

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

