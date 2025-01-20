package crm02.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="ProductServlet",urlPatterns = {"/ProductServlet"})
public class ProductServlet extends HttpServlet {
	 List<Product> productList = new ArrayList<>();
	    private int idCounter = 1;
	    @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        // Chuyển tiếp yêu cầu tới trang index.jsp
	        request.setAttribute("products", productList);
	        request.setAttribute("idCounter", idCounter++);
	        request.getRequestDispatcher("index.jsp").forward(request, response);
	    }

	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String name = request.getParameter("name");
	        int quantity = Integer.parseInt(request.getParameter("quantity"));
	        int price = Integer.parseInt(request.getParameter("price"));
	        
	        Product product = new Product(name, quantity, price);
	        productList.add(product);
	        System.out.println(productList.toString());
	        request.setAttribute("products", productList);
	        request.getRequestDispatcher("index.jsp").forward(request, response);
	    }
}
