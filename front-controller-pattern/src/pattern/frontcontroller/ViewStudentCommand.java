package pattern.frontcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*This is command concrete class which will process as per the client request and forward it to the frontend controller.
 *
 *In this case, when execute() is called, StudentVO will be process and forward this studentVO object to next landing/view page
 */

public class ViewStudentCommand implements Command {

	@Override
	public String execute(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		StudentVO studentVO = new StudentVO(1, "SShukla154");
		httpServletRequest.setAttribute("studentDetails", studentVO);

		/* This will return to showStudentDetails.jsp */
		return "showStudentDetails";
	}

}
