package shepherd.api.message;

import shepherd.api.asynchronous.AsynchronousResultListener;
import shepherd.api.cluster.ClusterEvent;
import shepherd.api.config.IConfiguration;
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


    MessageMetadata sendMessage(T message, int nodes[], int requiredAcknowledges, AsynchronousResultListener<Acknowledge> listener) throws MessageException;

    MessageMetadata sendMessage(T message, int requiredAcknowledges, AsynchronousResultListener<Acknowledge> listener) throws MessageException;

    MessageMetadata askQuestion(T question, int[] nodes, int requiredResponses, AsynchronousResultListener<Answer<T>> listener) throws MessageException;

    MessageMetadata askQuestion(T question, int requiredResponses, AsynchronousResultListener<Answer<T>> listener) throws MessageException;

    MessageMetadata askQuestion(T question, int[] nodes, int requiredResponses, int timeOut, AsynchronousResultListener<Answer<T>> listener) throws MessageException;

    MessageMetadata askQuestion(T question, int requiredResponses, int timeOut, AsynchronousResultListener<Answer<T>> listener) throws MessageException;



    ClusterEvent synchronizedClusterEvent();

    IConfiguration configurations();

    int id();

    MessageServiceStatistics statistics();

}
