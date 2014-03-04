package ar.gob.jgm;

import java.util.Map;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

import com.sun.jersey.spi.container.ContainerResponse;

public class ConsultaPersonaTransformer extends AbstractMessageTransformer { 
	
	@SuppressWarnings("unchecked")
	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding)
	        throws TransformerException {
	    ContainerResponse cr = (ContainerResponse) message.getInvocationProperty("jersey_response");
	    Map<String, Object> map = (Map<String, Object>) cr.getResponse().getEntity();
	    message.setPayload(map); 
	    return message; 
	}
}