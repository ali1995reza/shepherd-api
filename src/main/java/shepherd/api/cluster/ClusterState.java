package shepherd.api.cluster;

public enum ClusterState {

    SYNCHRONIZED(1) , UN_SYNCHRONIZED(2), STOPPED(3) , UNKNOWN(4);

    public final int code;

    ClusterState(int c)
    {
        this.code = c;
    }

    boolean is(ClusterState state)
    {
        return this == state;
    }

    boolean isNot(ClusterState state)
    {
        return this != state;
    }

    public static ClusterState getByCode(int code)
    {
        switch (code){
            case 1:return SYNCHRONIZED;
            case 2:return UN_SYNCHRONIZED;
            case 3:return STOPPED;
            case 4:return UNKNOWN;
            default:throw new IllegalArgumentException("code not defined");
        }
    }

}
