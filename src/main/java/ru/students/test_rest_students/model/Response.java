package ru.students.test_rest_students.model;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
public class Response {

   private String uid;
   private String operationUid;
   private String systemTime;
   private String code;
   private String errorCode;
   private String errorMessage;

}
