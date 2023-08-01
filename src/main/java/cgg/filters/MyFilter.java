package cgg.filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyFilter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain fc)
			throws IOException, ServletException {
		System.out.println("Before Servlet");
		
		//Pre-processing Logic...
		//...
		//...
		
		fc.doFilter(req, resp);
		
		System.out.println("After Servlet");
		
		//Post-processing Logic....
		//..
		
	}

}
