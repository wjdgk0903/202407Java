package Board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL 패턴 매핑
@WebServlet("/savePost")
public class SavePostServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 폼 데이터 가져오기
        String title = request.getParameter("title");
        String writer = request.getParameter("writer");
        String content = request.getParameter("content");

        // 게시글 저장 로직
        // 예: PostDAO.save(new Post(title, writer, content));
        // 여기서는 데이터베이스 작업을 직접 구현해야 합니다.

        // 게시글 저장 후 게시글 목록 페이지로 리디렉션
        response.sendRedirect("listPosts");
    }
}
