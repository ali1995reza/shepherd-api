package shepherd.api.cluster;


import shepherd.api.cluster.node.NodeInfo;
import shepherd.api.cluster.node.NodeState;

/**
 *
 * This interface will be used to listening on cluster events
 */
public interface ClusterEventListener {

    /**
     * It will be called when cluster stated changed
     * @param lastState what is the last state before changed
     * @param currentState new state of cluster
     *
     */
    void onClusterStateChanged(ClusterState lastState, ClusterState currentState);

    /**
     * I will be called when an node state changed
     * @param node target node
     * @param lastState last state before changed
     * @param currentState new state of node
     */
    void onNodeStateChanged(NodeInfo node, NodeState lastState, NodeState currentState);

    /**
     * It will be called when leader changed
     * @param leader new leader
     */
    void onLeaderChanged(NodeInfo leader);

}
