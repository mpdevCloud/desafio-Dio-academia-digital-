package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {


  @NotBlank(message = "Preecha corretamente.")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String nome;

  @NotBlank(message = "Preecha corretamente.")
  @CPF(message = "'${validatedValue}' é invalido!")
  private String cpf;

  @NotBlank(message = "Preecha corretamente.")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String bairro;


  @NotNull(message = "Preecha corretamente.")
  @Past(message = "Data '${validatedValue}' é invalida.")
  private LocalDate dataDeNascimento;
}
