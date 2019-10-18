package pack.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pack.model.ClientBoardDto;
import pack.model.SangpumAnnoInter;

@Controller
public class ClientBoardListController {
@Autowired
private SangpumAnnoInter inter;

@RequestMapping(value = "clientBoardList/{cname}")
public ModelAndView ClientListProcess(@PathVariable String cname) {
	//tot = inter.totalCnt(); //전체 레코드 수 얻기
	ModelAndView mv = new ModelAndView();
	 //전체자료읽기
	int cno = 0;
	if(cname.equals("study")) {
		cno = 1;
		mv.addObject("category", "스터디");
	}else if(cname.equals("competition")) {
		cno = 2;
		mv.addObject("category", "공모전");
	}else if(cname.equals("amity")) {
		cno = 3;
		mv.addObject("category", "친목");
	}else {
		return new ModelAndView("main");
	}
	
	List<ClientBoardDto> list = inter.selectDataAll(String.valueOf(cno));
	mv.setViewName("clientBoardList");
	mv.addObject("data", list);
	
	//ArrayList<ClientBoardDto> result = new ArrayList<ClientBoardDto>();

	return mv;
}
//
//private ArrayList<ClientBoardDto> getList(ArrayList<ClientBoardDto> list, int page) {
//	// TODO Auto-generated method stub
//	return null;
//}

}
