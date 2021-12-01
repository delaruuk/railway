package railwaycontroller;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RailwayRepository extends CrudRepository<Railway, Integer>{
    
    List<Railway> findByPosition(String position);
    
    Railway findByid(int id);
    
    List<Railway> findBySalLessThan(double value);
    
    List<Railway> findByNameLike(String value);
    
    List<Railway> findByNameContains(String value);
}