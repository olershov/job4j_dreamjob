package ru.job4j.dreamjob.service;

import net.jcip.annotations.ThreadSafe;
import org.springframework.stereotype.Service;
import ru.job4j.dreamjob.model.Post;
import ru.job4j.dreamjob.store.PostStore;
import java.util.Collection;

@ThreadSafe
@Service
public class PostService {

    private final PostStore store;

    public PostService(PostStore store) {
        this.store = store;
    }

    public Post add(Post post) {
        return store.add(post);
    }

    public Post findById(int id) {
        return store.findById(id);
    }

    public Post update(Post post) {
        return store.update(post);
    }

    public Collection<Post> findAll() {
        return store.findAll();
    }
}
