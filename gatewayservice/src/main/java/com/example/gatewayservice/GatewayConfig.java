package com.example.gatewayservice;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

public class GatewayConfig {

	@Bean
	public RouteLocator getRouteLocator(RouteLocatorBuilder rout) {
		return rout.routes()
				.route(p->p.path("/movies/**").uri("lb://movieservice/"))
				.route(p->p.path("/customer/**").uri("lb://customerservice/")).build();
				
	}
}