package generation.org.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import generation.org.blogpessoal.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long>{
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);

}
