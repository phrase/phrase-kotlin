# GitLabSyncApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gitlabSyncDelete**](GitLabSyncApi.md#gitlabSyncDelete) | **DELETE** /gitlab_syncs/{id} | Delete single Sync Setting
[**gitlabSyncExport**](GitLabSyncApi.md#gitlabSyncExport) | **POST** /gitlab_syncs/{gitlab_sync_id}/export | Export from Phrase to GitLab
[**gitlabSyncHistory**](GitLabSyncApi.md#gitlabSyncHistory) | **GET** /gitlab_syncs/{gitlab_sync_id}/history | History of single Sync Setting
[**gitlabSyncImport**](GitLabSyncApi.md#gitlabSyncImport) | **POST** /gitlab_syncs/{gitlab_sync_id}/import | Import from GitLab to Phrase
[**gitlabSyncList**](GitLabSyncApi.md#gitlabSyncList) | **GET** /gitlab_syncs | List GitLab syncs
[**gitlabSyncShow**](GitLabSyncApi.md#gitlabSyncShow) | **GET** /gitlab_syncs/{id} | Get single Sync Setting
[**gitlabSyncUpdate**](GitLabSyncApi.md#gitlabSyncUpdate) | **PUT** /gitlab_syncs/{id} | Update single Sync Setting


<a name="gitlabSyncDelete"></a>
# **gitlabSyncDelete**
> gitlabSyncDelete(id, xminusPhraseAppMinusOTP, accountId)

Delete single Sync Setting

Deletes a single GitLab Sync Setting.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = GitLabSyncApi()
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val accountId : kotlin.String = abcd1234 // kotlin.String | Account ID to specify the actual account the GitLab Sync should be created in. Required if the requesting user is a member of multiple accounts.
try {
    apiInstance.gitlabSyncDelete(id, xminusPhraseAppMinusOTP, accountId)
} catch (e: ClientException) {
    println("4xx response calling GitLabSyncApi#gitlabSyncDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitLabSyncApi#gitlabSyncDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **accountId** | **kotlin.String**| Account ID to specify the actual account the GitLab Sync should be created in. Required if the requesting user is a member of multiple accounts. | [optional]

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

<a name="gitlabSyncExport"></a>
# **gitlabSyncExport**
> GitlabSyncExport gitlabSyncExport(gitlabSyncId, gitlabSyncExportParameters, xminusPhraseAppMinusOTP)

Export from Phrase to GitLab

Export translations from Phrase to GitLab according to the .phraseapp.yml file within the GitLab repository.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = GitLabSyncApi()
val gitlabSyncId : kotlin.String = gitlabSyncId_example // kotlin.String | Gitlab Sync ID
val gitlabSyncExportParameters : GitlabSyncExportParameters =  // GitlabSyncExportParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : GitlabSyncExport = apiInstance.gitlabSyncExport(gitlabSyncId, gitlabSyncExportParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GitLabSyncApi#gitlabSyncExport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitLabSyncApi#gitlabSyncExport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gitlabSyncId** | **kotlin.String**| Gitlab Sync ID |
 **gitlabSyncExportParameters** | [**GitlabSyncExportParameters**](GitlabSyncExportParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**GitlabSyncExport**](GitlabSyncExport.md)

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

<a name="gitlabSyncHistory"></a>
# **gitlabSyncHistory**
> kotlin.Array&lt;GitlabSyncHistory&gt; gitlabSyncHistory(gitlabSyncId, xminusPhraseAppMinusOTP, page, perPage, accountId)

History of single Sync Setting

List history for a single Sync Setting.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = GitLabSyncApi()
val gitlabSyncId : kotlin.String = gitlabSyncId_example // kotlin.String | Gitlab Sync ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
val accountId : kotlin.String = abcd1234 // kotlin.String | Account ID to specify the actual account the GitLab Sync should be created in. Required if the requesting user is a member of multiple accounts.
try {
    val result : kotlin.Array<GitlabSyncHistory> = apiInstance.gitlabSyncHistory(gitlabSyncId, xminusPhraseAppMinusOTP, page, perPage, accountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GitLabSyncApi#gitlabSyncHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitLabSyncApi#gitlabSyncHistory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gitlabSyncId** | **kotlin.String**| Gitlab Sync ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **kotlin.Int**| Page number | [optional]
 **perPage** | **kotlin.Int**| allows you to specify a page size up to 100 items, 10 by default | [optional]
 **accountId** | **kotlin.String**| Account ID to specify the actual account the GitLab Sync should be created in. Required if the requesting user is a member of multiple accounts. | [optional]

### Return type

[**kotlin.Array&lt;GitlabSyncHistory&gt;**](GitlabSyncHistory.md)

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

<a name="gitlabSyncImport"></a>
# **gitlabSyncImport**
> kotlin.Array&lt;Upload&gt; gitlabSyncImport(gitlabSyncId, gitlabSyncImportParameters, xminusPhraseAppMinusOTP)

Import from GitLab to Phrase

Import translations from GitLab to Phrase according to the .phraseapp.yml file within the GitLab repository.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = GitLabSyncApi()
val gitlabSyncId : kotlin.String = gitlabSyncId_example // kotlin.String | Gitlab Sync ID
val gitlabSyncImportParameters : GitlabSyncImportParameters =  // GitlabSyncImportParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : kotlin.Array<Upload> = apiInstance.gitlabSyncImport(gitlabSyncId, gitlabSyncImportParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GitLabSyncApi#gitlabSyncImport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitLabSyncApi#gitlabSyncImport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gitlabSyncId** | **kotlin.String**| Gitlab Sync ID |
 **gitlabSyncImportParameters** | [**GitlabSyncImportParameters**](GitlabSyncImportParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**kotlin.Array&lt;Upload&gt;**](Upload.md)

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

<a name="gitlabSyncList"></a>
# **gitlabSyncList**
> kotlin.Array&lt;GitlabSync&gt; gitlabSyncList(xminusPhraseAppMinusOTP, accountId)

List GitLab syncs

List all GitLab Sync Settings for which synchronisation with Phrase and GitLab is activated.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = GitLabSyncApi()
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val accountId : kotlin.String = abcd1234 // kotlin.String | Account ID to specify the actual account the GitLab Sync should be created in. Required if the requesting user is a member of multiple accounts.
try {
    val result : kotlin.Array<GitlabSync> = apiInstance.gitlabSyncList(xminusPhraseAppMinusOTP, accountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GitLabSyncApi#gitlabSyncList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitLabSyncApi#gitlabSyncList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **accountId** | **kotlin.String**| Account ID to specify the actual account the GitLab Sync should be created in. Required if the requesting user is a member of multiple accounts. | [optional]

### Return type

[**kotlin.Array&lt;GitlabSync&gt;**](GitlabSync.md)

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

<a name="gitlabSyncShow"></a>
# **gitlabSyncShow**
> GitlabSync gitlabSyncShow(id, xminusPhraseAppMinusOTP, accountId)

Get single Sync Setting

Shows a single GitLab Sync Setting.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = GitLabSyncApi()
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val accountId : kotlin.String = abcd1234 // kotlin.String | Account ID to specify the actual account the GitLab Sync should be created in. Required if the requesting user is a member of multiple accounts.
try {
    val result : GitlabSync = apiInstance.gitlabSyncShow(id, xminusPhraseAppMinusOTP, accountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GitLabSyncApi#gitlabSyncShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitLabSyncApi#gitlabSyncShow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **accountId** | **kotlin.String**| Account ID to specify the actual account the GitLab Sync should be created in. Required if the requesting user is a member of multiple accounts. | [optional]

### Return type

[**GitlabSync**](GitlabSync.md)

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

<a name="gitlabSyncUpdate"></a>
# **gitlabSyncUpdate**
> GitlabSync gitlabSyncUpdate(id, xminusPhraseAppMinusOTP, accountId, phraseProjectCode, gitlabProjectId, gitlabBranchName)

Update single Sync Setting

Updates a single GitLab Sync Setting.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = GitLabSyncApi()
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val accountId : kotlin.String = abcd1234 // kotlin.String | Account ID to specify the actual account the GitLab Sync should be created in. Required if the requesting user is a member of multiple accounts.
val phraseProjectCode : kotlin.String = 3456abcd // kotlin.String | Code of the related Phrase Project.
val gitlabProjectId : kotlin.Int = 12345 // kotlin.Int | ID of the related GitLab Project.
val gitlabBranchName : kotlin.String = feature-development // kotlin.String | Name of the GitLab Branch.
try {
    val result : GitlabSync = apiInstance.gitlabSyncUpdate(id, xminusPhraseAppMinusOTP, accountId, phraseProjectCode, gitlabProjectId, gitlabBranchName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GitLabSyncApi#gitlabSyncUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitLabSyncApi#gitlabSyncUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **accountId** | **kotlin.String**| Account ID to specify the actual account the GitLab Sync should be created in. Required if the requesting user is a member of multiple accounts. | [optional]
 **phraseProjectCode** | **kotlin.String**| Code of the related Phrase Project. | [optional]
 **gitlabProjectId** | **kotlin.Int**| ID of the related GitLab Project. | [optional]
 **gitlabBranchName** | **kotlin.String**| Name of the GitLab Branch. | [optional]

### Return type

[**GitlabSync**](GitlabSync.md)

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

