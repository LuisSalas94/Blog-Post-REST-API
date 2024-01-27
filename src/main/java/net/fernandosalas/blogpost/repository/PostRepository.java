package net.fernandosalas.blogpost.repository;

import net.fernandosalas.blogpost.entity.Post;
import net.fernandosalas.blogpost.payload.PostDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    @Query("SELECT p FROM Post p WHERE " +
            "p.title LIKE CONCAT('%', :query, '%') OR " +
            "p.description LIKE CONCAT('%', :query, '%') OR " +
            "p.content LIKE CONCAT('%', :query, '%')")
    List<Post> searchPosts(String query);
}
