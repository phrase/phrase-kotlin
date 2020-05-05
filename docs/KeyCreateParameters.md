
# KeyCreateParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branch** | **kotlin.String** | specify the branch to use |  [optional]
**name** | **kotlin.String** | Key name |  [optional]
**description** | **kotlin.String** | Key description (usually includes contextual information for translators) |  [optional]
**plural** | **kotlin.Boolean** | Indicates whether key supports pluralization |  [optional]
**namePlural** | **kotlin.String** | Plural name for the key (used in some file formats, e.g. Gettext) |  [optional]
**dataType** | **kotlin.String** | Type of the key. Can be one of the following: string, number, boolean, array, markdown. |  [optional]
**tags** | **kotlin.String** | List of tags separated by comma to be associated with the key. |  [optional]
**maxCharactersAllowed** | **kotlin.Int** | Max. number of characters translations for this key can have. |  [optional]
**screenshot** | [**java.io.File**](java.io.File.md) | Screenshot/image for the key. This parameter is deprecated. Please use the Screenshots endpoint instead. |  [optional]
**removeScreenshot** | **kotlin.Boolean** | Indicates whether the screenshot will be deleted. This parameter is deprecated. Please use the Screenshots endpoint instead. |  [optional]
**unformatted** | **kotlin.Boolean** | Indicates whether the key should be exported as \&quot;unformatted\&quot;. Supported by Android XML and other formats. |  [optional]
**xmlSpacePreserve** | **kotlin.Boolean** | Indicates whether the key should be exported with \&quot;xml:space&#x3D;preserve\&quot;. Supported by several XML-based formats. |  [optional]
**originalFile** | **kotlin.String** | Original file attribute. Used in some formats, e.g. XLIFF. |  [optional]
**localizedFormatString** | **kotlin.String** | NSStringLocalizedFormatKey attribute. Used in .stringsdict format. |  [optional]
**localizedFormatKey** | **kotlin.String** | NSStringLocalizedFormatKey attribute. Used in .stringsdict format. |  [optional]



