package shepherd.api.cluster;

public enum ClusterState {

    /**
     * Initial state of cluster
     */
    UNKNOWN(-1),
    /**
     * When cluster synchronizing state.
     * For example when a new node connecting
     */
    SYNCHRONIZING(1),
    /**
     * When cluster state is synchronized across all nodes.
     * For example when a node disconnected and all nodes accept it
     */
    SYNCHRONIZED(2) ,
    /**
     * When cluster stopped
     */
    STOPPED(3);


    public final int code;

    ClusterState(int c)
    {
        this.code = c;
    }

    public boolean is(ClusterState state)
    {
        return this == state;
    }

    public boolean isNot(ClusterState state)
    {
        return this != state;
    }

    public static ClusterState getByCode(int code)
    {
        switch (code){
            case 1:return SYNCHRONIZED;
            case 2:return SYNCHRONIZING;
            case 3:return STOPPED;
            case 4:return UNKNOWN;
            default:throw new IllegalArgumentException("code not defined");
        }
    }

}
