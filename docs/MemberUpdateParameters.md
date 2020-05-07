
# MemberUpdateParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **kotlin.String** | Member role, can be any of of Manager, Developer, Translator |  [optional]
**projectIds** | **kotlin.String** | List of project ids the user has access to.  |  [optional]
**localeIds** | **kotlin.String** | List of locale ids the user has access to. |  [optional]
**permissions** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Additional permissions depending on member role. Available permissions are &lt;code&gt;create_upload&lt;/code&gt; and &lt;code&gt;review_translations&lt;/code&gt; |  [optional]



