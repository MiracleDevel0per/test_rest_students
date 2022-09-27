package ru.students.test_rest_students.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.students.test_rest_students.model.Response;

@Service
public class ForwardMMg implements ForwardMessage {

    @Override
    public Response sendMessage(Response responce) {
        RestTemplate restTemplate = new RestTemplate();
        String Url = "http://localhost:5555/feedback";
        restTemplate.postForLocation(Url, responce);
        return null;
    }
}
