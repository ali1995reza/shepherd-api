package shepherd.api.cluster;


import shepherd.api.cluster.node.NodeInfo;

import java.util.Map;
import java.util.function.Function;

public interface ClusterSchema {

    Map<Integer, NodeInfo> nodes();
    NodeInfo leader();
    int[] filterNodes(Function<NodeInfo, Boolean> filter);
}
