package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

import pack.model.SangpumAnnoInter;

@Controller
public class ClientBoardViewController {
@Autowired
private SangpumAnnoInter sangpumAnnoInter;

@RequestMapping(value ="clientBoardView" ,method=RequestMethod.POST)
public ModelAndView ClientViewProcess(@RequestParam("num")int num) {
	ModelAndView mv = new ModelAndView();
	
	mv.addObject("list",sangpumAnnoInter.selectListView(num));

	
	
	return mv;
}

}
