package ru.students.test_rest_students.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.core.SpringVersion;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
public class Request {

    @NotBlank
    @Size(max = 32)
    private String uid;

    @NotBlank
    @Size(max = 32)
    private String OperationUid;

    private  String systemName;

    @NotBlank
    private String SystemTime;

    private String source;

    private Integer communicationId;
    private Integer templateId;

    @Max(7)
    private Integer productCode;

    @Max(5)
    private Integer smsCode;


}
