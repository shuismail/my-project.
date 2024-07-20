package com.tourism.tourism.controller;

import com.tourism.tourism.model.Place;
import com.tourism.tourism.service.PlaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/place")
@CrossOrigin("*")
public class PlaceController {
    private final PlaceService service;

    @PostMapping
    public Place add(@RequestBody Place place){
        return service.createPlace(place);
    }
    @GetMapping
    public List<Place> getAll(){
        return service.getAll();
    }
    @GetMapping("{placeId}")
    public Optional<Place> getById(Integer placeId){
        return service.getById(placeId);
    }
    @DeleteMapping("{placeId}")
    public void deletePlace(@PathVariable Integer placeId){
        service.deletePlace(placeId);
    }

    @GetMapping("/count")
    public long countPlaces() {
        return service.countAllPlaces();
    }
}
