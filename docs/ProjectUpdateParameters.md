
# ProjectUpdateParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | Name of the project |  [optional]
**mainFormat** | **kotlin.String** | Main file format specified by its API Extension name. Used for locale downloads if no format is specified. For API Extension names of available file formats see &lt;a href&#x3D;\&quot;https://help.phrase.com/help/supported-platforms-and-formats\&quot;&gt;Format Guide&lt;/a&gt; or our &lt;a href&#x3D;\&quot;#formats\&quot;&gt;Formats API Endpoint&lt;/a&gt;. |  [optional]
**sharesTranslationMemory** | **kotlin.Boolean** | Indicates whether the project should share the account&#39;s translation memory |  [optional]
**projectImage** | [**java.io.File**](java.io.File.md) | Image to identify the project |  [optional]
**removeProjectImage** | **kotlin.Boolean** | Indicates whether the project image should be deleted. |  [optional]
**accountId** | **kotlin.String** | Account ID to specify the actual account the project should be created in. Required if the requesting user is a member of multiple accounts. |  [optional]



