package br.fatec.agenda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.fatec.agenda.model.Contato;
import br.fatec.agenda.repositories.ContatoRepository;

@Service
public class ContatoService implements ServiceInterface<Contato> {
	
	@Autowired
	private ContatoRepository repository;

	@Override
	public Contato create(Contato obj) {
		return repository.save(obj);
	}

	@Override
	public Contato findById(Long id) {
		
		Optional<Contato> _contato = repository.findById(id);
		return _contato.orElse(null);
	}

	@Override
	public List<Contato> findAll() {
		return repository.findAll();
	}

	@Override
	public boolean update(Contato obj) {
		if (repository.existsById(obj.getId())) {
			repository.save(obj);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Long id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return true;
		}
		return false;
	}

}
