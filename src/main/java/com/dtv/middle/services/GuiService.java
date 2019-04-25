package com.dtv.middle.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtv.middle.dao.GuiRepo;
import com.dtv.middle.models.GuiModel;
import com.dtv.middle.resources.ReturnFormat;
import com.dtv.middle.resources.ReturnFormat.Status;
import com.dtv.middle.utils.DashboardRequest;

@Service
public class GuiService {
	@Autowired
	GuiRepo guirepo;

	public ReturnFormat saveDashboardQuery(DashboardRequest dashboardReq) {
		ReturnFormat rf = new ReturnFormat();
		try {
			GuiModel guiModel = new GuiModel();
			guiModel.setProjectId(dashboardReq.getProjectId());
			guiModel.setQueryId(dashboardReq.getQueryId());
			guiModel.setQuery(dashboardReq.getQuery());

			guirepo.saveAndFlush(guiModel);
			return rf;
		} catch (Exception e) {
			rf.setStatus(Status.ERROR);

			return rf;
		}

	}

	public ReturnFormat getDashboardQuery(int projectId, int queryId) {
		ReturnFormat rf = new ReturnFormat();
		try {

			String query = guirepo.findQueryByQueryId(projectId, queryId);
			rf.setData(query);
			return rf;
		} catch (Exception e) {
			rf.setStatus(Status.ERROR);

			return rf;
		}

	}

	public ReturnFormat updateDashboardQuery(int projectId, int queryId, String query) {
		ReturnFormat rf = new ReturnFormat();
		try {

			guirepo.updateQueryByQueryId(query, projectId, queryId);
			rf.setStatus(Status.SUCCESS);
			return rf;
		} catch (Exception e) {
			rf.setStatus(Status.ERROR);

			return rf;
		}

	}

	public ReturnFormat deleteDashboardQuery(int projectId, int queryId) {
		ReturnFormat rf = new ReturnFormat();
		try {

			guirepo.deleteQueryByQueryId(projectId, queryId);
			rf.setStatus(Status.SUCCESS);
			return rf;
		} catch (Exception e) {
			rf.setStatus(Status.ERROR);

			return rf;
		}

	}

}
