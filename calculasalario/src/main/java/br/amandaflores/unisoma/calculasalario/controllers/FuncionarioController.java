package br.amandaflores.unisoma.calculasalario.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.amandaflores.unisoma.calculasalario.model.dto.FuncionarioDto;
import br.amandaflores.unisoma.calculasalario.model.services.FuncionarioService;

@RestController ("/api")
public class FuncionarioController {

	@Autowired
	private FuncionarioService funcionarioService;

	@GetMapping("/funcionario/{cpf}")
	public FuncionarioDto listar(@PathVariable String cpf) {
		
		return funcionarioService.listaFuncionario(cpf);
	}

	@PutMapping("/funcionario")
	public boolean listar(@RequestBody FuncionarioDto funcionarioDto) {
		
		return funcionarioService.adicionarFuncionario(funcionarioDto);
	}
	
	@GetMapping("/aumento/{cpf}")
	public FuncionarioDto calcularAumentoSalario(@PathVariable String cpf) {
		
		return funcionarioService.calcularAumento(cpf);
	}
	
	@GetMapping("/irpf/{cpf}")
	public FuncionarioDto calcularIrpf(@PathVariable String cpf) {
		
		return funcionarioService.calcularIrpf (cpf);
	}
}