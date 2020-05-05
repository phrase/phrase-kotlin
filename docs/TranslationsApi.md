# TranslationsApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**translationCreate**](TranslationsApi.md#translationCreate) | **POST** /projects/{project_id}/translations | Create a translation
[**translationExclude**](TranslationsApi.md#translationExclude) | **PATCH** /projects/{project_id}/translations/{id}/exclude | Exclude a translation from export
[**translationInclude**](TranslationsApi.md#translationInclude) | **PATCH** /projects/{project_id}/translations/{id}/include | Revoke exclusion of a translation in export
[**translationReview**](TranslationsApi.md#translationReview) | **PATCH** /projects/{project_id}/translations/{id}/review | Review a translation
[**translationShow**](TranslationsApi.md#translationShow) | **GET** /projects/{project_id}/translations/{id} | Get a single translation
[**translationUnverify**](TranslationsApi.md#translationUnverify) | **PATCH** /projects/{project_id}/translations/{id}/unverify | Mark a translation as unverified
[**translationUpdate**](TranslationsApi.md#translationUpdate) | **PATCH** /projects/{project_id}/translations/{id} | Update a translation
[**translationVerify**](TranslationsApi.md#translationVerify) | **PATCH** /projects/{project_id}/translations/{id}/verify | Verify a translation
[**translationsByKey**](TranslationsApi.md#translationsByKey) | **GET** /projects/{project_id}/keys/{key_id}/translations | List translations by key
[**translationsByLocale**](TranslationsApi.md#translationsByLocale) | **GET** /projects/{project_id}/locales/{locale_id}/translations | List translations by locale
[**translationsExclude**](TranslationsApi.md#translationsExclude) | **PATCH** /projects/{project_id}/translations/exclude | Set exclude from export flag on translations selected by query
[**translationsInclude**](TranslationsApi.md#translationsInclude) | **PATCH** /projects/{project_id}/translations/include | Remove exlude from import flag from translations selected by query
[**translationsList**](TranslationsApi.md#translationsList) | **GET** /projects/{project_id}/translations | List all translations
[**translationsReview**](TranslationsApi.md#translationsReview) | **PATCH** /projects/{project_id}/translations/review | Review translations selected by query
[**translationsSearch**](TranslationsApi.md#translationsSearch) | **POST** /projects/{project_id}/translations/search | Search translations
[**translationsUnverify**](TranslationsApi.md#translationsUnverify) | **PATCH** /projects/{project_id}/translations/unverify | Mark translations selected by query as unverified
[**translationsVerify**](TranslationsApi.md#translationsVerify) | **PATCH** /projects/{project_id}/translations/verify | Verify translations selected by query


<a name="translationCreate"></a>
# **translationCreate**
> translationCreate(projectId, translationCreateParameters, xminusPhraseAppMinusOTP)

Create a translation

Create a translation.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = TranslationsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val translationCreateParameters : TranslationCreateParameters =  // TranslationCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.translationCreate(projectId, translationCreateParameters, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling TranslationsApi#translationCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TranslationsApi#translationCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **translationCreateParameters** | [**TranslationCreateParameters**](TranslationCreateParameters.md)|  |
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

<a name="translationExclude"></a>
# **translationExclude**
> TranslationDetails translationExclude(projectId, id, translationExcludeParameters, xminusPhraseAppMinusOTP)

Exclude a translation from export

Set exclude from export flag on an existing translation.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = TranslationsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val translationExcludeParameters : TranslationExcludeParameters =  // TranslationExcludeParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : TranslationDetails = apiInstance.translationExclude(projectId, id, translationExcludeParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TranslationsApi#translationExclude")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TranslationsApi#translationExclude")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **translationExcludeParameters** | [**TranslationExcludeParameters**](TranslationExcludeParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**TranslationDetails**](TranslationDetails.md)

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

<a name="translationInclude"></a>
# **translationInclude**
> TranslationDetails translationInclude(projectId, id, translationIncludeParameters, xminusPhraseAppMinusOTP)

Revoke exclusion of a translation in export

Remove exclude from export flag from an existing translation.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = TranslationsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val translationIncludeParameters : TranslationIncludeParameters =  // TranslationIncludeParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : TranslationDetails = apiInstance.translationInclude(projectId, id, translationIncludeParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TranslationsApi#translationInclude")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TranslationsApi#translationInclude")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **translationIncludeParameters** | [**TranslationIncludeParameters**](TranslationIncludeParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**TranslationDetails**](TranslationDetails.md)

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

<a name="translationReview"></a>
# **translationReview**
> TranslationDetails translationReview(projectId, id, translationReviewParameters, xminusPhraseAppMinusOTP)

Review a translation

Mark an existing translation as reviewed.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = TranslationsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val translationReviewParameters : TranslationReviewParameters =  // TranslationReviewParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : TranslationDetails = apiInstance.translationReview(projectId, id, translationReviewParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TranslationsApi#translationReview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TranslationsApi#translationReview")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **translationReviewParameters** | [**TranslationReviewParameters**](TranslationReviewParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**TranslationDetails**](TranslationDetails.md)

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

<a name="translationShow"></a>
# **translationShow**
> TranslationDetails translationShow(projectId, id, xminusPhraseAppMinusOTP, branch)

Get a single translation

Get details on a single translation.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = TranslationsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    val result : TranslationDetails = apiInstance.translationShow(projectId, id, xminusPhraseAppMinusOTP, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TranslationsApi#translationShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TranslationsApi#translationShow")
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

[**TranslationDetails**](TranslationDetails.md)

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

<a name="translationUnverify"></a>
# **translationUnverify**
> TranslationDetails translationUnverify(projectId, id, translationUnverifyParameters, xminusPhraseAppMinusOTP)

Mark a translation as unverified

Mark an existing translation as unverified.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = TranslationsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val translationUnverifyParameters : TranslationUnverifyParameters =  // TranslationUnverifyParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : TranslationDetails = apiInstance.translationUnverify(projectId, id, translationUnverifyParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TranslationsApi#translationUnverify")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TranslationsApi#translationUnverify")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **translationUnverifyParameters** | [**TranslationUnverifyParameters**](TranslationUnverifyParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**TranslationDetails**](TranslationDetails.md)

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

<a name="translationUpdate"></a>
# **translationUpdate**
> TranslationDetails translationUpdate(projectId, id, translationUpdateParameters, xminusPhraseAppMinusOTP)

Update a translation

Update an existing translation.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = TranslationsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val translationUpdateParameters : TranslationUpdateParameters =  // TranslationUpdateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : TranslationDetails = apiInstance.translationUpdate(projectId, id, translationUpdateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TranslationsApi#translationUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TranslationsApi#translationUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **translationUpdateParameters** | [**TranslationUpdateParameters**](TranslationUpdateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**TranslationDetails**](TranslationDetails.md)

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

<a name="translationVerify"></a>
# **translationVerify**
> TranslationDetails translationVerify(projectId, id, translationVerifyParameters, xminusPhraseAppMinusOTP)

Verify a translation

Verify an existing translation.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = TranslationsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val translationVerifyParameters : TranslationVerifyParameters =  // TranslationVerifyParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : TranslationDetails = apiInstance.translationVerify(projectId, id, translationVerifyParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TranslationsApi#translationVerify")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TranslationsApi#translationVerify")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **translationVerifyParameters** | [**TranslationVerifyParameters**](TranslationVerifyParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**TranslationDetails**](TranslationDetails.md)

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

<a name="translationsByKey"></a>
# **translationsByKey**
> kotlin.Array&lt;Translation&gt; translationsByKey(projectId, keyId, xminusPhraseAppMinusOTP, page, perPage, branch, sort, order, q)

List translations by key

List translations for a specific key.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = TranslationsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val keyId : kotlin.String = keyId_example // kotlin.String | Translation Key ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
val sort : kotlin.String = updated_at // kotlin.String | Sort criteria. Can be one of: key_name, created_at, updated_at.
val order : kotlin.String = desc // kotlin.String | Order direction. Can be one of: asc, desc.
val q : kotlin.String = PhraseApp*%20unverified:true%20excluded:true%20tags:feature,center // kotlin.String | q_description_placeholder
try {
    val result : kotlin.Array<Translation> = apiInstance.translationsByKey(projectId, keyId, xminusPhraseAppMinusOTP, page, perPage, branch, sort, order, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TranslationsApi#translationsByKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TranslationsApi#translationsByKey")
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
 **sort** | **kotlin.String**| Sort criteria. Can be one of: key_name, created_at, updated_at. | [optional]
 **order** | **kotlin.String**| Order direction. Can be one of: asc, desc. | [optional]
 **q** | **kotlin.String**| q_description_placeholder | [optional]

### Return type

[**kotlin.Array&lt;Translation&gt;**](Translation.md)

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

<a name="translationsByLocale"></a>
# **translationsByLocale**
> kotlin.Array&lt;Translation&gt; translationsByLocale(projectId, localeId, xminusPhraseAppMinusOTP, page, perPage, branch, sort, order, q)

List translations by locale

List translations for a specific locale. If you want to download all translations for one locale we recommend to use the &lt;code&gt;locales#download&lt;/code&gt; endpoint.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = TranslationsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val localeId : kotlin.String = localeId_example // kotlin.String | Locale ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
val sort : kotlin.String = updated_at // kotlin.String | Sort criteria. Can be one of: key_name, created_at, updated_at.
val order : kotlin.String = desc // kotlin.String | Order direction. Can be one of: asc, desc.
val q : kotlin.String = PhraseApp*%20unverified:true%20excluded:true%20tags:feature,center // kotlin.String | q_description_placeholder
try {
    val result : kotlin.Array<Translation> = apiInstance.translationsByLocale(projectId, localeId, xminusPhraseAppMinusOTP, page, perPage, branch, sort, order, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TranslationsApi#translationsByLocale")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TranslationsApi#translationsByLocale")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **localeId** | **kotlin.String**| Locale ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **kotlin.Int**| Page number | [optional]
 **perPage** | **kotlin.Int**| allows you to specify a page size up to 100 items, 10 by default | [optional]
 **branch** | **kotlin.String**| specify the branch to use | [optional]
 **sort** | **kotlin.String**| Sort criteria. Can be one of: key_name, created_at, updated_at. | [optional]
 **order** | **kotlin.String**| Order direction. Can be one of: asc, desc. | [optional]
 **q** | **kotlin.String**| q_description_placeholder | [optional]

### Return type

[**kotlin.Array&lt;Translation&gt;**](Translation.md)

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

<a name="translationsExclude"></a>
# **translationsExclude**
> AffectedCount translationsExclude(projectId, translationsExcludeParameters, xminusPhraseAppMinusOTP)

Set exclude from export flag on translations selected by query

Exclude translations matching query from locale export.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = TranslationsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val translationsExcludeParameters : TranslationsExcludeParameters =  // TranslationsExcludeParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : AffectedCount = apiInstance.translationsExclude(projectId, translationsExcludeParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TranslationsApi#translationsExclude")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TranslationsApi#translationsExclude")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **translationsExcludeParameters** | [**TranslationsExcludeParameters**](TranslationsExcludeParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**AffectedCount**](AffectedCount.md)

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

<a name="translationsInclude"></a>
# **translationsInclude**
> AffectedCount translationsInclude(projectId, translationsIncludeParameters, xminusPhraseAppMinusOTP)

Remove exlude from import flag from translations selected by query

Include translations matching query in locale export.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = TranslationsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val translationsIncludeParameters : TranslationsIncludeParameters =  // TranslationsIncludeParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : AffectedCount = apiInstance.translationsInclude(projectId, translationsIncludeParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TranslationsApi#translationsInclude")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TranslationsApi#translationsInclude")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **translationsIncludeParameters** | [**TranslationsIncludeParameters**](TranslationsIncludeParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**AffectedCount**](AffectedCount.md)

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

<a name="translationsList"></a>
# **translationsList**
> kotlin.Array&lt;Translation&gt; translationsList(projectId, xminusPhraseAppMinusOTP, page, perPage, branch, sort, order, q)

List all translations

List translations for the given project. If you want to download all translations for one locale we recommend to use the &lt;code&gt;locales#download&lt;/code&gt; endpoint.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = TranslationsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
val sort : kotlin.String = updated_at // kotlin.String | Sort criteria. Can be one of: key_name, created_at, updated_at.
val order : kotlin.String = desc // kotlin.String | Order direction. Can be one of: asc, desc.
val q : kotlin.String = PhraseApp*%20unverified:true%20excluded:true%20tags:feature,center // kotlin.String | q_description_placeholder
try {
    val result : kotlin.Array<Translation> = apiInstance.translationsList(projectId, xminusPhraseAppMinusOTP, page, perPage, branch, sort, order, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TranslationsApi#translationsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TranslationsApi#translationsList")
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
 **sort** | **kotlin.String**| Sort criteria. Can be one of: key_name, created_at, updated_at. | [optional]
 **order** | **kotlin.String**| Order direction. Can be one of: asc, desc. | [optional]
 **q** | **kotlin.String**| q_description_placeholder | [optional]

### Return type

[**kotlin.Array&lt;Translation&gt;**](Translation.md)

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

<a name="translationsReview"></a>
# **translationsReview**
> AffectedCount translationsReview(projectId, translationsReviewParameters, xminusPhraseAppMinusOTP)

Review translations selected by query

Review translations matching query.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = TranslationsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val translationsReviewParameters : TranslationsReviewParameters =  // TranslationsReviewParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : AffectedCount = apiInstance.translationsReview(projectId, translationsReviewParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TranslationsApi#translationsReview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TranslationsApi#translationsReview")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **translationsReviewParameters** | [**TranslationsReviewParameters**](TranslationsReviewParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**AffectedCount**](AffectedCount.md)

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

<a name="translationsSearch"></a>
# **translationsSearch**
> kotlin.Array&lt;Translation&gt; translationsSearch(projectId, translationsSearchParameters, xminusPhraseAppMinusOTP, page, perPage)

Search translations

Search translations for the given project. Provides the same search interface as &lt;code&gt;translations#index&lt;/code&gt; but allows POST requests to avoid limitations imposed by GET requests. If you want to download all translations for one locale we recommend to use the &lt;code&gt;locales#download&lt;/code&gt; endpoint.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = TranslationsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val translationsSearchParameters : TranslationsSearchParameters =  // TranslationsSearchParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
try {
    val result : kotlin.Array<Translation> = apiInstance.translationsSearch(projectId, translationsSearchParameters, xminusPhraseAppMinusOTP, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TranslationsApi#translationsSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TranslationsApi#translationsSearch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **translationsSearchParameters** | [**TranslationsSearchParameters**](TranslationsSearchParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **kotlin.Int**| Page number | [optional]
 **perPage** | **kotlin.Int**| allows you to specify a page size up to 100 items, 10 by default | [optional]

### Return type

[**kotlin.Array&lt;Translation&gt;**](Translation.md)

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

<a name="translationsUnverify"></a>
# **translationsUnverify**
> AffectedCount translationsUnverify(projectId, translationsUnverifyParameters, xminusPhraseAppMinusOTP)

Mark translations selected by query as unverified

Mark translations matching query as unverified.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = TranslationsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val translationsUnverifyParameters : TranslationsUnverifyParameters =  // TranslationsUnverifyParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : AffectedCount = apiInstance.translationsUnverify(projectId, translationsUnverifyParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TranslationsApi#translationsUnverify")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TranslationsApi#translationsUnverify")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **translationsUnverifyParameters** | [**TranslationsUnverifyParameters**](TranslationsUnverifyParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**AffectedCount**](AffectedCount.md)

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

<a name="translationsVerify"></a>
# **translationsVerify**
> AffectedCount translationsVerify(projectId, translationsVerifyParameters, xminusPhraseAppMinusOTP)

Verify translations selected by query

Verify translations matching query.

### Example
```kotlin
// Import classes:
//import org.phrase.client.infrastructure.*
//import org.phrase.client.models.*

val apiInstance = TranslationsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val translationsVerifyParameters : TranslationsVerifyParameters =  // TranslationsVerifyParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : AffectedCount = apiInstance.translationsVerify(projectId, translationsVerifyParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TranslationsApi#translationsVerify")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TranslationsApi#translationsVerify")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **translationsVerifyParameters** | [**TranslationsVerifyParameters**](TranslationsVerifyParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**AffectedCount**](AffectedCount.md)

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

