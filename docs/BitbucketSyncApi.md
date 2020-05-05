# BitbucketSyncApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bitbucketSyncExport**](BitbucketSyncApi.md#bitbucketSyncExport) | **POST** /bitbucket_syncs/{id}/export | Export from Phrase to Bitbucket
[**bitbucketSyncImport**](BitbucketSyncApi.md#bitbucketSyncImport) | **POST** /bitbucket_syncs/{id}/import | Import to Phrase from Bitbucket
[**bitbucketSyncsList**](BitbucketSyncApi.md#bitbucketSyncsList) | **GET** /bitbucket_syncs | List Bitbucket syncs


<a name="bitbucketSyncExport"></a>
# **bitbucketSyncExport**
> BitbucketSyncExportResponse bitbucketSyncExport(id, bitbucketSyncExportParameters, xminusPhraseAppMinusOTP)

Export from Phrase to Bitbucket

Export translations from Phrase to Bitbucket according to the .phraseapp.yml file within the Bitbucket Repository.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = BitbucketSyncApi()
val id : kotlin.String = id_example // kotlin.String | ID
val bitbucketSyncExportParameters : BitbucketSyncExportParameters =  // BitbucketSyncExportParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : BitbucketSyncExportResponse = apiInstance.bitbucketSyncExport(id, bitbucketSyncExportParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BitbucketSyncApi#bitbucketSyncExport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BitbucketSyncApi#bitbucketSyncExport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| ID |
 **bitbucketSyncExportParameters** | [**BitbucketSyncExportParameters**](BitbucketSyncExportParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**BitbucketSyncExportResponse**](BitbucketSyncExportResponse.md)

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

<a name="bitbucketSyncImport"></a>
# **bitbucketSyncImport**
> bitbucketSyncImport(id, bitbucketSyncImportParameters, xminusPhraseAppMinusOTP)

Import to Phrase from Bitbucket

Import translations from Bitbucket to Phrase according to the .phraseapp.yml file within the Bitbucket repository.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = BitbucketSyncApi()
val id : kotlin.String = id_example // kotlin.String | ID
val bitbucketSyncImportParameters : BitbucketSyncImportParameters =  // BitbucketSyncImportParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.bitbucketSyncImport(id, bitbucketSyncImportParameters, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling BitbucketSyncApi#bitbucketSyncImport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BitbucketSyncApi#bitbucketSyncImport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| ID |
 **bitbucketSyncImportParameters** | [**BitbucketSyncImportParameters**](BitbucketSyncImportParameters.md)|  |
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

<a name="bitbucketSyncsList"></a>
# **bitbucketSyncsList**
> kotlin.Array&lt;BitbucketSync&gt; bitbucketSyncsList(xminusPhraseAppMinusOTP, accountId)

List Bitbucket syncs

List all Bitbucket repositories for which synchronisation with Phrase is activated.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = BitbucketSyncApi()
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val accountId : kotlin.String = abcd1234 // kotlin.String | Account ID to specify the actual account the project should be created in. Required if the requesting user is a member of multiple accounts.
try {
    val result : kotlin.Array<BitbucketSync> = apiInstance.bitbucketSyncsList(xminusPhraseAppMinusOTP, accountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BitbucketSyncApi#bitbucketSyncsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BitbucketSyncApi#bitbucketSyncsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **accountId** | **kotlin.String**| Account ID to specify the actual account the project should be created in. Required if the requesting user is a member of multiple accounts. | [optional]

### Return type

[**kotlin.Array&lt;BitbucketSync&gt;**](BitbucketSync.md)

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

