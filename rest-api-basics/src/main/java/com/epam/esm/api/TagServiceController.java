package com.epam.esm.api;

import com.epam.esm.domain.Tag;
import com.epam.esm.service.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tags")
@RequiredArgsConstructor
public class TagServiceController {

    private final TagService tagService;

    @GetMapping("/{id}")
    public ResponseEntity<Tag> getTag(@PathVariable("id") Long id) {
        return ResponseEntity.ok(tagService.getEntity(id));
    }

    @GetMapping
    public ResponseEntity<List<Tag>> getTags() {
        return ResponseEntity.ok(tagService.getEntities());
    }

    @PostMapping
    public ResponseEntity<Tag> createTag(@RequestBody Tag tag) {
        return ResponseEntity.ok(tagService.saveEntity(tag));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTag(@PathVariable("id") Long id) {
        tagService.deleteEntity(id);
        return ResponseEntity.noContent().build();
    }
}
