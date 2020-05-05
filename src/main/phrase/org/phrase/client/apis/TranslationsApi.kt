/**
* Phrase API Reference
* Phrase is a translation management platform for software projects. You can collaborate on language file translation with your team or order translations through our platform. The API allows you to import locale files, download locale files, tag keys or interact in other ways with the localization data stored in Phrase for your account.  ## API Endpoint  <div class=\"resource__code--outer\">   <div class=\"code-section\">     <pre><code>https://api.phrase.com/v2/</code></pre>   </div> </div>  The API is only accessible via HTTPS, the base URL is <code>https://api.phrase.com/</code>, and the current version is <code>v2</code> which results in the base URL for all requests: <code>https://api.phrase.com/v2/</code>.   ## Usage  [curl](http://curl.haxx.se/) is used primarily to send requests to Phrase in the examples. On most you'll find a second variant using the [Phrase API v2 client](https://phrase.com/cli/) that might be more convenient to handle. For further information check its [documentation](https://help.phrase.com/help/phrase-in-your-terminal).   ## Use of HTTP Verbs  Phrase API v2 tries to use the appropriate HTTP verb for accessing each endpoint according to REST specification where possible:  <div class=\"table-responsive\">   <table class=\"basic-table\">     <thead>       <tr class=\"basic-table__row basic-table__row--header\">         <th class=\"basic-table__cell basic-table__cell--header\">Verb</th>         <th class=\"basic-table__cell basic-table__cell--header\">Description</th>       </tr>     </thead>     <tbody>       <tr>         <td class=\"basic-table__cell\">GET</td>         <td class=\"basic-table__cell\">Retrieve one or multiple resources</td>       </tr>       <tr>         <td class=\"basic-table__cell\">POST</td>         <td class=\"basic-table__cell\">Create a resource</td>       </tr>       <tr>         <td class=\"basic-table__cell\">PUT</td>         <td class=\"basic-table__cell\">Update a resource</td>       </tr>       <tr>         <td class=\"basic-table__cell\">PATCH</td>         <td class=\"basic-table__cell\">Update a resource (partially)</td>       </tr>       <tr>         <td class=\"basic-table__cell\">DELETE</td>         <td class=\"basic-table__cell\">Delete a resource</td>       </tr>     </tbody>   </table> </div>   ## Identification via User-Agent  You must include the User-Agent header with the name of your application or project. It might be a good idea to include some sort of contact information  as well, so that we can get in touch if necessary (e.g. to warn you about Rate-Limiting or badly formed requests). Examples of excellent User-Agent headers:  <pre><code>User-Agent: Frederiks Mobile App (frederik@phrase.com) User-Agent: ACME Inc Python Client (http://example.com/contact)</code></pre>  If you don't send this header, you will receive a response with 400 Bad Request.   ## Lists  When you request a list of resources, the API will typically only return an array of resources including their most important attributes. For a detailed representation of the resource you should request its detailed representation.  Lists are usually [paginated](#pagination).   ## Parameters  Many endpoints support additional parameters, e.g. for pagination. When passing them in a GET request you can send them as HTTP query string parameters:  <pre><code>$ curl -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects?page=2\"</code></pre>  When performing a POST, PUT, PATCH or DELETE request, we recommend sending parameters that are not already included in the URL, as JSON body:  <pre><code>$ curl -H 'Content-Type: application/json' -d '{\"name\":\"My new project\"}' -u EMAIL_OR_ACCESS_TOKEN https://api.phrase.com/v2/projects</code></pre>  Encoding parameters as JSON means better support for types (boolean, integer) and usually better readability. Don't forget to set the correct Content-Type for your request.  *The Content-Type header is omitted in some of the following examples for better readbility.*   ## Errors   ### Request Errors  If a request contains invalid JSON or is missing a required parameter (besides resource attributes), the status `400 Bad Request` is returned:  <pre><code>{   \"message\": \"JSON could not be parsed\" }</code></pre>   ### Validation Errors  When the validation for a resource fails, the status `422 Unprocessable Entity` is returned, along with information on the affected fields:  <pre><code>{   \"message\": \"Validation Failed\",   \"errors\": [     {       \"resource\": \"Project\",       \"field\": \"name\",       \"message\": \"can't be blank\"     }   ] }</code></pre>   ## Date Format  Times and dates are returned and expected in [ISO 8601](http://en.wikipedia.org/wiki/ISO_8601) date format:  <pre><code>YYYY-MM-DDTHH:MM:SSZ</code></pre>  Instead of 'Z' for UTC time zone you can specify your time zone's locale offset using the following notation:  <pre><code>YYYY-MM-DDTHH:MM:SS¬±hh:mm</code></pre>  Example for CET (1 hour behind UTC):  <pre><code>2015-03-31T13:00+01:00</code></pre>  Please note that in HTTP headers, we will use the appropriate recommended date formats instead of ISO 8601.   ## Authentication  <div class=\"alert alert-info\">For more detailed information on authentication, check out the <a href=\"#authentication\">API v2 Authentication Guide</a>.</div>  There are two different ways to authenticate when performing API requests:  * E-Mail and password * Oauth Access Token   ### E-Mail and password  To get started easily, you can use HTTP Basic authentication with your email and password:  <pre><code>$ curl -u username:password \"https://api.phrase.com/v2/projects\"</code></pre>   ### OAuth via Access Tokens  You can create and manage access tokens in your [profile settings](https://app.phrase.com/settings/oauth_access_tokens) in Translation Center or via the [Authorizations API](#authorizations).  Simply pass the access token as the username of your request:  <pre><code>$ curl -u ACCESS_TOKEN: \"https://api.phrase.com/v2/projects\"</code></pre>  or send the access token via the `Authorization` header field:  <pre><code>$ curl -H \"Authorization: token ACCESS_TOKEN\" https://api.phrase.com/v2/projects</code></pre>  For more detailed information on authentication, check out the <a href=\"#authentication\">API v2 Authentication Guide</a>.  #### Send via parameter  As JSONP (and other) requests cannot send HTTP Basic Auth credentials, a special query parameter `access_token` can be used:  <pre><code>curl \"https://api.phrase.com/v2/projects?access_token=ACCESS_TOKEN\"</code></pre>  You should only use this transport method if sending the authentication via header or Basic authentication is not possible.  ### Two-Factor-Authentication  Users with Two-Factor-Authentication enabled have to send a valid token along their request with certain authentication methods (such as Basic authentication). The necessity of a Two-Factor-Authentication token is indicated by the `X-PhraseApp-OTP: required; :MFA-type` header in the response. The `:MFA-type`field indicates the source of the token, e.g. `app` (refers to your Authenticator application):  <pre><code>X-PhraseApp-OTP: required; app</code></pre>  To provide a Two-Factor-Authentication token you can simply send it in the header of the request:  <pre><code>curl -H \"X-PhraseApp-OTP: MFA-TOKEN\" -u EMAIL https://api.phrase.com/v2/projects</code></pre>  Since Two-Factor-Authentication tokens usually expire quickly, we recommend using an alternative authentication method such as OAuth access tokens.  ### Multiple Accounts  Some endpoints require the account ID to be specified if the authenticated user is a member of multiple accounts. You can find the eight-digit account ID inside <a href=\"https://app.phrase.com/\" target=\"_blank\">Translation Center</a> by switching to the desired account and then visiting the account details page. If required, you can specify the account just like a normal parameter within the request.  ## Pagination  Endpoints that return a list or resources will usually return paginated results and include 25 items by default. To access further pages, use the `page` parameter:  <pre><code>$ curl -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects?page=2\"</code></pre>  Some endpoints also allow a custom page size by using the `per_page` parameter:  <pre><code>$ curl -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects?page=2&per_page=50\"</code></pre>  Unless specified otherwise in the description of the respective endpoint, `per_page` allows you to specify a page size up to 100 items.   ## Link-Headers  We provide you with pagination URLs in the [Link Header field](http://tools.ietf.org/html/rfc5988). Make use of this information to avoid building pagination URLs yourself.  <pre><code>Link: <https://api.phrase.com/v2/projects?page=1>; rel=\"first\", <https://api.phrase.com/v2/projects?page=3>; rel=\"prev\", <https://api.phrase.com/v2/projects?page=5>; rel=\"next\", <https://api.phrase.com/v2/projects?page=9>; rel=\"last\"</code></pre>  Possible `rel` values are:  <div class=\"table-responsive\">   <table class=\"basic-table\">     <thead>       <tr class=\"basic-table__row basic-table__row--header\">         <th class=\"basic-table__cell basic-table__cell--header\">Value</th>         <th class=\"basic-table__cell basic-table__cell--header\">Description</th>       </tr>     </thead>     <tbody>       <tr>         <td class=\"basic-table__cell\">next</td>         <td class=\"basic-table__cell\">URL of the next page of results</td>       </tr>       <tr>         <td class=\"basic-table__cell\">last</td>         <td class=\"basic-table__cell\">URL of the last page of results</td>       </tr>       <tr>         <td class=\"basic-table__cell\">first</td>         <td class=\"basic-table__cell\">URL of the first page of results</td>       </tr>       <tr>         <td class=\"basic-table__cell\">prev</td>         <td class=\"basic-table__cell\">URL of the previous page of results</td>       </tr>     </tbody>   </table> </div>  ## Rate Limiting  All API endpoints are subject to rate limiting to ensure good performance for all customers. The rate limit is calculated per user:  * 1000 requests per 5 minutes * 4 concurrent (parallel) requests  For your convenience we send information on the current rate limit within the response headers:  <div class=\"table-responsive\">   <table class=\"basic-table\">     <thead>       <tr class=\"basic-table__row basic-table__row--header\">         <th class=\"basic-table__cell basic-table__cell--header\">Header</th>         <th class=\"basic-table__cell basic-table__cell--header\">Description</th>       </tr>     </thead>     <tbody>       <tr>         <td class=\"basic-table__cell\" style=\"white-space: nowrap;\"><code>X-Rate-Limit-Limit</code></td>         <td class=\"basic-table__cell\">Number of max requests allowed in the current time period</td>       </tr>       <tr>         <td class=\"basic-table__cell\" style=\"white-space: nowrap;\"><code>X-Rate-Limit-Remaining</code></td>         <td class=\"basic-table__cell\">Number of remaining requests in the current time period</td>       </tr>       <tr>         <td class=\"basic-table__cell\" style=\"white-space: nowrap;\"><code>X-Rate-Limit-Reset</code></td>         <td class=\"basic-table__cell\">Timestamp of end of current time period as UNIX timestamp</td>       </tr>     </tbody>   </table> </div>  If you should run into the rate limit, you will receive the HTTP status code `429: Too many requests`.  If you should need higher rate limits, [contact us](https://phrase.com/contact).   ## Conditional GET requests / HTTP Caching  <div class=\"alert alert-info\"><p><strong>Note:</strong> Conditional GET requests are currently only supported for <a href=\"#locales_download\">locales#download</a> and <a href=\"#translations_index\">translations#index</a></p></div>  We will return an ETag or Last-Modified header with most GET requests. When you request a resource we recommend to store this value and submit them on subsequent requests as `If-Modified-Since` and `If-None-Match` headers. If the resource has not changed in the meantime, we will return the status `304 Not Modified` instead of rendering and returning the resource again. In most cases this is less time-consuming and makes your application/integration faster.  Please note that all conditional requests that return a response with status 304 don't count against your rate limits.  <pre><code>$ curl -i -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects/1234abcd1234abcdefefabcd1234efab/locales/en/download\" HTTP/1.1 200 OK ETag: \"abcd1234abcdefefabcd1234efab1234\" Last-Modified: Wed, 28 Jan 2015 15:31:30 UTC Status: 200 OK  $ curl -i -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects/1234abcd1234abcdefefabcd1234efab/locales/en/download\" -H 'If-None-Match: \"abcd1234abcdefefabcd1234efab1234\"' HTTP/1.1 304 Not Modified ETag: \"abcd1234abcdefefabcd1234efab1234\" Last-Modified: Wed, 28 Jan 2015 15:31:30 UTC Status: 304 Not Modified  $ curl -i -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects/1234abcd1234abcdefefabcd1234efab/locales/en/download\" -H \"If-Modified-Since: Wed, 28 Jan 2015 15:31:30 UTC\" HTTP/1.1 304 Not Modified Last-Modified: Wed, 28 Jan 2015 15:31:30 UTC Status: 304 Not Modified</code></pre>   ## JSONP  The Phrase API supports [JSONP](http://en.wikipedia.org/wiki/JSONP) for all GET requests in order to deal with cross-domain request issues. Just send a `?callback` parameter along with the request to specify the Javascript function name to be called with the response content:  <pre><code>$ curl \"https://api.phrase.com/v2/projects?callback=myFunction\"</code></pre>  The response will include the normal output for that endpoint, along with a `meta` section including header data:  <pre><code>myFunction({   {     \"meta\": {       \"status\": 200,       ...     },     \"data\": [       {         \"id\": \"1234abcd1234abc1234abcd1234abc\"         ...       }     ]   } });</code></pre>  To authenticate a JSONP request, you can send a valid [access token](#authentication) as the `?access_token` parameter along the request:  <pre><code>$ curl \"https://api.phrase.com/v2/projects?callback=myFunction&access_token=ACCESS-TOKEN\"</code></pre> 
*
* The version of the OpenAPI document: 2.0.0
* Contact: support@phrase.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.phrase.client.apis

import org.phrase.client.models.AffectedCount
import org.phrase.client.models.Translation
import org.phrase.client.models.TranslationCreateParameters
import org.phrase.client.models.TranslationDetails
import org.phrase.client.models.TranslationExcludeParameters
import org.phrase.client.models.TranslationIncludeParameters
import org.phrase.client.models.TranslationReviewParameters
import org.phrase.client.models.TranslationUnverifyParameters
import org.phrase.client.models.TranslationUpdateParameters
import org.phrase.client.models.TranslationVerifyParameters
import org.phrase.client.models.TranslationsExcludeParameters
import org.phrase.client.models.TranslationsIncludeParameters
import org.phrase.client.models.TranslationsReviewParameters
import org.phrase.client.models.TranslationsSearchParameters
import org.phrase.client.models.TranslationsUnverifyParameters
import org.phrase.client.models.TranslationsVerifyParameters

import org.phrase.client.infrastructure.ApiClient
import org.phrase.client.infrastructure.ClientException
import org.phrase.client.infrastructure.ClientError
import org.phrase.client.infrastructure.ServerException
import org.phrase.client.infrastructure.ServerError
import org.phrase.client.infrastructure.MultiValueMap
import org.phrase.client.infrastructure.RequestConfig
import org.phrase.client.infrastructure.RequestMethod
import org.phrase.client.infrastructure.ResponseType
import org.phrase.client.infrastructure.Success
import org.phrase.client.infrastructure.toMultiValue

class TranslationsApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("org.phrase.client.baseUrl", "https://api.phrase.com/v2")
        }
    }

    /**
    * Create a translation
    * Create a translation.
    * @param projectId Project ID 
    * @param translationCreateParameters  
    * @param xminusPhraseAppMinusOTP Two-Factor-Authentication token (optional) (optional)
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun translationCreate(projectId: kotlin.String, translationCreateParameters: TranslationCreateParameters, xminusPhraseAppMinusOTP: kotlin.String?) : Unit {
        val localVariableBody: kotlin.Any? = translationCreateParameters
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("X-PhraseApp-OTP" to xminusPhraseAppMinusOTP.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/projects/{project_id}/translations".replace("{"+"project_id"+"}", "$projectId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Exclude a translation from export
    * Set exclude from export flag on an existing translation.
    * @param projectId Project ID 
    * @param id ID 
    * @param translationExcludeParameters  
    * @param xminusPhraseAppMinusOTP Two-Factor-Authentication token (optional) (optional)
    * @return TranslationDetails
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun translationExclude(projectId: kotlin.String, id: kotlin.String, translationExcludeParameters: TranslationExcludeParameters, xminusPhraseAppMinusOTP: kotlin.String?) : TranslationDetails {
        val localVariableBody: kotlin.Any? = translationExcludeParameters
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("X-PhraseApp-OTP" to xminusPhraseAppMinusOTP.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.PATCH,
            "/projects/{project_id}/translations/{id}/exclude".replace("{"+"project_id"+"}", "$projectId").replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<TranslationDetails>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TranslationDetails
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Revoke exclusion of a translation in export
    * Remove exclude from export flag from an existing translation.
    * @param projectId Project ID 
    * @param id ID 
    * @param translationIncludeParameters  
    * @param xminusPhraseAppMinusOTP Two-Factor-Authentication token (optional) (optional)
    * @return TranslationDetails
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun translationInclude(projectId: kotlin.String, id: kotlin.String, translationIncludeParameters: TranslationIncludeParameters, xminusPhraseAppMinusOTP: kotlin.String?) : TranslationDetails {
        val localVariableBody: kotlin.Any? = translationIncludeParameters
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("X-PhraseApp-OTP" to xminusPhraseAppMinusOTP.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.PATCH,
            "/projects/{project_id}/translations/{id}/include".replace("{"+"project_id"+"}", "$projectId").replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<TranslationDetails>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TranslationDetails
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Review a translation
    * Mark an existing translation as reviewed.
    * @param projectId Project ID 
    * @param id ID 
    * @param translationReviewParameters  
    * @param xminusPhraseAppMinusOTP Two-Factor-Authentication token (optional) (optional)
    * @return TranslationDetails
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun translationReview(projectId: kotlin.String, id: kotlin.String, translationReviewParameters: TranslationReviewParameters, xminusPhraseAppMinusOTP: kotlin.String?) : TranslationDetails {
        val localVariableBody: kotlin.Any? = translationReviewParameters
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("X-PhraseApp-OTP" to xminusPhraseAppMinusOTP.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.PATCH,
            "/projects/{project_id}/translations/{id}/review".replace("{"+"project_id"+"}", "$projectId").replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<TranslationDetails>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TranslationDetails
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Get a single translation
    * Get details on a single translation.
    * @param projectId Project ID 
    * @param id ID 
    * @param xminusPhraseAppMinusOTP Two-Factor-Authentication token (optional) (optional)
    * @param branch specify the branch to use (optional)
    * @return TranslationDetails
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun translationShow(projectId: kotlin.String, id: kotlin.String, xminusPhraseAppMinusOTP: kotlin.String?, branch: kotlin.String?) : TranslationDetails {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (branch != null) {
                    put("branch", listOf(branch.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("X-PhraseApp-OTP" to xminusPhraseAppMinusOTP.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/projects/{project_id}/translations/{id}".replace("{"+"project_id"+"}", "$projectId").replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<TranslationDetails>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TranslationDetails
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Mark a translation as unverified
    * Mark an existing translation as unverified.
    * @param projectId Project ID 
    * @param id ID 
    * @param translationUnverifyParameters  
    * @param xminusPhraseAppMinusOTP Two-Factor-Authentication token (optional) (optional)
    * @return TranslationDetails
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun translationUnverify(projectId: kotlin.String, id: kotlin.String, translationUnverifyParameters: TranslationUnverifyParameters, xminusPhraseAppMinusOTP: kotlin.String?) : TranslationDetails {
        val localVariableBody: kotlin.Any? = translationUnverifyParameters
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("X-PhraseApp-OTP" to xminusPhraseAppMinusOTP.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.PATCH,
            "/projects/{project_id}/translations/{id}/unverify".replace("{"+"project_id"+"}", "$projectId").replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<TranslationDetails>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TranslationDetails
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Update a translation
    * Update an existing translation.
    * @param projectId Project ID 
    * @param id ID 
    * @param translationUpdateParameters  
    * @param xminusPhraseAppMinusOTP Two-Factor-Authentication token (optional) (optional)
    * @return TranslationDetails
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun translationUpdate(projectId: kotlin.String, id: kotlin.String, translationUpdateParameters: TranslationUpdateParameters, xminusPhraseAppMinusOTP: kotlin.String?) : TranslationDetails {
        val localVariableBody: kotlin.Any? = translationUpdateParameters
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("X-PhraseApp-OTP" to xminusPhraseAppMinusOTP.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.PATCH,
            "/projects/{project_id}/translations/{id}".replace("{"+"project_id"+"}", "$projectId").replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<TranslationDetails>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TranslationDetails
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Verify a translation
    * Verify an existing translation.
    * @param projectId Project ID 
    * @param id ID 
    * @param translationVerifyParameters  
    * @param xminusPhraseAppMinusOTP Two-Factor-Authentication token (optional) (optional)
    * @return TranslationDetails
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun translationVerify(projectId: kotlin.String, id: kotlin.String, translationVerifyParameters: TranslationVerifyParameters, xminusPhraseAppMinusOTP: kotlin.String?) : TranslationDetails {
        val localVariableBody: kotlin.Any? = translationVerifyParameters
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("X-PhraseApp-OTP" to xminusPhraseAppMinusOTP.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.PATCH,
            "/projects/{project_id}/translations/{id}/verify".replace("{"+"project_id"+"}", "$projectId").replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<TranslationDetails>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TranslationDetails
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * List translations by key
    * List translations for a specific key.
    * @param projectId Project ID 
    * @param keyId Translation Key ID 
    * @param xminusPhraseAppMinusOTP Two-Factor-Authentication token (optional) (optional)
    * @param page Page number (optional)
    * @param perPage allows you to specify a page size up to 100 items, 10 by default (optional)
    * @param branch specify the branch to use (optional)
    * @param sort Sort criteria. Can be one of: key_name, created_at, updated_at. (optional)
    * @param order Order direction. Can be one of: asc, desc. (optional)
    * @param q q_description_placeholder (optional)
    * @return kotlin.Array<Translation>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun translationsByKey(projectId: kotlin.String, keyId: kotlin.String, xminusPhraseAppMinusOTP: kotlin.String?, page: kotlin.Int?, perPage: kotlin.Int?, branch: kotlin.String?, sort: kotlin.String?, order: kotlin.String?, q: kotlin.String?) : kotlin.Array<Translation> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (perPage != null) {
                    put("per_page", listOf(perPage.toString()))
                }
                if (branch != null) {
                    put("branch", listOf(branch.toString()))
                }
                if (sort != null) {
                    put("sort", listOf(sort.toString()))
                }
                if (order != null) {
                    put("order", listOf(order.toString()))
                }
                if (q != null) {
                    put("q", listOf(q.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("X-PhraseApp-OTP" to xminusPhraseAppMinusOTP.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/projects/{project_id}/keys/{key_id}/translations".replace("{"+"project_id"+"}", "$projectId").replace("{"+"key_id"+"}", "$keyId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<Translation>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<Translation>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * List translations by locale
    * List translations for a specific locale. If you want to download all translations for one locale we recommend to use the &lt;code&gt;locales#download&lt;/code&gt; endpoint.
    * @param projectId Project ID 
    * @param localeId Locale ID 
    * @param xminusPhraseAppMinusOTP Two-Factor-Authentication token (optional) (optional)
    * @param page Page number (optional)
    * @param perPage allows you to specify a page size up to 100 items, 10 by default (optional)
    * @param branch specify the branch to use (optional)
    * @param sort Sort criteria. Can be one of: key_name, created_at, updated_at. (optional)
    * @param order Order direction. Can be one of: asc, desc. (optional)
    * @param q q_description_placeholder (optional)
    * @return kotlin.Array<Translation>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun translationsByLocale(projectId: kotlin.String, localeId: kotlin.String, xminusPhraseAppMinusOTP: kotlin.String?, page: kotlin.Int?, perPage: kotlin.Int?, branch: kotlin.String?, sort: kotlin.String?, order: kotlin.String?, q: kotlin.String?) : kotlin.Array<Translation> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (perPage != null) {
                    put("per_page", listOf(perPage.toString()))
                }
                if (branch != null) {
                    put("branch", listOf(branch.toString()))
                }
                if (sort != null) {
                    put("sort", listOf(sort.toString()))
                }
                if (order != null) {
                    put("order", listOf(order.toString()))
                }
                if (q != null) {
                    put("q", listOf(q.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("X-PhraseApp-OTP" to xminusPhraseAppMinusOTP.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/projects/{project_id}/locales/{locale_id}/translations".replace("{"+"project_id"+"}", "$projectId").replace("{"+"locale_id"+"}", "$localeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<Translation>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<Translation>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Set exclude from export flag on translations selected by query
    * Exclude translations matching query from locale export.
    * @param projectId Project ID 
    * @param translationsExcludeParameters  
    * @param xminusPhraseAppMinusOTP Two-Factor-Authentication token (optional) (optional)
    * @return AffectedCount
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun translationsExclude(projectId: kotlin.String, translationsExcludeParameters: TranslationsExcludeParameters, xminusPhraseAppMinusOTP: kotlin.String?) : AffectedCount {
        val localVariableBody: kotlin.Any? = translationsExcludeParameters
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("X-PhraseApp-OTP" to xminusPhraseAppMinusOTP.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.PATCH,
            "/projects/{project_id}/translations/exclude".replace("{"+"project_id"+"}", "$projectId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<AffectedCount>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AffectedCount
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Remove exlude from import flag from translations selected by query
    * Include translations matching query in locale export.
    * @param projectId Project ID 
    * @param translationsIncludeParameters  
    * @param xminusPhraseAppMinusOTP Two-Factor-Authentication token (optional) (optional)
    * @return AffectedCount
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun translationsInclude(projectId: kotlin.String, translationsIncludeParameters: TranslationsIncludeParameters, xminusPhraseAppMinusOTP: kotlin.String?) : AffectedCount {
        val localVariableBody: kotlin.Any? = translationsIncludeParameters
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("X-PhraseApp-OTP" to xminusPhraseAppMinusOTP.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.PATCH,
            "/projects/{project_id}/translations/include".replace("{"+"project_id"+"}", "$projectId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<AffectedCount>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AffectedCount
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * List all translations
    * List translations for the given project. If you want to download all translations for one locale we recommend to use the &lt;code&gt;locales#download&lt;/code&gt; endpoint.
    * @param projectId Project ID 
    * @param xminusPhraseAppMinusOTP Two-Factor-Authentication token (optional) (optional)
    * @param page Page number (optional)
    * @param perPage allows you to specify a page size up to 100 items, 10 by default (optional)
    * @param branch specify the branch to use (optional)
    * @param sort Sort criteria. Can be one of: key_name, created_at, updated_at. (optional)
    * @param order Order direction. Can be one of: asc, desc. (optional)
    * @param q q_description_placeholder (optional)
    * @return kotlin.Array<Translation>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun translationsList(projectId: kotlin.String, xminusPhraseAppMinusOTP: kotlin.String?, page: kotlin.Int?, perPage: kotlin.Int?, branch: kotlin.String?, sort: kotlin.String?, order: kotlin.String?, q: kotlin.String?) : kotlin.Array<Translation> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (perPage != null) {
                    put("per_page", listOf(perPage.toString()))
                }
                if (branch != null) {
                    put("branch", listOf(branch.toString()))
                }
                if (sort != null) {
                    put("sort", listOf(sort.toString()))
                }
                if (order != null) {
                    put("order", listOf(order.toString()))
                }
                if (q != null) {
                    put("q", listOf(q.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("X-PhraseApp-OTP" to xminusPhraseAppMinusOTP.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/projects/{project_id}/translations".replace("{"+"project_id"+"}", "$projectId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<Translation>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<Translation>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Review translations selected by query
    * Review translations matching query.
    * @param projectId Project ID 
    * @param translationsReviewParameters  
    * @param xminusPhraseAppMinusOTP Two-Factor-Authentication token (optional) (optional)
    * @return AffectedCount
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun translationsReview(projectId: kotlin.String, translationsReviewParameters: TranslationsReviewParameters, xminusPhraseAppMinusOTP: kotlin.String?) : AffectedCount {
        val localVariableBody: kotlin.Any? = translationsReviewParameters
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("X-PhraseApp-OTP" to xminusPhraseAppMinusOTP.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.PATCH,
            "/projects/{project_id}/translations/review".replace("{"+"project_id"+"}", "$projectId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<AffectedCount>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AffectedCount
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Search translations
    * Search translations for the given project. Provides the same search interface as &lt;code&gt;translations#index&lt;/code&gt; but allows POST requests to avoid limitations imposed by GET requests. If you want to download all translations for one locale we recommend to use the &lt;code&gt;locales#download&lt;/code&gt; endpoint.
    * @param projectId Project ID 
    * @param translationsSearchParameters  
    * @param xminusPhraseAppMinusOTP Two-Factor-Authentication token (optional) (optional)
    * @param page Page number (optional)
    * @param perPage allows you to specify a page size up to 100 items, 10 by default (optional)
    * @return kotlin.Array<Translation>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun translationsSearch(projectId: kotlin.String, translationsSearchParameters: TranslationsSearchParameters, xminusPhraseAppMinusOTP: kotlin.String?, page: kotlin.Int?, perPage: kotlin.Int?) : kotlin.Array<Translation> {
        val localVariableBody: kotlin.Any? = translationsSearchParameters
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (perPage != null) {
                    put("per_page", listOf(perPage.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("X-PhraseApp-OTP" to xminusPhraseAppMinusOTP.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/projects/{project_id}/translations/search".replace("{"+"project_id"+"}", "$projectId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<Translation>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<Translation>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Mark translations selected by query as unverified
    * Mark translations matching query as unverified.
    * @param projectId Project ID 
    * @param translationsUnverifyParameters  
    * @param xminusPhraseAppMinusOTP Two-Factor-Authentication token (optional) (optional)
    * @return AffectedCount
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun translationsUnverify(projectId: kotlin.String, translationsUnverifyParameters: TranslationsUnverifyParameters, xminusPhraseAppMinusOTP: kotlin.String?) : AffectedCount {
        val localVariableBody: kotlin.Any? = translationsUnverifyParameters
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("X-PhraseApp-OTP" to xminusPhraseAppMinusOTP.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.PATCH,
            "/projects/{project_id}/translations/unverify".replace("{"+"project_id"+"}", "$projectId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<AffectedCount>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AffectedCount
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Verify translations selected by query
    * Verify translations matching query.
    * @param projectId Project ID 
    * @param translationsVerifyParameters  
    * @param xminusPhraseAppMinusOTP Two-Factor-Authentication token (optional) (optional)
    * @return AffectedCount
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun translationsVerify(projectId: kotlin.String, translationsVerifyParameters: TranslationsVerifyParameters, xminusPhraseAppMinusOTP: kotlin.String?) : AffectedCount {
        val localVariableBody: kotlin.Any? = translationsVerifyParameters
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("X-PhraseApp-OTP" to xminusPhraseAppMinusOTP.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.PATCH,
            "/projects/{project_id}/translations/verify".replace("{"+"project_id"+"}", "$projectId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<AffectedCount>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AffectedCount
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

}
