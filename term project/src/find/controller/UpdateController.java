package find.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import find.service.Service;
import find.vo.ContentVO;

public class UpdateController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//HttpSession session = request.getSession();
		//String title = (String)session.getAttribute("title");
		
		String title = request.getParameter("title");
		String dir = request.getParameter("dir");
		String cast1 = request.getParameter("cast1");
		String cast2 = request.getParameter("cast2");
		String genre = request.getParameter("genre");
		String year = request.getParameter("year");
		String rate = request.getParameter("rate");
		String info = request.getParameter("info");
		String ott = request.getParameter("ott");
		
		ContentVO content = new ContentVO();
		content.setTitle(title);
		content.setDir(dir);
		content.setCast1(cast1);
		content.setCast2(cast2);
		content.setGenre(genre);
		content.setYear(year);
		content.setRate(rate);
		content.setInfo(info);
		content.setOtt(ott);
		
		Service service = Service.getInstance();
		service.Update(content);
		
		request.setAttribute("title", title);
		HttpUtil.forward(request, response, "/result/UpdateOutput.jsp");
	}

}


