package remarema.master;

public class Nodes {

	private int nodeID;
	private String nodeName;
	private String nodeURL;
	private String nodeProperties;
	private Cluster cluster;

	public Nodes() {
		// TODO Auto-generated constructor stub
	}

	public Nodes(String nodeName, String nodeURL, Cluster cluster) {
		this.nodeName = nodeName;
		this.nodeURL = nodeURL;
		this.cluster = cluster;
	}

	public int getNodeID() {
		return nodeID;
	}

	public void setNodeID(int nodeID) {
		this.nodeID = nodeID;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getNodeURL() {
		return nodeURL;
	}

	public void setNodeURL(String nodeURL) {
		this.nodeURL = nodeURL;
	}

	public String getNodeProperties() {
		return nodeProperties;
	}

	public void setNodeProperties(String nodeProperties) {
		this.nodeProperties = nodeProperties;
	}

	public Cluster getCluster() {
		return cluster;
	}

	public void setCluster(Cluster cluster) {
		this.cluster = cluster;
	}
}
