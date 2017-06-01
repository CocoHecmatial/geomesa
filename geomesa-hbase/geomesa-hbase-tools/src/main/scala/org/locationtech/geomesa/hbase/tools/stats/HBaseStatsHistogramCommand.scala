/***********************************************************************
 * Copyright (c) 2013-2016 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.hbase.tools.stats

import com.beust.jcommander.Parameters
import org.locationtech.geomesa.hbase.data.HBaseDataStore
import org.locationtech.geomesa.hbase.tools.HBaseDataStoreCommand
import org.locationtech.geomesa.tools.CatalogParam
import org.locationtech.geomesa.tools.stats.{StatsHistogramCommand, StatsHistogramParams}

class HBaseStatsHistogramCommand extends StatsHistogramCommand[HBaseDataStore] with HBaseDataStoreCommand {
  override val params = new HBaseStatsHistogramParams
}

@Parameters(commandDescription = "View or calculate counts of attribute in a GeoMesa feature type, grouped by sorted values")
class HBaseStatsHistogramParams extends StatsHistogramParams with CatalogParam
