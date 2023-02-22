package MyClient;
import TestServ.MyServ;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.net.URL;  

import javax.xml.namespace.QName;  
import javax.xml.ws.Service; 
/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=res.getWriter();
	    res.setContentType("text/html");
	    String user=req.getParameter("First");
	    String user1=req.getParameter("Second");
	    //pw.println("Login Success...!");
	    //"DB objDB = new DB();
	    
	    //if(user.equals("test") && pass.equals("test"))
	    URL url = new URL("http://localhost:8888/testWS?wsdl");  
	    
        //1st argument service URI, refer to wsdl document above  
    //2nd argument is service name, refer to wsdl document above  
        QName qname = new QName("http://TestServ/", "MyServService");  
        Service service = Service.create(url, qname);  
        MyServ hello = service.getPort(MyServ.class);  
        String str = hello.sayHello("Mr. ");
        
	     StringBuilder sb = new StringBuilder();
	    sb.append(str);
	    sb.append(user);
	    sb.append(" ");
	    sb.append(user1);
	    String str1 = sb.toString();
	    pw.println(str1);
	}

}
