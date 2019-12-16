
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MainServlet2")
public class MainServret2 extends HttpServlet {

	public void init() {

		System.out.println("WebApp MainServret 起動しました。");


	}


    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{
    	forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{
    	forward(request, response);
    }

    protected void forward(HttpServletRequest request, HttpServletResponse response){

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/main2.jsp");
		//  フォワードによるページ遷移
		try {
			dispatcher.forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
    }
}


