package com.tourism.tourism.service;

import com.tourism.tourism.model.Place;
import com.tourism.tourism.repository.PlaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlaceService {

    private final PlaceRepository repository;

    public Place createPlace(Place place) {
        return repository.save(place);
    }

    public List<Place> getAll() {
        return repository.findAll();
    }

    public Optional<Place> getById(Integer placeId) {
        return repository.findById(placeId);
    }

    public void deletePlace(Integer placeId) {
        repository.deleteById(placeId);
    }

    public long countAllPlaces() {
        return repository.count();
    }
}
