package com.rakuten.internship.service;

import com.rakuten.internship.entity.Tag;
import com.rakuten.internship.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TagService {

    @Autowired
    private TagRepository tagRepository;

    public List<Tag> findTags() {
        return tagRepository.findAll();
    }

    public Tag findByName(int id) {
        return tagRepository.findBytagId(id);
    }

    public Tag save(Tag tag) {
        return tagRepository.save(tag);
    }

    public Tag findByTagId(Integer tagId) {
        return tagRepository.findBytagId(tagId);
    }

}
