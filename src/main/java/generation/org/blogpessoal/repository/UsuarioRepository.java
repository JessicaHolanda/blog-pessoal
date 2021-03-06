package generation.org.blogpessoal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import generation.org.blogpessoal.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public List<Usuario> findAllByNomeContainingIgnoreCase (String nome);
	public Optional<Usuario> findByUsuarioAndSenha(String usuario, String senha);
	public Optional<Usuario> findByUsuario(String usuario);
}
