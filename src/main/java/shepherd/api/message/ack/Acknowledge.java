package shepherd.api.message.ack;


import shepherd.api.message.MessageMetadata;

public interface Acknowledge {

    int numberOfFailedAcks();
    int numberOfSuccessAcks();
    int numberOfPossibleAcks();
    int numberOfRequiredAcks();
    MessageMetadata messageMetadata();

}
