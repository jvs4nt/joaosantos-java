package com._tdspr.joaosantos.gateways;

import com._tdspr.joaosantos.domains.Aluno;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @GetMapping("/fiap")
    public ResponseEntity<String> getAlunos() {
        return ResponseEntity.ok("Hello World!");
    }
    @GetMapping("/fiap/{alunoId}")
    public ResponseEntity<String> getAluno(@PathVariable String alunoId) {
        return ResponseEntity.ok("Hello World! O id do aluno é: " + alunoId);
    }

    @PostMapping("/fiap")
    public ResponseEntity<Aluno> postaluno(@RequestBody Aluno aluno) {
        Aluno alunoAtualizado = new Aluno();
        alunoAtualizado.setRm("12345");
        alunoAtualizado.setRegistro(aluno.getRegistro());
        return ResponseEntity.ok(alunoAtualizado);
    }
}
