/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.Pairs
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object PairsApi {

  /**
   * Pairs cause measurements with effect measurements grouped over the duration of action after the onset delay.
   * 
   * Expected answers:
   *   code 200 : Seq[Pairs] (Successful operation)
   *   code 401 :  (Not Authenticated)
   * 
   * @param cause Original variable name for the explanatory or independent variable
   * @param effect Original variable name for the outcome or dependent variable
   * @param accessToken User&#39;s OAuth2 access token
   * @param causeSource Name of data source that the cause measurements should come from
   * @param causeUnit Abbreviated name for the unit cause measurements to be returned in
   * @param delay Delay before onset of action (in seconds) from the cause variable settings.
   * @param duration Duration of action (in seconds) from the cause variable settings.
   * @param effectSource Name of data source that the effectmeasurements should come from
   * @param effectUnit Abbreviated name for the unit effect measurements to be returned in
   * @param endTime The most recent date (in epoch time) for which we should return measurements
   * @param startTime The earliest date (in epoch time) for which we should return measurements
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0.
   * @param offset Now suppose you wanted to show results 11-20. You&#39;d set the offset to 10 and the limit to 10.
   * @param sort Sort by given field. If the field is prefixed with &#x60;-, it will sort in descending order.
   */
  def v1PairsCsvGet(cause: String, effect: String, accessToken: Option[String] = None, causeSource: Option[String] = None, causeUnit: Option[String] = None, delay: Option[String] = None, duration: Option[String] = None, effectSource: Option[String] = None, effectUnit: Option[String] = None, endTime: Option[String] = None, startTime: Option[String] = None, limit: Option[Int] = None, offset: Option[Int] = None, sort: Option[Int] = None): ApiRequest[Seq[Pairs]] =
    ApiRequest[Seq[Pairs]](ApiMethods.GET, "https://app.quantimo.do/api", "/v1/pairsCsv", "application/json")
      .withQueryParam("access_token", accessToken)
      .withQueryParam("cause", cause)
      .withQueryParam("causeSource", causeSource)
      .withQueryParam("causeUnit", causeUnit)
      .withQueryParam("delay", delay)
      .withQueryParam("duration", duration)
      .withQueryParam("effect", effect)
      .withQueryParam("effectSource", effectSource)
      .withQueryParam("effectUnit", effectUnit)
      .withQueryParam("endTime", endTime)
      .withQueryParam("startTime", startTime)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("sort", sort)
      .withSuccessResponse[Seq[Pairs]](200)
      .withErrorResponse[Unit](401)
        /**
   * Pairs cause measurements with effect measurements grouped over the duration of action after the onset delay.
   * 
   * Expected answers:
   *   code 200 : Seq[Pairs] (Successful operation)
   *   code 401 :  (Not Authenticated)
   * 
   * @param cause Original variable name for the explanatory or independent variable
   * @param effect Original variable name for the outcome or dependent variable
   * @param accessToken User&#39;s OAuth2 access token
   * @param causeSource Name of data source that the cause measurements should come from
   * @param causeUnit Abbreviated name for the unit cause measurements to be returned in
   * @param delay Delay before onset of action (in seconds) from the cause variable settings.
   * @param duration Duration of action (in seconds) from the cause variable settings.
   * @param effectSource Name of data source that the effectmeasurements should come from
   * @param effectUnit Abbreviated name for the unit effect measurements to be returned in
   * @param endTime The most recent date (in epoch time) for which we should return measurements
   * @param startTime The earliest date (in epoch time) for which we should return measurements
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0.
   * @param offset Now suppose you wanted to show results 11-20. You&#39;d set the offset to 10 and the limit to 10.
   * @param sort Sort by given field. If the field is prefixed with &#x60;-, it will sort in descending order.
   */
  def v1PairsGet(cause: String, effect: String, accessToken: Option[String] = None, causeSource: Option[String] = None, causeUnit: Option[String] = None, delay: Option[String] = None, duration: Option[String] = None, effectSource: Option[String] = None, effectUnit: Option[String] = None, endTime: Option[String] = None, startTime: Option[String] = None, limit: Option[Int] = None, offset: Option[Int] = None, sort: Option[Int] = None): ApiRequest[Seq[Pairs]] =
    ApiRequest[Seq[Pairs]](ApiMethods.GET, "https://app.quantimo.do/api", "/v1/pairs", "application/json")
      .withQueryParam("access_token", accessToken)
      .withQueryParam("cause", cause)
      .withQueryParam("causeSource", causeSource)
      .withQueryParam("causeUnit", causeUnit)
      .withQueryParam("delay", delay)
      .withQueryParam("duration", duration)
      .withQueryParam("effect", effect)
      .withQueryParam("effectSource", effectSource)
      .withQueryParam("effectUnit", effectUnit)
      .withQueryParam("endTime", endTime)
      .withQueryParam("startTime", startTime)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("sort", sort)
      .withSuccessResponse[Seq[Pairs]](200)
      .withErrorResponse[Unit](401)
      

}

