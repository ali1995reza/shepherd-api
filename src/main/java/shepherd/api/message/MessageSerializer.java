package shepherd.api.message;


import shepherd.api.message.exceptions.SerializeException;

import java.nio.ByteBuffer;

public interface MessageSerializer<T> {


    ByteBuffer[] serialize(T msgData) throws SerializeException;
    T deserialize(ByteBuffer[] rawData) throws SerializeException;
}
