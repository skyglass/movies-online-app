package skyglass.composer.movie.config;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.keycloak.adapters.springsecurity.authentication.KeycloakAuthenticationProvider;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.authority.mapping.SimpleAuthorityMapper;

@Configuration
public class KeycloakAdminConfig {

	@Value("${keycloak.auth-server-url}")
	private String keycloakServerUrl;

	@Bean
	Keycloak keycloakAdmin() {
		return KeycloakBuilder.builder()
				.serverUrl(keycloakServerUrl)
				.realm("master")
				.username("admin")
				.password("admin")
				.clientId("admin-cli")
				.build();
	}

	@Bean
	public KeycloakSpringBootConfigResolver keycloakConfigResolver() {
		return new KeycloakSpringBootConfigResolver();
	}

}
