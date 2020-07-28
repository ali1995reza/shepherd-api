package shepherd.api.message;

import java.util.Map;

public interface Answer<T> {

    Map<Integer, Response<T>> responses();
    int numberOfFailedNodes();
    int numberOfRequiredResponses();
    boolean timedOut();
    MessageMetadata questionMetadata();
}
