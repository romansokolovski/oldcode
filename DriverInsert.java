package jdbcDemo;

import java.sql.*;


public class DriverInsert {

	public static void main(String[] args) {
		
		try{
			//1. Get a connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","roman");
			//2. Create a statement
			Statement myStat = myConn.createStatement();
			//3. Execute a SQL query
			//INSERTING INTO DB
			String sq1 = "insert into potluck "+"(id, name, food, confirmed, signup_date)"
			+ "values ('9', 'bruh', 'nothing', 'Y', '2016-02-11')";
			myStat.execute(sq1);
			System.out.println("Insert Complete");
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
