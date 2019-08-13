package com.stackroute.trackService.service;

import com.stackroute.trackService.domain.Track;
import com.stackroute.trackService.exceptions.TrackAlreadyExistException;
import com.stackroute.trackService.exceptions.TrackNotFoundException;
import com.stackroute.trackService.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackServiceImpl implements TrackService {

    TrackRepository trackRepository;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository)
    {
        this.trackRepository = trackRepository;
    }

    @Override
    public Track saveTrack(Track track) throws TrackAlreadyExistException{

        if(trackRepository.existsById(track.getTrackName()))
        {
            throw new TrackAlreadyExistException("the track already exist");
        }
        Track savedTrack = trackRepository.save(track);
        return savedTrack;
    }

    @Override
    public boolean deleteTrack(String name) throws TrackNotFoundException{
        if(!(trackRepository.existsById(name)))
        {
            throw new TrackNotFoundException("Track not found");
        }
        trackRepository.deleteById(name);
        return true;
    }

    @Override
    public Track updateTrack(Track track) throws TrackNotFoundException{
        if(trackRepository.existsById(track.getTrackName()))
        {
            Track updateTrack=trackRepository.save(track);
            return updateTrack;
        }

        else {
            throw new TrackNotFoundException("ID doesn't exist");
        }
    }

    @Override
    public List<Track> getAllTracks() {

        return trackRepository.findAll();
    }


}
