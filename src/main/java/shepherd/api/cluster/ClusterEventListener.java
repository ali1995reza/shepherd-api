package shepherd.api.cluster;


import shepherd.api.cluster.node.NodeInfo;
import shepherd.api.cluster.node.NodeState;

public interface ClusterEventListener {

    void onClusterStateChanged(ClusterState lastState, ClusterState currentState);
    void onNodeStateChanged(NodeInfo node, NodeState lastState, NodeState currentState);
    void onLeaderChanged(NodeInfo leader);

}
