package com.epam.esm.repository.impl;

import com.epam.esm.domain.GiftCertificate;
import com.epam.esm.repository.GiftCertificateDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class GiftCertificateDaoImpl implements GiftCertificateDAO {
    private final JdbcTemplate jdbcTemplate;


    @Override
    public GiftCertificate saveEntity(GiftCertificate gC) {
        var query = String.format(
                "INSERT INTO certificates(name, description, price, duration, create_date, last_update_date) " +
                "VALUES (%s, %s, %s, %s, %s, %s)",
                gC.getName(), gC.getDescription(), gC.getPrice(), gC.getDuration(), LocalDateTime.now(), LocalDateTime.now());
        jdbcTemplate.update(query);
        return gC;
    }

    @Override
    public GiftCertificate getEntity(Long id) {
        return jdbcTemplate.queryForObject("SELECT * from certificates WHERE id = ?",
                new BeanPropertyRowMapper<>(GiftCertificate.class), id);
    }

    @Override
    public void deleteEntity(Long id) {
        jdbcTemplate.update("DELETE FROM certificates WHERE id = " + id);
    }

    @Override
    public List<GiftCertificate> getEntities() {
        return jdbcTemplate.query("SELECT * FROM tags",
                (rs, row) -> {
                    GiftCertificate certificate = new GiftCertificate();
                    certificate.setId(rs.getLong("id"));
                    certificate.setName(rs.getString("name"));
                    certificate.setDescription(rs.getString("description"));
                    certificate.setPrice(rs.getDouble("price"));
                    certificate.setDuration(rs.getLong("duration"));
                    certificate.setCreateDate(rs.getTimestamp("create_date").toLocalDateTime());
                    certificate.setLastUpdateDate(rs.getTimestamp("last_update_date").toLocalDateTime());
                    return certificate;
                });
    }
}
