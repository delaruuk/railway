package railwaydata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Random;

public class RailwayLine {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection (
            "jdbc:derby://localhost:1527/JanuszAbolaji",
            "jdaa", "jdaa");
        
        
        String[] railwayline = {"35th/Archer to Adams/Wabash",
                            "Adams/Wabash to Ashland",
                            "Ashland to Clark/Lake",
                            "Clark/lake to Halsted",
                            "Halsted to Harold Washington Library-State/Van Buren",
                            "Harold Washington Library-State/Van Buren to Kedzie",
                            "Kedzie to LaSalle/Van Buren.",
                            "LaSalle/Van Buren to Midway",
                            "Midway to Pulaski",
                            "Pulaski to Quincy/Wells",
                            "Quincy/Wells to Roosevelt",
                            "Roosevelt to State/Lake",
                            "State/Lake to Washington/Wabash",
                            "Washington/Wabash to Washington/Wells",
                            "Washington/Wells to Western"};
      
        
        String[] thirtyfifththarcherarrival = {"4:00 AM - 1:00 AM"};
        String[] adamswabasharrival = {"4:25 AM - 1:25 AM"};
        String[] ashlandarrival = {"4:50 AM - 1:50 AM"};
        String[] clarklakefourtharrival = {"5:15 AM - 2:15 AM"};
        String[] halstedarrival = {"5:40 AM - 2:40 AM"};
        String[] haroldwashingtonlibarrival = {"6:05 AM - 3:05 AM"};
        String[] kedziearrival = {"6:30 AM - 3:30 AM"};
        String[] lasallevbarrival = {"6:55 AM - 3:55 AM"};
        String[] midwayarrival = {"6:55 AM - 3:55 AM"};
        String[] pulaskiarrival = {"6:55 AM - 3:55 AM"};
        String[] quincywellsarrival = {"6:55 AM - 3:55 AM"};
        String[] rooseveltarrival = {"6:55 AM - 3:55 AM"};
        String[] statelakearrival = {"6:55 AM - 3:55 AM"};
        String[] washingtonwabasharrival = {"6:55 AM - 3:55 AM"};
        String[] washingtonwellsarrival = {"6:55 AM - 3:55 AM"};
        String[] westernarrival = {"6:55 AM - 3:55 AM"};

        
        
        
        

        
        int count = 16;
        
        while (count > 0) {
            String name = "";
            String description = "";
            
          
            
            
            String sql = "INSERT INTO products VALUES(" + eid + ", '"
            sql = sql + railwayline + "','";
            sql = sql + arrivaltime + ")";
            System.out.println(sql);
            try {
                conn.createStatement().execute(sql);
                count--;
            } catch (Exception e) {
                System.out.println(e);
            }
                    
        }
        
        
    }
    
}

