package maratmingazovr.grpc_server.controller;

import io.grpc.stub.StreamObserver;
import lombok.extern.log4j.Log4j2;
import lombok.val;
import maratmingazovr.grpc_common.GetUserRequest;
import maratmingazovr.grpc_common.User;
import maratmingazovr.grpc_common.UserServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;

@Log4j2
@GrpcService
public class UserServiceController extends UserServiceGrpc.UserServiceImplBase{

    @Override
    public void getUser(GetUserRequest request, StreamObserver<User> responseObserver) {

        val userId = request.getId();
        val user = User.newBuilder().setId(userId).setName("User"+userId).build();
        responseObserver.onNext(user);
        responseObserver.onCompleted();
    }
}
