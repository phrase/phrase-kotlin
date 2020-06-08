# TagsApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tagCreate**](TagsApi.md#tagCreate) | **POST** /projects/{project_id}/tags | Create a tag
[**tagDelete**](TagsApi.md#tagDelete) | **DELETE** /projects/{project_id}/tags/{name} | Delete a tag
[**tagShow**](TagsApi.md#tagShow) | **GET** /projects/{project_id}/tags/{name} | Get a single tag
[**tagsList**](TagsApi.md#tagsList) | **GET** /projects/{project_id}/tags | List tags


<a name="tagCreate"></a>
# **tagCreate**
> TagWithStats tagCreate(projectId, tagCreateParameters, xminusPhraseAppMinusOTP)

Create a tag

Create a new tag.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = TagsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val tagCreateParameters : TagCreateParameters =  // TagCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : TagWithStats = apiInstance.tagCreate(projectId, tagCreateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#tagCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#tagCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **tagCreateParameters** | [**TagCreateParameters**](TagCreateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**TagWithStats**](TagWithStats.md)

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

<a name="tagDelete"></a>
# **tagDelete**
> tagDelete(projectId, name, xminusPhraseAppMinusOTP, branch)

Delete a tag

Delete an existing tag.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = TagsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val name : kotlin.String = name_example // kotlin.String | name
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    apiInstance.tagDelete(projectId, name, xminusPhraseAppMinusOTP, branch)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#tagDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#tagDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **name** | **kotlin.String**| name |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **branch** | **kotlin.String**| specify the branch to use | [optional]

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

<a name="tagShow"></a>
# **tagShow**
> TagWithStats tagShow(projectId, name, xminusPhraseAppMinusOTP, branch)

Get a single tag

Get details and progress information on a single tag for a given project.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = TagsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val name : kotlin.String = name_example // kotlin.String | name
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    val result : TagWithStats = apiInstance.tagShow(projectId, name, xminusPhraseAppMinusOTP, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#tagShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#tagShow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **name** | **kotlin.String**| name |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **branch** | **kotlin.String**| specify the branch to use | [optional]

### Return type

[**TagWithStats**](TagWithStats.md)

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

<a name="tagsList"></a>
# **tagsList**
> kotlin.Array&lt;Tag&gt; tagsList(projectId, xminusPhraseAppMinusOTP, page, perPage, branch)

List tags

List all tags for the given project.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = TagsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    val result : kotlin.Array<Tag> = apiInstance.tagsList(projectId, xminusPhraseAppMinusOTP, page, perPage, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#tagsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#tagsList")
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

[**kotlin.Array&lt;Tag&gt;**](Tag.md)

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

