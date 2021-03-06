package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class UserTokenRequest (
  user: Option[UserTokenRequestInnerUserField],
  /* Organization Access token */
  organizationAccessToken: String)
   extends ApiModel


