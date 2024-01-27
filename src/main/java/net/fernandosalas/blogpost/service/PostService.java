package net.fernandosalas.blogpost.service;

import net.fernandosalas.blogpost.payload.PostDto;

public interface PostService {
    PostDto createPost(PostDto postDto);
}
