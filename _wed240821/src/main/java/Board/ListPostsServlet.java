package Board;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL 패턴 매핑
@WebServlet("/listPosts")
public class ListPostsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 게시글 목록을 가져오는 로직
        // 예: List<Post> posts = PostDAO.getAllPosts();
        // 여기서는 데이터베이스 작업을 직접 구현해야 합니다.

        // 예시 데이터 (실제 데이터베이스 작업으로 대체해야 함)
        List<Post> posts = PostDAO.getAllPosts();  // PostDAO는 게시글을 데이터베이스에서 가져오는 클래스입니다.

        // 게시글 목록을 JSP에 전달
        request.setAttribute("msgList", posts);

        // 게시글 목록 페이지로 포워딩
        request.getRequestDispatcher("Board2.jsp").forward(request, response);
    }
}