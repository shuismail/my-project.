package com.tourism.tourism.service;

import com.tourism.tourism.model.District;
import com.tourism.tourism.repository.DistrictRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DistrictService {
    private final DistrictRepository  repository;
    public District createDistrict(District district) {
        return repository.save(district);
    }

    public List<District> getAllDistrict() {
        return repository.findAll();
    }

    public Optional<District> getById(Integer districtId) {
        return repository.findById(districtId);
    }

    public void deleteRegion(Integer districtId) {
        repository.deleteById(districtId);
    }

    public long countAllDistrict() {
        return repository.count();
    }
}
