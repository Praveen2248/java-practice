package com.ch.resource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

@Path("/order")
public class OrderService {

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	@Path("/in")
	public String createOrder(InputStream in) throws IOException {
		StringBuffer buffer = null;
		buffer = new StringBuffer();
		int c = 0;
		while((c=in.read()) != -1) {
			buffer.append((char)c);
			System.out.println("haiiii")
			//Hi this is praveen kumar working with git hub
		
		}
		return buffer.toString() + " 123 ";
		//Once again tyring to modify the current code
	}
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	@Path("/reader")
	public String createOrder(Reader reader) throws IOException {
		StringBuffer buffer = null;
		buffer = new StringBuffer();
		int c= 0;
		while((c=reader.read()) != -1) {
			buffer.append((char)c);
		}
		
		return buffer.toString();
		//I am again modifying the code in global repository
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	@Path("/bite")
	public byte[] createOrder(byte[] bite) {
		return bite;
	}
	
	/*@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	@Path("/streaming")
	public StreamingOutput createOrder(final String bodyData) {
		StreamingOutput so = (OutputStream os)-> {
			os.write(bodyData.length());			
		};
		return so;
	}*/
	
	
	@POST
	@Produces(MediaType.MULTIPART_FORM_DATA)
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Path("/file")
	public File createOrder(File file) {
		
		return file;
	}
}
