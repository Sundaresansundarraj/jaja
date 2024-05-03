// package com.example.api.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.oauth2.jwt.ReactiveJwtDecoder;
// import org.springframework.security.oauth2.jwt.NimbusReactiveJwtDecoder;
// import org.springframework.web.reactive.function.client.WebClient;

// @Configuration
// public class JwtConfig {

//     @Bean
//     public ReactiveJwtDecoder reactiveJwtDecoder() {
//         return NimbusReactiveJwtDecoder
//                 .withJwkSetUri("http://localhost:8181/realms/sundifafa/protocol/openid-connect/token")
//                 .webClient(webClient())
//                 .build();
//     }

//     private WebClient webClient() {
//         return WebClient.builder().build();
//     }
// }

