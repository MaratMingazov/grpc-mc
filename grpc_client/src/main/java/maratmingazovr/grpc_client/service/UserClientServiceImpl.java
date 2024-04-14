package maratmingazovr.grpc_client.service;

import lombok.extern.log4j.Log4j2;
import lombok.val;
import maratmingazovr.grpc_client.dto.UserDto;

import maratmingazovr.grpc_client.util.Utils;
import maratmingazovr.grpc_common.UserServiceGrpc;
import maratmingazovr.grpc_common.GetUserRequest;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class UserClientServiceImpl implements UserClientService{

    @GrpcClient("grpc-service")
    private UserServiceGrpc.UserServiceBlockingStub client;

    @Override
    public UserDto getUser(int userId) {
        log.info("Processing GET request for user id: {}", userId);
        val userRequest = GetUserRequest.newBuilder().setId(userId).build();
        val user = client.getUser(userRequest);
        return Utils.convertToUserDto(user);
    }
}
