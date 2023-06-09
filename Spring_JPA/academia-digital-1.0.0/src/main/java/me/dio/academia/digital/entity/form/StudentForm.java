package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentForm {

  @NotEmpty(message = "Invalid answer!")
  @Size(min = 3, max = 50, message = "${validatedValue}'s lentgh needs to be between {min} and {max}.")
  private String name;

  @NotEmpty(message = "Invalid answer!")
  @CPF(message = "${validatedValue} is invalid!")
  private String cpf;

  @NotEmpty(message = "Invalid answer!")
  @Size(min = 3, max = 50, message = "${validatedValue}'s lentgh needs to be between {min} and {max}.")
  private String neighborhood;

  @NotNull
  @Past(message = "Date ${validatedValue} is invalid!")
  private LocalDate dateOfBirth;
}
