package ru.students.test_rest_students.service;

import org.springframework.stereotype.Service;
import ru.students.test_rest_students.model.Response;
@Service
public class ModifyUid implements MyService{

    @Override
    public Response execute(Response responce) {

        responce.setUid("NewID");
        return responce;
    }
}
