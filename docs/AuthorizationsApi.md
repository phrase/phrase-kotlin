# AuthorizationsApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorizationCreate**](AuthorizationsApi.md#authorizationCreate) | **POST** /authorizations | Create an authorization
[**authorizationDelete**](AuthorizationsApi.md#authorizationDelete) | **DELETE** /authorizations/{id} | Delete an authorization
[**authorizationShow**](AuthorizationsApi.md#authorizationShow) | **GET** /authorizations/{id} | Get a single authorization
[**authorizationUpdate**](AuthorizationsApi.md#authorizationUpdate) | **PATCH** /authorizations/{id} | Update an authorization
[**authorizationsList**](AuthorizationsApi.md#authorizationsList) | **GET** /authorizations | List authorizations


<a name="authorizationCreate"></a>
# **authorizationCreate**
> AuthorizationWithToken authorizationCreate(authorizationCreateParameters, xminusPhraseAppMinusOTP)

Create an authorization

Create a new authorization.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = AuthorizationsApi()
val authorizationCreateParameters : AuthorizationCreateParameters =  // AuthorizationCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : AuthorizationWithToken = apiInstance.authorizationCreate(authorizationCreateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthorizationsApi#authorizationCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthorizationsApi#authorizationCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizationCreateParameters** | [**AuthorizationCreateParameters**](AuthorizationCreateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**AuthorizationWithToken**](AuthorizationWithToken.md)

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

<a name="authorizationDelete"></a>
# **authorizationDelete**
> authorizationDelete(id, xminusPhraseAppMinusOTP)

Delete an authorization

Delete an existing authorization. API calls using that token will stop working.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = AuthorizationsApi()
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.authorizationDelete(id, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling AuthorizationsApi#authorizationDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthorizationsApi#authorizationDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="authorizationShow"></a>
# **authorizationShow**
> Authorization authorizationShow(id, xminusPhraseAppMinusOTP)

Get a single authorization

Get details on a single authorization.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = AuthorizationsApi()
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Authorization = apiInstance.authorizationShow(id, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthorizationsApi#authorizationShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthorizationsApi#authorizationShow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Authorization**](Authorization.md)

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

<a name="authorizationUpdate"></a>
# **authorizationUpdate**
> Authorization authorizationUpdate(id, authorizationUpdateParameters, xminusPhraseAppMinusOTP)

Update an authorization

Update an existing authorization.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = AuthorizationsApi()
val id : kotlin.String = id_example // kotlin.String | ID
val authorizationUpdateParameters : AuthorizationUpdateParameters =  // AuthorizationUpdateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Authorization = apiInstance.authorizationUpdate(id, authorizationUpdateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthorizationsApi#authorizationUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthorizationsApi#authorizationUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| ID |
 **authorizationUpdateParameters** | [**AuthorizationUpdateParameters**](AuthorizationUpdateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Authorization**](Authorization.md)

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

<a name="authorizationsList"></a>
# **authorizationsList**
> kotlin.Array&lt;Authorization&gt; authorizationsList(xminusPhraseAppMinusOTP, page, perPage)

List authorizations

List all your authorizations.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = AuthorizationsApi()
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
try {
    val result : kotlin.Array<Authorization> = apiInstance.authorizationsList(xminusPhraseAppMinusOTP, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthorizationsApi#authorizationsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthorizationsApi#authorizationsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **kotlin.Int**| Page number | [optional]
 **perPage** | **kotlin.Int**| allows you to specify a page size up to 100 items, 10 by default | [optional]

### Return type

[**kotlin.Array&lt;Authorization&gt;**](Authorization.md)

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

