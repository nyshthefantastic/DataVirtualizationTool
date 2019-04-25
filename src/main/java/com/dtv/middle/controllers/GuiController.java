package com.dtv.middle.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dtv.middle.resources.ReturnFormat;
import com.dtv.middle.services.GuiService;
import com.dtv.middle.utils.DashboardRequest;

@RestController
@RequestMapping("/api/dashboard")
public class GuiController {
	@Autowired
	GuiService guiservice;

	@RequestMapping(method = RequestMethod.POST, value = "/saveQueries")
	public ReturnFormat saveDashboardQuery(@RequestBody DashboardRequest dashboardReq) {

		return guiservice.saveDashboardQuery(dashboardReq);
	}

	@GetMapping(value = "/getQueries")
	public @ResponseBody ReturnFormat getDashboardQuery(@RequestParam("projectId") int projectId,
			@RequestParam("queryId") int queryId) {

		return guiservice.getDashboardQuery(projectId, queryId);
	}

	@PutMapping(value = "/updateQueries")
	public ReturnFormat updateDashboardQuery(@RequestParam("projectId") int projectId,
			@RequestParam("queryId") int queryId, @RequestParam("query") String query) {
		return guiservice.updateDashboardQuery(projectId, queryId, query);
	}

	@DeleteMapping(value = "/deleteQueries")
	public ReturnFormat deleteDashboard(@RequestParam("projectId") int projectId,
			@RequestParam("queryId") int queryId) {
		return guiservice.deleteDashboardQuery(projectId, queryId);
	}
}
