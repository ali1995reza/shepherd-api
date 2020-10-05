package shepherd.api.cluster.node;


import shepherd.api.cluster.Cluster;

/**
 *
 * <p>
 *     Each NodeInfo represent information about nodes that joint in cluster
 * </p>
 *
 */
public interface NodeInfo {

    /**
     * ID of node
     * @return id
     */
    int id();

    /**
     * Address of node
     * @return address
     */
    NodeAddress address();

    /**
     * Current state of node
     * @return state
     */
    NodeState state();

    /**
     * Is this node leader of cluster or not
     * @return true if this node is leader else will return false
     */
    boolean isLeader();

    /**
     * Is this information about current local node or not
     *
     * @return true if this information is related to local current node
     * else will return false
     */
    boolean isCurrentNode();

    /**
     * <p>
     *     To get when this node joint to cluster
     * </p>
     * <p>
     *     This time must be shown as cluster time
     * </p>
     *
     * @return joint time
     *
     *
     * @see Cluster#clusterTime()
     */
    long joinTime();


    /**
     * <p>
     *     To get version of node
     * </p>
     *
     * @return version of node
     */
    long version();

    /**
     * To get some statistic about this node
     * <p>
     *     This statistics are local and not distributed
     * </p>
     * @return statistics of node
     */
    NodeStatistics statistics();
}
