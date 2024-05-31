package com.ivotasevski;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component("MyQueueMessageConsumerOne")
@Slf4j
public class MyQueueMessageConsumerOne implements Consumer<JsonNode> {

    @Override
    public void accept(JsonNode payload) {
        log.info("MyQueueMessageConsumerOne consumed message: {}", payload);
    }
}
