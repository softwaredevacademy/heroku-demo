package se.kth.sda.skeleton.posts;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @PostMapping("/posts")
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(postRepository.save(post));
    }

    @GetMapping("/posts")
    public ResponseEntity<List<Post>> listAllPosts() {
        return ResponseEntity
                .ok(postRepository.findAll());
    }
}
