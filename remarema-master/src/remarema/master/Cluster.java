package remarema.master;

public class Cluster {

	private int clusterID;
	private String clusterName;
	private Cluster parentCluster;

	public Cluster() {
		// TODO Auto-generated constructor stub
	}

	public Cluster(String clusterName, Cluster parentCluster) {
		this.clusterName = clusterName;
		this.parentCluster = parentCluster;
	}

	public int getClusterID() {
		return clusterID;
	}

	public void setClusterID(int clusterID) {
		this.clusterID = clusterID;
	}

	public String getClusterName() {
		return clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

	public Cluster getParentCluster() {
		return parentCluster;
	}

	public void setParentCluster(Cluster parentCluster) {
		this.parentCluster = parentCluster;
	}

}
