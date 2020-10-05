package shepherd.api.message;


import shepherd.api.asynchronous.AsynchronousResultListener;
import shepherd.api.message.ack.Acknowledge;
import shepherd.api.message.exceptions.MessageException;

public interface Question<T> extends Message<T> {

    MessageMetadata response(T response, boolean waitFoAck, AsynchronousResultListener<Acknowledge> listener) throws MessageException;

    MessageMetadata response(T response, AsynchronousResultListener<Acknowledge> listener) throws MessageException;

    int timeOut();




}
