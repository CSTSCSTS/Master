package db4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudyDataBase {
	public static void main(String[] args) throws ClassNotFoundException {

Class.forName("org.sqlite.JDBC");//JDBCドライバの呼び出し
Connection connection = null;
try {
	//DriverManager.getConnection→データベースへの接続()
	//内に接続を試みるデータベース名を「jdbc:(サブプロトコル名):(サブ名)」指定
	connection = DriverManager.getConnection("jdbc:sqlite:C:/eclipsejava/pleiades/workspace/db4/DBSTEP4SQLite.db");
	Statement statement = connection.createStatement();
	//SQL文の実行に使用する「java.sql.Statement」オブジェクトを取得してくるメソッド
	ResultSet rs = statement.executeQuery(null);//SQL文を実行するメソッド()内にSQL文を記述
	//問題ないと結果を「java.sql.ResultSet」オブジェクトで返すResultSetオブジェクトはselect文の実行結果を格納するインターフェース
	//insert,update,deleteの実行でも「java.sql.Statement」オブジェクトを使用する。実行には
	//「executeQuery」の代わりに「executeUpdate」を使用する「executeUpdate」はselect文ではないので、
	//結果を返さない

	System.out.println(rs);
} catch(SQLException e){

}


	/* Class.forName("org.sqlite.JDBC");//まずドライバを手に入れよう
	Connection connection = null;
	try{
	// データベース接続
	connection = DriverManager.getConnection("jdbc:sqlite:C:/eclipsejava/pleiades/workspace/db4/DBSTEP4SQLite.db");
	Statement statement = connection.createStatement();
	statement.setQueryTimeout(30); // タイムアウトを30 秒で設定
	// SQL 実行
	ResultSet rs = statement.executeQuery("SELECT * FROM TEST_T");
	while(rs.next()){
	// 結果表示
	System.out.println("ID: " + rs.getString("SYSTEM_ID") );
	}
	} catch(SQLException e){
	e.printStackTrace();
	} finally{
	try{
	if(connection != null) connection.close();
	}catch(SQLException e){
	// 何もしない */
	}
}
