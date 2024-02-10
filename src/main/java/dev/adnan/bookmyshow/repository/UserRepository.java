package dev.adnan.bookmyshow.repository;

import dev.adnan.bookmyshow.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
