package org.example.testreactive;

import org.example.testreactive.model.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class TestReactiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestReactiveApplication.class, args);

        String url = "https://api.twelvedata.com/time_series?symbol=AAPL&interval=1day&apikey=demo";

        WebClient.Builder builder = WebClient.builder();

        Course course = builder.build()
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(Course.class)
                .block();

        System.out.println("------------------------------");
        System.out.println(course);
        System.out.println("------------------------------");
    }

}
