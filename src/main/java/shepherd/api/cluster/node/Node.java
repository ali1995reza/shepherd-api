package shepherd.api.cluster.node;


import shepherd.api.cluster.Cluster;
import shepherd.api.config.Configuration;
import shepherd.api.message.MessageServiceManager;

public interface Node<T> {

    void joinCluster(NodeAddress<T> address) throws Exception;

    void createCluster();

    void leave();

    NodeInfo info();

    Cluster cluster();

    Configuration configurations();

    MessageServiceManager messageServiceManager();


}
