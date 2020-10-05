package shepherd.api.cluster.node;


/**
 * This class will represent some statistics about each node.
 * This statistics are local and not cluster wide.
 *
 */
public interface NodeStatistics {

    /**
     * Get total sent bytes to the node.
     * It will return 0 for current node.
     * Also it contains all bytes such as application protocol , cluster protocol and etc.
     * @return total sent bytes to the node
     */
    long totalSentBytes();
    /**
     * Get total received bytes from the node.
     * It will return 0 for current node.
     * Also it contains all bytes such as application protocol , cluster protocol and etc.
     * @return total received bytes from the node
     */
    long totalReceivedBytes();

    /**
     * Gte total sent packets to the node.
     * It will return 0 for current node.
     * Also it contains all packets such as application protocol , cluster protocol and etc.
     * @return total sent packets to the node
     */
    long totalSentPackets();

    /**
     * Gte total received packets from the node.
     * It will return 0 for current node.
     * Also it contains all packets such as application protocol , cluster protocol and etc.
     * @return total received packets from the node
     */
    long totalReceivedPackets();
}
