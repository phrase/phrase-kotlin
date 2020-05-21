# OrdersApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderConfirm**](OrdersApi.md#orderConfirm) | **PATCH** /projects/{project_id}/orders/{id}/confirm | Confirm an order
[**orderCreate**](OrdersApi.md#orderCreate) | **POST** /projects/{project_id}/orders | Create a new order
[**orderDelete**](OrdersApi.md#orderDelete) | **DELETE** /projects/{project_id}/orders/{id} | Cancel an order
[**orderShow**](OrdersApi.md#orderShow) | **GET** /projects/{project_id}/orders/{id} | Get a single order
[**ordersList**](OrdersApi.md#ordersList) | **GET** /projects/{project_id}/orders | List orders


<a name="orderConfirm"></a>
# **orderConfirm**
> TranslationOrder orderConfirm(projectId, id, orderConfirmParameters, xminusPhraseAppMinusOTP)

Confirm an order

Confirm an existing order and send it to the provider for translation. Same constraints as for create.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = OrdersApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val orderConfirmParameters : OrderConfirmParameters =  // OrderConfirmParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : TranslationOrder = apiInstance.orderConfirm(projectId, id, orderConfirmParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#orderConfirm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#orderConfirm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **orderConfirmParameters** | [**OrderConfirmParameters**](OrderConfirmParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**TranslationOrder**](TranslationOrder.md)

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

<a name="orderCreate"></a>
# **orderCreate**
> orderCreate(projectId, orderCreateParameters, xminusPhraseAppMinusOTP)

Create a new order

Create a new order. Access token scope must include &lt;code&gt;orders.create&lt;/code&gt;.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = OrdersApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val orderCreateParameters : OrderCreateParameters =  // OrderCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.orderCreate(projectId, orderCreateParameters, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#orderCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#orderCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **orderCreateParameters** | [**OrderCreateParameters**](OrderCreateParameters.md)|  |
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

<a name="orderDelete"></a>
# **orderDelete**
> orderDelete(projectId, id, xminusPhraseAppMinusOTP, branch)

Cancel an order

Cancel an existing order. Must not yet be confirmed.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = OrdersApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    apiInstance.orderDelete(projectId, id, xminusPhraseAppMinusOTP, branch)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#orderDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#orderDelete")
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

<a name="orderShow"></a>
# **orderShow**
> TranslationOrder orderShow(projectId, id, xminusPhraseAppMinusOTP, branch)

Get a single order

Get details on a single order.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = OrdersApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    val result : TranslationOrder = apiInstance.orderShow(projectId, id, xminusPhraseAppMinusOTP, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#orderShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#orderShow")
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

[**TranslationOrder**](TranslationOrder.md)

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

<a name="ordersList"></a>
# **ordersList**
> kotlin.Array&lt;TranslationOrder&gt; ordersList(projectId, xminusPhraseAppMinusOTP, page, perPage, branch)

List orders

List all orders for the given project.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = OrdersApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    val result : kotlin.Array<TranslationOrder> = apiInstance.ordersList(projectId, xminusPhraseAppMinusOTP, page, perPage, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#ordersList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#ordersList")
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

[**kotlin.Array&lt;TranslationOrder&gt;**](TranslationOrder.md)

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

