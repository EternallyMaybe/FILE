package testServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<String> usernames = Arrays.asList("aaa","bbb","ccc");
		
        String username = request.getParameter("username");
        System.out.print(username);
		String result = null;
		if(usernames.contains(username)){
			result = "<font color='red'>���û����ѱ�ʹ��</font>";
		}
		else{
			result = "<font color='green'>���û�������ʹ��</font>";
		}
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter  out = response.getWriter();
		out.print(result);
		out.flush();
	    out.close();
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException {
		
		List<String> usernames = Arrays.asList("aaa","bbb","ccc");
		response.setContentType("text/html");//���÷��͵��ͻ��˵���Ӧ����������Ϊhtml
	    response.setCharacterEncoding("utf-8");//�����ַ�����ʽ
	    PrintWriter out=response.getWriter();//������Ӧ���ͻ���,response�����ڵ�ǰhttp�����У���Request���Ӧ
	    //��ȡҳ�����
		String username = request.getParameter("username");
		String result = null;
		if(usernames.contains(username)){
			result = "<font color='red'>���û����ѱ�ʹ��</font>";
		}
		else{
			result = "<font color='green'>���û�������ʹ��</font>";
		}
		out.print(result);
        out.flush();
        out.close();
	}
}
