# JobLocalesApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jobLocaleComplete**](JobLocalesApi.md#jobLocaleComplete) | **POST** /projects/{project_id}/jobs/{job_id}/locales/{id}/complete | Complete a job locale
[**jobLocaleDelete**](JobLocalesApi.md#jobLocaleDelete) | **DELETE** /projects/{project_id}/jobs/{job_id}/locales/{id} | Delete a job locale
[**jobLocaleReopen**](JobLocalesApi.md#jobLocaleReopen) | **POST** /projects/{project_id}/jobs/{job_id}/locales/{id}/reopen | Reopen a job locale
[**jobLocaleShow**](JobLocalesApi.md#jobLocaleShow) | **GET** /projects/{project_id}/jobs/{job_id}/locale/{id} | Get a single job locale
[**jobLocaleUpdate**](JobLocalesApi.md#jobLocaleUpdate) | **PATCH** /projects/{project_id}/jobs/{job_id}/locales/{id} | Update a job locale
[**jobLocalesCreate**](JobLocalesApi.md#jobLocalesCreate) | **POST** /projects/{project_id}/jobs/{job_id}/locales | Create a job locale
[**jobLocalesList**](JobLocalesApi.md#jobLocalesList) | **GET** /projects/{project_id}/jobs/{job_id}/locales | List job locales


<a name="jobLocaleComplete"></a>
# **jobLocaleComplete**
> JobLocale jobLocaleComplete(projectId, jobId, id, jobLocaleCompleteParameters, xminusPhraseAppMinusOTP)

Complete a job locale

Mark a job locale as completed.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = JobLocalesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val jobId : kotlin.String = jobId_example // kotlin.String | Job ID
val id : kotlin.String = id_example // kotlin.String | ID
val jobLocaleCompleteParameters : JobLocaleCompleteParameters =  // JobLocaleCompleteParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : JobLocale = apiInstance.jobLocaleComplete(projectId, jobId, id, jobLocaleCompleteParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobLocalesApi#jobLocaleComplete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobLocalesApi#jobLocaleComplete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **jobId** | **kotlin.String**| Job ID |
 **id** | **kotlin.String**| ID |
 **jobLocaleCompleteParameters** | [**JobLocaleCompleteParameters**](JobLocaleCompleteParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**JobLocale**](JobLocale.md)

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

<a name="jobLocaleDelete"></a>
# **jobLocaleDelete**
> jobLocaleDelete(projectId, jobId, id, xminusPhraseAppMinusOTP, branch)

Delete a job locale

Delete an existing job locale.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = JobLocalesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val jobId : kotlin.String = jobId_example // kotlin.String | Job ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    apiInstance.jobLocaleDelete(projectId, jobId, id, xminusPhraseAppMinusOTP, branch)
} catch (e: ClientException) {
    println("4xx response calling JobLocalesApi#jobLocaleDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobLocalesApi#jobLocaleDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **jobId** | **kotlin.String**| Job ID |
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

<a name="jobLocaleReopen"></a>
# **jobLocaleReopen**
> JobLocale jobLocaleReopen(projectId, jobId, id, jobLocaleReopenParameters, xminusPhraseAppMinusOTP)

Reopen a job locale

Mark a job locale as uncompleted.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = JobLocalesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val jobId : kotlin.String = jobId_example // kotlin.String | Job ID
val id : kotlin.String = id_example // kotlin.String | ID
val jobLocaleReopenParameters : JobLocaleReopenParameters =  // JobLocaleReopenParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : JobLocale = apiInstance.jobLocaleReopen(projectId, jobId, id, jobLocaleReopenParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobLocalesApi#jobLocaleReopen")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobLocalesApi#jobLocaleReopen")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **jobId** | **kotlin.String**| Job ID |
 **id** | **kotlin.String**| ID |
 **jobLocaleReopenParameters** | [**JobLocaleReopenParameters**](JobLocaleReopenParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**JobLocale**](JobLocale.md)

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

<a name="jobLocaleShow"></a>
# **jobLocaleShow**
> JobLocale jobLocaleShow(projectId, jobId, id, xminusPhraseAppMinusOTP, branch)

Get a single job locale

Get a single job locale for a given job.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = JobLocalesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val jobId : kotlin.String = jobId_example // kotlin.String | Job ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    val result : JobLocale = apiInstance.jobLocaleShow(projectId, jobId, id, xminusPhraseAppMinusOTP, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobLocalesApi#jobLocaleShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobLocalesApi#jobLocaleShow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **jobId** | **kotlin.String**| Job ID |
 **id** | **kotlin.String**| ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **branch** | **kotlin.String**| specify the branch to use | [optional]

### Return type

[**JobLocale**](JobLocale.md)

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

<a name="jobLocaleUpdate"></a>
# **jobLocaleUpdate**
> JobLocale jobLocaleUpdate(projectId, jobId, id, jobLocaleUpdateParameters, xminusPhraseAppMinusOTP)

Update a job locale

Update an existing job locale.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = JobLocalesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val jobId : kotlin.String = jobId_example // kotlin.String | Job ID
val id : kotlin.String = id_example // kotlin.String | ID
val jobLocaleUpdateParameters : JobLocaleUpdateParameters =  // JobLocaleUpdateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : JobLocale = apiInstance.jobLocaleUpdate(projectId, jobId, id, jobLocaleUpdateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobLocalesApi#jobLocaleUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobLocalesApi#jobLocaleUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **jobId** | **kotlin.String**| Job ID |
 **id** | **kotlin.String**| ID |
 **jobLocaleUpdateParameters** | [**JobLocaleUpdateParameters**](JobLocaleUpdateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**JobLocale**](JobLocale.md)

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

<a name="jobLocalesCreate"></a>
# **jobLocalesCreate**
> jobLocalesCreate(projectId, jobId, jobLocalesCreateParameters, xminusPhraseAppMinusOTP)

Create a job locale

Create a new job locale.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = JobLocalesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val jobId : kotlin.String = jobId_example // kotlin.String | Job ID
val jobLocalesCreateParameters : JobLocalesCreateParameters =  // JobLocalesCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.jobLocalesCreate(projectId, jobId, jobLocalesCreateParameters, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling JobLocalesApi#jobLocalesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobLocalesApi#jobLocalesCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **jobId** | **kotlin.String**| Job ID |
 **jobLocalesCreateParameters** | [**JobLocalesCreateParameters**](JobLocalesCreateParameters.md)|  |
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

<a name="jobLocalesList"></a>
# **jobLocalesList**
> kotlin.Array&lt;JobLocale&gt; jobLocalesList(projectId, jobId, xminusPhraseAppMinusOTP, page, perPage, branch)

List job locales

List all job locales for a given job.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = JobLocalesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val jobId : kotlin.String = jobId_example // kotlin.String | Job ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    val result : kotlin.Array<JobLocale> = apiInstance.jobLocalesList(projectId, jobId, xminusPhraseAppMinusOTP, page, perPage, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobLocalesApi#jobLocalesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobLocalesApi#jobLocalesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **jobId** | **kotlin.String**| Job ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **kotlin.Int**| Page number | [optional]
 **perPage** | **kotlin.Int**| allows you to specify a page size up to 100 items, 10 by default | [optional]
 **branch** | **kotlin.String**| specify the branch to use | [optional]

### Return type

[**kotlin.Array&lt;JobLocale&gt;**](JobLocale.md)

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

