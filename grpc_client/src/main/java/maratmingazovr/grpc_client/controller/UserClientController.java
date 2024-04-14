package maratmingazovr.grpc_client.controller;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import maratmingazovr.grpc_client.dto.UserDto;
import maratmingazovr.grpc_client.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Log4j2
@Validated
@RestController
@RequestMapping("/grpc")
@AllArgsConstructor
public class UserClientController {

    private final UserClientService userClientService;

    @GetMapping("/users/{id}")
    public ResponseEntity<UserDto> get(
            @PathVariable("id") @NotNull @Positive(message = "User id must be greater than 0") int id
    ) {
        log.info("Received request for user with id: {}", id);
        return ResponseEntity.ok(userClientService.getUser(id));
    }



}
