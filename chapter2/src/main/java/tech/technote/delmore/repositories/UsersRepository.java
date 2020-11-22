package tech.technote.delmore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.technote.delmore.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
