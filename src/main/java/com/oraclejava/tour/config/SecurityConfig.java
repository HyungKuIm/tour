package com.oraclejava.tour.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@SuppressWarnings("deprecation")
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private UserDetailsService userDetailsService;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	//configure(HttpSecurity..)
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// 모든 링크에 대해 직접 접근 금지 및 로그인 링크 풀어줌
		http
			.csrf().disable()  // csrf 금지 해제
			.authorizeHttpRequests()
				.antMatchers("/login", "/css/**").permitAll()
				.antMatchers("/customers/create").permitAll()
				.anyRequest().authenticated();
		
		// 로그인 처리 구현
		http
			.formLogin()
				.loginProcessingUrl("/login")
				.loginPage("/login")
				.failureUrl("/login?error")
				.usernameParameter("userId")
				.passwordParameter("password")
				.defaultSuccessUrl("/", true);
		
		// 로그아웃 처리 구현
		http
			.logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
					.logoutUrl("/logout")
						.logoutSuccessUrl("/login");
	}
	
	//configure(AuthenticationManagerBuilder...)
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService)
			.passwordEncoder(passwordEncoder());
	}
}














