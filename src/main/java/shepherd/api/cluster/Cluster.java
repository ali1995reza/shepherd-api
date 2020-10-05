package shepherd.api.cluster;


import shepherd.api.config.IConfiguration;

public interface Cluster {

    /**
     * Get schema of the cluster
     * @return Cluster schema
     */
    ClusterSchema schema();

    /**
     * Get cluster event
     * @return cluster event
     */
    ClusterEvent clusterEvent();

    /**
     * Get current cluster time as milliseconds spend from begginig
     * @return time as millis
     */
    long clusterTime();

    /**
     * Get configuration of cluster
     * @return cluster config
     */
    IConfiguration clusterConfig();

    /**
     * Get current state of cluster
     * @return current state
     */
    ClusterState state();
}
