package com.epam.esm.service.impl;

import com.epam.esm.domain.Tag;
import com.epam.esm.repository.TagDAO;
import com.epam.esm.service.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService {

    private final TagDAO tagDAO;

    @Override
    public Tag saveEntity(Tag tag) {
        return tagDAO.saveEntity(tag);
    }

    @Override
    public Tag getEntity(Long id) {
        return tagDAO.getEntity(id);
    }

    @Override
    public void deleteEntity(Long id) {
        tagDAO.deleteEntity(id);
    }

    @Override
    public List<Tag> getEntities() {
        return tagDAO.getEntities();
    }
}
