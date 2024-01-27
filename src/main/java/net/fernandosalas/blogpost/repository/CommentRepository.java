package net.fernandosalas.blogpost.repository;

import net.fernandosalas.blogpost.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
