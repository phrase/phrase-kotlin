# com.phrase.client - Kotlin client library for Phrase API Reference

## Requires

* Kotlin 1.3.41
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.phrase.com/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**accountShow**](docs/AccountsApi.md#accountshow) | **GET** /accounts/{id} | Get a single account
*AccountsApi* | [**accountsList**](docs/AccountsApi.md#accountslist) | **GET** /accounts | List accounts
*AuthorizationsApi* | [**authorizationCreate**](docs/AuthorizationsApi.md#authorizationcreate) | **POST** /authorizations | Create an authorization
*AuthorizationsApi* | [**authorizationDelete**](docs/AuthorizationsApi.md#authorizationdelete) | **DELETE** /authorizations/{id} | Delete an authorization
*AuthorizationsApi* | [**authorizationShow**](docs/AuthorizationsApi.md#authorizationshow) | **GET** /authorizations/{id} | Get a single authorization
*AuthorizationsApi* | [**authorizationUpdate**](docs/AuthorizationsApi.md#authorizationupdate) | **PATCH** /authorizations/{id} | Update an authorization
*AuthorizationsApi* | [**authorizationsList**](docs/AuthorizationsApi.md#authorizationslist) | **GET** /authorizations | List authorizations
*BitbucketSyncApi* | [**bitbucketSyncExport**](docs/BitbucketSyncApi.md#bitbucketsyncexport) | **POST** /bitbucket_syncs/{id}/export | Export from Phrase to Bitbucket
*BitbucketSyncApi* | [**bitbucketSyncImport**](docs/BitbucketSyncApi.md#bitbucketsyncimport) | **POST** /bitbucket_syncs/{id}/import | Import to Phrase from Bitbucket
*BitbucketSyncApi* | [**bitbucketSyncsList**](docs/BitbucketSyncApi.md#bitbucketsyncslist) | **GET** /bitbucket_syncs | List Bitbucket syncs
*BlacklistedKeysApi* | [**blacklistedKeyCreate**](docs/BlacklistedKeysApi.md#blacklistedkeycreate) | **POST** /projects/{project_id}/blacklisted_keys | Create a blacklisted key
*BlacklistedKeysApi* | [**blacklistedKeyDelete**](docs/BlacklistedKeysApi.md#blacklistedkeydelete) | **DELETE** /projects/{project_id}/blacklisted_keys/{id} | Delete a blacklisted key
*BlacklistedKeysApi* | [**blacklistedKeyShow**](docs/BlacklistedKeysApi.md#blacklistedkeyshow) | **GET** /projects/{project_id}/blacklisted_keys/{id} | Get a single blacklisted key
*BlacklistedKeysApi* | [**blacklistedKeyUpdate**](docs/BlacklistedKeysApi.md#blacklistedkeyupdate) | **PATCH** /projects/{project_id}/blacklisted_keys/{id} | Update a blacklisted key
*BlacklistedKeysApi* | [**blacklistedKeysList**](docs/BlacklistedKeysApi.md#blacklistedkeyslist) | **GET** /projects/{project_id}/blacklisted_keys | List blacklisted keys
*BranchesApi* | [**branchCompare**](docs/BranchesApi.md#branchcompare) | **GET** /projects/{project_id}/branches/{name}/compare | Compare branches
*BranchesApi* | [**branchCreate**](docs/BranchesApi.md#branchcreate) | **POST** /projects/{project_id}/branches | Create a branch
*BranchesApi* | [**branchDelete**](docs/BranchesApi.md#branchdelete) | **DELETE** /projects/{project_id}/branches/{name} | Delete a branch
*BranchesApi* | [**branchMerge**](docs/BranchesApi.md#branchmerge) | **PATCH** /projects/{project_id}/branches/{name}/merge | Merge a branch
*BranchesApi* | [**branchShow**](docs/BranchesApi.md#branchshow) | **GET** /projects/{project_id}/branches/{name} | Get a single branch
*BranchesApi* | [**branchUpdate**](docs/BranchesApi.md#branchupdate) | **PATCH** /projects/{project_id}/branches/{name} | Update a branch
*BranchesApi* | [**branchesList**](docs/BranchesApi.md#brancheslist) | **GET** /projects/{project_id}/branches | List branches
*CommentsApi* | [**commentCreate**](docs/CommentsApi.md#commentcreate) | **POST** /projects/{project_id}/keys/{key_id}/comments | Create a comment
*CommentsApi* | [**commentDelete**](docs/CommentsApi.md#commentdelete) | **DELETE** /projects/{project_id}/keys/{key_id}/comments/{id} | Delete a comment
*CommentsApi* | [**commentMarkCheck**](docs/CommentsApi.md#commentmarkcheck) | **GET** /projects/{project_id}/keys/{key_id}/comments/{id}/read | Check if comment is read
*CommentsApi* | [**commentMarkRead**](docs/CommentsApi.md#commentmarkread) | **PATCH** /projects/{project_id}/keys/{key_id}/comments/{id}/read | Mark a comment as read
*CommentsApi* | [**commentMarkUnread**](docs/CommentsApi.md#commentmarkunread) | **DELETE** /projects/{project_id}/keys/{key_id}/comments/{id}/read | Mark a comment as unread
*CommentsApi* | [**commentShow**](docs/CommentsApi.md#commentshow) | **GET** /projects/{project_id}/keys/{key_id}/comments/{id} | Get a single comment
*CommentsApi* | [**commentUpdate**](docs/CommentsApi.md#commentupdate) | **PATCH** /projects/{project_id}/keys/{key_id}/comments/{id} | Update a comment
*CommentsApi* | [**commentsList**](docs/CommentsApi.md#commentslist) | **GET** /projects/{project_id}/keys/{key_id}/comments | List comments
*DistributionsApi* | [**distributionCreate**](docs/DistributionsApi.md#distributioncreate) | **POST** /accounts/{account_id}/distributions | Create a distribution
*DistributionsApi* | [**distributionDelete**](docs/DistributionsApi.md#distributiondelete) | **DELETE** /accounts/{account_id}/distributions/{id} | Delete a distribution
*DistributionsApi* | [**distributionShow**](docs/DistributionsApi.md#distributionshow) | **GET** /accounts/{account_id}/distributions/{id} | Get a single distribution
*DistributionsApi* | [**distributionUpdate**](docs/DistributionsApi.md#distributionupdate) | **PATCH** /accounts/{account_id}/distributions/{id} | Update a distribution
*DistributionsApi* | [**distributionsList**](docs/DistributionsApi.md#distributionslist) | **GET** /accounts/{account_id}/distributions | List distributions
*FormatsApi* | [**formatsList**](docs/FormatsApi.md#formatslist) | **GET** /formats | List formats
*GitLabSyncApi* | [**gitlabSyncDelete**](docs/GitLabSyncApi.md#gitlabsyncdelete) | **DELETE** /gitlab_syncs/{id} | Delete single Sync Setting
*GitLabSyncApi* | [**gitlabSyncExport**](docs/GitLabSyncApi.md#gitlabsyncexport) | **POST** /gitlab_syncs/{gitlab_sync_id}/export | Export from Phrase to GitLab
*GitLabSyncApi* | [**gitlabSyncHistory**](docs/GitLabSyncApi.md#gitlabsynchistory) | **GET** /gitlab_syncs/{gitlab_sync_id}/history | History of single Sync Setting
*GitLabSyncApi* | [**gitlabSyncImport**](docs/GitLabSyncApi.md#gitlabsyncimport) | **POST** /gitlab_syncs/{gitlab_sync_id}/import | Import from GitLab to Phrase
*GitLabSyncApi* | [**gitlabSyncList**](docs/GitLabSyncApi.md#gitlabsynclist) | **GET** /gitlab_syncs | List GitLab syncs
*GitLabSyncApi* | [**gitlabSyncShow**](docs/GitLabSyncApi.md#gitlabsyncshow) | **GET** /gitlab_syncs/{id} | Get single Sync Setting
*GitLabSyncApi* | [**gitlabSyncUpdate**](docs/GitLabSyncApi.md#gitlabsyncupdate) | **PUT** /gitlab_syncs/{id} | Update single Sync Setting
*GlossaryApi* | [**glossariesList**](docs/GlossaryApi.md#glossarieslist) | **GET** /accounts/{account_id}/glossaries | List glossaries
*GlossaryApi* | [**glossaryCreate**](docs/GlossaryApi.md#glossarycreate) | **POST** /accounts/{account_id}/glossaries | Create a glossary
*GlossaryApi* | [**glossaryDelete**](docs/GlossaryApi.md#glossarydelete) | **DELETE** /accounts/{account_id}/glossaries/{id} | Delete a glossary
*GlossaryApi* | [**glossaryShow**](docs/GlossaryApi.md#glossaryshow) | **GET** /accounts/{account_id}/glossaries/{id} | Get a single glossary
*GlossaryApi* | [**glossaryUpdate**](docs/GlossaryApi.md#glossaryupdate) | **PATCH** /accounts/{account_id}/glossaries/{id} | Update a glossary
*GlossaryTermTranslationsApi* | [**glossaryTermTranslationCreate**](docs/GlossaryTermTranslationsApi.md#glossarytermtranslationcreate) | **POST** /accounts/{account_id}/glossaries/{glossary_id}/terms/{term_id}/translations | Create a glossary term translation
*GlossaryTermTranslationsApi* | [**glossaryTermTranslationDelete**](docs/GlossaryTermTranslationsApi.md#glossarytermtranslationdelete) | **DELETE** /accounts/{account_id}/glossaries/{glossary_id}/terms/{term_id}/translations/{id} | Delete a glossary term translation
*GlossaryTermTranslationsApi* | [**glossaryTermTranslationUpdate**](docs/GlossaryTermTranslationsApi.md#glossarytermtranslationupdate) | **PATCH** /accounts/{account_id}/glossaries/{glossary_id}/terms/{term_id}/translations/{id} | Update a glossary term translation
*GlossaryTermsApi* | [**glossaryTermCreate**](docs/GlossaryTermsApi.md#glossarytermcreate) | **POST** /accounts/{account_id}/glossaries/{glossary_id}/terms | Create a glossary term
*GlossaryTermsApi* | [**glossaryTermDelete**](docs/GlossaryTermsApi.md#glossarytermdelete) | **DELETE** /accounts/{account_id}/glossaries/{glossary_id}/terms/{id} | Delete a glossary term
*GlossaryTermsApi* | [**glossaryTermShow**](docs/GlossaryTermsApi.md#glossarytermshow) | **GET** /accounts/{account_id}/glossaries/{glossary_id}/terms/{id} | Get a single glossary term
*GlossaryTermsApi* | [**glossaryTermUpdate**](docs/GlossaryTermsApi.md#glossarytermupdate) | **PATCH** /accounts/{account_id}/glossaries/{glossary_id}/terms/{id} | Update a glossary term
*GlossaryTermsApi* | [**glossaryTermsList**](docs/GlossaryTermsApi.md#glossarytermslist) | **GET** /accounts/{account_id}/glossaries/{glossary_id}/terms | List glossary terms
*InvitationsApi* | [**invitationCreate**](docs/InvitationsApi.md#invitationcreate) | **POST** /accounts/{account_id}/invitations | Create a new invitation
*InvitationsApi* | [**invitationDelete**](docs/InvitationsApi.md#invitationdelete) | **DELETE** /accounts/{account_id}/invitations/{id} | Delete an invitation
*InvitationsApi* | [**invitationResend**](docs/InvitationsApi.md#invitationresend) | **POST** /accounts/{account_id}/invitations/{id}/resend | Resend an invitation
*InvitationsApi* | [**invitationShow**](docs/InvitationsApi.md#invitationshow) | **GET** /accounts/{account_id}/invitations/{id} | Get a single invitation
*InvitationsApi* | [**invitationUpdate**](docs/InvitationsApi.md#invitationupdate) | **PATCH** /accounts/{account_id}/invitations/{id} | Update an invitation
*InvitationsApi* | [**invitationsList**](docs/InvitationsApi.md#invitationslist) | **GET** /accounts/{account_id}/invitations | List invitations
*JobLocalesApi* | [**jobLocaleComplete**](docs/JobLocalesApi.md#joblocalecomplete) | **POST** /projects/{project_id}/jobs/{job_id}/locales/{id}/complete | Complete a job locale
*JobLocalesApi* | [**jobLocaleDelete**](docs/JobLocalesApi.md#joblocaledelete) | **DELETE** /projects/{project_id}/jobs/{job_id}/locales/{id} | Delete a job locale
*JobLocalesApi* | [**jobLocaleReopen**](docs/JobLocalesApi.md#joblocalereopen) | **POST** /projects/{project_id}/jobs/{job_id}/locales/{id}/reopen | Reopen a job locale
*JobLocalesApi* | [**jobLocaleShow**](docs/JobLocalesApi.md#joblocaleshow) | **GET** /projects/{project_id}/jobs/{job_id}/locale/{id} | Get a single job locale
*JobLocalesApi* | [**jobLocaleUpdate**](docs/JobLocalesApi.md#joblocaleupdate) | **PATCH** /projects/{project_id}/jobs/{job_id}/locales/{id} | Update a job locale
*JobLocalesApi* | [**jobLocalesCreate**](docs/JobLocalesApi.md#joblocalescreate) | **POST** /projects/{project_id}/jobs/{job_id}/locales | Create a job locale
*JobLocalesApi* | [**jobLocalesList**](docs/JobLocalesApi.md#joblocaleslist) | **GET** /projects/{project_id}/jobs/{job_id}/locales | List job locales
*JobsApi* | [**jobComplete**](docs/JobsApi.md#jobcomplete) | **POST** /projects/{project_id}/jobs/{id}/complete | Complete a job
*JobsApi* | [**jobCreate**](docs/JobsApi.md#jobcreate) | **POST** /projects/{project_id}/jobs | Create a job
*JobsApi* | [**jobDelete**](docs/JobsApi.md#jobdelete) | **DELETE** /projects/{project_id}/jobs/{id} | Delete a job
*JobsApi* | [**jobKeysCreate**](docs/JobsApi.md#jobkeyscreate) | **POST** /projects/{project_id}/jobs/{id}/keys | Add keys to job
*JobsApi* | [**jobKeysDelete**](docs/JobsApi.md#jobkeysdelete) | **DELETE** /projects/{project_id}/jobs/{id}/keys | Remove keys from job
*JobsApi* | [**jobReopen**](docs/JobsApi.md#jobreopen) | **POST** /projects/{project_id}/jobs/{id}/reopen | Reopen a job
*JobsApi* | [**jobShow**](docs/JobsApi.md#jobshow) | **GET** /projects/{project_id}/jobs/{id} | Get a single job
*JobsApi* | [**jobStart**](docs/JobsApi.md#jobstart) | **POST** /projects/{project_id}/jobs/{id}/start | Start a job
*JobsApi* | [**jobUpdate**](docs/JobsApi.md#jobupdate) | **PATCH** /projects/{project_id}/jobs/{id} | Update a job
*JobsApi* | [**jobsList**](docs/JobsApi.md#jobslist) | **GET** /projects/{project_id}/jobs | List jobs
*KeysApi* | [**keyCreate**](docs/KeysApi.md#keycreate) | **POST** /projects/{project_id}/keys | Create a key
*KeysApi* | [**keyDelete**](docs/KeysApi.md#keydelete) | **DELETE** /projects/{project_id}/keys/{id} | Delete a key
*KeysApi* | [**keyShow**](docs/KeysApi.md#keyshow) | **GET** /projects/{project_id}/keys/{id} | Get a single key
*KeysApi* | [**keyUpdate**](docs/KeysApi.md#keyupdate) | **PATCH** /projects/{project_id}/keys/{id} | Update a key
*KeysApi* | [**keysDelete**](docs/KeysApi.md#keysdelete) | **DELETE** /projects/{project_id}/keys | Delete collection of keys
*KeysApi* | [**keysList**](docs/KeysApi.md#keyslist) | **GET** /projects/{project_id}/keys | List keys
*KeysApi* | [**keysSearch**](docs/KeysApi.md#keyssearch) | **POST** /projects/{project_id}/keys/search | Search keys
*KeysApi* | [**keysTag**](docs/KeysApi.md#keystag) | **PATCH** /projects/{project_id}/keys/tag | Add tags to collection of keys
*KeysApi* | [**keysUntag**](docs/KeysApi.md#keysuntag) | **PATCH** /projects/{project_id}/keys/untag | Remove tags from collection of keys
*LocalesApi* | [**localeCreate**](docs/LocalesApi.md#localecreate) | **POST** /projects/{project_id}/locales | Create a locale
*LocalesApi* | [**localeDelete**](docs/LocalesApi.md#localedelete) | **DELETE** /projects/{project_id}/locales/{id} | Delete a locale
*LocalesApi* | [**localeDownload**](docs/LocalesApi.md#localedownload) | **GET** /projects/{project_id}/locales/{id}/download | Download a locale
*LocalesApi* | [**localeShow**](docs/LocalesApi.md#localeshow) | **GET** /projects/{project_id}/locales/{id} | Get a single locale
*LocalesApi* | [**localeUpdate**](docs/LocalesApi.md#localeupdate) | **PATCH** /projects/{project_id}/locales/{id} | Update a locale
*LocalesApi* | [**localesList**](docs/LocalesApi.md#localeslist) | **GET** /projects/{project_id}/locales | List locales
*MembersApi* | [**memberDelete**](docs/MembersApi.md#memberdelete) | **DELETE** /accounts/{account_id}/members/{id} | Remove a user from the account
*MembersApi* | [**memberShow**](docs/MembersApi.md#membershow) | **GET** /accounts/{account_id}/members/{id} | Get single member
*MembersApi* | [**memberUpdate**](docs/MembersApi.md#memberupdate) | **PATCH** /accounts/{account_id}/members/{id} | Update a member
*MembersApi* | [**membersList**](docs/MembersApi.md#memberslist) | **GET** /accounts/{account_id}/members | List members
*OrdersApi* | [**orderConfirm**](docs/OrdersApi.md#orderconfirm) | **PATCH** /projects/{project_id}/orders/{id}/confirm | Confirm an order
*OrdersApi* | [**orderCreate**](docs/OrdersApi.md#ordercreate) | **POST** /projects/{project_id}/orders | Create a new order
*OrdersApi* | [**orderDelete**](docs/OrdersApi.md#orderdelete) | **DELETE** /projects/{project_id}/orders/{id} | Cancel an order
*OrdersApi* | [**orderShow**](docs/OrdersApi.md#ordershow) | **GET** /projects/{project_id}/orders/{id} | Get a single order
*OrdersApi* | [**ordersList**](docs/OrdersApi.md#orderslist) | **GET** /projects/{project_id}/orders | List orders
*ProjectsApi* | [**projectCreate**](docs/ProjectsApi.md#projectcreate) | **POST** /projects | Create a project
*ProjectsApi* | [**projectDelete**](docs/ProjectsApi.md#projectdelete) | **DELETE** /projects/{id} | Delete a project
*ProjectsApi* | [**projectShow**](docs/ProjectsApi.md#projectshow) | **GET** /projects/{id} | Get a single project
*ProjectsApi* | [**projectUpdate**](docs/ProjectsApi.md#projectupdate) | **PATCH** /projects/{id} | Update a project
*ProjectsApi* | [**projectsList**](docs/ProjectsApi.md#projectslist) | **GET** /projects | List projects
*ReleasesApi* | [**releaseCreate**](docs/ReleasesApi.md#releasecreate) | **POST** /accounts/{account_id}/distributions/{distribution_id}/releases | Create a release
*ReleasesApi* | [**releaseDelete**](docs/ReleasesApi.md#releasedelete) | **DELETE** /accounts/{account_id}/distributions/{distribution_id}/releases/{id} | Delete a release
*ReleasesApi* | [**releasePublish**](docs/ReleasesApi.md#releasepublish) | **POST** /accounts/{account_id}/distributions/{distribution_id}/releases/{id}/publish | Publish a release
*ReleasesApi* | [**releaseShow**](docs/ReleasesApi.md#releaseshow) | **GET** /accounts/{account_id}/distributions/{distribution_id}/releases/{id} | Get a single release
*ReleasesApi* | [**releaseUpdate**](docs/ReleasesApi.md#releaseupdate) | **PATCH** /accounts/{account_id}/distributions/{distribution_id}/releases/{id} | Update a release
*ReleasesApi* | [**releasesList**](docs/ReleasesApi.md#releaseslist) | **GET** /accounts/{account_id}/distributions/{distribution_id}/releases | List releases
*ScreenshotMarkersApi* | [**screenshotMarkerCreate**](docs/ScreenshotMarkersApi.md#screenshotmarkercreate) | **POST** /projects/{project_id}/screenshots/{screenshot_id}/markers | Create a screenshot marker
*ScreenshotMarkersApi* | [**screenshotMarkerDelete**](docs/ScreenshotMarkersApi.md#screenshotmarkerdelete) | **DELETE** /projects/{project_id}/screenshots/{screenshot_id}/markers | Delete a screenshot marker
*ScreenshotMarkersApi* | [**screenshotMarkerShow**](docs/ScreenshotMarkersApi.md#screenshotmarkershow) | **GET** /projects/{project_id}/screenshots/{screenshot_id}/markers/{id} | Get a single screenshot marker
*ScreenshotMarkersApi* | [**screenshotMarkerUpdate**](docs/ScreenshotMarkersApi.md#screenshotmarkerupdate) | **PATCH** /projects/{project_id}/screenshots/{screenshot_id}/markers | Update a screenshot marker
*ScreenshotMarkersApi* | [**screenshotMarkersList**](docs/ScreenshotMarkersApi.md#screenshotmarkerslist) | **GET** /projects/{project_id}/screenshots/{id}/markers | List screenshot markers
*ScreenshotsApi* | [**screenshotCreate**](docs/ScreenshotsApi.md#screenshotcreate) | **POST** /projects/{project_id}/screenshots | Create a screenshot
*ScreenshotsApi* | [**screenshotDelete**](docs/ScreenshotsApi.md#screenshotdelete) | **DELETE** /projects/{project_id}/screenshots/{id} | Delete a screenshot
*ScreenshotsApi* | [**screenshotShow**](docs/ScreenshotsApi.md#screenshotshow) | **GET** /projects/{project_id}/screenshots/{id} | Get a single screenshot
*ScreenshotsApi* | [**screenshotUpdate**](docs/ScreenshotsApi.md#screenshotupdate) | **PATCH** /projects/{project_id}/screenshots/{id} | Update a screenshot
*ScreenshotsApi* | [**screenshotsList**](docs/ScreenshotsApi.md#screenshotslist) | **GET** /projects/{project_id}/screenshots | List screenshots
*SpacesApi* | [**spaceCreate**](docs/SpacesApi.md#spacecreate) | **POST** /accounts/{account_id}/spaces | Create a Space
*SpacesApi* | [**spaceDelete**](docs/SpacesApi.md#spacedelete) | **DELETE** /accounts/{account_id}/spaces/{id} | Delete Space
*SpacesApi* | [**spaceShow**](docs/SpacesApi.md#spaceshow) | **GET** /accounts/{account_id}/spaces/{id} | Get Space
*SpacesApi* | [**spaceUpdate**](docs/SpacesApi.md#spaceupdate) | **PATCH** /accounts/{account_id}/spaces/{id} | Update Space
*SpacesApi* | [**spacesList**](docs/SpacesApi.md#spaceslist) | **GET** /accounts/{account_id}/spaces | List Spaces
*SpacesApi* | [**spacesProjectsCreate**](docs/SpacesApi.md#spacesprojectscreate) | **POST** /accounts/{account_id}/spaces/{space_id}/projects | Add Project
*SpacesApi* | [**spacesProjectsDelete**](docs/SpacesApi.md#spacesprojectsdelete) | **DELETE** /accounts/{account_id}/spaces/{space_id}/projects/{id} | Remove Project
*SpacesApi* | [**spacesProjectsList**](docs/SpacesApi.md#spacesprojectslist) | **GET** /accounts/{account_id}/spaces/{space_id}/projects | List Projects
*StyleGuidesApi* | [**styleguideCreate**](docs/StyleGuidesApi.md#styleguidecreate) | **POST** /projects/{project_id}/styleguides | Create a style guide
*StyleGuidesApi* | [**styleguideDelete**](docs/StyleGuidesApi.md#styleguidedelete) | **DELETE** /projects/{project_id}/styleguides/{id} | Delete a style guide
*StyleGuidesApi* | [**styleguideShow**](docs/StyleGuidesApi.md#styleguideshow) | **GET** /projects/{project_id}/styleguides/{id} | Get a single style guide
*StyleGuidesApi* | [**styleguideUpdate**](docs/StyleGuidesApi.md#styleguideupdate) | **PATCH** /projects/{project_id}/styleguides/{id} | Update a style guide
*StyleGuidesApi* | [**styleguidesList**](docs/StyleGuidesApi.md#styleguideslist) | **GET** /projects/{project_id}/styleguides | List style guides
*TagsApi* | [**tagCreate**](docs/TagsApi.md#tagcreate) | **POST** /projects/{project_id}/tags | Create a tag
*TagsApi* | [**tagDelete**](docs/TagsApi.md#tagdelete) | **DELETE** /projects/{project_id}/tags/{name} | Delete a tag
*TagsApi* | [**tagShow**](docs/TagsApi.md#tagshow) | **GET** /projects/{project_id}/tags/{name} | Get a single tag
*TagsApi* | [**tagsList**](docs/TagsApi.md#tagslist) | **GET** /projects/{project_id}/tags | List tags
*TranslationsApi* | [**translationCreate**](docs/TranslationsApi.md#translationcreate) | **POST** /projects/{project_id}/translations | Create a translation
*TranslationsApi* | [**translationExclude**](docs/TranslationsApi.md#translationexclude) | **PATCH** /projects/{project_id}/translations/{id}/exclude | Exclude a translation from export
*TranslationsApi* | [**translationInclude**](docs/TranslationsApi.md#translationinclude) | **PATCH** /projects/{project_id}/translations/{id}/include | Revoke exclusion of a translation in export
*TranslationsApi* | [**translationReview**](docs/TranslationsApi.md#translationreview) | **PATCH** /projects/{project_id}/translations/{id}/review | Review a translation
*TranslationsApi* | [**translationShow**](docs/TranslationsApi.md#translationshow) | **GET** /projects/{project_id}/translations/{id} | Get a single translation
*TranslationsApi* | [**translationUnverify**](docs/TranslationsApi.md#translationunverify) | **PATCH** /projects/{project_id}/translations/{id}/unverify | Mark a translation as unverified
*TranslationsApi* | [**translationUpdate**](docs/TranslationsApi.md#translationupdate) | **PATCH** /projects/{project_id}/translations/{id} | Update a translation
*TranslationsApi* | [**translationVerify**](docs/TranslationsApi.md#translationverify) | **PATCH** /projects/{project_id}/translations/{id}/verify | Verify a translation
*TranslationsApi* | [**translationsByKey**](docs/TranslationsApi.md#translationsbykey) | **GET** /projects/{project_id}/keys/{key_id}/translations | List translations by key
*TranslationsApi* | [**translationsByLocale**](docs/TranslationsApi.md#translationsbylocale) | **GET** /projects/{project_id}/locales/{locale_id}/translations | List translations by locale
*TranslationsApi* | [**translationsExclude**](docs/TranslationsApi.md#translationsexclude) | **PATCH** /projects/{project_id}/translations/exclude | Set exclude from export flag on translations selected by query
*TranslationsApi* | [**translationsInclude**](docs/TranslationsApi.md#translationsinclude) | **PATCH** /projects/{project_id}/translations/include | Remove exlude from import flag from translations selected by query
*TranslationsApi* | [**translationsList**](docs/TranslationsApi.md#translationslist) | **GET** /projects/{project_id}/translations | List all translations
*TranslationsApi* | [**translationsReview**](docs/TranslationsApi.md#translationsreview) | **PATCH** /projects/{project_id}/translations/review | Review translations selected by query
*TranslationsApi* | [**translationsSearch**](docs/TranslationsApi.md#translationssearch) | **POST** /projects/{project_id}/translations/search | Search translations
*TranslationsApi* | [**translationsUnverify**](docs/TranslationsApi.md#translationsunverify) | **PATCH** /projects/{project_id}/translations/unverify | Mark translations selected by query as unverified
*TranslationsApi* | [**translationsVerify**](docs/TranslationsApi.md#translationsverify) | **PATCH** /projects/{project_id}/translations/verify | Verify translations selected by query
*UploadsApi* | [**uploadCreate**](docs/UploadsApi.md#uploadcreate) | **POST** /projects/{project_id}/uploads | Upload a new file
*UploadsApi* | [**uploadShow**](docs/UploadsApi.md#uploadshow) | **GET** /projects/{project_id}/uploads/{id} | View upload details
*UploadsApi* | [**uploadsList**](docs/UploadsApi.md#uploadslist) | **GET** /projects/{project_id}/uploads | List uploads
*UsersApi* | [**showUser**](docs/UsersApi.md#showuser) | **GET** /user | Show current User
*VersionsHistoryApi* | [**versionShow**](docs/VersionsHistoryApi.md#versionshow) | **GET** /projects/{project_id}/translations/{translation_id}/versions/{id} | Get a single version
*VersionsHistoryApi* | [**versionsList**](docs/VersionsHistoryApi.md#versionslist) | **GET** /projects/{project_id}/translations/{translation_id}/versions | List all versions
*WebhooksApi* | [**webhookCreate**](docs/WebhooksApi.md#webhookcreate) | **POST** /projects/{project_id}/webhooks | Create a webhook
*WebhooksApi* | [**webhookDelete**](docs/WebhooksApi.md#webhookdelete) | **DELETE** /projects/{project_id}/webhooks/{id} | Delete a webhook
*WebhooksApi* | [**webhookShow**](docs/WebhooksApi.md#webhookshow) | **GET** /projects/{project_id}/webhooks/{id} | Get a single webhook
*WebhooksApi* | [**webhookTest**](docs/WebhooksApi.md#webhooktest) | **POST** /projects/{project_id}/webhooks/{id}/test | Test a webhook
*WebhooksApi* | [**webhookUpdate**](docs/WebhooksApi.md#webhookupdate) | **PATCH** /projects/{project_id}/webhooks/{id} | Update a webhook
*WebhooksApi* | [**webhooksList**](docs/WebhooksApi.md#webhookslist) | **GET** /projects/{project_id}/webhooks | List webhooks


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.phrase.client.models.Account](docs/Account.md)
 - [com.phrase.client.models.AccountDetails](docs/AccountDetails.md)
 - [com.phrase.client.models.AccountDetails1](docs/AccountDetails1.md)
 - [com.phrase.client.models.AffectedCount](docs/AffectedCount.md)
 - [com.phrase.client.models.AffectedResources](docs/AffectedResources.md)
 - [com.phrase.client.models.Authorization](docs/Authorization.md)
 - [com.phrase.client.models.AuthorizationCreateParameters](docs/AuthorizationCreateParameters.md)
 - [com.phrase.client.models.AuthorizationUpdateParameters](docs/AuthorizationUpdateParameters.md)
 - [com.phrase.client.models.AuthorizationWithToken](docs/AuthorizationWithToken.md)
 - [com.phrase.client.models.AuthorizationWithToken1](docs/AuthorizationWithToken1.md)
 - [com.phrase.client.models.BitbucketSync](docs/BitbucketSync.md)
 - [com.phrase.client.models.BitbucketSyncExportParameters](docs/BitbucketSyncExportParameters.md)
 - [com.phrase.client.models.BitbucketSyncExportResponse](docs/BitbucketSyncExportResponse.md)
 - [com.phrase.client.models.BitbucketSyncImportParameters](docs/BitbucketSyncImportParameters.md)
 - [com.phrase.client.models.BlacklistedKey](docs/BlacklistedKey.md)
 - [com.phrase.client.models.BlacklistedKeyCreateParameters](docs/BlacklistedKeyCreateParameters.md)
 - [com.phrase.client.models.BlacklistedKeyUpdateParameters](docs/BlacklistedKeyUpdateParameters.md)
 - [com.phrase.client.models.Branch](docs/Branch.md)
 - [com.phrase.client.models.BranchCreateParameters](docs/BranchCreateParameters.md)
 - [com.phrase.client.models.BranchMergeParameters](docs/BranchMergeParameters.md)
 - [com.phrase.client.models.BranchUpdateParameters](docs/BranchUpdateParameters.md)
 - [com.phrase.client.models.Comment](docs/Comment.md)
 - [com.phrase.client.models.CommentCreateParameters](docs/CommentCreateParameters.md)
 - [com.phrase.client.models.CommentMarkReadParameters](docs/CommentMarkReadParameters.md)
 - [com.phrase.client.models.CommentUpdateParameters](docs/CommentUpdateParameters.md)
 - [com.phrase.client.models.Distribution](docs/Distribution.md)
 - [com.phrase.client.models.DistributionCreateParameters](docs/DistributionCreateParameters.md)
 - [com.phrase.client.models.DistributionPreview](docs/DistributionPreview.md)
 - [com.phrase.client.models.DistributionUpdateParameters](docs/DistributionUpdateParameters.md)
 - [com.phrase.client.models.Format](docs/Format.md)
 - [com.phrase.client.models.GitlabSync](docs/GitlabSync.md)
 - [com.phrase.client.models.GitlabSyncExport](docs/GitlabSyncExport.md)
 - [com.phrase.client.models.GitlabSyncExportParameters](docs/GitlabSyncExportParameters.md)
 - [com.phrase.client.models.GitlabSyncHistory](docs/GitlabSyncHistory.md)
 - [com.phrase.client.models.GitlabSyncImportParameters](docs/GitlabSyncImportParameters.md)
 - [com.phrase.client.models.Glossary](docs/Glossary.md)
 - [com.phrase.client.models.GlossaryCreateParameters](docs/GlossaryCreateParameters.md)
 - [com.phrase.client.models.GlossaryTerm](docs/GlossaryTerm.md)
 - [com.phrase.client.models.GlossaryTermCreateParameters](docs/GlossaryTermCreateParameters.md)
 - [com.phrase.client.models.GlossaryTermTranslation](docs/GlossaryTermTranslation.md)
 - [com.phrase.client.models.GlossaryTermTranslationCreateParameters](docs/GlossaryTermTranslationCreateParameters.md)
 - [com.phrase.client.models.GlossaryTermTranslationUpdateParameters](docs/GlossaryTermTranslationUpdateParameters.md)
 - [com.phrase.client.models.GlossaryTermUpdateParameters](docs/GlossaryTermUpdateParameters.md)
 - [com.phrase.client.models.GlossaryUpdateParameters](docs/GlossaryUpdateParameters.md)
 - [com.phrase.client.models.Invitation](docs/Invitation.md)
 - [com.phrase.client.models.InvitationCreateParameters](docs/InvitationCreateParameters.md)
 - [com.phrase.client.models.InvitationUpdateParameters](docs/InvitationUpdateParameters.md)
 - [com.phrase.client.models.Job](docs/Job.md)
 - [com.phrase.client.models.JobCompleteParameters](docs/JobCompleteParameters.md)
 - [com.phrase.client.models.JobCreateParameters](docs/JobCreateParameters.md)
 - [com.phrase.client.models.JobDetails](docs/JobDetails.md)
 - [com.phrase.client.models.JobDetails1](docs/JobDetails1.md)
 - [com.phrase.client.models.JobKeysCreateParameters](docs/JobKeysCreateParameters.md)
 - [com.phrase.client.models.JobLocale](docs/JobLocale.md)
 - [com.phrase.client.models.JobLocaleCompleteParameters](docs/JobLocaleCompleteParameters.md)
 - [com.phrase.client.models.JobLocaleReopenParameters](docs/JobLocaleReopenParameters.md)
 - [com.phrase.client.models.JobLocaleUpdateParameters](docs/JobLocaleUpdateParameters.md)
 - [com.phrase.client.models.JobLocalesCreateParameters](docs/JobLocalesCreateParameters.md)
 - [com.phrase.client.models.JobPreview](docs/JobPreview.md)
 - [com.phrase.client.models.JobReopenParameters](docs/JobReopenParameters.md)
 - [com.phrase.client.models.JobStartParameters](docs/JobStartParameters.md)
 - [com.phrase.client.models.JobUpdateParameters](docs/JobUpdateParameters.md)
 - [com.phrase.client.models.KeyCreateParameters](docs/KeyCreateParameters.md)
 - [com.phrase.client.models.KeyPreview](docs/KeyPreview.md)
 - [com.phrase.client.models.KeyUpdateParameters](docs/KeyUpdateParameters.md)
 - [com.phrase.client.models.KeysSearchParameters](docs/KeysSearchParameters.md)
 - [com.phrase.client.models.KeysTagParameters](docs/KeysTagParameters.md)
 - [com.phrase.client.models.KeysUntagParameters](docs/KeysUntagParameters.md)
 - [com.phrase.client.models.Locale](docs/Locale.md)
 - [com.phrase.client.models.LocaleCreateParameters](docs/LocaleCreateParameters.md)
 - [com.phrase.client.models.LocaleDetails](docs/LocaleDetails.md)
 - [com.phrase.client.models.LocaleDetails1](docs/LocaleDetails1.md)
 - [com.phrase.client.models.LocalePreview](docs/LocalePreview.md)
 - [com.phrase.client.models.LocaleStatistics](docs/LocaleStatistics.md)
 - [com.phrase.client.models.LocaleUpdateParameters](docs/LocaleUpdateParameters.md)
 - [com.phrase.client.models.Member](docs/Member.md)
 - [com.phrase.client.models.MemberUpdateParameters](docs/MemberUpdateParameters.md)
 - [com.phrase.client.models.OrderConfirmParameters](docs/OrderConfirmParameters.md)
 - [com.phrase.client.models.OrderCreateParameters](docs/OrderCreateParameters.md)
 - [com.phrase.client.models.Project](docs/Project.md)
 - [com.phrase.client.models.ProjectCreateParameters](docs/ProjectCreateParameters.md)
 - [com.phrase.client.models.ProjectDetails](docs/ProjectDetails.md)
 - [com.phrase.client.models.ProjectDetails1](docs/ProjectDetails1.md)
 - [com.phrase.client.models.ProjectLocales](docs/ProjectLocales.md)
 - [com.phrase.client.models.ProjectLocales1](docs/ProjectLocales1.md)
 - [com.phrase.client.models.ProjectShort](docs/ProjectShort.md)
 - [com.phrase.client.models.ProjectUpdateParameters](docs/ProjectUpdateParameters.md)
 - [com.phrase.client.models.Release](docs/Release.md)
 - [com.phrase.client.models.ReleaseCreateParameters](docs/ReleaseCreateParameters.md)
 - [com.phrase.client.models.ReleasePreview](docs/ReleasePreview.md)
 - [com.phrase.client.models.ReleaseUpdateParameters](docs/ReleaseUpdateParameters.md)
 - [com.phrase.client.models.Screenshot](docs/Screenshot.md)
 - [com.phrase.client.models.ScreenshotCreateParameters](docs/ScreenshotCreateParameters.md)
 - [com.phrase.client.models.ScreenshotMarker](docs/ScreenshotMarker.md)
 - [com.phrase.client.models.ScreenshotMarkerCreateParameters](docs/ScreenshotMarkerCreateParameters.md)
 - [com.phrase.client.models.ScreenshotMarkerUpdateParameters](docs/ScreenshotMarkerUpdateParameters.md)
 - [com.phrase.client.models.ScreenshotUpdateParameters](docs/ScreenshotUpdateParameters.md)
 - [com.phrase.client.models.Space](docs/Space.md)
 - [com.phrase.client.models.SpaceCreateParameters](docs/SpaceCreateParameters.md)
 - [com.phrase.client.models.SpaceUpdateParameters](docs/SpaceUpdateParameters.md)
 - [com.phrase.client.models.SpacesProjectsCreateParameters](docs/SpacesProjectsCreateParameters.md)
 - [com.phrase.client.models.Styleguide](docs/Styleguide.md)
 - [com.phrase.client.models.StyleguideCreateParameters](docs/StyleguideCreateParameters.md)
 - [com.phrase.client.models.StyleguideDetails](docs/StyleguideDetails.md)
 - [com.phrase.client.models.StyleguideDetails1](docs/StyleguideDetails1.md)
 - [com.phrase.client.models.StyleguidePreview](docs/StyleguidePreview.md)
 - [com.phrase.client.models.StyleguideUpdateParameters](docs/StyleguideUpdateParameters.md)
 - [com.phrase.client.models.Tag](docs/Tag.md)
 - [com.phrase.client.models.TagCreateParameters](docs/TagCreateParameters.md)
 - [com.phrase.client.models.TagWithStats](docs/TagWithStats.md)
 - [com.phrase.client.models.TagWithStats1](docs/TagWithStats1.md)
 - [com.phrase.client.models.TagWithStats1Statistics](docs/TagWithStats1Statistics.md)
 - [com.phrase.client.models.TagWithStats1Statistics1](docs/TagWithStats1Statistics1.md)
 - [com.phrase.client.models.Translation](docs/Translation.md)
 - [com.phrase.client.models.TranslationCreateParameters](docs/TranslationCreateParameters.md)
 - [com.phrase.client.models.TranslationDetails](docs/TranslationDetails.md)
 - [com.phrase.client.models.TranslationDetails1](docs/TranslationDetails1.md)
 - [com.phrase.client.models.TranslationExcludeParameters](docs/TranslationExcludeParameters.md)
 - [com.phrase.client.models.TranslationIncludeParameters](docs/TranslationIncludeParameters.md)
 - [com.phrase.client.models.TranslationKey](docs/TranslationKey.md)
 - [com.phrase.client.models.TranslationKeyDetails](docs/TranslationKeyDetails.md)
 - [com.phrase.client.models.TranslationKeyDetails1](docs/TranslationKeyDetails1.md)
 - [com.phrase.client.models.TranslationOrder](docs/TranslationOrder.md)
 - [com.phrase.client.models.TranslationReviewParameters](docs/TranslationReviewParameters.md)
 - [com.phrase.client.models.TranslationUnverifyParameters](docs/TranslationUnverifyParameters.md)
 - [com.phrase.client.models.TranslationUpdateParameters](docs/TranslationUpdateParameters.md)
 - [com.phrase.client.models.TranslationVerifyParameters](docs/TranslationVerifyParameters.md)
 - [com.phrase.client.models.TranslationVersion](docs/TranslationVersion.md)
 - [com.phrase.client.models.TranslationVersionWithUser](docs/TranslationVersionWithUser.md)
 - [com.phrase.client.models.TranslationVersionWithUser1](docs/TranslationVersionWithUser1.md)
 - [com.phrase.client.models.TranslationsExcludeParameters](docs/TranslationsExcludeParameters.md)
 - [com.phrase.client.models.TranslationsIncludeParameters](docs/TranslationsIncludeParameters.md)
 - [com.phrase.client.models.TranslationsReviewParameters](docs/TranslationsReviewParameters.md)
 - [com.phrase.client.models.TranslationsSearchParameters](docs/TranslationsSearchParameters.md)
 - [com.phrase.client.models.TranslationsUnverifyParameters](docs/TranslationsUnverifyParameters.md)
 - [com.phrase.client.models.TranslationsVerifyParameters](docs/TranslationsVerifyParameters.md)
 - [com.phrase.client.models.Upload](docs/Upload.md)
 - [com.phrase.client.models.UploadCreateParameters](docs/UploadCreateParameters.md)
 - [com.phrase.client.models.UploadSummary](docs/UploadSummary.md)
 - [com.phrase.client.models.User](docs/User.md)
 - [com.phrase.client.models.UserPreview](docs/UserPreview.md)
 - [com.phrase.client.models.Webhook](docs/Webhook.md)
 - [com.phrase.client.models.WebhookCreateParameters](docs/WebhookCreateParameters.md)
 - [com.phrase.client.models.WebhookUpdateParameters](docs/WebhookUpdateParameters.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="Basic"></a>
### Basic

- **Type**: HTTP basic authentication

<a name="Token"></a>
### Token

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

