package shepherd.api.message;

public interface MessageServiceStatistics {


    long totalSentMessages();
    long totalReceivedMessages();

    long totalSentQuestions();
    long totalReceivedQuestions();

    long totalSentResponses();
    long totalReceivedResponses();

}
