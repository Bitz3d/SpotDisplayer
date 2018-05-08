package pl.rafalab.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Component
public class SpotPointF55 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String spotName;

    @NotNull
    private double pointX;


    @NotNull
    private double pointY;


    @NotNull
    private double pointZ;


    public SpotPointF55() {
    }

    public SpotPointF55(String spotName, double pointX, double pointY, double pointZ) {
        this.spotName = spotName;
        this.pointX = pointX;
        this.pointY = pointY;
        this.pointZ = pointZ;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpotName() {
        return spotName;
    }

    public void setSpotName(String spotName) {
        this.spotName = spotName;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double getPointZ() {
        return pointZ;
    }

    public void setPointZ(double pointZ) {
        this.pointZ = pointZ;
    }

    @Override
    public String toString() {
        return "Id:" +id+" Spot Name: "+spotName+" Point x: "+ pointX+" Point y: "+ pointY+" Point z: "+ pointY;
    }


}