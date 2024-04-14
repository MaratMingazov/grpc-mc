package maratmingazovr.grpc_client.service;

import maratmingazovr.grpc_client.dto.UserDto;

public interface UserClientService {

    UserDto getUser(int userId);
}
