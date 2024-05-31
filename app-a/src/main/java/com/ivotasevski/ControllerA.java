package com.ivotasevski;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class ControllerA {

    private final MessageService messageService;

    @PostMapping("/input")
    public void postInput(@RequestBody JsonNode input) {
      log.info("Received input through controller: <{}>", input);
      messageService.sendMessage("my-destination", input);
    }
}
