package net.fernandosalas.blogpost.repository;

import net.fernandosalas.blogpost.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
