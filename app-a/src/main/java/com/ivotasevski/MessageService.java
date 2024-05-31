package com.ivotasevski;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MessageService {

    private final StreamBridge streamBridge;

    public void sendMessage(String destination, Object payload) {
        streamBridge.send(destination, payload);
        log.info("Message <{}> send to {}", payload, destination);
    }
}
