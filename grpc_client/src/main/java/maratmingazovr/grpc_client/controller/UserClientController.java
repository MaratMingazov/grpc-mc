package maratmingazovr.grpc_client.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import maratmingazovr.grpc_client.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@Validated
@RestController
@RequestMapping("/grpc")
@AllArgsConstructor
public class UserClientController {

    private final UserClientService userClientService;



}
