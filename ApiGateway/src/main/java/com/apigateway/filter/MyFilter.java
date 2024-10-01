package com.apigateway.filter;

import java.util.List;
import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import io.netty.handler.codec.http.HttpHeaders;
import reactor.core.publisher.Mono;

@Component
public class MyFilter implements GlobalFilter{

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		// TODO Auto-generated method stub
//		System.out.println("API Filter executed");
//		
//		ServerHttpRequest request =exchange.getRequest();
//		org.springframework.http.HttpHeaders headers= request.getHeaders();
//		
//		Set<String> keySet = headers.keySet();
//		
//		if(!keySet.contains("secret")) {
//			throw new RuntimeException("Invalid request");
//		}
//		
//		List<String> list=headers.get("secret");
//		
//		if(!list.get(0).equals("Saiprasad@10")) {
//			throw new RuntimeException("Invalid request");
//		}
		
		return chain.filter(exchange);
	}

}
