# KeysApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**keyCreate**](KeysApi.md#keyCreate) | **POST** /projects/{project_id}/keys | Create a key
[**keyDelete**](KeysApi.md#keyDelete) | **DELETE** /projects/{project_id}/keys/{id} | Delete a key
[**keyShow**](KeysApi.md#keyShow) | **GET** /projects/{project_id}/keys/{id} | Get a single key
[**keyUpdate**](KeysApi.md#keyUpdate) | **PATCH** /projects/{project_id}/keys/{id} | Update a key
[**keysDelete**](KeysApi.md#keysDelete) | **DELETE** /projects/{project_id}/keys | Delete collection of keys
[**keysList**](KeysApi.md#keysList) | **GET** /projects/{project_id}/keys | List keys
[**keysSearch**](KeysApi.md#keysSearch) | **POST** /projects/{project_id}/keys/search | Search keys
[**keysTag**](KeysApi.md#keysTag) | **PATCH** /projects/{project_id}/keys/tag | Add tags to collection of keys
[**keysUntag**](KeysApi.md#keysUntag) | **PATCH** /projects/{project_id}/keys/untag | Remove tags from collection of keys


<a name="keyCreate"></a>
# **keyCreate**
> keyCreate(projectId, keyCreateParameters, xminusPhraseAppMinusOTP)

Create a key

Create a new key.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = KeysApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val keyCreateParameters : KeyCreateParameters =  // KeyCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.keyCreate(projectId, keyCreateParameters, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling KeysApi#keyCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeysApi#keyCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **keyCreateParameters** | [**KeyCreateParameters**](KeyCreateParameters.md)|  |
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

<a name="keyDelete"></a>
# **keyDelete**
> keyDelete(projectId, id, xminusPhraseAppMinusOTP, branch)

Delete a key

Delete an existing key.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = KeysApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    apiInstance.keyDelete(projectId, id, xminusPhraseAppMinusOTP, branch)
} catch (e: ClientException) {
    println("4xx response calling KeysApi#keyDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeysApi#keyDelete")
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

<a name="keyShow"></a>
# **keyShow**
> TranslationKeyDetails keyShow(projectId, id, xminusPhraseAppMinusOTP, branch)

Get a single key

Get details on a single key for a given project.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = KeysApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    val result : TranslationKeyDetails = apiInstance.keyShow(projectId, id, xminusPhraseAppMinusOTP, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KeysApi#keyShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeysApi#keyShow")
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

[**TranslationKeyDetails**](TranslationKeyDetails.md)

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

<a name="keyUpdate"></a>
# **keyUpdate**
> TranslationKeyDetails keyUpdate(projectId, id, keyUpdateParameters, xminusPhraseAppMinusOTP)

Update a key

Update an existing key.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = KeysApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val keyUpdateParameters : KeyUpdateParameters =  // KeyUpdateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : TranslationKeyDetails = apiInstance.keyUpdate(projectId, id, keyUpdateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KeysApi#keyUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeysApi#keyUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **keyUpdateParameters** | [**KeyUpdateParameters**](KeyUpdateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**TranslationKeyDetails**](TranslationKeyDetails.md)

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

<a name="keysDelete"></a>
# **keysDelete**
> AffectedResources keysDelete(projectId, xminusPhraseAppMinusOTP, branch, q, localeId)

Delete collection of keys

Delete all keys matching query. Same constraints as list. Please limit the number of affected keys to about 1,000 as you might experience timeouts otherwise.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = KeysApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
val q : kotlin.String = mykey* translated:true // kotlin.String | q_description_placeholder
val localeId : kotlin.String = abcd1234abcd1234abcd1234abcd1234 // kotlin.String | Locale used to determine the translation state of a key when filtering for untranslated or translated keys.
try {
    val result : AffectedResources = apiInstance.keysDelete(projectId, xminusPhraseAppMinusOTP, branch, q, localeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KeysApi#keysDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeysApi#keysDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **branch** | **kotlin.String**| specify the branch to use | [optional]
 **q** | **kotlin.String**| q_description_placeholder | [optional]
 **localeId** | **kotlin.String**| Locale used to determine the translation state of a key when filtering for untranslated or translated keys. | [optional]

### Return type

[**AffectedResources**](AffectedResources.md)

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

<a name="keysList"></a>
# **keysList**
> kotlin.Array&lt;TranslationKey&gt; keysList(projectId, xminusPhraseAppMinusOTP, page, perPage, branch, sort, order, q, localeId)

List keys

List all keys for the given project. Alternatively you can POST requests to /search.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = KeysApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
val sort : kotlin.String = updated_at // kotlin.String | Sort by field. Can be one of: name, created_at, updated_at.
val order : kotlin.String = desc // kotlin.String | Order direction. Can be one of: asc, desc.
val q : kotlin.String = mykey* translated:true // kotlin.String | q_description_placeholder
val localeId : kotlin.String = abcd1234abcd1234abcd1234abcd1234 // kotlin.String | Locale used to determine the translation state of a key when filtering for untranslated or translated keys.
try {
    val result : kotlin.Array<TranslationKey> = apiInstance.keysList(projectId, xminusPhraseAppMinusOTP, page, perPage, branch, sort, order, q, localeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KeysApi#keysList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeysApi#keysList")
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
 **sort** | **kotlin.String**| Sort by field. Can be one of: name, created_at, updated_at. | [optional]
 **order** | **kotlin.String**| Order direction. Can be one of: asc, desc. | [optional]
 **q** | **kotlin.String**| q_description_placeholder | [optional]
 **localeId** | **kotlin.String**| Locale used to determine the translation state of a key when filtering for untranslated or translated keys. | [optional]

### Return type

[**kotlin.Array&lt;TranslationKey&gt;**](TranslationKey.md)

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

<a name="keysSearch"></a>
# **keysSearch**
> kotlin.Array&lt;TranslationKey&gt; keysSearch(projectId, keysSearchParameters, xminusPhraseAppMinusOTP, page, perPage)

Search keys

Search keys for the given project matching query.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = KeysApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val keysSearchParameters : KeysSearchParameters =  // KeysSearchParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
try {
    val result : kotlin.Array<TranslationKey> = apiInstance.keysSearch(projectId, keysSearchParameters, xminusPhraseAppMinusOTP, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KeysApi#keysSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeysApi#keysSearch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **keysSearchParameters** | [**KeysSearchParameters**](KeysSearchParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **kotlin.Int**| Page number | [optional]
 **perPage** | **kotlin.Int**| allows you to specify a page size up to 100 items, 10 by default | [optional]

### Return type

[**kotlin.Array&lt;TranslationKey&gt;**](TranslationKey.md)

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

<a name="keysTag"></a>
# **keysTag**
> AffectedResources keysTag(projectId, keysTagParameters, xminusPhraseAppMinusOTP)

Add tags to collection of keys

Tags all keys matching query. Same constraints as list.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = KeysApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val keysTagParameters : KeysTagParameters =  // KeysTagParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : AffectedResources = apiInstance.keysTag(projectId, keysTagParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KeysApi#keysTag")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeysApi#keysTag")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **keysTagParameters** | [**KeysTagParameters**](KeysTagParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**AffectedResources**](AffectedResources.md)

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

<a name="keysUntag"></a>
# **keysUntag**
> AffectedResources keysUntag(projectId, keysUntagParameters, xminusPhraseAppMinusOTP)

Remove tags from collection of keys

Removes specified tags from keys matching query.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = KeysApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val keysUntagParameters : KeysUntagParameters =  // KeysUntagParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : AffectedResources = apiInstance.keysUntag(projectId, keysUntagParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KeysApi#keysUntag")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeysApi#keysUntag")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **keysUntagParameters** | [**KeysUntagParameters**](KeysUntagParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**AffectedResources**](AffectedResources.md)

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

