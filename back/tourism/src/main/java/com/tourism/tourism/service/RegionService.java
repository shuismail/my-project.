package com.tourism.tourism.service;

import com.tourism.tourism.model.Region;
import com.tourism.tourism.repository.RegionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RegionService {
    private final RegionRepository repository;
    public Region createRegion(Region region) {
        return repository.save(region);
    }

    public List<Region> getAllRegion() {
        return repository.findAll();
    }

    public Optional<Region> getById(Integer regionId) {
        return repository.findById(regionId);
    }

    public void deleteRegion(Integer regionId) {
        repository.deleteById(regionId);
    }

    public long countAllRegions() {
        return repository.count();
    }
}
