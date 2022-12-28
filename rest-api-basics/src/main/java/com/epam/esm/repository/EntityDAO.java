package com.epam.esm.repository;

import java.util.List;

public interface EntityDAO<T> {

    T saveEntity(T t);

    T getEntity(Long id);

    void deleteEntity(Long id);

    List<T> getEntities();
}
