package shepherd.api.message;


import shepherd.api.config.ConfigurationKey;

import java.nio.ByteBuffer;
import java.util.Map;

public interface MessageServiceManager {


    <T> MessageService<T> registerService(int id
            , MessageSerializer<T> serializer
            , MessageListener<T> listener
            , Map<ConfigurationKey, Object> configs);

    <T> MessageService<T> registerService(int id
            , MessageSerializer<T> serializer
            , MessageListener<T> listener);

    MessageService<ByteBuffer[]> registerService(int id
            , MessageListener<ByteBuffer[]> listener
            , Map<ConfigurationKey, Object> configs);

    MessageService<ByteBuffer[]> registerService(int id
            , MessageListener<ByteBuffer[]> listener);

    void deregisterService(MessageService service);

}
