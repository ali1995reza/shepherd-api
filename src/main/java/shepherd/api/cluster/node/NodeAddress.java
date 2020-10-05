package shepherd.api.cluster.node;


/**
 * <p>
 *     This is an abstract class that will implemented by any impl of API
 * </p>
 * @param <A> Address typ , example : SocketAddress for IP node implements
 */
public interface NodeAddress<A> {

    A address();

}
