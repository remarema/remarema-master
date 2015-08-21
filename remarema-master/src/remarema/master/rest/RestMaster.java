package remarema.master.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import remarema.client.api.Master;
import remarema.client.api.NodeConfiguration;
import remarema.master.Nodes;
import remarema.master.Supernodes;
import remarema.master.model.MockModel;

public class RestMaster implements Master{
	
	MockModel mockModel;

	public RestMaster() {
		mockModel = new MockModel();
		mockModel.buildModel();
	}

	@Override
	@GET
	@Produces("application/xml")
	@Path("/Node/{nodename}")
	public NodeConfiguration getConfigurationForNode(
			@PathParam("nodename") String nodeName) {
		Nodes node = mockModel.getNodeByName(nodeName);
		String nodeClusterName = node.getCluster().getClusterName();
		Supernodes supernode = mockModel.getSupernodeForClustername(nodeClusterName);
		
		NodeConfiguration nodeConfiguration = new NodeConfiguration();
		nodeConfiguration.setNodeName(nodeName);
		nodeConfiguration.setClusterName(nodeClusterName);
		nodeConfiguration.setSupernode(supernode.getNode().getNodeURL());
		return nodeConfiguration;
	}

	@Override
	@POST
	@Path("/{cluster:.*}")
	public NodeConfiguration setSuperNodeForCluster(@PathParam("cluster") String clusterName) {
		
		// INSERT-Befehl; Zeitstempel ebenfalls miteintragen
		// wenn erfolgreich, dann true zurückgeben, andernfalls false
		return null;
	}

	@GET
	@Produces("application/xml")
	@Path("/cluster/{clustername}")
	public NodeConfiguration getConfigurationForParentCluster(
			@PathParam("clustername") String clustername) {
		// Abfrage an Tabelle cluster; SELECT parent WHERE name = clustername;
		return null;
	}

	@Override
	@GET
	@Produces("application/xml")
	@Path("/supernode/{clustername}")
	public NodeConfiguration getSupernodeFromParentCluster(
			@PathParam("clustername") String clustername) {
		// Abfrage an Tabelle supernode; SELECT node where cluster =
		// clustername;
		return null;
	}

}
