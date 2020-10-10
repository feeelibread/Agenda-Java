package agendaContatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class FabricaConexoes {

	public static final String USERNAME = "root";
	public static final String PASSWORD = "root";
	public static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";

	public static Connection createConnectionToMySQL() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

		return connection;
	}

	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf.setTimeZone(TimeZone.getDefault());

		Connection con = createConnectionToMySQL();

		if (con != null) {
			System.out.println("Conexão obtida com sucesso :D " + con);
			con.close();
		}

	}

}
