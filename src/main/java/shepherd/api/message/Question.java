package shepherd.api.message;


import shepherd.api.asynchronous.AsynchronousFuture;
import shepherd.api.message.ack.Acknowledge;
import shepherd.api.message.exceptions.MessageException;

public interface Question<T> extends Message<T> {

    AsynchronousFuture<Acknowledge> response(T response, boolean waitFoAck) throws MessageException;

    AsynchronousFuture<Acknowledge> response(T response) throws MessageException;

    int timeOut();




}
