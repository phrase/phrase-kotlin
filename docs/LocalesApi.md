# LocalesApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**localeCreate**](LocalesApi.md#localeCreate) | **POST** /projects/{project_id}/locales | Create a locale
[**localeDelete**](LocalesApi.md#localeDelete) | **DELETE** /projects/{project_id}/locales/{id} | Delete a locale
[**localeDownload**](LocalesApi.md#localeDownload) | **GET** /projects/{project_id}/locales/{id}/download | Download a locale
[**localeShow**](LocalesApi.md#localeShow) | **GET** /projects/{project_id}/locales/{id} | Get a single locale
[**localeUpdate**](LocalesApi.md#localeUpdate) | **PATCH** /projects/{project_id}/locales/{id} | Update a locale
[**localesList**](LocalesApi.md#localesList) | **GET** /projects/{project_id}/locales | List locales


<a name="localeCreate"></a>
# **localeCreate**
> LocaleDetails localeCreate(projectId, localeCreateParameters, xminusPhraseAppMinusOTP)

Create a locale

Create a new locale.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = LocalesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val localeCreateParameters : LocaleCreateParameters =  // LocaleCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : LocaleDetails = apiInstance.localeCreate(projectId, localeCreateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocalesApi#localeCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocalesApi#localeCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **localeCreateParameters** | [**LocaleCreateParameters**](LocaleCreateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**LocaleDetails**](LocaleDetails.md)

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

<a name="localeDelete"></a>
# **localeDelete**
> localeDelete(projectId, id, xminusPhraseAppMinusOTP, branch)

Delete a locale

Delete an existing locale.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = LocalesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    apiInstance.localeDelete(projectId, id, xminusPhraseAppMinusOTP, branch)
} catch (e: ClientException) {
    println("4xx response calling LocalesApi#localeDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocalesApi#localeDelete")
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

<a name="localeDownload"></a>
# **localeDownload**
> localeDownload(projectId, id, xminusPhraseAppMinusOTP, branch, fileFormat, tags, tag, includeEmptyTranslations, includeTranslatedKeys, keepNotranslateTags, convertEmoji, formatOptions, encoding, skipUnverifiedTranslations, includeUnverifiedTranslations, useLastReviewedVersion, fallbackLocaleId)

Download a locale

Download a locale in a specific file format.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = LocalesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
val fileFormat : kotlin.String = yml // kotlin.String | File format name. See the format guide for all supported file formats.
val tags : kotlin.String = feature1,feature2 // kotlin.String | Limit results to keys tagged with a list of comma separated tag names.
val tag : kotlin.String = feature // kotlin.String | Limit download to tagged keys. This parameter is deprecated. Please use the \"tags\" parameter instead
val includeEmptyTranslations : kotlin.Boolean = true // kotlin.Boolean | Indicates whether keys without translations should be included in the output as well.
val includeTranslatedKeys : kotlin.Boolean = true // kotlin.Boolean | Include translated keys in the locale file. Use in combination with include_empty_translations to obtain only untranslated keys.
val keepNotranslateTags : kotlin.Boolean = true // kotlin.Boolean | Indicates whether [NOTRANSLATE] tags should be kept.
val convertEmoji : kotlin.Boolean = true // kotlin.Boolean | This option is obsolete. Projects that were created on or after Nov 29th 2019 or that did not contain emoji by then will not require this flag any longer since emoji are now supported natively.
val formatOptions : kotlin.Any = Object // kotlin.Any | Additional formatting and render options. See the <a href=\"https://help.phrase.com/help/supported-platforms-and-formats\">format guide</a> for a list of options available for each format. Specify format options like this: <code>...&format_options[foo]=bar</code>
val encoding : kotlin.String = encoding_example // kotlin.String | Enforces a specific encoding on the file contents. Valid options are \"UTF-8\", \"UTF-16\" and \"ISO-8859-1\".
val skipUnverifiedTranslations : kotlin.Boolean = true // kotlin.Boolean | Indicates whether the locale file should skip all unverified translations. This parameter is deprecated and should be replaced with <code>include_unverified_translations</code>.
val includeUnverifiedTranslations : kotlin.Boolean = true // kotlin.Boolean | if set to false unverified translations are excluded
val useLastReviewedVersion : kotlin.Boolean = true // kotlin.Boolean | If set to true the last reviewed version of a translation is used. This is only available if the review workflow (currently in beta) is enabled for the project.
val fallbackLocaleId : kotlin.String = fallbackLocaleId_example // kotlin.String | If a key has no translation in the locale being downloaded the translation in the fallback locale will be used. Provide the public ID of the locale that should be used as the fallback. Requires include_empty_translations to be set to <code>true</code>.
try {
    apiInstance.localeDownload(projectId, id, xminusPhraseAppMinusOTP, branch, fileFormat, tags, tag, includeEmptyTranslations, includeTranslatedKeys, keepNotranslateTags, convertEmoji, formatOptions, encoding, skipUnverifiedTranslations, includeUnverifiedTranslations, useLastReviewedVersion, fallbackLocaleId)
} catch (e: ClientException) {
    println("4xx response calling LocalesApi#localeDownload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocalesApi#localeDownload")
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
 **fileFormat** | **kotlin.String**| File format name. See the format guide for all supported file formats. | [optional]
 **tags** | **kotlin.String**| Limit results to keys tagged with a list of comma separated tag names. | [optional]
 **tag** | **kotlin.String**| Limit download to tagged keys. This parameter is deprecated. Please use the \&quot;tags\&quot; parameter instead | [optional]
 **includeEmptyTranslations** | **kotlin.Boolean**| Indicates whether keys without translations should be included in the output as well. | [optional]
 **includeTranslatedKeys** | **kotlin.Boolean**| Include translated keys in the locale file. Use in combination with include_empty_translations to obtain only untranslated keys. | [optional]
 **keepNotranslateTags** | **kotlin.Boolean**| Indicates whether [NOTRANSLATE] tags should be kept. | [optional]
 **convertEmoji** | **kotlin.Boolean**| This option is obsolete. Projects that were created on or after Nov 29th 2019 or that did not contain emoji by then will not require this flag any longer since emoji are now supported natively. | [optional]
 **formatOptions** | [**kotlin.Any**](.md)| Additional formatting and render options. See the &lt;a href&#x3D;\&quot;https://help.phrase.com/help/supported-platforms-and-formats\&quot;&gt;format guide&lt;/a&gt; for a list of options available for each format. Specify format options like this: &lt;code&gt;...&amp;format_options[foo]&#x3D;bar&lt;/code&gt; | [optional]
 **encoding** | **kotlin.String**| Enforces a specific encoding on the file contents. Valid options are \&quot;UTF-8\&quot;, \&quot;UTF-16\&quot; and \&quot;ISO-8859-1\&quot;. | [optional]
 **skipUnverifiedTranslations** | **kotlin.Boolean**| Indicates whether the locale file should skip all unverified translations. This parameter is deprecated and should be replaced with &lt;code&gt;include_unverified_translations&lt;/code&gt;. | [optional]
 **includeUnverifiedTranslations** | **kotlin.Boolean**| if set to false unverified translations are excluded | [optional]
 **useLastReviewedVersion** | **kotlin.Boolean**| If set to true the last reviewed version of a translation is used. This is only available if the review workflow (currently in beta) is enabled for the project. | [optional]
 **fallbackLocaleId** | **kotlin.String**| If a key has no translation in the locale being downloaded the translation in the fallback locale will be used. Provide the public ID of the locale that should be used as the fallback. Requires include_empty_translations to be set to &lt;code&gt;true&lt;/code&gt;. | [optional]

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

<a name="localeShow"></a>
# **localeShow**
> LocaleDetails localeShow(projectId, id, xminusPhraseAppMinusOTP, branch)

Get a single locale

Get details on a single locale for a given project.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = LocalesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    val result : LocaleDetails = apiInstance.localeShow(projectId, id, xminusPhraseAppMinusOTP, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocalesApi#localeShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocalesApi#localeShow")
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

[**LocaleDetails**](LocaleDetails.md)

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

<a name="localeUpdate"></a>
# **localeUpdate**
> LocaleDetails localeUpdate(projectId, id, localeUpdateParameters, xminusPhraseAppMinusOTP)

Update a locale

Update an existing locale.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = LocalesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val id : kotlin.String = id_example // kotlin.String | ID
val localeUpdateParameters : LocaleUpdateParameters =  // LocaleUpdateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : LocaleDetails = apiInstance.localeUpdate(projectId, id, localeUpdateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocalesApi#localeUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocalesApi#localeUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| Project ID |
 **id** | **kotlin.String**| ID |
 **localeUpdateParameters** | [**LocaleUpdateParameters**](LocaleUpdateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**LocaleDetails**](LocaleDetails.md)

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

<a name="localesList"></a>
# **localesList**
> kotlin.Array&lt;Locale&gt; localesList(projectId, xminusPhraseAppMinusOTP, page, perPage, branch)

List locales

List all locales for the given project.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = LocalesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
val branch : kotlin.String = my-feature-branch // kotlin.String | specify the branch to use
try {
    val result : kotlin.Array<Locale> = apiInstance.localesList(projectId, xminusPhraseAppMinusOTP, page, perPage, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocalesApi#localesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocalesApi#localesList")
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

[**kotlin.Array&lt;Locale&gt;**](Locale.md)

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

