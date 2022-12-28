package com.epam.esm.repository.impl;

import com.epam.esm.domain.Tag;
import com.epam.esm.repository.TagDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TagDaoImpl implements TagDAO {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public Tag saveEntity(Tag tag) {
        jdbcTemplate.update("INSERT INTO tags(name) VALUES(" + tag.getName() + ")");
        return tag;
    }

    @Override
    public Tag getEntity(Long id) {
        return jdbcTemplate.queryForObject("SELECT * from tags WHERE id = ?", new BeanPropertyRowMapper<>(Tag.class), id);
    }

    @Override
    public void deleteEntity(Long id) {
        jdbcTemplate.update("DELETE FROM tags WHERE id = " + id);
    }

    @Override
    public List<Tag> getEntities() {
        return jdbcTemplate.query("SELECT * FROM tags",
                (rs, row) -> {
            Tag tag = new Tag();
            tag.setId(rs.getLong("id"));
            tag.setName(rs.getString("name"));
            return tag;
        });
    }
}
