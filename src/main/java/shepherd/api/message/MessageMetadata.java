package shepherd.api.message;


import shepherd.api.cluster.node.NodeInfo;

public interface MessageMetadata {


    enum MessageType {


        UNICAST((byte)0) , MULTICAST((byte)1) , BROADCAST((byte)2);

        private byte code = -1;

        private MessageType(byte id)
        {
            this.code = id;
        }

        public byte code() {
            return code;
        }

        public boolean is(MessageType other)
        {
            return this==other;
        }

        public boolean isNot(MessageType other)
        {
            return this!=other;
        }

        public static MessageType getByCode(byte code)
        {
            switch (code)
            {
                case 0:return UNICAST;
                case 1:return MULTICAST;
                case 2:return BROADCAST;
                default:throw new IllegalArgumentException("can not found message-type with this code");
            }
        }
    }



    NodeInfo sender();

    int id();

    MessageType type();

    long sendTime();

    long receiveTime();
}
