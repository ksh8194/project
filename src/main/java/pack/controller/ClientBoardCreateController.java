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
public ModelAndView ClientCreateProcess2() {
	
	ModelAndView mv = new ModelAndView();
	mv.setViewName("clientBoardList");
	
	return mv;
}

}
