# GlossaryTermTranslationsApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**glossaryTermTranslationCreate**](GlossaryTermTranslationsApi.md#glossaryTermTranslationCreate) | **POST** /accounts/{account_id}/glossaries/{glossary_id}/terms/{term_id}/translations | Create a glossary term translation
[**glossaryTermTranslationDelete**](GlossaryTermTranslationsApi.md#glossaryTermTranslationDelete) | **DELETE** /accounts/{account_id}/glossaries/{glossary_id}/terms/{term_id}/translations/{id} | Delete a glossary term translation
[**glossaryTermTranslationUpdate**](GlossaryTermTranslationsApi.md#glossaryTermTranslationUpdate) | **PATCH** /accounts/{account_id}/glossaries/{glossary_id}/terms/{term_id}/translations/{id} | Update a glossary term translation


<a name="glossaryTermTranslationCreate"></a>
# **glossaryTermTranslationCreate**
> GlossaryTermTranslation glossaryTermTranslationCreate(accountId, glossaryId, termId, glossaryTermTranslationCreateParameters, xminusPhraseAppMinusOTP)

Create a glossary term translation

Create a new glossary term translation.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = GlossaryTermTranslationsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val glossaryId : kotlin.String = glossaryId_example // kotlin.String | Glossary ID
val termId : kotlin.String = termId_example // kotlin.String | Term ID
val glossaryTermTranslationCreateParameters : GlossaryTermTranslationCreateParameters =  // GlossaryTermTranslationCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : GlossaryTermTranslation = apiInstance.glossaryTermTranslationCreate(accountId, glossaryId, termId, glossaryTermTranslationCreateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GlossaryTermTranslationsApi#glossaryTermTranslationCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GlossaryTermTranslationsApi#glossaryTermTranslationCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **glossaryId** | **kotlin.String**| Glossary ID |
 **termId** | **kotlin.String**| Term ID |
 **glossaryTermTranslationCreateParameters** | [**GlossaryTermTranslationCreateParameters**](GlossaryTermTranslationCreateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**GlossaryTermTranslation**](GlossaryTermTranslation.md)

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

<a name="glossaryTermTranslationDelete"></a>
# **glossaryTermTranslationDelete**
> glossaryTermTranslationDelete(accountId, glossaryId, termId, id, xminusPhraseAppMinusOTP)

Delete a glossary term translation

Delete an existing glossary term translation.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = GlossaryTermTranslationsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val glossaryId : kotlin.String = glossaryId_example // kotlin.String | Glossary ID
val termId : kotlin.String = termId_example // kotlin.String | Term ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.glossaryTermTranslationDelete(accountId, glossaryId, termId, id, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling GlossaryTermTranslationsApi#glossaryTermTranslationDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GlossaryTermTranslationsApi#glossaryTermTranslationDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **glossaryId** | **kotlin.String**| Glossary ID |
 **termId** | **kotlin.String**| Term ID |
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

<a name="glossaryTermTranslationUpdate"></a>
# **glossaryTermTranslationUpdate**
> GlossaryTermTranslation glossaryTermTranslationUpdate(accountId, glossaryId, termId, id, glossaryTermTranslationUpdateParameters, xminusPhraseAppMinusOTP)

Update a glossary term translation

Update an existing glossary term translation.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = GlossaryTermTranslationsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val glossaryId : kotlin.String = glossaryId_example // kotlin.String | Glossary ID
val termId : kotlin.String = termId_example // kotlin.String | Term ID
val id : kotlin.String = id_example // kotlin.String | ID
val glossaryTermTranslationUpdateParameters : GlossaryTermTranslationUpdateParameters =  // GlossaryTermTranslationUpdateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : GlossaryTermTranslation = apiInstance.glossaryTermTranslationUpdate(accountId, glossaryId, termId, id, glossaryTermTranslationUpdateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GlossaryTermTranslationsApi#glossaryTermTranslationUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GlossaryTermTranslationsApi#glossaryTermTranslationUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **glossaryId** | **kotlin.String**| Glossary ID |
 **termId** | **kotlin.String**| Term ID |
 **id** | **kotlin.String**| ID |
 **glossaryTermTranslationUpdateParameters** | [**GlossaryTermTranslationUpdateParameters**](GlossaryTermTranslationUpdateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**GlossaryTermTranslation**](GlossaryTermTranslation.md)

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

