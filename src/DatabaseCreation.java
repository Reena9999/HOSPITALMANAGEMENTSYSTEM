import java.sql.*;

public class DatabaseCreation {
    public static void main(String[] args) throws Exception {
        try{
            //loads the classes in the lib folder
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/HospitalManagementSystem", "root", "94807279");
            Statement statement=connection.createStatement();
            statement.executeUpdate("create table tblScheduledBooking(BookingID varchar(10),PatientID varchar (10),DOCID varchar (10),ScheduledDate DATE,ScheduledTime TIME,Registra varchar (10),PRIMARY KEY (BookingID))");
            statement.executeUpdate("create table tblRegistras(RegistraID varchar(10),FirstName varchar (50),LastName varchar (50),PhNumber varchar(10),PRIMARY KEY (RegistraID))");
            statement.executeUpdate("create table tblDoctorAvailability(availableDate DATE,DOCID varchar (10),availabileStartTime TIME,availabileEndTime TIME,PatientToAttend int(5))");

            System.out.println("Tables successfully created");
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
