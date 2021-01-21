package pl.marcinrosol.triphelper.rest.controllers;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.marcinrosol.triphelper.rest.services.TripService;

@RestController
@RequestMapping("/api/trip")
public class TripController {

    private final TripService tripService;

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @GetMapping
    @RequestMapping(path = "/{tripId}")
    public ResponseEntity<Object> getTripById(@PathVariable  Long tripId){
        return new ResponseEntity<Object>(tripService.getTripById(tripId),HttpStatus.ACCEPTED);
    }

}
