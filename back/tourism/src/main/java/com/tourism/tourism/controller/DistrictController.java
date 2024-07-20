package com.tourism.tourism.controller;


import com.tourism.tourism.model.District;
import com.tourism.tourism.model.Region;
import com.tourism.tourism.service.DistrictService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/district")
@CrossOrigin("*")
public class DistrictController {
    private final DistrictService service;

    @PostMapping
    public District addDistrict(@RequestBody District district){
        return service.createDistrict(district);
    }

    @GetMapping
    public List<District> getAll(){
        return service.getAllDistrict();
    }
    @GetMapping("{districtId}")
    public Optional<District> getById(@PathVariable Integer districtId){
        return service.getById(districtId);
    }
    @DeleteMapping("{districtId}")
    public void deleteRegion(@PathVariable Integer districtId){
        service.deleteRegion(districtId);
    }
    @PutMapping("{districtId}")
    public District updateDistrict(@RequestBody District district,@PathVariable Integer districtId){
        district.setDistrictId(districtId);
        return service.createDistrict(district);

    }

    @GetMapping("/count")
    public long countDistrict() {
        return service.countAllDistrict();
    }
}
