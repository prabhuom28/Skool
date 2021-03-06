/*
 * @Author: 609349708 (Abhinav Meghmala)
 */

package com.bt.dataintegration.hive;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.hadoop.hive.metastore.HiveMetaStoreClient;
import org.apache.hadoop.hive.metastore.api.AlreadyExistsException;
import org.apache.hadoop.hive.metastore.api.InvalidObjectException;
import org.apache.hadoop.hive.metastore.api.MetaException;
import org.apache.hadoop.hive.metastore.api.NoSuchObjectException;
import org.apache.hadoop.hive.metastore.api.Table;
import org.apache.thrift.TException;

import com.bt.dataintegration.property.config.HadoopConfig;

public interface IHiveProcess {
	
	//Create table with avro schema. Returns a table object
	public String validateHiveTablePrivs(HadoopConfig hconf);	
	
	//Build hive query for user. returns query string
	public String queryBuilder(HadoopConfig hconf);
	
	//Build add partition query
	public String partitionBuilder(HadoopConfig hconf);
	
	//Write the Hive create command in file
	public void writeHiveCreateQuery(String query, HadoopConfig hconf);
	
	//Write partition query to file
	public void writeHivePartitionQuery(String query, HadoopConfig hconf);
}
