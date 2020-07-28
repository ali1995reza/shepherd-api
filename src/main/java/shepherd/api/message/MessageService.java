package shepherd.api.message;


import shepherd.api.asynchronous.AsynchronousFuture;
import shepherd.api.cluster.ClusterEvent;
import shepherd.api.config.Configuration;
import shepherd.api.message.ack.Acknowledge;
import shepherd.api.message.exceptions.MessageException;

public interface MessageService<T> {

    final class DefaultArguments
    {
        public final static int NO_ACKNOWLEDGE = 0;
        public final static int ALL_ACKNOWLEDGES = -2;
        public final static int HALF_ACKNOWLEDGES = -3;


        public final static int ALL_RESPONSES = -4;
        public final static int HALF_RESPONSES = -5;
    }


    AsynchronousFuture<Acknowledge> sendMessage(T message, int requiredAcknowledges, int... nodes) throws MessageException;


    AsynchronousFuture<Acknowledge> broadcastMessage(T message, int requiredAcknowledges) throws MessageException;


    AsynchronousFuture<Answer<T>> askQuestion(T question, int[] nodes, int requiredResponses) throws MessageException;


    AsynchronousFuture<Answer<T>> askQuestion(T question, int requiredResponses) throws MessageException;


    AsynchronousFuture<Answer<T>> askQuestion(T question, int[] nodes, int requiredResponses, int timeOut) throws MessageException;


    AsynchronousFuture<Answer<T>> askQuestion(T question, int requiredResponses, int timeOut) throws MessageException;

    ClusterEvent synchronizedClusterEvent();

    Configuration configurations();

    int id();

}
