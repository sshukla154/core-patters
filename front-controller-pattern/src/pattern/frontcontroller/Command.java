package pattern.frontcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {

	String execute(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse);
	
}
