# VersionsHistoryApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**versionShow**](VersionsHistoryApi.md#versionShow) | **GET** /projects/{project_id}/translations/{translation_id}/versions/{id} | Get a single version
[**versionsList**](VersionsHistoryApi.md#versionsList) | **GET** /projects/{project_id}/translations/{translation_id}/versions | List all versions


<a name="versionShow"></a>
# **versionShow**
> TranslationVersionWithUser versionShow(projectId, translationId, id, xminusPhraseAppMinusOTP, branch)

Get a single version

Get details on a single version.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = VersionsHistoryApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val translationId : kotlin.String = translationId_example // kotlin.String | Translation ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    val result : TranslationVersionWithUser = apiInstance.versionShow(projectId, translationId, id, xminusPhraseAppMinusOTP, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VersionsHistoryApi#versionShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VersionsHistoryApi#versionShow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **translationId** | **kotlin.String**| Translation ID |
 **id** | **kotlin.String**| ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **branch** | **kotlin.String**| specify the branch to use | [optional]

### Return type

[**TranslationVersionWithUser**](TranslationVersionWithUser.md)

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

<a name="versionsList"></a>
# **versionsList**
> kotlin.Array&lt;TranslationVersion&gt; versionsList(projectId, translationId, xminusPhraseAppMinusOTP, page, perPage, branch)

List all versions

List all versions for the given translation.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = VersionsHistoryApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val translationId : kotlin.String = translationId_example // kotlin.String | Translation ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    val result : kotlin.Array<TranslationVersion> = apiInstance.versionsList(projectId, translationId, xminusPhraseAppMinusOTP, page, perPage, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VersionsHistoryApi#versionsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VersionsHistoryApi#versionsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **translationId** | **kotlin.String**| Translation ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **kotlin.Int**| Page number | [optional]
 **perPage** | **kotlin.Int**| allows you to specify a page size up to 100 items, 10 by default | [optional]
 **branch** | **kotlin.String**| specify the branch to use | [optional]

### Return type

[**kotlin.Array&lt;TranslationVersion&gt;**](TranslationVersion.md)

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

