package com.dtv.middle.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtv.middle.dao.GuiRepo;
import com.dtv.middle.models.GuiModel;
import com.dtv.middle.resources.ReturnFormat;
import com.dtv.middle.resources.ReturnFormat.Status;
import com.dtv.middle.utils.AbstractionRequest;
import com.dtv.middle.utils.DashboardRequest;

@Service
public class AbstractionService<E> {
	@Autowired
	GuiRepo guirepo;
	
	public ReturnFormat saveAbstractionQuery(AbstractionRequest abstrationReq) {
		ReturnFormat rf = new ReturnFormat();
		try {
			String query=guirepo.findQueryByQueryId(abstrationReq.getProjectId(), abstrationReq.getQueryId());
			String chartType=abstrationReq.getChartType();
			List<E> data=new ArrayList<E>();
			data=abstrationReq.getData();
			

			return rf;
		} catch (Exception e) {
			rf.setStatus(Status.ERROR);

			return rf;
		}

	}
}
