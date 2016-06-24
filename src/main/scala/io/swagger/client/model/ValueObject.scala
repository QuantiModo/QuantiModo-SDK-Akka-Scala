/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class ValueObject (
  /* Timestamp for the measurement event in epoch time (unixtime) */
  timestamp: Long,
  /* Measurement value */
  value: Double,
  /* Optional note to include with the measurement */
  note: Option[String])
   extends ApiModel


