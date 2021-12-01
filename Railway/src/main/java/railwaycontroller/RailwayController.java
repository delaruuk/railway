package railwaycontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
public class RailwayController {
    
    @Autowired
    RailwayRepository railwayService;
    
    
    @GetMapping("/arrival")
    public ResponseEntity<List<Railway>> getAllArrival() {
        return new ResponseEntity(railwayService.findAll(),HttpStatus.OK);
    }
         
    @GetMapping("/railway/{arrival}")
    public ResponseEntity<List<Railway>> getAllEmpsByPosition(@PathVariable("position") String position) {
        List<Railway> list = railwayService.findByPosition(position);
        return new ResponseEntity(list,HttpStatus.OK);


    }
    
    
    
    @GetMapping("/railways/nl/{name}")
    public ResponseEntity<List<Railway>> getRailwayNamedLike(@PathVariable("name") String name) {
        List<Railway> list = railwayService.findByNameContains(name);
        return new ResponseEntity(list,HttpStatus.OK);

        
    }
  
    @DeleteMapping("/railway2/{id}")
    public ResponseEntity<Railway> deleteSingleRailway2(@PathVariable("id") int id) {
        try {
            railwayService.deleteById(id);
            
            return new ResponseEntity(null,HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(null,HttpStatus.NOT_FOUND);
        }
        
    }
    
    @PostMapping("/railway")
    public ResponseEntity<Railway> addRailway(@RequestBody final @Valid Railway e) {
        
        if (railwayService.existsById(e.getEid())) {
            return new ResponseEntity(e,HttpStatus.FOUND);
        } else {
            railwayService.save(e);
            return new ResponseEntity(e,HttpStatus.OK);
        }
        
        
    }
    
    @PutMapping("/railway")
    public ResponseEntity<Railway> updateRailway(@RequestBody final Railway e) {
        
        if (railwayService.existsById(e.getEid())) {
            railwayService.save(e);
            return new ResponseEntity(e,HttpStatus.OK);
            
        } else {
            return new ResponseEntity(e,HttpStatus.NOT_FOUND);
        }
        
        
    }
    
    @GetMapping("/railway/num")
    public long getNumberOfArrivals() {
        return railwayService.count();
    }
    
    
    
}

