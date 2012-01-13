package nomad.ccu.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import nomad.ccu.beans.Ccu;
import nomad.ccu.data.DataServiceInterface;

import org.springframework.context.annotation.Scope;

@Path("/ccuList")
@Scope("request")
public class CcuListResource {
	
	private DataServiceInterface dataService; 
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Ccu> getCcuList() {
		return dataService.getCcuList();
	}

	public DataServiceInterface getDataService() {
		return dataService;
	}

	public void setDataService(DataServiceInterface dataService) {
		this.dataService = dataService;
	}
}
