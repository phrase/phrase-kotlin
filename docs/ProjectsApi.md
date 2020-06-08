# ProjectsApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**projectCreate**](ProjectsApi.md#projectCreate) | **POST** /projects | Create a project
[**projectDelete**](ProjectsApi.md#projectDelete) | **DELETE** /projects/{id} | Delete a project
[**projectShow**](ProjectsApi.md#projectShow) | **GET** /projects/{id} | Get a single project
[**projectUpdate**](ProjectsApi.md#projectUpdate) | **PATCH** /projects/{id} | Update a project
[**projectsList**](ProjectsApi.md#projectsList) | **GET** /projects | List projects


<a name="projectCreate"></a>
# **projectCreate**
> ProjectDetails projectCreate(projectCreateParameters, xminusPhraseAppMinusOTP)

Create a project

Create a new project.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = ProjectsApi()
val projectCreateParameters : ProjectCreateParameters =  // ProjectCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : ProjectDetails = apiInstance.projectCreate(projectCreateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectCreateParameters** | [**ProjectCreateParameters**](ProjectCreateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**ProjectDetails**](ProjectDetails.md)

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

<a name="projectDelete"></a>
# **projectDelete**
> projectDelete(id, xminusPhraseAppMinusOTP)

Delete a project

Delete an existing project.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = ProjectsApi()
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.projectDelete(id, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectDelete")
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

<a name="projectShow"></a>
# **projectShow**
> ProjectDetails projectShow(id, xminusPhraseAppMinusOTP)

Get a single project

Get details on a single project.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = ProjectsApi()
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : ProjectDetails = apiInstance.projectShow(id, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectShow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**ProjectDetails**](ProjectDetails.md)

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

<a name="projectUpdate"></a>
# **projectUpdate**
> ProjectDetails projectUpdate(id, projectUpdateParameters, xminusPhraseAppMinusOTP)

Update a project

Update an existing project.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = ProjectsApi()
val id : kotlin.String = id_example // kotlin.String | ID
val projectUpdateParameters : ProjectUpdateParameters =  // ProjectUpdateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : ProjectDetails = apiInstance.projectUpdate(id, projectUpdateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| ID |
 **projectUpdateParameters** | [**ProjectUpdateParameters**](ProjectUpdateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**ProjectDetails**](ProjectDetails.md)

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

<a name="projectsList"></a>
# **projectsList**
> kotlin.Array&lt;Project&gt; projectsList(xminusPhraseAppMinusOTP, page, perPage)

List projects

List all projects the current user has access to.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = ProjectsApi()
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
try {
    val result : kotlin.Array<Project> = apiInstance.projectsList(xminusPhraseAppMinusOTP, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsList")
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

[**kotlin.Array&lt;Project&gt;**](Project.md)

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

