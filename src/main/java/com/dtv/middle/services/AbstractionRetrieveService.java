package com.dtv.middle.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtv.middle.dao.GuiRepo;
import com.dtv.middle.resources.ReturnFormat;
import com.dtv.middle.resources.ReturnFormat.Status;
import com.dtv.middle.utils.AbstractionRequest;
import com.dtv.middle.utils.AbstractionRetrieveRequest;

@Service

public class AbstractionRetrieveService {
	@Autowired
	GuiRepo guirepo;
	
	public ReturnFormat getAbstractionQuery(AbstractionRetrieveRequest abstrationReq) {
		ReturnFormat rf = new ReturnFormat();
		Connection dbcon = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			dbcon = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dvtdb", "root", "");
			String query = guirepo.findQueryByQueryId(abstrationReq.getProjectId(), abstrationReq.getQueryId());
			String chartType=abstrationReq.getChartType();
			List<Object> data = new ArrayList<Object>();

			data = abstrationReq.getData();
			PreparedStatement ps = dbcon.prepareStatement(query);
			int count = 1;
			for (int a = 0; a < data.size(); a++) {
				ps.setObject(count, data.get(a));
				count++;
			}
			ResultSet rs=ps.executeQuery();
			ResultSetMetaData rsm=rs.getMetaData();
			int colNo=rsm.getColumnCount();
			
			while(rs.next()) {
				for(int a=0;a<colNo;a++) {
					System.out.println("COLVALZ "+rs.getObject(a+1));
				}
			}
			return rf;
		} catch (SQLException e) {
			rf.setStatus(Status.ERROR);
			System.out.println(e);
			return rf;

		} catch (Exception e) {
			rf.setStatus(Status.ERROR);
			System.out.println(e);
			return rf;
		}
	}

	
}
