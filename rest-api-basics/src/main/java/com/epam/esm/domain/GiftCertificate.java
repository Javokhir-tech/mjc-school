package com.epam.esm.domain;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class GiftCertificate {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private Long duration;
    private LocalDateTime createDate;
    private LocalDateTime lastUpdateDate;
    private List<Tag> tags;
}
