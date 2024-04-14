package maratmingazovr.grpc_client.util;

import com.google.gson.Gson;
import maratmingazovr.grpc_client.dto.UserDto;
import maratmingazovr.grpc_common.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Utils {

    @Autowired
    public Gson gson;

    public UserDto convertToDto(User user) {
        return gson.fromJson(gson.toJson(user), UserDto.class);
    }

}
