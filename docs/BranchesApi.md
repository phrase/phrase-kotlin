# BranchesApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**branchCompare**](BranchesApi.md#branchCompare) | **GET** /projects/{project_id}/branches/{name}/compare | Compare branches
[**branchCreate**](BranchesApi.md#branchCreate) | **POST** /projects/{project_id}/branches | Create a branch
[**branchDelete**](BranchesApi.md#branchDelete) | **DELETE** /projects/{project_id}/branches/{name} | Delete a branch
[**branchMerge**](BranchesApi.md#branchMerge) | **PATCH** /projects/{project_id}/branches/{name}/merge | Merge a branch
[**branchShow**](BranchesApi.md#branchShow) | **GET** /projects/{project_id}/branches/{name} | Get a single branch
[**branchUpdate**](BranchesApi.md#branchUpdate) | **PATCH** /projects/{project_id}/branches/{name} | Update a branch
[**branchesList**](BranchesApi.md#branchesList) | **GET** /projects/{project_id}/branches | List branches


<a name="branchCompare"></a>
# **branchCompare**
> branchCompare(projectId, name, xminusPhraseAppMinusOTP)

Compare branches

Compare branch with main branch.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = BranchesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val name : kotlin.String = name_example // kotlin.String | name
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.branchCompare(projectId, name, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling BranchesApi#branchCompare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BranchesApi#branchCompare")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **name** | **kotlin.String**| name |
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

<a name="branchCreate"></a>
# **branchCreate**
> Branch branchCreate(projectId, branchCreateParameters, xminusPhraseAppMinusOTP)

Create a branch

Create a new branch.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = BranchesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val branchCreateParameters : BranchCreateParameters =  // BranchCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Branch = apiInstance.branchCreate(projectId, branchCreateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BranchesApi#branchCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BranchesApi#branchCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **branchCreateParameters** | [**BranchCreateParameters**](BranchCreateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Branch**](Branch.md)

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

<a name="branchDelete"></a>
# **branchDelete**
> branchDelete(projectId, name, xminusPhraseAppMinusOTP)

Delete a branch

Delete an existing branch.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = BranchesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val name : kotlin.String = name_example // kotlin.String | name
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.branchDelete(projectId, name, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling BranchesApi#branchDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BranchesApi#branchDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **name** | **kotlin.String**| name |
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

<a name="branchMerge"></a>
# **branchMerge**
> branchMerge(projectId, name, branchMergeParameters, xminusPhraseAppMinusOTP)

Merge a branch

Merge an existing branch.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = BranchesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val name : kotlin.String = name_example // kotlin.String | name
val branchMergeParameters : BranchMergeParameters =  // BranchMergeParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.branchMerge(projectId, name, branchMergeParameters, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling BranchesApi#branchMerge")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BranchesApi#branchMerge")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **name** | **kotlin.String**| name |
 **branchMergeParameters** | [**BranchMergeParameters**](BranchMergeParameters.md)|  |
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

<a name="branchShow"></a>
# **branchShow**
> Branch branchShow(projectId, name, xminusPhraseAppMinusOTP)

Get a single branch

Get details on a single branch for a given project.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = BranchesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val name : kotlin.String = name_example // kotlin.String | name
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Branch = apiInstance.branchShow(projectId, name, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BranchesApi#branchShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BranchesApi#branchShow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **name** | **kotlin.String**| name |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Branch**](Branch.md)

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

<a name="branchUpdate"></a>
# **branchUpdate**
> Branch branchUpdate(projectId, name, branchUpdateParameters, xminusPhraseAppMinusOTP)

Update a branch

Update an existing branch.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = BranchesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val name : kotlin.String = name_example // kotlin.String | name
val branchUpdateParameters : BranchUpdateParameters =  // BranchUpdateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Branch = apiInstance.branchUpdate(projectId, name, branchUpdateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BranchesApi#branchUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BranchesApi#branchUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **name** | **kotlin.String**| name |
 **branchUpdateParameters** | [**BranchUpdateParameters**](BranchUpdateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Branch**](Branch.md)

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

<a name="branchesList"></a>
# **branchesList**
> kotlin.Array&lt;Branch&gt; branchesList(projectId, xminusPhraseAppMinusOTP, page, perPage)

List branches

List all branches the of the current project.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = BranchesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
try {
    val result : kotlin.Array<Branch> = apiInstance.branchesList(projectId, xminusPhraseAppMinusOTP, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BranchesApi#branchesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BranchesApi#branchesList")
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

### Return type

[**kotlin.Array&lt;Branch&gt;**](Branch.md)

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

