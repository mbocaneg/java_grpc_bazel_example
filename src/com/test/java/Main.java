package src.com.test.java;

//import com.test.java.proto.TransceiverGrpc;
import com.test.java.proto.TransmissionObjectOuterClass;
//import com.test.java.proto.TransceiverOuterClass;
//import io.grpc.ManagedChannel;
//import io.grpc.ManagedChannelBuilder;
//import io.grpc.stub.StreamObserver;

public class Main {

    public static void main(String[] args) {

        TransmissionObjectOuterClass.TransmissionObject transmissionObject = TransmissionObjectOuterClass.TransmissionObject.newBuilder()
                .setMessage("hello world")
                .setValue(3.14f)
                .build();
        System.out.println(transmissionObject);

//        ManagedChannel channel = ManagedChannelBuilder
//                .forAddress("localhost", 1234)
//                .usePlaintext()
//                .build();
//        TransceiverGrpc.TransceiverBlockingStub stub = TransceiverGrpc.newBlockingStub(channel);
//        TransceiverOuterClass.EchoRequest request = TransceiverOuterClass.EchoRequest.newBuilder()
//                .setFromClient(transmissionObject)
//                .build();
//        TransceiverOuterClass.EchoResponse response = stub.echo(request);
//        System.out.println("Received message from server: ");
//        System.out.println(response);
//        channel.shutdownNow();

    }
}
