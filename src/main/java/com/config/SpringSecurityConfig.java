/*
 * package com.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.ComponentScan; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import org.springframework.security.core.userdetails.User;
 * import org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.provisioning.InMemoryUserDetailsManager;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity
 * 
 * @ComponentScan(basePackages = { "com.controller" })
 * 
 * public class SpringSecurityConfig {
 * 
 * @Bean public InMemoryUserDetailsManager userDetailsManager() {
 * 
 * UserDetails john =
 * User.builder().username("john").password("{noop}test123").roles("EMPLOYEE").
 * build();
 * 
 * UserDetails mary =
 * User.builder().username("mary").password("{noop}test123").roles("MANAGER").
 * build();
 * 
 * UserDetails susan =
 * User.builder().username("susan").password("{noop}test123").roles("ADMIN").
 * build();
 * 
 * return new InMemoryUserDetailsManager(john, mary, susan); }
 * 
 * }
 */