package com.xworkz.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.dto.HospitalDto;

public class HospitalRepositoryImp implements HospitalRepository {

	String url = "jdbc:mysql://localhost:3306/xworkz";
	String username = "root";
	String hide = "Parashuram@123";

	@Override
	public boolean save(HospitalDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, username, hide);
			System.out.println(connection);
			String sql = "insert into xworkz.hospita values(" + dto.getId() + ",'" + dto.getName() + "','"
					+ dto.getSpecalist() + "','" + dto.getFounder() + "'," + dto.getSince() + ")";
			Statement createStatement = connection.createStatement();
			int executeUpdate = createStatement.executeUpdate(sql);
			if (executeUpdate > 0) {
				System.out.println("Genarated data   :" + sql);
				return true;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return true;
	}

}
