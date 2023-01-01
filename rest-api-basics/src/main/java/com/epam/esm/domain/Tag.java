package com.epam.esm.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Tag {

    private Long id;
    private String name;

    @ToString.Exclude
    private List<GiftCertificate> certificates;
}
