package Reto2_Web.interfaces;

import Reto2_Web.modelo.User;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author RUBEN GIRALDO
 */
public interface InterfaceUser extends MongoRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    List<User> findBybirthtDay(Date date);

    Optional<User> findByEmailAndPassword(String email, String password);

    Optional<User> findTopByOrderByIdDesc();

    List<User> findByMonthBirthtDay(String monthBirthtDay);
}
