package me.dio.academia.digital.service.Impl;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.repository.AvaliacaoFisicaRepository;
import me.dio.academia.digital.service.IAvaliacaoFisicaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    private AlunoRepository alunoRepository;



    @Override
    public AvaliacaoFisica create (AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica(  );
        Aluno aluno = (Aluno) alunoRepository.findAllById( Collections.singleton( form.getAlunoId( ) ) );

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso( ));
        avaliacaoFisica.setAltura(form.getAltura( ));

        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica get (Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll () {
        return null;
    }

    @Override
    public AvaliacaoFisica update (Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete (Long id) {

    }

    public void setAvaliacaoFisicaRepository (AvaliacaoFisicaRepository avaliacaoFisicaRepository) {
        this.avaliacaoFisicaRepository = avaliacaoFisicaRepository;
    }

    public void setAlunoRepository (AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }
}
