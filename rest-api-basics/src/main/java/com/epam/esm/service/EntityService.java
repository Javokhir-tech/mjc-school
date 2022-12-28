package com.epam.esm.service;

import java.util.List;

public interface EntityService<T> {

    T saveEntity(T t);

    T getEntity(Long id);

    void deleteEntity(Long id);

    List<T> getEntities();
}
