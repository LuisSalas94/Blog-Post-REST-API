package net.fernandosalas.blogpost.service;

import net.fernandosalas.blogpost.payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(CommentDto commentDto, long postId);

    List<CommentDto> getCommentsByPostId(long postId);

    CommentDto getCommentById(long postId, long commentId);

    CommentDto updateComment(long postId, long commentId, CommentDto commentDto);

    void deleteComment(long postId, long commentId);
}
