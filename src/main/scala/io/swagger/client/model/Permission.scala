package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class Permission (
  /* Grant permission to target user or public so they may access measurements within the given parameters. TODO: Rename target to something more intuitive. */
  target: Int,
  /* ORIGINAL Variable name */
  variableName: String,
  /* Earliest time when measurements will be accessible in epoch seconds */
  minTimestamp: Int,
  /* Latest time when measurements will be accessible in epoch seconds */
  maxTimestamp: Int,
  /* Earliest time of day when measurements will be accessible in epoch seconds */
  minTimeOfDay: Int,
  /* Latest time of day when measurements will be accessible in epoch seconds */
  maxTimeOfDay: Int,
  /* Maybe specifies if only weekday measurements should be accessible */
  week: String)
   extends ApiModel


