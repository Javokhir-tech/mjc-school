package com.epam.esm.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Tag {

    private Long id;
    private String name;
    private List<GiftCertificate> certificates;
}
