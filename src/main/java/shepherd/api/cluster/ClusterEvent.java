package shepherd.api.cluster;

public interface ClusterEvent {

    void addClusterEventListener(ClusterEventListener clusterEventListener);
    void removeClusterEventListener(ClusterEventListener clusterEventListener);
}
