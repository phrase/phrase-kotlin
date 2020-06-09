# GlossariesApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**glossariesList**](GlossariesApi.md#glossariesList) | **GET** /accounts/{account_id}/glossaries | List glossaries
[**glossaryCreate**](GlossariesApi.md#glossaryCreate) | **POST** /accounts/{account_id}/glossaries | Create a glossary
[**glossaryDelete**](GlossariesApi.md#glossaryDelete) | **DELETE** /accounts/{account_id}/glossaries/{id} | Delete a glossary
[**glossaryShow**](GlossariesApi.md#glossaryShow) | **GET** /accounts/{account_id}/glossaries/{id} | Get a single glossary
[**glossaryUpdate**](GlossariesApi.md#glossaryUpdate) | **PATCH** /accounts/{account_id}/glossaries/{id} | Update a glossary


<a name="glossariesList"></a>
# **glossariesList**
> kotlin.Array&lt;Glossary&gt; glossariesList(accountId, xminusPhraseAppMinusOTP, page, perPage)

List glossaries

List all glossaries the current user has access to.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = GlossariesApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
try {
    val result : kotlin.Array<Glossary> = apiInstance.glossariesList(accountId, xminusPhraseAppMinusOTP, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GlossariesApi#glossariesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GlossariesApi#glossariesList")
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

[**kotlin.Array&lt;Glossary&gt;**](Glossary.md)

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

<a name="glossaryCreate"></a>
# **glossaryCreate**
> Glossary glossaryCreate(accountId, glossaryCreateParameters, xminusPhraseAppMinusOTP)

Create a glossary

Create a new glossary.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = GlossariesApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val glossaryCreateParameters : GlossaryCreateParameters =  // GlossaryCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Glossary = apiInstance.glossaryCreate(accountId, glossaryCreateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GlossariesApi#glossaryCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GlossariesApi#glossaryCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **glossaryCreateParameters** | [**GlossaryCreateParameters**](GlossaryCreateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Glossary**](Glossary.md)

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

<a name="glossaryDelete"></a>
# **glossaryDelete**
> glossaryDelete(accountId, id, xminusPhraseAppMinusOTP)

Delete a glossary

Delete an existing glossary.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = GlossariesApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.glossaryDelete(accountId, id, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling GlossariesApi#glossaryDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GlossariesApi#glossaryDelete")
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

<a name="glossaryShow"></a>
# **glossaryShow**
> Glossary glossaryShow(accountId, id, xminusPhraseAppMinusOTP)

Get a single glossary

Get details on a single glossary.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = GlossariesApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Glossary = apiInstance.glossaryShow(accountId, id, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GlossariesApi#glossaryShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GlossariesApi#glossaryShow")
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

[**Glossary**](Glossary.md)

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

<a name="glossaryUpdate"></a>
# **glossaryUpdate**
> Glossary glossaryUpdate(accountId, id, glossaryUpdateParameters, xminusPhraseAppMinusOTP)

Update a glossary

Update an existing glossary.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = GlossariesApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val id : kotlin.String = id_example // kotlin.String | ID
val glossaryUpdateParameters : GlossaryUpdateParameters =  // GlossaryUpdateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Glossary = apiInstance.glossaryUpdate(accountId, id, glossaryUpdateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GlossariesApi#glossaryUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GlossariesApi#glossaryUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **id** | **kotlin.String**| ID |
 **glossaryUpdateParameters** | [**GlossaryUpdateParameters**](GlossaryUpdateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Glossary**](Glossary.md)

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

