package Reto2_Web.interfaces;

import Reto2_Web.modelo.CleaningProduct;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author RUBEN GIRALDO
 */
public interface InterfaceCleaningProduct extends MongoRepository<CleaningProduct, Integer> {

    //Reto 5
    public List<CleaningProduct> findByPriceLessThanEqual(double precio);

    //Reto 5
    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<CleaningProduct> findByDescriptionLike(String description);
}
