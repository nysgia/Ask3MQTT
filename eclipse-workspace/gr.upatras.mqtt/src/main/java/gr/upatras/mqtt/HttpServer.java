package gr.upatras.mqtt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HttpServer {

    public static void main(String[] args) {
        SpringApplication.run(HttpServer.class, args);
    }
}

@RestController
@RequestMapping("/post")
class MyController {
    @PostMapping
    public String handlePostRequest(@RequestBody String text) {
        // Publish the text via MQTT
        MqttPublisher.publishText(text);

        return "Topic:" + MqttPublisher.topic + "\nFinals Score Prediction: " + text;
    }
}
