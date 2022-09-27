package ru.students.test_rest_students.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.students.test_rest_students.model.Request;
import ru.students.test_rest_students.model.Response;
import ru.students.test_rest_students.service.ForwardMessage;
import ru.students.test_rest_students.service.MyService;

@RestController
public class MyController {
    private final MyService myService;
    private final ForwardMessage forwardMessage;

    public MyController(MyService myService, ForwardMessage forwardMessage) {
        this.myService = myService;
        this.forwardMessage = forwardMessage;
    }


    @PostMapping(value = "/feedback")
    public ResponseEntity<Response> feedback(@RequestBody Request request){

        Response response = Response.builder()
                .uid(request.getUid())
                .operationUid(request.getOperationUid())
                .systemTime(request.getSystemTime())
                .code("success")
                .errorCode("")
                .errorMessage("")
                .build();
        Response autoModify = myService.execute(response);
        Response sendMsg = forwardMessage.sendMessage(autoModify);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
