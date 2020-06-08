# WebhooksApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webhookCreate**](WebhooksApi.md#webhookCreate) | **POST** /projects/{project_id}/webhooks | Create a webhook
[**webhookDelete**](WebhooksApi.md#webhookDelete) | **DELETE** /projects/{project_id}/webhooks/{id} | Delete a webhook
[**webhookShow**](WebhooksApi.md#webhookShow) | **GET** /projects/{project_id}/webhooks/{id} | Get a single webhook
[**webhookTest**](WebhooksApi.md#webhookTest) | **POST** /projects/{project_id}/webhooks/{id}/test | Test a webhook
[**webhookUpdate**](WebhooksApi.md#webhookUpdate) | **PATCH** /projects/{project_id}/webhooks/{id} | Update a webhook
[**webhooksList**](WebhooksApi.md#webhooksList) | **GET** /projects/{project_id}/webhooks | List webhooks


<a name="webhookCreate"></a>
# **webhookCreate**
> Webhook webhookCreate(projectId, webhookCreateParameters, xminusPhraseAppMinusOTP)

Create a webhook

Create a new webhook.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = WebhooksApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val webhookCreateParameters : WebhookCreateParameters =  // WebhookCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Webhook = apiInstance.webhookCreate(projectId, webhookCreateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#webhookCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#webhookCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **webhookCreateParameters** | [**WebhookCreateParameters**](WebhookCreateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Webhook**](Webhook.md)

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

<a name="webhookDelete"></a>
# **webhookDelete**
> webhookDelete(projectId, id, xminusPhraseAppMinusOTP)

Delete a webhook

Delete an existing webhook.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = WebhooksApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.webhookDelete(projectId, id, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#webhookDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#webhookDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
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

<a name="webhookShow"></a>
# **webhookShow**
> Webhook webhookShow(projectId, id, xminusPhraseAppMinusOTP)

Get a single webhook

Get details on a single webhook.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = WebhooksApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Webhook = apiInstance.webhookShow(projectId, id, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#webhookShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#webhookShow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Webhook**](Webhook.md)

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

<a name="webhookTest"></a>
# **webhookTest**
> webhookTest(projectId, id, xminusPhraseAppMinusOTP)

Test a webhook

Perform a test request for a webhook.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = WebhooksApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.webhookTest(projectId, id, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#webhookTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#webhookTest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
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

<a name="webhookUpdate"></a>
# **webhookUpdate**
> Webhook webhookUpdate(projectId, id, webhookUpdateParameters, xminusPhraseAppMinusOTP)

Update a webhook

Update an existing webhook.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = WebhooksApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val webhookUpdateParameters : WebhookUpdateParameters =  // WebhookUpdateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Webhook = apiInstance.webhookUpdate(projectId, id, webhookUpdateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#webhookUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#webhookUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **webhookUpdateParameters** | [**WebhookUpdateParameters**](WebhookUpdateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Webhook**](Webhook.md)

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

<a name="webhooksList"></a>
# **webhooksList**
> kotlin.Array&lt;Webhook&gt; webhooksList(projectId, xminusPhraseAppMinusOTP, page, perPage)

List webhooks

List all webhooks for the given project.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = WebhooksApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
try {
    val result : kotlin.Array<Webhook> = apiInstance.webhooksList(projectId, xminusPhraseAppMinusOTP, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#webhooksList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#webhooksList")
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

[**kotlin.Array&lt;Webhook&gt;**](Webhook.md)

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

