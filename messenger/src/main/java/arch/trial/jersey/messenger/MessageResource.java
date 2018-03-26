package arch.trial.jersey.messenger;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path ("/messages")
public class MessageResource {
	
	/**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
   
    
   /* @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
    	return "Helo";
    }*/
    MessageService sms = new MessageService();
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getIt() {
    	return sms.getAllMsg() ;
    }


}
