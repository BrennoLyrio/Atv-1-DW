package com.autobots.automanager.controles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autobots.automanager.entidades.Endereco;
import com.autobots.automanager.repositorios.EnderecoRepositorio;

@RestController
@RequestMapping("/endereco")
public class EnderecoControle {
	@Autowired
	private EnderecoRepositorio repositorio;
	
	@GetMapping("/endereco/{id}")
	public Endereco obterEndereco(@PathVariable long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	@GetMapping("/enderecos")
	public List<Endereco> obterEnderecos() {
		return repositorio.findAll();
	}
	
	@PostMapping("/cadastro")
	public void cadastrarEndereco(@RequestBody Endereco endereco) {
		repositorio.save(endereco);
	}
	
	@PutMapping("/atualizar")
	public void atualizarEndereco(@RequestBody Endereco atualizacao) {
		Endereco endereco = repositorio.getById(atualizacao.getId());
		endereco.setBairro(atualizacao.getBairro());
		endereco.setCidade(atualizacao.getCidade());
		endereco.setRua(atualizacao.getRua());
		endereco.setNumero(atualizacao.getNumero());
		endereco.setEstado(atualizacao.getEstado());
		endereco.setCodigoPostal(atualizacao.getCodigoPostal());
		endereco.setInformacoesAdicionais(atualizacao.getInformacoesAdicionais());
		repositorio.save(endereco);
	}
	
	@DeleteMapping("/excluir")
	public void excluirEndereco(@RequestBody Endereco exclusao) {
		Endereco endereco = repositorio.getById(exclusao.getId());
		repositorio.delete(endereco);
	}
	
	
	
}
