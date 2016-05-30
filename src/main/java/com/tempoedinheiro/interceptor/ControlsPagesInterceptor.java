package com.tempoedinheiro.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.tempoedinheiro.session.AdminAware;
import com.tempoedinheiro.session.UsuarioAware;

public class ControlsPagesInterceptor extends  HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String uri = request.getRequestURI();
		
		if(uri.equals("/home"))
			return true;
		
		if(uri.equals("/adminlogin"))
			return true;
		
		if(uri.equals("/usuariologin"))
			return true;
		
		if(uri.contains("/admin/")){
			if(AdminAware.existAdmin(request.getSession().getAttribute("usuario")))
				return true;
			else{
				response.sendRedirect("/adminlogin");
				return false;
			}
		}
		
		if(uri.contains("/usuario/")){
			if(UsuarioAware.existUsuario(request.getSession().getAttribute("usuario")))
				return true;
			else{
				response.sendRedirect("/usuariologin");
				return false;
			}
		}
		
		else{
			response.sendRedirect("/home");
			return false;
		}
	}
}
