package org.springframework.samples.jpetstore.web.spring;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.samples.jpetstore.domain.logic.PetStoreFacade;

public class ViewTrainOrderController implements Controller {
	private Logger logger;
	private PetStoreFacade petStore;
	private boolean tagPage;
	private String myYear;
	private String myMonth;
	private int myTrainNumber;
	private List myTrainNumberList;
	
	public ViewTrainOrderController() {
		// TODO Auto-generated constructor stub
		logger = Logger.getLogger(this.getClass());
	}
	public void setPetStore(PetStoreFacade petStore) {
		this.petStore = petStore;
	}
	
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		logger = Logger.getLogger(this.getClass());
		
		String strYear = "";
		String strMonth = "";
		
		strYear = request.getParameter("year");
		strMonth = request.getParameter("month");
		
		String strTn = request.getParameter("trainNumber");
		
		Map myModel = new HashMap<String, String>();
		
		
		if (tagPage) {
			int trainNumber = 0;
			
			logger.info(strTn);
			if(strTn != null) {
				trainNumber = Integer.valueOf(strTn);
				myModel.put("carList", 
						petStore.getCarnumberList(myYear, myMonth, trainNumber));
				myModel.put("trainNumberList", myTrainNumberList);
				return new ModelAndView("trainOrder","myModel2", myModel);
			}
			

		}
		
		if((strYear == null)||(strMonth == null)) {
			logger.info("carnumber.jsp");
			
			
			List yearList = new ArrayList<String>();
			yearList = petStore.getYearList();
			
			List monthList = new ArrayList<String>();
			monthList = petStore.getMonthList();
			
			myModel.put("yearList", yearList);
			myModel.put("monthList", monthList);
				
			return new ModelAndView("carnumber","myModel2", myModel);
		} else {
			logger.info("trainOrder.jsp");
			myYear = strYear;
			myMonth = strMonth;
			
			myTrainNumberList = new ArrayList<String>();
			myTrainNumberList = petStore.getTrainNumberList(myYear, myMonth);
			myModel.put("trainNumberList", myTrainNumberList);
			tagPage = true;

			return new ModelAndView("trainOrder","myModel2", myModel);
		}
		
	}

}
