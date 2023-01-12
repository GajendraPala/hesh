package com.controlltodb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.kafka.core.KafkaTemplate;


@Path("/cruddata")
public class Controllerfordatatodb {
	int id=12342;
	@Context
	HttpServletRequest request;
	@Context
	HttpServletResponse response;
	
	 @Path("/producer/{msg}")
	 @POST
	  @Produces("application/json")
	  public String hello(@PathParam("msg") String message) {

			Properties props = new Properties();

			props.put("bootstrap.servers", "localhost:9092");

			props.put("acks", "all");

			props.put("retries", 0);

			props.put("batch.size", 16384);

			props.put("linger.ms", 1);

			props.put("buffer.memory", 93554432);
			props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
			props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
			Producer<String, String> producer = new KafkaProducer<String, String>(props);
			ProducerRecord<String, String> record = new ProducerRecord<String, String>("users", "cab-update",message);
			
			producer.send(record);
			
			/*
			 try {
				 Class.forName("com.mysql.jdbc.Driver");                        //192.168.124.156:3306/testdevdb
					//Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.124.213:3555/ppc_ayrusadmin", "avmaapp","avmaapp$");
					Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.124.156:3306/testdevdb", "auvitapp","auvitapp$");
					PreparedStatement insertuserdata = conn.prepareStatement("INSERT INTO TypeOfFile (FileType)  values(?)");
					insertuserdata.setString(1, message);
				int input = insertuserdata.executeUpdate();
				conn.close();
		    	}catch (Exception e) {
		    		   System.out.println("OOPS SOMETHING WENT WRONG" + e);
		    	    }
		    
			*/
			
			Details1 d1=new Details1(34,"gdsds");
			HashMap<String, Details1> hm=new HashMap<String, Details1>();
			hm.put("name",d1.getName());
			
			//producer.send(d);
			System.out.println(record);

		  return message+ "  "+record;
	 }
	
