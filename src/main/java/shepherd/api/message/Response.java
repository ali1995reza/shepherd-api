package shepherd.api.message;

public interface Response<T> extends Message<T> {

    enum Error{
        DESTINATION_DOSE_NOT_SUPPORT_SERVICE ,
        QUESTION_DESERIALIZE_HAD_ERROR ,
        RESPONSE_DESERIALIZE_HAD_ERROR ;
    }


    boolean hasError();

    Error error();



}
