package shepherd.api.cluster.node;

import shepherd.api.cluster.Cluster;
import shepherd.api.config.IConfiguration;
import shepherd.api.message.MessageServiceManager;


/**
 *
 * <p>
 *     each <code>Node</code> is a local member of Cluster
 * </p>
 *
 * @param <T> address type
 */
public interface Node<T> {

    /**
     * <p>
     *     This method use to join to an existing cluster
     * </p>
     * @param address address of one of nodes in exists cluster
     * @throws Exception if any problem occurs in joining to cluster
     *
     * @see #createCluster()
     */
    void joinCluster(NodeAddress<T> address) throws Exception;


    /**
     * <p>
     *     This method use to create a cluster that current node is the
     *     first node of cluster
     * </p>
     *
     * @see #joinCluster(NodeAddress)
     */
    void createCluster();


    /**
     * <p>
     *     Use to leave from cluster.
     * </p>
     * <p>
     *     After a node call this method no message can published from this node ,
     *     and waiting to leave operation done
     * </p>
     *
     */
    void leave();

    /**
     * <p>
     *     To get current node information
     * </p>
     *
     * @return Information of current node
     */
    NodeInfo info();

    /**
     * <p>
     *     To get current cluster
     * </p>
     * @return The cluster that this node is one of it's member
     */
    Cluster cluster();


    /**
     * <p>
     *     To get current node configuration
     * </p>
     * @return Current node config
     */
    IConfiguration configurations();

    /**
     *
     * <p>
     *     This method will provide a MessageServiceManager to
     *     create , remove and etc MessageServices
     * </p>
     * @return Current node MessageServiceManager
     */
    MessageServiceManager messageServiceManager();


}
