package pl.rafalab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rafalab.model.SpotPoint;

public interface SpotPointRepository extends JpaRepository<SpotPoint, Long> {
}
