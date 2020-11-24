package tech.technote.delmore.jparepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.technote.delmore.entity.TUser;

public interface TUserRepository extends JpaRepository<TUser, Integer> {

    TUser findTUserByUsernameLike(String usernmae);
}
