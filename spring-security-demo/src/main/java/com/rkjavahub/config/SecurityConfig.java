/**
 * 
 */
package com.rkjavahub.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author Rohit
 *
 */
@Configuration
public class SecurityConfig {
	
	// Default user authentication (use user as  username and password provided in console as password)
	/*
	 * @Bean SecurityFilterChain securityFilterChain(HttpSecurity http) throws
	 * Exception { http.authorizeHttpRequests(auths ->
	 * auths.anyRequest().authenticated()).httpBasic(withDefaults()); return
	 * http.build(); }
	 */

	@Bean
	InMemoryUserDetailsManager detailsManager() {
		@SuppressWarnings("deprecation")
		UserDetails userDetails = User.withDefaultPasswordEncoder().username("Rohit").password("solapur").roles("USER")
				.build();

		return new InMemoryUserDetailsManager(userDetails);

	}
}
