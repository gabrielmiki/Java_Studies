package me.dio.academia.digital.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class RegistrationForm {

  @NotNull(message = "Invalid Data!")
  @Positive(message = "The student's Id needs to be Positive!")
  private Long studentId;

}
