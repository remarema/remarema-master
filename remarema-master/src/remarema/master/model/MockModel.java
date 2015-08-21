package remarema.master.model;

import java.util.HashMap;

import remarema.master.Cluster;
import remarema.master.Nodes;
import remarema.master.Supernodes;

public class MockModel {

	private HashMap<String, Cluster> clusterMap;
	private HashMap<String, Nodes> nodesMap;
	private HashMap<String, Supernodes> supernodeMap;

	public MockModel() {
		clusterMap = new HashMap<String, Cluster>();
		nodesMap = new HashMap<String, Nodes>();
		supernodeMap = new HashMap<String, Supernodes>();
	}

	public void buildModel() {
		addCluster(new Cluster("ARZ", null));
		addCluster(new Cluster("cluster001", clusterMap.get("ARZ")));
		addCluster(new Cluster("cluster002", clusterMap.get("cluster001")));
		
		addNode(new Nodes("client001",
				"http://localhost:8080/remarema-p2p/rest",
				clusterMap.get("cluster001")));
		addNode(new Nodes("client002",
				"http://localhost:8080/remarema-p2p/rest",
				clusterMap.get("cluster001")));
		addNode(new Nodes("client003",
				"http://localhost:8080/remarema-p2p/rest",
				clusterMap.get("cluster002")));
	}

	private void addNode(Nodes node) {
		nodesMap.put(node.getNodeName(), node);
	}

	private void addCluster(Cluster cluster) {
		clusterMap.put(cluster.getClusterName(), cluster);
	}
	
	public void addSupernode(Supernodes supernode){
		supernodeMap.put(supernode.getCluster().getClusterName(), supernode);
	}
	
	
	public Nodes getNodeByName(String nodeName){
		Nodes node = nodesMap.get(nodeName);
		return node;
	}
	
	public Supernodes getSupernodeForClustername(String clustername){
		Supernodes supernode = supernodeMap.get(clustername);
		return supernode;
	}
	

}
