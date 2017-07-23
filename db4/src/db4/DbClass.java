package db4;
import java.sql.Connection;

public class DbClass {


	public static void main(String[] args) throws ClassNotFoundException {

		Class.forName("org.sqlite.JDBC");
		Connection connection = null;
		
//		Class.forName("org.sqlite.JDBC");
//		Connection connection = null;
//		try{
//			connection = DriverManager.getConnection("jdbc:sqlite:C:/eclipsejava/pleiades/workspace/db4/DBSTEP4SQLite.db");
//			System.out.println("イエーーーーー");
//
//		}catch(SQLException e){
//			e.printStackTrace();
//		}
//
//		finally{
//			try {
//				connection.close();
//			} catch (SQLException e) {
//				// TODO 自動生成された catch ブロック
//				e.printStackTrace();
//			}
//		}
//
//

	}
}
