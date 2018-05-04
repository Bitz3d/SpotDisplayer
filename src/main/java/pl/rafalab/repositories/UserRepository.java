package pl.rafalab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.rafalab.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select userName, password from User where userName = ?1")
    User findByUserName(String userName);


}
