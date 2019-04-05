package br.com.mtools.security.confing;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//definido acesso aos ambientes 
		http.csrf().disable().authorizeRequests().antMatchers(HttpMethod.GET,"/").permitAll()
		.anyRequest().authenticated()
		//acesso ao form login
		.and().formLogin().permitAll()
		//acesso de logout e pagina para isso
		.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//Authentificação usuario e senha
		auth.inMemoryAuthentication()
		.withUser("mtools").password("ASNO").roles("ADMIN");
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		//Não bloqueia CSS e JS da vida 
		web.ignoring().antMatchers("/style/**");
	}
	
	
}
