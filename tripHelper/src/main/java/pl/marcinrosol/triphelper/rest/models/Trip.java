package pl.marcinrosol.triphelper.rest.models;

import javax.persistence.*;

@Entity
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tripId;

    private String name;

    public Trip(Long tripId, String name) {
        this.tripId = tripId;
        this.name = name;
    }

    public Trip() {
    }

    public Long getTripId() {
        return tripId;
    }

    public void setTripId(Long tripId) {
        this.tripId = tripId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
