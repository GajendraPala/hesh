package com.controlltodb;

import java.io.Serializable;

import org.apache.kafka.common.serialization.Serializer;

public class Sample implements Serializable, Serializer  {
	int id;
	String name;
	public Sample(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}
	
	
	public byte[] serialize(String topic, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	    public void close() {
	        // intentionally left blank
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String sendjson(String name2, int id2) {
			String str="{\"name\":\""+name2+"\", \"carid\":"+id2+"}";
			return str;
		
		}
		

		
	
}
