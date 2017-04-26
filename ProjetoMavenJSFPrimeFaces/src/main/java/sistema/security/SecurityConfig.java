package sistema.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import sistema.modelos.Usuario;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	AuthenticationManagerBuilder auth;

	@Autowired
	public void configureGlobal() throws Exception {
		auth.inMemoryAuthentication().withUser("adm").password("123").roles("ADM");
	}

	public void addUser(Usuario user) throws Exception {
		auth.inMemoryAuthentication().withUser(user.getIdString()).password(user.getSenha()).roles("USER");
	}

	// @Override
	protected void configure(HttpSecurity http) throws Exception {

		// Controle feito pelo JSF
		http.csrf().disable();

		// Página de acesso negado
		http.exceptionHandling().accessDeniedPage("/acessonegado.xhtml");

		// Libera todos os recursos do JSF
		http.authorizeRequests().antMatchers("/javax.faces.resource/**").permitAll();
		http.authorizeRequests().antMatchers("/pages/**").permitAll();
		http.authorizeRequests().antMatchers("/login.xhtml").permitAll();
		
		// Login
		http.formLogin().loginPage("/login.xhtml").permitAll().defaultSuccessUrl("/pages/inicio.xhtml", true)
				.failureUrl("/login.xhtml?error=true").usernameParameter("username").passwordParameter("password");
		
		// Logout
		http.logout().logoutUrl("/logout").logoutSuccessUrl("/login.xhtml");

		// Todas as requisições para partes internas da aplicação devem ser
		// autenticadas
		http.authorizeRequests().anyRequest().authenticated();

	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**");
		web.ignoring().antMatchers("/javax.faces.resource/**");
	}
}
