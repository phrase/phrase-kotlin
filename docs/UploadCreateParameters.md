
# UploadCreateParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branch** | **kotlin.String** | specify the branch to use |  [optional]
**file** | [**java.io.File**](java.io.File.md) | File to be imported |  [optional]
**fileFormat** | **kotlin.String** | File format. Auto-detected when possible and not specified. |  [optional]
**localeId** | **kotlin.String** | Locale of the file&#39;s content. Can be the name or public id of the locale. Preferred is the public id. |  [optional]
**tags** | **kotlin.String** | List of tags separated by comma to be associated with the new keys contained in the upload. |  [optional]
**updateTranslations** | **kotlin.Boolean** | Indicates whether existing translations should be updated with the file content. |  [optional]
**updateDescriptions** | **kotlin.Boolean** | Existing key descriptions will be updated with the file content. Empty descriptions overwrite existing descriptions. |  [optional]
**convertEmoji** | **kotlin.Boolean** | This option is obsolete. Providing the option will cause a bad request error. |  [optional]
**skipUploadTags** | **kotlin.Boolean** | Indicates whether the upload should not create upload tags. |  [optional]
**skipUnverification** | **kotlin.Boolean** | Indicates whether the upload should unverify updated translations. |  [optional]
**fileEncoding** | **kotlin.String** | Enforces a specific encoding on the file contents. Valid options are \&quot;UTF-8\&quot;, \&quot;UTF-16\&quot; and \&quot;ISO-8859-1\&quot;. |  [optional]
**localeMapping** | [**kotlin.Any**](.md) | Optional, format specific mapping between locale names and the columns the translations to those locales are contained in. |  [optional]
**formatOptions** | [**kotlin.Any**](.md) | Additional options available for specific formats. See our format guide for complete list. |  [optional]
**autotranslate** | **kotlin.Boolean** | If set, translations for the uploaded language will be fetched automatically. |  [optional]
**markReviewed** | **kotlin.Boolean** | Indicated whether the imported translations should be marked as reviewed. This setting is available if the review workflow (currently beta) is enabled for the project. |  [optional]



