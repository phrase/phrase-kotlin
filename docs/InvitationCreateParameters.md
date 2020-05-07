
# InvitationCreateParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **kotlin.String** | The email of the invited user. The &lt;code&gt;email&lt;/code&gt; can not be updated once created. Create a new invitation for each unique email. |  [optional]
**role** | **kotlin.String** | Invitiation role, can be any of Manager, Developer, Translator. |  [optional]
**projectIds** | **kotlin.String** | List of project ids the invited user has access to. |  [optional]
**localeIds** | **kotlin.String** | List of locale ids the invited user has access to. |  [optional]
**permissions** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Additional permissions depending on invitation role. Available permissions are &lt;code&gt;create_upload&lt;/code&gt; and &lt;code&gt;review_translations&lt;/code&gt; |  [optional]



