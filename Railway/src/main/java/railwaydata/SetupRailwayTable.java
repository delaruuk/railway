
package railwaydata;

import java.sql.Connection;
import java.sql.DriverManager;

public class SetupRailwayTable {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/januszAbolaji",
                    "jdaa", "jdaa");

            try {
                String sql = "DROP TABLE schedule";
                conn.createStatement().execute(sql);

            } catch (Exception e) {
                System.out.println("Railway didn't exist");
            }

            try {
                String sql = "CREATE TABLE railwayline (";
                sql = sql + "id INTEGER PRIMARY KEY,";
                sql = sql + "name VARCHAR(50),";
                sql = sql + "arrival INTEGER(50),";
                sql = sql + ")";
                System.out.println(sql);
                conn.createStatement().execute(sql);
            } catch (Exception e) {
                System.out.println(e);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

//consider using the id for trainstop id.