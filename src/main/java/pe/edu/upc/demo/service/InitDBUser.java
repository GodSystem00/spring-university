package pe.edu.upc.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import pe.edu.upc.demo.model.Usuario;
import pe.edu.upc.demo.repository.AuthorityRepository;
import pe.edu.upc.demo.repository.UsuarioRepository;

@Service
public class InitDBUser implements CommandLineRunner {
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private AuthorityRepository authorityRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public void run(String... args) throws Exception {

		/*this.usuarioRepository.deleteAll();
		this.authorityRepository.deleteAll();
		Usuario juan = new Usuario();		
		juan.setUsername("juan");
		juan.setPassword(passwordEncoder.encode("juan"));
		juan.setEnable(true);
		
		Usuario admin = new Usuario();
		admin.setUsername("admin");
		admin.setPassword(passwordEncoder.encode("admin"));
		admin.setEnable(true);
		
		Usuario manager = new Usuario();
		manager.setUsername("manager");
		manager.setPassword(passwordEncoder.encode("manager"));
		manager.setEnable(true);
		
		
		juan.addAuthority("ROLE_USER");
		admin.addAuthority("ROLE_ADMIN");
		admin.addAuthority("ACCESS_REST1");
		admin.addAuthority("ACCESS_REST2");
		manager.addAuthority("ROLE_MANAGER");
		manager.addAuthority("ACCESS_REST1");
		
		List<Usuario> usuarios = Arrays.asList(juan, admin, manager);
		this.usuarioRepository.saveAll(usuarios);*/
	}
}
