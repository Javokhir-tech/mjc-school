package com.epam.esm.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class Tag {
    private Long id;
    private String name;
    private List<GiftCertificate> certificates;
}
