package pl.marcinrosol.triphelper.rest.services;

import org.springframework.stereotype.Service;
import pl.marcinrosol.triphelper.rest.models.Trip;
import pl.marcinrosol.triphelper.rest.repositories.TripRepository;

@Service
public class TripService {

    private final TripRepository tripRepository;

    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public Trip getTripById(Long tripId){
        Trip trip = null;
        try{
            trip = tripRepository.findByTripId(tripId).orElseThrow(ArithmeticException::new);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return trip;
    }

}
