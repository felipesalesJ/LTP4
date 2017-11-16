package br.com.livraria.filtro;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.net.httpserver.Filter.Chain;

public class FiltroLogin implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain filter) throws IOException, ServletException {
		HttpSession sess =  ((HttpServletRequest) req).getSession(false);
		
		HttpServletRequest httpServletRequest = (HttpServletRequest) req;
		String reqURI = httpServletRequest.getRequestURI();
		HttpSession sessao = httpServletRequest.getSession();
		boolean logginRequest = ((HttpServletRequest) req).getRequestURI().equals(reqURI);

		
		if(sessao.getAttribute("usuario") != null || logginRequest){
			filter.doFilter(req, resp);
		}else{
			((HttpServletResponse) resp).sendRedirect(reqURI);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
