package shepherd.api.cluster.node;

public enum NodeState {
    CONNECTING(1) ,
    SYNCHRONIZING(2) ,
    CONNECTED(3) ,
    LEAVING(4) ,
    DISCONNECTED(5) ,
    UNKNOWN(6);


    public final int code;

    NodeState(int c)
    {
        this.code = c;
    }

    public boolean is(NodeState state)
    {
        return this == state;
    }

    public boolean isNot(NodeState state)
    {
        return this != state;
    }

    public static NodeState getByCode(int code)
    {
        switch (code){
            case 1 : return CONNECTING;
            case 2 : return SYNCHRONIZING;
            case 3 : return CONNECTED;
            case 4 : return LEAVING;
            case 5 : return DISCONNECTED;
            case 6 : return UNKNOWN;
            default:throw new IllegalArgumentException("code not defined");
        }
    }
}
