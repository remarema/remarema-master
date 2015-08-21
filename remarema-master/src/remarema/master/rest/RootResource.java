package remarema.master.rest;

import javax.ws.rs.Path;

public class RootResource {

	@Path("/master")
	public RestMaster restMaster() {
		return new RestMaster();
	}

}