	  @Path("/consumer")
	  @GET
	  @Produces("application/json")
	  public String consumeer() {

		 String topicName = "users";
			Properties properties = new Properties();
			properties.setProperty("bootstrap.servers", "localhost:9092");
			properties.setProperty("group.id", "test");
		    properties.setProperty("enable.auto.commit", "true");
		    properties.setProperty("auto.commit.interval.ms", "1000");
		   // properties.setProperty("partition.assignment.strategy", "range");
		    properties.setProperty("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		    properties.setProperty("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

			KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(properties);
			consumer.subscribe(Arrays.asList(topicName));
		//	System.out.println(consumer.listTopics());
			
			System.out.println("loop");
			String users = null;
			
			
		
//	return users;
//				} 
         
			
				try {
					 Class.forName("com.mysql.jdbc.Driver");                        //192.168.124.156:3306/testdevdb
						//Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.124.213:3555/ppc_ayrusadmin", "avmaapp","avmaapp$");
						Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.124.156:3306/testdevdb?useSSL=false", "auvitapp","auvitapp$");
						PreparedStatement insertuserdata = conn.prepareStatement("INSERT INTO TypeOfFile (FileType)  values(?)");
						insertuserdata.setString(1, users);
					int input = insertuserdata.executeUpdate();
					conn.close();
			    	}catch (Exception e) {
			    		   System.out.println("OOPS SOMETHING WENT WRONG" + e);
			    	    }
				return users;
		}
	
	
	 
	@Path("/sending/{name}/{mobile}/{tableno}/{array}")
	@POST
	@Produces("application/json")
	public String[] insert(@PathParam("name") String name,@PathParam("mobile") int mobile,@PathParam("tableno") String tno,@PathParam("array") String[] ary) {
		
	//KafkaTemplate.send("gajas")
		id=id-3;
		id=id;
		response.addHeader("Access-Control-Allow-Headers",
				"origin, content-type, accept, x-requested-with, my-cool-header");
		response.addHeader("Access-Control-Max-Age", "60"); 
		response.addHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
		response.addHeader("Access-Control-Allow-Origin", "*");
		
		System.out.println(name+"   "+mobile+"  "+ary);
		 Connection conn = null;
		 String str = null;
	  for(String a:ary) {	
		 System.out.println(a);		
		 }
		
		 try {
	    		Class.forName("com.mysql.jdbc.Driver");
		         conn = DriverManager.getConnection("jdbc:mysql://192.168.124.156:3306/testdevdb", "auvitapp", "auvitapp$");
		        Statement statement = conn.createStatement();
	            String s="SELECT * FROM jspform";
				  ResultSet so= statement.executeQuery(s);
				  while(so.next()) {
				 str=str+so.getInt("id")+" "+so.getString("name")+" "+so.getString("password")+" \n";
				  }
				  System.out.println(str);
	                // return "deleted record from table";
	    	}catch (Exception e) {
	    		   System.out.println("OOPS SOMETHING WENT WRONG" + e);
	    	    }
	    return ary;
	    }
	 
		
	@Path("/sending/{array}")
	@POST
	@Produces("application/json")
	public Details1 bus(@PathParam("array") String[] ary) {
		id=id-3;
		id=id;
		response.addHeader("Access-Control-Allow-Headers",
				"origin, content-type, accept, x-requested-with, my-cool-header");
		response.addHeader("Access-Control-Max-Age", "60"); 
		response.addHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
		response.addHeader("Access-Control-Allow-Origin", "*");
		System.out.println("inside the bus method........................................");
		System.out.println(ary[0]);
		for(String a:ary) {
			System.out.println(a);
		}
		
		 Connection conn = null;
		 String str = null;
		 try {
	    		Class.forName("com.mysql.jdbc.Driver");
		         conn = DriverManager.getConnection("jdbc:mysql://192.168.124.156:3306/testdevdb", "auvitapp", "auvitapp$");
		        Statement statement = conn.createStatement();
	            String s="SELECT * FROM jspform";
				  ResultSet so= statement.executeQuery(s);
				  while(so.next()) {
				 str=str+so.getInt("id")+" "+so.getString("name")+" "+so.getString("password")+" \n";
				  }
				  System.out.println(str);
	                // return "deleted record from table";
	    	}catch (Exception e) {
	    		   System.out.println("OOPS SOMETHING WENT WRONG" + e);
	    	    }
		 ArrayList<Details1> al=new ArrayList<Details1>();
		 
		// Details data1=new Details(12,"gaja");
		 Details1 data2=new Details1(54,"ravi");
		 //String name="gaja";
	    return data2;
	    }
}
/*
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
import java.sql.*;  
@Path("/cruddata")
public class Controllerfordatatodb extends HttpServlet  
{    
     public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
      {  
         PrintWriter out = res.getWriter();  
         res.setContentType("text/html");  
         out.println("<html><body>");  
         Connection conn = null;
         try 
         {  
        	 Class.forName("com.mysql.jdbc.Driver");  
        	  conn = DriverManager.getConnection("jdbc:mysql://192.168.124.156:3306/testdevdb", "auvitapp", "auvitapp$");
		        Statement statement = conn.createStatement();
	            String qry="SELECT * FROM jspform";
				ResultSet rs= statement.executeQuery(qry);
				System.out.println("this is inside the method..................................................");
             out.println("<table border=1 width=50% height=50%>");  
             out.println("<tr><th>EmpId</th><th>EmpName</th><th>Salary</th><tr>");  
             while (rs.next()) 
             {  
                 String n = rs.getString("id");  
                 String nm = rs.getString("name");  
                 int s = rs.getInt("password");   
                 out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td></tr>");   
             }  
             out.println("</table>");  
             out.println("</html></body>");  
             conn.close();  
            }  
             catch (Exception e) 
            {  
             out.println("error");  
         }  
     }  
 } 
*/