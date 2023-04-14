package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.service.Impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

   @Autowired
   private AlunoServiceImpl service;

   @PostMapping
   public Aluno create(@RequestBody AlunoForm form){ return service.create(form);}

   @GetMapping("/avaliacoes/{id}")
   public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id){
      return service.getAllAvalicaoFisicaId(id);
   }

   @GetMapping
   public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false)
      String dataDeNascemento){

      return service.getAll(dataDeNascemento);

   }

}
