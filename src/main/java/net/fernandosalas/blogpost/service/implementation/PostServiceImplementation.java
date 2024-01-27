package net.fernandosalas.blogpost.service.implementation;

import lombok.AllArgsConstructor;
import net.fernandosalas.blogpost.entity.Post;
import net.fernandosalas.blogpost.payload.PostDto;
import net.fernandosalas.blogpost.repository.PostRepository;
import net.fernandosalas.blogpost.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PostServiceImplementation implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = modelMapper.map(postDto, Post.class);
        Post newPost = postRepository.save(post);
        return modelMapper.map(newPost, PostDto.class);
    }
}
