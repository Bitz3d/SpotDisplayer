package pl.rafalab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rafalab.model.SpotPointF54;

public interface SpotPointF54Repository extends JpaRepository<SpotPointF54, Long> {

    SpotPointF54 findBySpotName(String spotName);


}
