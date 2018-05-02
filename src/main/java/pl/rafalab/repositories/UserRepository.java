package pl.rafalab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rafalab.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
