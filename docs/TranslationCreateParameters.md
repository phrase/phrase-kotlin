
# TranslationCreateParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branch** | **kotlin.String** | specify the branch to use |  [optional]
**localeId** | **kotlin.String** | Locale. Can be the name or public id of the locale. Preferred is the public id. |  [optional]
**keyId** | **kotlin.String** | Key |  [optional]
**content** | **kotlin.String** | Translation content |  [optional]
**pluralSuffix** | **kotlin.String** | Plural suffix. Can be one of: zero, one, two, few, many, other. Must be specified if the key associated to the translation is pluralized. |  [optional]
**unverified** | **kotlin.Boolean** | Indicates whether translation is unverified. Part of the &lt;a href&#x3D;\&quot;https://help.phrase.com/help/verification-and-proofreading\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Advanced Workflows&lt;/a&gt; feature. |  [optional]
**excluded** | **kotlin.Boolean** | Indicates whether translation is excluded. |  [optional]
**autotranslate** | **kotlin.Boolean** | Indicates whether the translation should be auto-translated. Responses with status 422 if provided for translation within a non-default locale or the project does not have the Autopilot feature enabled. |  [optional]



