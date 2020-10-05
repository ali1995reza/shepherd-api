package shepherd.api.cluster.node;


/**
 * <p>
 *     State of node
 * </p>
 */
public enum NodeState {
    /**
     * Unknown is the initial state of node
     */
    UNKNOWN(-1),
    /**
     * After a node establish a connection the state will change to connecting
     */
    CONNECTING(0) ,
    /**
     * When new node exchanging required data for joining to the cluster
     */
    SYNCHRONIZING(1) ,
    /**
     * When current node fully exchange data with peer ,
     * It just happens just for other nodes and not current node
     */
    CONNECTED(2) ,
    /**
     * When the node connected to the cluster successfully
     */
    CLUSTER_CONNECTED(3),
    /**
     * When the node want to leave from cluster
     */
    LEAVING(4) ,
    /**
     * When node successfully left the cluster
     */
    LEFT(5) ,
    /**
     * When node disconnected from local node ,
     * It just happens just for other nodes and node current node
     */
    DISCONNECTED(6) ,
    /**
     * When the node disconnected from cluster and all other nodes accept it
     */
    CLUSTER_DISCONNECTED(7);


    /**
     * To represent state by code , and use it to serialize state
     */
    public final int code;

    NodeState(int c)
    {
        this.code = c;
    }

    /**
     * its works same as {@link #equals(Object)} method
     * @param state other state to compare
     * @return {@code true} if equals and {@code false} if not
     *
     * @see #isNot(NodeState)
     */
    public boolean is(NodeState state)
    {
        return this == state;
    }

    /**
     * To check if this not equals to other state
     * @param state other state to compare
     * @return {@code true} if not-equals and {@code false} if equals
     *
     * @see #is(NodeState)
     */
    public boolean isNot(NodeState state)
    {
        return this != state;
    }

    /**
     * Just to know if current state is one of passed states
     * @param states Other states to check
     * @return {@code true} if current state is equals to one of others states and
     *         {@code false} if current state is not equals to any of passed states
     */
    public boolean isOneOf(NodeState... states)
    {
        for(NodeState state:states)
        {
            if(this==state)
                return true;
        }

        return false;
    }

    /**
     * To just represent state by code
     * @param code code of state
     * @return That state which has the same code with passed code
     * @throws IllegalArgumentException If code not valid or not found
     */
    public static NodeState getByCode(int code)
    {
        switch (code){
            case -1 : return UNKNOWN;
            case 0 : return CONNECTING;
            case 1 : return SYNCHRONIZING;
            case 2 : return CONNECTED;
            case 3 : return CLUSTER_CONNECTED;
            case 4 : return LEAVING;
            case 5 : return LEFT;
            case 6 : return DISCONNECTED;
            case 7 : return CLUSTER_DISCONNECTED;
            default:throw new IllegalArgumentException("code not defined");
        }
    }
}
