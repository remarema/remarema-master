package remarema.master;

import java.util.Date;

public class Supernodes {

	private int supernodeID;
	private Cluster cluster;
	private Nodes node;
	private Date lastHearbeat;
	
	public Supernodes() {
		// TODO Auto-generated constructor stub
	}
	public Supernodes(Cluster cluster, Nodes node, Date lastHeartbeat){
		this.cluster = cluster;
		this.node = node;
		this.lastHearbeat = lastHeartbeat;
	}

	public int getSupernodeID() {
		return supernodeID;
	}

	public void setSupernodeID(int supernodeID) {
		this.supernodeID = supernodeID;
	}

	public Cluster getCluster() {
		return cluster;
	}

	public void setCluster(Cluster cluster) {
		this.cluster = cluster;
	}

	public Nodes getNode() {
		return node;
	}

	public void setNode(Nodes node) {
		this.node = node;
	}

	public Date getLastHearbeat() {
		return lastHearbeat;
	}

	public void setLastHearbeat(Date lastHearbeat) {
		this.lastHearbeat = lastHearbeat;
	}

}
