package find.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import find.service.Service;

public class DeleteController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String title = request.getParameter("title");
		Service service = Service.getInstance();
		service.Delete(title);
		HttpUtil.forward(request, response, "/result/DeleteOutput.jsp");
	}

}
