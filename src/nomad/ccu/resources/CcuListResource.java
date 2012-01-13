package nomad.ccu.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import nomad.ccu.beans.Ccu;
import nomad.ccu.data.DataServiceInterface;
import nomad.ccu.data.SimpleTestDataService;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Path("/ccuList")
@Component
@Scope("request")
public class CcuListResource {
	
	private DataServiceInterface dataService; 
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Ccu> getCcuList() {
		if(dataService == null) {
			dataService = new SimpleTestDataService();
		}
		return dataService.getCcuList();
	}
}
