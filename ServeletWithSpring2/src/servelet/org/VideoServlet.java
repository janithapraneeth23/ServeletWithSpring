package servelet.org;

import java.io.IOException;
import java.io.PrintWriter;
import servelet.org.Video;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VideoServlet
 */
@WebServlet("/VideoServlet")
public class VideoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ArrayList<Video> videos = new ArrayList<Video>();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String url = request.getParameter("url");
		
		Video v3 = new Video(name, url);
		videos.add(v3);
		response.getWriter().write("Video Added");
		
		response.setContentType("text/plain");
		Video v2 = new Video("janitha", "HI");
		videos.add(v2);
		
		PrintWriter sendToClient = response.getWriter();
		for(Video v: this.videos) {
			sendToClient.write(v.getName() + ":" + v.getURL()+ "\n");
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String url = request.getParameter("url");
		
		Video v = new Video(name, url);
		videos.add(v);
		response.getWriter().write("Video Added");
		
	}
}
