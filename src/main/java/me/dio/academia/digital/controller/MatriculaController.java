package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.service.Impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;


    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form){ return service.clone(form); }


    @GetMapping
    public List<Matricula> getAll(@RequestParam(value = "bairro", required = false)String bairro) {
        return service.getAll(bairro);
    }
}
