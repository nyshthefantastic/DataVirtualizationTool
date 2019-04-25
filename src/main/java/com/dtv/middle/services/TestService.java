package com.dtv.middle.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtv.middle.dao.TestRepo;
import com.dtv.middle.resources.ReturnFormat;

@Service
public class TestService {

	ReturnFormat returnFormat;

	@Autowired
	TestRepo opdVisitsRep;
	/*
	 * public ReturnFormat getOpdPatientVisitsCount(Date fromDate,Date toDate) {
	 * 
	 * if(fromDate!=null&& toDate!=null) {
	 * 
	 * if(fromDate.before(toDate)) {
	 * 
	 * returnFormat = new ReturnFormat();
	 * 
	 * try { List<String> str = new ArrayList<String>(); List<String> str1 = new
	 * ArrayList<String>(); str1.add("Monday"); str1.add("Tuesday");
	 * str1.add("Wednesday"); str1.add("Thursday"); str1.add("Friday");
	 * str1.add("Saturday"); str1.add("Sunday");
	 * 
	 * 
	 * 
	 * List<NameCountModel> pss = new ArrayList<NameCountModel>(); // Service to
	 * retrieve patients' OPD visit count hourly
	 * 
	 * pss = opdVisitsRep.findByVisitsAll(fromDate, toDate); int subSeqVisits =
	 * opdVisitsRep.findSubSequentCount(fromDate, toDate);
	 * 
	 * int[] da = new int[pss.size()]; int len = 0; int add = 0; int totalCount=0;
	 * 
	 * while (pss.size() > len) { NameCountModel p = pss.get(len); if (p != null) {
	 * da[add] = p.getCount(); totalCount=totalCount+p.getCount();
	 * str.add(p.getName()); add++; } len++; }
	 * 
	 * 
	 * 
	 * long diff = toDate.getTime() - fromDate.getTime(); int diffDays = (int) (diff
	 * / (24 * 60 * 60 * 1000)); len = 0; int[] daa = new int[str.size()]; while
	 * (str.size() > len) { daa[len] = da[len]; len++; }
	 * 
	 * 
	 * FormatHelper gt = new FormatHelper();
	 * 
	 * gt.setdata(daa); gt.setlabel("Visits"); gt.setType("bar");
	 * 
	 * 
	 * FormatHelper gt1 = new FormatHelper();
	 * 
	 * gt1.setdata(daa); gt1.setlabel("Trend"); gt1.setType("line");
	 * List<FormatHelper> gtp = new ArrayList<FormatHelper>(); gtp.add(gt);
	 * gtp.add(gt1);
	 * 
	 * if(totalCount!=0) { returnFormat.setData(gtp); returnFormat.setLabels(str1);
	 * returnFormat.setAvgCount(totalCount/diffDays);
	 * returnFormat.setSubCount(subSeqVisits);
	 * returnFormat.setMessage("Data Retrieved");
	 * returnFormat.setStatus(ReturnFormat.Status.SUCCESS); }else {
	 * returnFormat.setData(gtp); returnFormat.setLabels(str1);
	 * returnFormat.setAvgCount(totalCount/diffDays);
	 * returnFormat.setSubCount(subSeqVisits);
	 * returnFormat.setMessage("No data available for given date range");
	 * returnFormat.setStatus(ReturnFormat.Status.SUCCESS);
	 * 
	 * }
	 * 
	 * } catch (Exception e) { returnFormat.setData("");
	 * returnFormat.setMessage("Error Occured");
	 * returnFormat.setStatus(ReturnFormat.Status.ERROR); e.printStackTrace();
	 * 
	 * }
	 * 
	 * }else { returnFormat.setData(""); returnFormat.setLabels("");
	 * returnFormat.setMessage("Cannot accessible the given date range");
	 * returnFormat.setStatus(ReturnFormat.Status.ERROR); } }else{
	 * returnFormat.setData(""); returnFormat.setLabels("");
	 * returnFormat.setMessage("Please enter date range to show details.");
	 * returnFormat.setStatus(ReturnFormat.Status.ERROR);
	 * 
	 * } return returnFormat; }
	 */
	
}
