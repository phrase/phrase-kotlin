# GlossaryTermsApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**glossaryTermCreate**](GlossaryTermsApi.md#glossaryTermCreate) | **POST** /accounts/{account_id}/glossaries/{glossary_id}/terms | Create a glossary term
[**glossaryTermDelete**](GlossaryTermsApi.md#glossaryTermDelete) | **DELETE** /accounts/{account_id}/glossaries/{glossary_id}/terms/{id} | Delete a glossary term
[**glossaryTermShow**](GlossaryTermsApi.md#glossaryTermShow) | **GET** /accounts/{account_id}/glossaries/{glossary_id}/terms/{id} | Get a single glossary term
[**glossaryTermUpdate**](GlossaryTermsApi.md#glossaryTermUpdate) | **PATCH** /accounts/{account_id}/glossaries/{glossary_id}/terms/{id} | Update a glossary term
[**glossaryTermsList**](GlossaryTermsApi.md#glossaryTermsList) | **GET** /accounts/{account_id}/glossaries/{glossary_id}/terms | List glossary terms


<a name="glossaryTermCreate"></a>
# **glossaryTermCreate**
> GlossaryTerm glossaryTermCreate(accountId, glossaryId, glossaryTermCreateParameters, xminusPhraseAppMinusOTP)

Create a glossary term

Create a new glossary term.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = GlossaryTermsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val glossaryId : kotlin.String = glossaryId_example // kotlin.String | Glossary ID
val glossaryTermCreateParameters : GlossaryTermCreateParameters =  // GlossaryTermCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : GlossaryTerm = apiInstance.glossaryTermCreate(accountId, glossaryId, glossaryTermCreateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GlossaryTermsApi#glossaryTermCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GlossaryTermsApi#glossaryTermCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **glossaryId** | **kotlin.String**| Glossary ID |
 **glossaryTermCreateParameters** | [**GlossaryTermCreateParameters**](GlossaryTermCreateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**GlossaryTerm**](GlossaryTerm.md)

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

<a name="glossaryTermDelete"></a>
# **glossaryTermDelete**
> glossaryTermDelete(accountId, glossaryId, id, xminusPhraseAppMinusOTP)

Delete a glossary term

Delete an existing glossary term.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = GlossaryTermsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val glossaryId : kotlin.String = glossaryId_example // kotlin.String | Glossary ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.glossaryTermDelete(accountId, glossaryId, id, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling GlossaryTermsApi#glossaryTermDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GlossaryTermsApi#glossaryTermDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **glossaryId** | **kotlin.String**| Glossary ID |
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

<a name="glossaryTermShow"></a>
# **glossaryTermShow**
> GlossaryTerm glossaryTermShow(accountId, glossaryId, id, xminusPhraseAppMinusOTP)

Get a single glossary term

Get details on a single glossary term.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = GlossaryTermsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val glossaryId : kotlin.String = glossaryId_example // kotlin.String | Glossary ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : GlossaryTerm = apiInstance.glossaryTermShow(accountId, glossaryId, id, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GlossaryTermsApi#glossaryTermShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GlossaryTermsApi#glossaryTermShow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **glossaryId** | **kotlin.String**| Glossary ID |
 **id** | **kotlin.String**| ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**GlossaryTerm**](GlossaryTerm.md)

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

<a name="glossaryTermUpdate"></a>
# **glossaryTermUpdate**
> GlossaryTerm glossaryTermUpdate(accountId, glossaryId, id, glossaryTermUpdateParameters, xminusPhraseAppMinusOTP)

Update a glossary term

Update an existing glossary term.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = GlossaryTermsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val glossaryId : kotlin.String = glossaryId_example // kotlin.String | Glossary ID
val id : kotlin.String = id_example // kotlin.String | ID
val glossaryTermUpdateParameters : GlossaryTermUpdateParameters =  // GlossaryTermUpdateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : GlossaryTerm = apiInstance.glossaryTermUpdate(accountId, glossaryId, id, glossaryTermUpdateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GlossaryTermsApi#glossaryTermUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GlossaryTermsApi#glossaryTermUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **glossaryId** | **kotlin.String**| Glossary ID |
 **id** | **kotlin.String**| ID |
 **glossaryTermUpdateParameters** | [**GlossaryTermUpdateParameters**](GlossaryTermUpdateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**GlossaryTerm**](GlossaryTerm.md)

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

<a name="glossaryTermsList"></a>
# **glossaryTermsList**
> kotlin.Array&lt;GlossaryTerm&gt; glossaryTermsList(accountId, glossaryId, xminusPhraseAppMinusOTP, page, perPage)

List glossary terms

List all glossary terms the current user has access to.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = GlossaryTermsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val glossaryId : kotlin.String = glossaryId_example // kotlin.String | Glossary ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
try {
    val result : kotlin.Array<GlossaryTerm> = apiInstance.glossaryTermsList(accountId, glossaryId, xminusPhraseAppMinusOTP, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GlossaryTermsApi#glossaryTermsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GlossaryTermsApi#glossaryTermsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **glossaryId** | **kotlin.String**| Glossary ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **kotlin.Int**| Page number | [optional]
 **perPage** | **kotlin.Int**| allows you to specify a page size up to 100 items, 10 by default | [optional]

### Return type

[**kotlin.Array&lt;GlossaryTerm&gt;**](GlossaryTerm.md)

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

