package com.stackroute.trackService.repository;

import com.stackroute.trackService.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface TrackRepository extends MongoRepository<Track, String> {

}
