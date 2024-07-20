package com.tourism.tourism.controller;

import com.tourism.tourism.model.Region;
import com.tourism.tourism.service.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/region")
@CrossOrigin("*")
public class RegionController {

    private final RegionService service;

    @PostMapping
    public Region addRegion(@RequestBody Region region){
        return service.createRegion(region);
    }

    @GetMapping
    public List<Region> getAll(){
        return service.getAllRegion();
    }
    @GetMapping("{regionId}")
    public Optional<Region> getById(@PathVariable Integer regionId){
        return service.getById(regionId);
    }
    @DeleteMapping("{regionId}")
    public void deleteRegion(@PathVariable Integer regionId){
        service.deleteRegion(regionId);
    }
    @PutMapping("{regionId}")
    public Region updateRegion(@RequestBody Region region,@PathVariable Integer regionId){
        region.setRegionId(regionId);
        return service.createRegion(region);

    }

    @GetMapping("/count")
    public long countRegions() {
        return service.countAllRegions();
    }
}
