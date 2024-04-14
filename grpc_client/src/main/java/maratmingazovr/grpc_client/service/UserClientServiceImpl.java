package maratmingazovr.grpc_client.service;

import lombok.extern.log4j.Log4j2;
import maratmingazovr.grpc_client.dto.UserDto;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class UserClientServiceImpl implements UserClientService{

    @Override
    public UserDto getUser(int userId) {
        log.info("Processing GET request for user id: {}", userId);
        return null;
    }
}
