package shepherd.api.message;


public interface MessageListener<T> {

    void onMessageReceived(Message<T> message);
    void onQuestionAsked(Question<T> question);
}
