package com.epam.esm.api;

import com.epam.esm.domain.GiftCertificate;
import com.epam.esm.service.GiftCertificateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/certificates")
@RequiredArgsConstructor
public class GiftCertificateController {

    private final GiftCertificateService giftCertificateService;

    @GetMapping("/{id}")
    public ResponseEntity<GiftCertificate> getGiftCertificate(@PathVariable("id") Long id) {
        return ResponseEntity.ok(giftCertificateService.getEntity(id));
    }

    @GetMapping
    public ResponseEntity<List<GiftCertificate>> getGiftCertificates() {
        return ResponseEntity.ok(giftCertificateService.getEntities());
    }

    @PostMapping
    public ResponseEntity<GiftCertificate> createGiftCertificate(@RequestBody GiftCertificate GiftCertificate) {
        return ResponseEntity.ok(giftCertificateService.saveEntity(GiftCertificate));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGiftCertificate(@PathVariable("id") Long id) {
        giftCertificateService.deleteEntity(id);
        return ResponseEntity.noContent().build();
    }
}
