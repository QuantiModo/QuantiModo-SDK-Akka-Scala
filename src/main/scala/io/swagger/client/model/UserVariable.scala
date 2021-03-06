package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class UserVariable (
  /* ID of the parent variable if this variable has any parent */
  parentId: Option[Int],
  /* client_id */
  clientId: Option[String],
  /* ID of variable */
  variableId: Int,
  /* ID of unit to use for this variable */
  defaultUnitId: Option[Int],
  /* Minimum reasonable value for this variable (uses default unit) */
  minimumAllowedValue: Option[Float],
  /* Maximum reasonable value for this variable (uses default unit) */
  maximumAllowedValue: Option[Float],
  /* Value for replacing null measurements */
  fillingValue: Option[Float],
  /* The Variable this Variable should be joined with. If the variable is joined with some other variable then it is not shown to user in the list of variables */
  joinWith: Option[Int],
  /* How long it takes for a measurement in this variable to take effect */
  onsetDelay: Option[Int],
  /* Estimated duration of time following the onset delay in which a stimulus produces a perceivable effect */
  durationOfAction: Option[Int],
  /* ID of variable category */
  variableCategoryId: Option[Int],
  /* updated */
  updated: Option[Int],
  /* Is variable public */
  public: Option[Int],
  /* A value of 1 indicates that this variable is generally a cause in a causal relationship.  An example of a causeOnly variable would be a variable such as Cloud Cover which would generally not be influenced by the behaviour of the user */
  causeOnly: Option[Boolean],
  /* 0 -> No filling, 1 -> Use filling-value */
  fillingType: Option[String],
  /* Number of measurements */
  numberOfMeasurements: Option[Int],
  /* Number of processed measurements */
  numberOfProcessedMeasurements: Option[Int],
  /* Number of measurements at last analysis */
  measurementsAtLastAnalysis: Option[Int],
  /* ID of last Unit */
  lastUnitId: Option[Int],
  /* ID of last original Unit */
  lastOriginalUnitId: Option[Int],
  /* Last Value */
  lastValue: Option[Float],
  /* Last original value which is stored */
  lastOriginalValue: Option[Int],
  /* ID of last source */
  lastSourceId: Option[Int],
  /* Number of correlations for this variable */
  numberOfCorrelations: Option[Int],
  /* status */
  status: Option[String],
  /* error_message */
  errorMessage: Option[String],
  /* When this variable or its settings were last updated */
  lastSuccessfulUpdateTime: Option[DateTime],
  /* Standard deviation */
  standardDeviation: Option[Float],
  /* Variance */
  variance: Option[Float],
  /* Minimum recorded daily value of this variable */
  minimumRecordedDailyValue: Option[Float],
  /* Maximum recorded daily value of this variable */
  maximumRecordedDailyValue: Option[Float],
  /* Mean */
  mean: Option[Float],
  /* Median */
  median: Option[Float],
  /* Most common Unit ID */
  mostCommonUnitId: Option[Int],
  /* Most common value */
  mostCommonValue: Option[Float],
  /* Number of unique daily values */
  numberOfUniqueDailyValues: Option[Float],
  /* Number of changes */
  numberOfChanges: Option[Int],
  /* Skewness */
  skewness: Option[Float],
  /* Kurtosis */
  kurtosis: Option[Float],
  /* Latitude */
  latitude: Option[Float],
  /* Longitude */
  longitude: Option[Float],
  /* Location */
  location: Option[String],
  /* created_at */
  createdAt: Option[DateTime],
  /* updated_at */
  updatedAt: Option[DateTime],
  /* Outcome variables (those with `outcome` == 1) are variables for which a human would generally want to identify the influencing factors.  These include symptoms of illness, physique, mood, cognitive performance, etc.  Generally correlation calculations are only performed on outcome variables */
  outcome: Option[Boolean],
  /* Comma-separated list of source names to limit variables to those sources */
  sources: Option[String],
  /* Earliest source time */
  earliestSourceTime: Option[Int],
  /* Latest source time */
  latestSourceTime: Option[Int],
  /* Earliest measurement time */
  earliestMeasurementTime: Option[Int],
  /* Latest measurement time */
  latestMeasurementTime: Option[Int],
  /* Earliest filling time */
  earliestFillingTime: Option[Int],
  /* Latest filling time */
  latestFillingTime: Option[Int])
   extends ApiModel


