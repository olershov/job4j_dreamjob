package ru.job4j.dreamjob.service;

import ru.job4j.dreamjob.model.Post;
import ru.job4j.dreamjob.store.PostStore;

import java.util.Collection;

public class PostService {

    private static final PostService INST = new PostService();
    private final PostStore store;

    private PostService() {
        store = PostStore.instOf();
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

    public static PostService instOf() {
        return INST;
    }
}
