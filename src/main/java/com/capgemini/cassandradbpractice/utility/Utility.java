//package com.capgemini.cassandradbpractice.utility;
//
//import org.springframework.stereotype.Service;
//
//import com.datastax.driver.core.Cluster;
//import com.datastax.driver.core.Session;
//
//@Service
//public class Utility {
//	
//	public void creatingKeySpace() {
//		String query = "CREATE KEYSPACE tp WITH replication "
//		         + "= {'class':'SimpleStrategy', 'replication_factor':1};";
//		Cluster.Builder builder = Cluster.builder();
//		Cluster cluster = builder.build();
//		Session session = cluster.connect( );
//		session.execute(query);
//		System.out.println("Completed");
//	}
//}
