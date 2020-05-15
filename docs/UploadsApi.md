# UploadsApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**uploadCreate**](UploadsApi.md#uploadCreate) | **POST** /projects/{project_id}/uploads | Upload a new file
[**uploadShow**](UploadsApi.md#uploadShow) | **GET** /projects/{project_id}/uploads/{id} | View upload details
[**uploadsList**](UploadsApi.md#uploadsList) | **GET** /projects/{project_id}/uploads | List uploads


<a name="uploadCreate"></a>
# **uploadCreate**
> uploadCreate(projectId, xminusPhraseAppMinusOTP, branch, file, fileFormat, localeId, tags, updateTranslations, updateDescriptions, convertEmoji, skipUploadTags, skipUnverification, fileEncoding, autotranslate, markReviewed)

Upload a new file

Upload a new language file. Creates necessary resources in your project.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = UploadsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = branch_example // kotlin.String | specify the branch to use
val file : java.io.File = BINARY_DATA_HERE // java.io.File | File to be imported
val fileFormat : kotlin.String = fileFormat_example // kotlin.String | File format. Auto-detected when possible and not specified.
val localeId : kotlin.String = localeId_example // kotlin.String | Locale of the file's content. Can be the name or public id of the locale. Preferred is the public id.
val tags : kotlin.String = tags_example // kotlin.String | List of tags separated by comma to be associated with the new keys contained in the upload.
val updateTranslations : kotlin.Boolean = true // kotlin.Boolean | Indicates whether existing translations should be updated with the file content.
val updateDescriptions : kotlin.Boolean = true // kotlin.Boolean | Existing key descriptions will be updated with the file content. Empty descriptions overwrite existing descriptions.
val convertEmoji : kotlin.Boolean = true // kotlin.Boolean | This option is obsolete. Providing the option will cause a bad request error.
val skipUploadTags : kotlin.Boolean = true // kotlin.Boolean | Indicates whether the upload should not create upload tags.
val skipUnverification : kotlin.Boolean = true // kotlin.Boolean | Indicates whether the upload should unverify updated translations.
val fileEncoding : kotlin.String = fileEncoding_example // kotlin.String | Enforces a specific encoding on the file contents. Valid options are \\\"UTF-8\\\", \\\"UTF-16\\\" and \\\"ISO-8859-1\\\".
val autotranslate : kotlin.Boolean = true // kotlin.Boolean | If set, translations for the uploaded language will be fetched automatically.
val markReviewed : kotlin.Boolean = true // kotlin.Boolean | Indicated whether the imported translations should be marked as reviewed. This setting is available if the review workflow (currently beta) is enabled for the project.
try {
    apiInstance.uploadCreate(projectId, xminusPhraseAppMinusOTP, branch, file, fileFormat, localeId, tags, updateTranslations, updateDescriptions, convertEmoji, skipUploadTags, skipUnverification, fileEncoding, autotranslate, markReviewed)
} catch (e: ClientException) {
    println("4xx response calling UploadsApi#uploadCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UploadsApi#uploadCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **branch** | **kotlin.String**| specify the branch to use | [optional]
 **file** | **java.io.File**| File to be imported | [optional]
 **fileFormat** | **kotlin.String**| File format. Auto-detected when possible and not specified. | [optional]
 **localeId** | **kotlin.String**| Locale of the file&#39;s content. Can be the name or public id of the locale. Preferred is the public id. | [optional]
 **tags** | **kotlin.String**| List of tags separated by comma to be associated with the new keys contained in the upload. | [optional]
 **updateTranslations** | **kotlin.Boolean**| Indicates whether existing translations should be updated with the file content. | [optional]
 **updateDescriptions** | **kotlin.Boolean**| Existing key descriptions will be updated with the file content. Empty descriptions overwrite existing descriptions. | [optional]
 **convertEmoji** | **kotlin.Boolean**| This option is obsolete. Providing the option will cause a bad request error. | [optional]
 **skipUploadTags** | **kotlin.Boolean**| Indicates whether the upload should not create upload tags. | [optional]
 **skipUnverification** | **kotlin.Boolean**| Indicates whether the upload should unverify updated translations. | [optional]
 **fileEncoding** | **kotlin.String**| Enforces a specific encoding on the file contents. Valid options are \\\&quot;UTF-8\\\&quot;, \\\&quot;UTF-16\\\&quot; and \\\&quot;ISO-8859-1\\\&quot;. | [optional]
 **autotranslate** | **kotlin.Boolean**| If set, translations for the uploaded language will be fetched automatically. | [optional]
 **markReviewed** | **kotlin.Boolean**| Indicated whether the imported translations should be marked as reviewed. This setting is available if the review workflow (currently beta) is enabled for the project. | [optional]

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

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="uploadShow"></a>
# **uploadShow**
> Upload uploadShow(projectId, id, xminusPhraseAppMinusOTP, branch)

View upload details

View details and summary for a single upload.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = UploadsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    val result : Upload = apiInstance.uploadShow(projectId, id, xminusPhraseAppMinusOTP, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UploadsApi#uploadShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UploadsApi#uploadShow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **branch** | **kotlin.String**| specify the branch to use | [optional]

### Return type

[**Upload**](Upload.md)

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

<a name="uploadsList"></a>
# **uploadsList**
> kotlin.Array&lt;Upload&gt; uploadsList(projectId, xminusPhraseAppMinusOTP, page, perPage, branch)

List uploads

List all uploads for the given project.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = UploadsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    val result : kotlin.Array<Upload> = apiInstance.uploadsList(projectId, xminusPhraseAppMinusOTP, page, perPage, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UploadsApi#uploadsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UploadsApi#uploadsList")
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
 **branch** | **kotlin.String**| specify the branch to use | [optional]

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

 - **Content-Type**: Not defined
 - **Accept**: application/json

