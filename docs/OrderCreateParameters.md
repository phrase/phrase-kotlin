
# OrderCreateParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branch** | **kotlin.String** | specify the branch to use |  [optional]
**lsp** | **kotlin.String** | Name of the LSP that should process this order. Can be one of gengo, textmaster. |  [optional]
**sourceLocaleId** | **kotlin.String** | Source locale for the order. Can be the name or public id of the source locale. Preferred is the public id. |  [optional]
**targetLocaleIds** | **kotlin.Array&lt;kotlin.String&gt;** | List of target locales you want the source content translate to. Can be the name or public id of the target locales. Preferred is the public id. |  [optional]
**translationType** | **kotlin.String** | Name of the quality level, availability depends on the LSP. Can be one of:  standard, pro (for orders processed by Gengo) and one of regular, premium, enterprise (for orders processed by TextMaster) |  [optional]
**tag** | **kotlin.String** | Tag you want to order translations for. |  [optional]
**message** | **kotlin.String** | Message that is displayed to the translators for description. |  [optional]
**styleguideId** | **kotlin.String** | Style guide for translators to be sent with the order. |  [optional]
**unverifyTranslationsUponDelivery** | **kotlin.Boolean** | Unverify translations upon delivery. |  [optional]
**includeUntranslatedKeys** | **kotlin.Boolean** | Order translations for keys with untranslated content in the selected target locales. |  [optional]
**includeUnverifiedTranslations** | **kotlin.Boolean** | Order translations for keys with unverified content in the selected target locales. |  [optional]
**category** | **kotlin.String** | Category to use (required for orders processed by TextMaster). |  [optional]
**quality** | **kotlin.Boolean** | Extra proofreading option to ensure consistency in vocabulary and style. Only available for orders processed by TextMaster. |  [optional]
**priority** | **kotlin.Boolean** | Indicates whether the priority option should be ordered which decreases turnaround time by 30%. Available only for orders processed by TextMaster. |  [optional]



