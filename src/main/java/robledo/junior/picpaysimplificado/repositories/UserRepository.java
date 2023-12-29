package robledo.junior.picpaysimplificado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import robledo.junior.picpaysimplificado.domain.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
