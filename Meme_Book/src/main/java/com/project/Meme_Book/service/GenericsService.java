package com.project.Meme_Book.service;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface GenericsService {
    public <T> void save(T p);

    public <T> List<T> findAll();

    public <T> Object findById(Integer id);


}
