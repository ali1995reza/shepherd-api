package shepherd.api.cluster;

public interface ClusterEvent {

    /**
     * To add new listener to the cluster event
     * @param clusterEventListener new listener to add
     */
    void addClusterEventListener(ClusterEventListener clusterEventListener);

    /**
     * To remove an existing listener
     * @param clusterEventListener listener to remove
     */
    void removeClusterEventListener(ClusterEventListener clusterEventListener);
}
