package net.fernandosalas.blogpost.service;

import net.fernandosalas.blogpost.entity.Post;
import net.fernandosalas.blogpost.payload.PostDto;
import net.fernandosalas.blogpost.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    List<PostDto> searchPosts(String query);

    void deletePost(long id);
}
