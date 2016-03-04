package jdbcDemo;

import java.sql.*;


public class DriverUpdate {

	public static void main(String[] args) {
		
		try{
			//1. Get a connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","roman");
			//2. Create a statement
			Statement myStat = myConn.createStatement();
			//3. Execute a SQL query
			//UPDATING VALS
			//String sq2 = "update potluck set food ='Candy' where potluck.name = 'John'";
			//myStat.execute(sq2);
			System.out.println("Update Complete");
			//Deleting
			//String sq3 = "delete from potluck where name = 'anna'";
			//myStat.execute(sq3);
			//3.5 ACCESSING DB
			ResultSet myRs = myStat.executeQuery("select * from potluck");
			//4. Process the result set
			while(myRs.next()){
				System.out.println(myRs.getString("name")+ " likes " + myRs.getString("food"));
			}
		}
		catch (Exception exc){
			exc.printStackTrace();
		}
	}

}
