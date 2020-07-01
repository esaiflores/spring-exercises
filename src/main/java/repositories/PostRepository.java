package repositories;

import com.codeup.spring.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    Post findByTitle(String post_to_be_deleted);
}
