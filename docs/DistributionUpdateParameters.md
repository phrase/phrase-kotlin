
# DistributionUpdateParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | Name of the distribution |  [optional]
**projectId** | **kotlin.String** | Project id the distribution should be assigned to. |  [optional]
**platforms** | **kotlin.Array&lt;kotlin.String&gt;** | List of platforms the distribution should support. |  [optional]
**formatOptions** | [**kotlin.Any**](.md) | Additional formatting and render options. Only &lt;code&gt;enclose_in_cdata&lt;/code&gt; is available for platform &lt;code&gt;android&lt;/code&gt;. |  [optional]
**fallbackToNonRegionalLocale** | **kotlin.Boolean** | Indicates whether to fallback to non regional locale when locale can not be found |  [optional]
**fallbackToDefaultLocale** | **kotlin.Boolean** | Indicates whether to fallback to projects default locale when locale can not be found |  [optional]
**useLastReviewedVersion** | **kotlin.Boolean** | Use last reviewed instead of latest translation in a project |  [optional]



