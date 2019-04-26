package com.dtv.middle.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dtv.middle.resources.ReturnFormat;
import com.dtv.middle.services.AbstractionService;
import com.dtv.middle.services.GuiService;
import com.dtv.middle.utils.AbstractionDeleteRequest;
import com.dtv.middle.utils.AbstractionRequest;
import com.dtv.middle.utils.AbstractionUpdateRequest;
import com.dtv.middle.utils.DashboardRequest;

@RestController
@RequestMapping("/api/abstraction")
public class AbstractionController {
	@Autowired
	AbstractionService abstrationSer;
	
	@RequestMapping(method = RequestMethod.POST, value = "/saveQueries")
	public ReturnFormat saveAbstractionQuery(@RequestBody AbstractionRequest abstrationReq) {

		return abstrationSer.saveAbstractionQuery(abstrationReq);
	}
	
	@PutMapping(value = "/updateQueries")
	public ReturnFormat updateDashboardQuery(@RequestBody AbstractionUpdateRequest abstractionReq) {
		return abstrationSer.updateAbstractionQuery(abstractionReq);
	}
	
	@DeleteMapping(value = "/deleteQueries")
	public ReturnFormat deleteDashboard(@RequestBody AbstractionDeleteRequest abstractionReq) {
		return abstrationSer.deleteAbstractionQuery(abstractionReq);
	}

}
