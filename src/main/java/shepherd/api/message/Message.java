package shepherd.api.message;

public interface Message<T> {

    T data();
    MessageMetadata metadata();

}
