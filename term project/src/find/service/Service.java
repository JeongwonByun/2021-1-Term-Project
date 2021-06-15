package find.service;


import java.util.ArrayList;

import find.dao.FindDAO;
import find.vo.ContentVO;

public class Service {
	private static Service service = new Service();
	private Service() {}
	private FindDAO dao = FindDAO.getInstance();
	public static Service getInstance()
	{
		return service;
	}
	public ContentVO Search(String title) {
		// TODO Auto-generated method stub
		ContentVO content = dao.Search(title);
		return content;
	}
	public boolean login(String id, String pwd) {
		// TODO Auto-generated method stub
		return dao.login(id, pwd);
	}
	public void Insert(ContentVO content) {
		// TODO Auto-generated method stub
		dao.Insert(content);
	}
	public void Update(ContentVO content) {
		// TODO Auto-generated method stub
		dao.Update(content);
	}
	public void Delete(String title) {
		// TODO Auto-generated method stub
		dao.Delete(title);
	}
	
	
	
}
