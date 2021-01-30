package ua.pobut.storage.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.pobut.storage.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

    User findByUsername(String username);
}
