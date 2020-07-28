package shepherd.api.cluster.node;

public interface NodeInfo {


    int id();
    NodeAddress address();
    NodeState state();
    boolean isLeader();
    boolean isCurrentNode();
    long joinTime();
    int version();
}
