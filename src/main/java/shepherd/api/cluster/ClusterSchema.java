package shepherd.api.cluster;

import shepherd.api.cluster.node.NodeInfo;

import java.util.Map;
import java.util.function.Function;

/**
 *This class contains some methods to use for cluster schema
 */
public interface ClusterSchema {

    /**
     * Get nodes of cluster in a map.Kye is the id and values are information for each node
     * @return nodes map
     */
    Map<Integer, NodeInfo> nodes();

    /**
     * Get current leader node
     * @return leader node information
     */
    NodeInfo leader();

    /**
     * To just get nodes for a specific purpose.
     * Each node will check by filter and if result be true it will passed the filter
     * @param filter filter function
     * @return filtered nodes to use them for sending message
     */
    int[] filterNodes(Function<NodeInfo, Boolean> filter);
}
