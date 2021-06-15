package find.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import find.service.Service;
import find.vo.ContentVO;

public class SearchController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String title = request.getParameter("title");
		String job = request.getParameter("job");
		String path = null;
		if(job.equals("search"))
			path = "/Search.jsp";
		else if(job.equals("update"))
			path = "/Update.jsp";
		else if(job.equals("delete"))
			path = "/Delete.jsp";
		if(title.isEmpty()) {
			request.setAttribute("error", "검색어를 입력하시오.");
			HttpUtil.forward(request, response, path);
			return;
		}
		Service service = Service.getInstance();
		ContentVO content = service.Search(title);
		if(content == null)request.setAttribute("result", "작품 정보가 없습니다.");
		request.setAttribute("content", content);
		if(job.equals("search")) path="result/searchOutput.jsp";
		HttpUtil.forward(request, response, path);
	}

}
