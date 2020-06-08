# CommentsApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commentCreate**](CommentsApi.md#commentCreate) | **POST** /projects/{project_id}/keys/{key_id}/comments | Create a comment
[**commentDelete**](CommentsApi.md#commentDelete) | **DELETE** /projects/{project_id}/keys/{key_id}/comments/{id} | Delete a comment
[**commentMarkCheck**](CommentsApi.md#commentMarkCheck) | **GET** /projects/{project_id}/keys/{key_id}/comments/{id}/read | Check if comment is read
[**commentMarkRead**](CommentsApi.md#commentMarkRead) | **PATCH** /projects/{project_id}/keys/{key_id}/comments/{id}/read | Mark a comment as read
[**commentMarkUnread**](CommentsApi.md#commentMarkUnread) | **DELETE** /projects/{project_id}/keys/{key_id}/comments/{id}/read | Mark a comment as unread
[**commentShow**](CommentsApi.md#commentShow) | **GET** /projects/{project_id}/keys/{key_id}/comments/{id} | Get a single comment
[**commentUpdate**](CommentsApi.md#commentUpdate) | **PATCH** /projects/{project_id}/keys/{key_id}/comments/{id} | Update a comment
[**commentsList**](CommentsApi.md#commentsList) | **GET** /projects/{project_id}/keys/{key_id}/comments | List comments


<a name="commentCreate"></a>
# **commentCreate**
> Comment commentCreate(projectId, keyId, commentCreateParameters, xminusPhraseAppMinusOTP)

Create a comment

Create a new comment for a key.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = CommentsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val keyId : kotlin.String = keyId_example // kotlin.String | Translation Key ID
val commentCreateParameters : CommentCreateParameters =  // CommentCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Comment = apiInstance.commentCreate(projectId, keyId, commentCreateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#commentCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#commentCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **keyId** | **kotlin.String**| Translation Key ID |
 **commentCreateParameters** | [**CommentCreateParameters**](CommentCreateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Comment**](Comment.md)

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

<a name="commentDelete"></a>
# **commentDelete**
> commentDelete(projectId, keyId, id, xminusPhraseAppMinusOTP, branch)

Delete a comment

Delete an existing comment.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = CommentsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val keyId : kotlin.String = keyId_example // kotlin.String | Translation Key ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    apiInstance.commentDelete(projectId, keyId, id, xminusPhraseAppMinusOTP, branch)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#commentDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#commentDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **keyId** | **kotlin.String**| Translation Key ID |
 **id** | **kotlin.String**| ID |
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

<a name="commentMarkCheck"></a>
# **commentMarkCheck**
> commentMarkCheck(projectId, keyId, id, xminusPhraseAppMinusOTP, branch)

Check if comment is read

Check if comment was marked as read. Returns 204 if read, 404 if unread.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = CommentsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val keyId : kotlin.String = keyId_example // kotlin.String | Translation Key ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    apiInstance.commentMarkCheck(projectId, keyId, id, xminusPhraseAppMinusOTP, branch)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#commentMarkCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#commentMarkCheck")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **keyId** | **kotlin.String**| Translation Key ID |
 **id** | **kotlin.String**| ID |
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

<a name="commentMarkRead"></a>
# **commentMarkRead**
> commentMarkRead(projectId, keyId, id, commentMarkReadParameters, xminusPhraseAppMinusOTP)

Mark a comment as read

Mark a comment as read.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = CommentsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val keyId : kotlin.String = keyId_example // kotlin.String | Translation Key ID
val id : kotlin.String = id_example // kotlin.String | ID
val commentMarkReadParameters : CommentMarkReadParameters =  // CommentMarkReadParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.commentMarkRead(projectId, keyId, id, commentMarkReadParameters, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#commentMarkRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#commentMarkRead")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **keyId** | **kotlin.String**| Translation Key ID |
 **id** | **kotlin.String**| ID |
 **commentMarkReadParameters** | [**CommentMarkReadParameters**](CommentMarkReadParameters.md)|  |
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

<a name="commentMarkUnread"></a>
# **commentMarkUnread**
> commentMarkUnread(projectId, keyId, id, xminusPhraseAppMinusOTP, branch)

Mark a comment as unread

Mark a comment as unread.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = CommentsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val keyId : kotlin.String = keyId_example // kotlin.String | Translation Key ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    apiInstance.commentMarkUnread(projectId, keyId, id, xminusPhraseAppMinusOTP, branch)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#commentMarkUnread")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#commentMarkUnread")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **keyId** | **kotlin.String**| Translation Key ID |
 **id** | **kotlin.String**| ID |
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

<a name="commentShow"></a>
# **commentShow**
> Comment commentShow(projectId, keyId, id, xminusPhraseAppMinusOTP, branch)

Get a single comment

Get details on a single comment.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = CommentsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val keyId : kotlin.String = keyId_example // kotlin.String | Translation Key ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    val result : Comment = apiInstance.commentShow(projectId, keyId, id, xminusPhraseAppMinusOTP, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#commentShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#commentShow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **keyId** | **kotlin.String**| Translation Key ID |
 **id** | **kotlin.String**| ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **branch** | **kotlin.String**| specify the branch to use | [optional]

### Return type

[**Comment**](Comment.md)

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

<a name="commentUpdate"></a>
# **commentUpdate**
> Comment commentUpdate(projectId, keyId, id, commentUpdateParameters, xminusPhraseAppMinusOTP)

Update a comment

Update an existing comment.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = CommentsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val keyId : kotlin.String = keyId_example // kotlin.String | Translation Key ID
val id : kotlin.String = id_example // kotlin.String | ID
val commentUpdateParameters : CommentUpdateParameters =  // CommentUpdateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Comment = apiInstance.commentUpdate(projectId, keyId, id, commentUpdateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#commentUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#commentUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **keyId** | **kotlin.String**| Translation Key ID |
 **id** | **kotlin.String**| ID |
 **commentUpdateParameters** | [**CommentUpdateParameters**](CommentUpdateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Comment**](Comment.md)

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

<a name="commentsList"></a>
# **commentsList**
> kotlin.Array&lt;Comment&gt; commentsList(projectId, keyId, xminusPhraseAppMinusOTP, page, perPage, branch)

List comments

List all comments for a key.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = CommentsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val keyId : kotlin.String = keyId_example // kotlin.String | Translation Key ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    val result : kotlin.Array<Comment> = apiInstance.commentsList(projectId, keyId, xminusPhraseAppMinusOTP, page, perPage, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#commentsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#commentsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **keyId** | **kotlin.String**| Translation Key ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **kotlin.Int**| Page number | [optional]
 **perPage** | **kotlin.Int**| allows you to specify a page size up to 100 items, 10 by default | [optional]
 **branch** | **kotlin.String**| specify the branch to use | [optional]

### Return type

[**kotlin.Array&lt;Comment&gt;**](Comment.md)

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

