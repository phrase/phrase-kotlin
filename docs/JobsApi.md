# JobsApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jobComplete**](JobsApi.md#jobComplete) | **POST** /projects/{project_id}/jobs/{id}/complete | Complete a job
[**jobCreate**](JobsApi.md#jobCreate) | **POST** /projects/{project_id}/jobs | Create a job
[**jobDelete**](JobsApi.md#jobDelete) | **DELETE** /projects/{project_id}/jobs/{id} | Delete a job
[**jobKeysCreate**](JobsApi.md#jobKeysCreate) | **POST** /projects/{project_id}/jobs/{id}/keys | Add keys to job
[**jobKeysDelete**](JobsApi.md#jobKeysDelete) | **DELETE** /projects/{project_id}/jobs/{id}/keys | Remove keys from job
[**jobReopen**](JobsApi.md#jobReopen) | **POST** /projects/{project_id}/jobs/{id}/reopen | Reopen a job
[**jobShow**](JobsApi.md#jobShow) | **GET** /projects/{project_id}/jobs/{id} | Get a single job
[**jobStart**](JobsApi.md#jobStart) | **POST** /projects/{project_id}/jobs/{id}/start | Start a job
[**jobUpdate**](JobsApi.md#jobUpdate) | **PATCH** /projects/{project_id}/jobs/{id} | Update a job
[**jobsList**](JobsApi.md#jobsList) | **GET** /projects/{project_id}/jobs | List jobs


<a name="jobComplete"></a>
# **jobComplete**
> JobDetails jobComplete(projectId, id, jobCompleteParameters, xminusPhraseAppMinusOTP)

Complete a job

Mark a job as completed.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = JobsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val jobCompleteParameters : JobCompleteParameters =  // JobCompleteParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : JobDetails = apiInstance.jobComplete(projectId, id, jobCompleteParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobsApi#jobComplete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobsApi#jobComplete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **jobCompleteParameters** | [**JobCompleteParameters**](JobCompleteParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**JobDetails**](JobDetails.md)

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

<a name="jobCreate"></a>
# **jobCreate**
> JobDetails jobCreate(projectId, jobCreateParameters, xminusPhraseAppMinusOTP)

Create a job

Create a new job.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = JobsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val jobCreateParameters : JobCreateParameters =  // JobCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : JobDetails = apiInstance.jobCreate(projectId, jobCreateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobsApi#jobCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobsApi#jobCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **jobCreateParameters** | [**JobCreateParameters**](JobCreateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**JobDetails**](JobDetails.md)

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

<a name="jobDelete"></a>
# **jobDelete**
> jobDelete(projectId, id, xminusPhraseAppMinusOTP, branch)

Delete a job

Delete an existing job.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = JobsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    apiInstance.jobDelete(projectId, id, xminusPhraseAppMinusOTP, branch)
} catch (e: ClientException) {
    println("4xx response calling JobsApi#jobDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobsApi#jobDelete")
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

<a name="jobKeysCreate"></a>
# **jobKeysCreate**
> JobDetails jobKeysCreate(projectId, id, jobKeysCreateParameters, xminusPhraseAppMinusOTP)

Add keys to job

Add multiple keys to a existing job.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = JobsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val jobKeysCreateParameters : JobKeysCreateParameters =  // JobKeysCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : JobDetails = apiInstance.jobKeysCreate(projectId, id, jobKeysCreateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobsApi#jobKeysCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobsApi#jobKeysCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **jobKeysCreateParameters** | [**JobKeysCreateParameters**](JobKeysCreateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**JobDetails**](JobDetails.md)

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

<a name="jobKeysDelete"></a>
# **jobKeysDelete**
> jobKeysDelete(projectId, id, xminusPhraseAppMinusOTP, branch, translationKeyIds)

Remove keys from job

Remove multiple keys from existing job.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = JobsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
val translationKeyIds : kotlin.Array<kotlin.String> = ["abcd1234cdef1234abcd1234cdef1234"] // kotlin.Array<kotlin.String> | ids of keys that should added to the job
try {
    apiInstance.jobKeysDelete(projectId, id, xminusPhraseAppMinusOTP, branch, translationKeyIds)
} catch (e: ClientException) {
    println("4xx response calling JobsApi#jobKeysDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobsApi#jobKeysDelete")
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
 **translationKeyIds** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| ids of keys that should added to the job | [optional]

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

<a name="jobReopen"></a>
# **jobReopen**
> JobDetails jobReopen(projectId, id, jobReopenParameters, xminusPhraseAppMinusOTP)

Reopen a job

Mark a job as uncompleted.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = JobsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val jobReopenParameters : JobReopenParameters =  // JobReopenParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : JobDetails = apiInstance.jobReopen(projectId, id, jobReopenParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobsApi#jobReopen")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobsApi#jobReopen")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **jobReopenParameters** | [**JobReopenParameters**](JobReopenParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**JobDetails**](JobDetails.md)

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

<a name="jobShow"></a>
# **jobShow**
> JobDetails jobShow(projectId, id, xminusPhraseAppMinusOTP, branch)

Get a single job

Get details on a single job for a given project.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = JobsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    val result : JobDetails = apiInstance.jobShow(projectId, id, xminusPhraseAppMinusOTP, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobsApi#jobShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobsApi#jobShow")
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

[**JobDetails**](JobDetails.md)

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

<a name="jobStart"></a>
# **jobStart**
> JobDetails jobStart(projectId, id, jobStartParameters, xminusPhraseAppMinusOTP)

Start a job

Starts an existing job in state draft.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = JobsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val jobStartParameters : JobStartParameters =  // JobStartParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : JobDetails = apiInstance.jobStart(projectId, id, jobStartParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobsApi#jobStart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobsApi#jobStart")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **jobStartParameters** | [**JobStartParameters**](JobStartParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**JobDetails**](JobDetails.md)

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

<a name="jobUpdate"></a>
# **jobUpdate**
> JobDetails jobUpdate(projectId, id, jobUpdateParameters, xminusPhraseAppMinusOTP)

Update a job

Update an existing job.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = JobsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val jobUpdateParameters : JobUpdateParameters =  // JobUpdateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : JobDetails = apiInstance.jobUpdate(projectId, id, jobUpdateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobsApi#jobUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobsApi#jobUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **jobUpdateParameters** | [**JobUpdateParameters**](JobUpdateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**JobDetails**](JobDetails.md)

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

<a name="jobsList"></a>
# **jobsList**
> kotlin.Array&lt;Job&gt; jobsList(projectId, xminusPhraseAppMinusOTP, page, perPage, branch, ownedBy, assignedTo, state)

List jobs

List all jobs for the given project.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = JobsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
val ownedBy : kotlin.String = abcd1234cdef1234abcd1234cdef1234 // kotlin.String | filter by user owning job
val assignedTo : kotlin.String = abcd1234cdef1234abcd1234cdef1234 // kotlin.String | filter by user assigned to job
val state : kotlin.String = completed // kotlin.String | filter by state of job Valid states are <code>draft</code>, <code>in_progress</code>, <code>completed</code>
try {
    val result : kotlin.Array<Job> = apiInstance.jobsList(projectId, xminusPhraseAppMinusOTP, page, perPage, branch, ownedBy, assignedTo, state)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobsApi#jobsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobsApi#jobsList")
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
 **ownedBy** | **kotlin.String**| filter by user owning job | [optional]
 **assignedTo** | **kotlin.String**| filter by user assigned to job | [optional]
 **state** | **kotlin.String**| filter by state of job Valid states are &lt;code&gt;draft&lt;/code&gt;, &lt;code&gt;in_progress&lt;/code&gt;, &lt;code&gt;completed&lt;/code&gt; | [optional]

### Return type

[**kotlin.Array&lt;Job&gt;**](Job.md)

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

