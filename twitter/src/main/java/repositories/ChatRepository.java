package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entities.Chat;

@Repository
public interface ChatRepository extends CrudRepository<Chat, Long> {

}