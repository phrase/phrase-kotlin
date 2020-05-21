# InvitationsApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invitationCreate**](InvitationsApi.md#invitationCreate) | **POST** /accounts/{account_id}/invitations | Create a new invitation
[**invitationDelete**](InvitationsApi.md#invitationDelete) | **DELETE** /accounts/{account_id}/invitations/{id} | Delete an invitation
[**invitationResend**](InvitationsApi.md#invitationResend) | **POST** /accounts/{account_id}/invitations/{id}/resend | Resend an invitation
[**invitationShow**](InvitationsApi.md#invitationShow) | **GET** /accounts/{account_id}/invitations/{id} | Get a single invitation
[**invitationUpdate**](InvitationsApi.md#invitationUpdate) | **PATCH** /accounts/{account_id}/invitations/{id} | Update an invitation
[**invitationsList**](InvitationsApi.md#invitationsList) | **GET** /accounts/{account_id}/invitations | List invitations


<a name="invitationCreate"></a>
# **invitationCreate**
> invitationCreate(accountId, invitationCreateParameters, xminusPhraseAppMinusOTP)

Create a new invitation

Invite a person to an account. Developers and translators need &lt;code&gt;project_ids&lt;/code&gt; and &lt;code&gt;locale_ids&lt;/code&gt; assigned to access them. Access token scope must include &lt;code&gt;team.manage&lt;/code&gt;.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = InvitationsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val invitationCreateParameters : InvitationCreateParameters =  // InvitationCreateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.invitationCreate(accountId, invitationCreateParameters, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#invitationCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#invitationCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **invitationCreateParameters** | [**InvitationCreateParameters**](InvitationCreateParameters.md)|  |
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

<a name="invitationDelete"></a>
# **invitationDelete**
> invitationDelete(accountId, id, xminusPhraseAppMinusOTP)

Delete an invitation

Delete an existing invitation (must not be accepted yet). Access token scope must include &lt;code&gt;team.manage&lt;/code&gt;.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = InvitationsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    apiInstance.invitationDelete(accountId, id, xminusPhraseAppMinusOTP)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#invitationDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#invitationDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
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

<a name="invitationResend"></a>
# **invitationResend**
> Invitation invitationResend(accountId, id, xminusPhraseAppMinusOTP)

Resend an invitation

Resend the invitation email (must not be accepted yet). Access token scope must include &lt;code&gt;team.manage&lt;/code&gt;.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = InvitationsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Invitation = apiInstance.invitationResend(accountId, id, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#invitationResend")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#invitationResend")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **id** | **kotlin.String**| ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Invitation**](Invitation.md)

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

<a name="invitationShow"></a>
# **invitationShow**
> Invitation invitationShow(accountId, id, xminusPhraseAppMinusOTP)

Get a single invitation

Get details on a single invitation. Access token scope must include &lt;code&gt;team.manage&lt;/code&gt;.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = InvitationsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val id : kotlin.String = id_example // kotlin.String | ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Invitation = apiInstance.invitationShow(accountId, id, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#invitationShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#invitationShow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **id** | **kotlin.String**| ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Invitation**](Invitation.md)

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

<a name="invitationUpdate"></a>
# **invitationUpdate**
> Invitation invitationUpdate(accountId, id, invitationUpdateParameters, xminusPhraseAppMinusOTP)

Update an invitation

Update an existing invitation (must not be accepted yet). The &lt;code&gt;email&lt;/code&gt; cannot be updated. Developers and translators need &lt;code&gt;project_ids&lt;/code&gt; and &lt;code&gt;locale_ids&lt;/code&gt; assigned to access them. Access token scope must include &lt;code&gt;team.manage&lt;/code&gt;.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = InvitationsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val id : kotlin.String = id_example // kotlin.String | ID
val invitationUpdateParameters : InvitationUpdateParameters =  // InvitationUpdateParameters | 
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
try {
    val result : Invitation = apiInstance.invitationUpdate(accountId, id, invitationUpdateParameters, xminusPhraseAppMinusOTP)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#invitationUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#invitationUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **id** | **kotlin.String**| ID |
 **invitationUpdateParameters** | [**InvitationUpdateParameters**](InvitationUpdateParameters.md)|  |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Invitation**](Invitation.md)

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

<a name="invitationsList"></a>
# **invitationsList**
> kotlin.Array&lt;Invitation&gt; invitationsList(accountId, xminusPhraseAppMinusOTP, page, perPage)

List invitations

List invitations for an account. It will also list the accessible resources like projects and locales the invited user has access to. In case nothing is shown the default access from the role is used. Access token scope must include &lt;code&gt;team.manage&lt;/code&gt;.

### Example
```kotlin
// Import classes:
//import com.phrase.client.infrastructure.*
//import com.phrase.client.models.*

val apiInstance = InvitationsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val xminusPhraseAppMinusOTP : kotlin.String = xminusPhraseAppMinusOTP_example // kotlin.String | Two-Factor-Authentication token (optional)
val page : kotlin.Int = 1 // kotlin.Int | Page number
val perPage : kotlin.Int = 10 // kotlin.Int | allows you to specify a page size up to 100 items, 10 by default
try {
    val result : kotlin.Array<Invitation> = apiInstance.invitationsList(accountId, xminusPhraseAppMinusOTP, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#invitationsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#invitationsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| Account ID |
 **xminusPhraseAppMinusOTP** | **kotlin.String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **kotlin.Int**| Page number | [optional]
 **perPage** | **kotlin.Int**| allows you to specify a page size up to 100 items, 10 by default | [optional]

### Return type

[**kotlin.Array&lt;Invitation&gt;**](Invitation.md)

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

