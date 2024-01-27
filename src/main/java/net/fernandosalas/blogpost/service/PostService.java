package net.fernandosalas.blogpost.service;

import net.fernandosalas.blogpost.entity.Post;
import net.fernandosalas.blogpost.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPost();

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePost(long id);
}
