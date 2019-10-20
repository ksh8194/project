package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pack.model.SangpumAnnoInter;

@Controller
public class ClientBoardCreateController {

@Autowired
private SangpumAnnoInter sangpumAnnoInter;

@RequestMapping(value = "clientBoardList/clientBoardCreate", method = RequestMethod.GET)
public ModelAndView ClientCreateProcess() {
	
	ModelAndView mv = new ModelAndView();
	mv.setViewName("clientBoardCreate");
	
	return mv;
}

@RequestMapping(value = "clientBoardList/clientBoardCreate", method = RequestMethod.POST)
public String ClientCreateProcess2(BoardBean bean) {
	bean.setB_sdate();
	bean.setB_udate("2019-01-01");
	bean.setB_mno("1");
	bean.setB_con("1");
	bean.setB_views("0");
	
		
	 if(sangpumAnnoInter.boardWrite(bean)>0) {
		return "redirect:/clientBoardList";
	}else {
		return "redirect:/error";
	}
}

}
