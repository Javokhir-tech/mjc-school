package com.epam.esm.service.impl;

import com.epam.esm.domain.GiftCertificate;
import com.epam.esm.repository.GiftCertificateDAO;
import com.epam.esm.service.GiftCertificateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GiftServiceImpl implements GiftCertificateService {

    private final GiftCertificateDAO giftCertificateDAO;

    @Override
    public GiftCertificate saveEntity(GiftCertificate giftCertificate) {
        return giftCertificateDAO.saveEntity(giftCertificate);
    }

    @Override
    public GiftCertificate getEntity(Long id) {
        return giftCertificateDAO.getEntity(id);
    }

    @Override
    public void deleteEntity(Long id) {
        giftCertificateDAO.deleteEntity(id);
    }

    @Override
    public List<GiftCertificate> getEntities() {
        return giftCertificateDAO.getEntities();
    }
}
