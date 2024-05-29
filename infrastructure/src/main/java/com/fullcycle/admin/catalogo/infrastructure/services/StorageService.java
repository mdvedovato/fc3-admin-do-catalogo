package com.fullcycle.admin.catalogo.infrastructure.services;

import com.fullcycle.admin.catalogo.domain.resource.Resource;

import java.util.List;
import java.util.Optional;

public interface StorageService {

    void store(String id, Resource resource);

    void store(String id, com.fullcycle.admin.catalogo.domain.video.Resource resource);

    Optional<com.fullcycle.admin.catalogo.domain.video.Resource> get(String id);

    List<String> list(String prefix);

    void deleteAll(final List<String> ids);
}