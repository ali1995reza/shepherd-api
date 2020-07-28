package shepherd.api.cluster;


import shepherd.api.config.Configuration;

public interface Cluster {

    ClusterSchema schema();
    ClusterEvent clusterEvent();
    long clusterTime();
    Configuration clusterConfig();
    ClusterState state();
}
