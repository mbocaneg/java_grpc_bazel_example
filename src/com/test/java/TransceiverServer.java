package src.com.test.java;

import com.test.java.proto.TransceiverGrpc;
import com.test.java.proto.TransceiverOuterClass;
import com.test.java.proto.TransmissionObjectOuterClass;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class TransceiverServer {
    private Server server;
    int port = 1234;

    private void start() throws IOException {
        server = ServerBuilder
                .forPort(port)
                .addService(new TransceiverService())
                .build()
                .start();
    }

    public static void main(String[] args) throws IOException {
        final TransceiverServer server = new TransceiverServer();
        server.start();
    }


    static class TransceiverService extends TransceiverGrpc.TransceiverImplBase {

        @Override
        public void echo(TransceiverOuterClass.EchoRequest request, StreamObserver<TransceiverOuterClass.EchoResponse> responseObserver) {
            TransmissionObjectOuterClass.TransmissionObject val = request.getFromClient();
            System.out.println("Client sends: " + val);
            TransceiverOuterClass.EchoResponse response = TransceiverOuterClass.EchoResponse.newBuilder()
                    .setFromServer(val)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}
