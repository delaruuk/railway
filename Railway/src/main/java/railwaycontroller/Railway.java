package railwaycontroller;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Train Stops")
public class Railway implements Serializable {

    @Id
    private int id;
    
    @Column(name="salary")
    private String name;

    @Column(name="time")
    private double time;

    public int getEid() {
        return id;
    }

    public void setEid(int eid) {
        this.id = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
