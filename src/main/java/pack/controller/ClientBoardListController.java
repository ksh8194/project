package pack.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import pack.model.BoardDto;
import pack.model.SangpumAnnoInter;

@Controller
public class ClientBoardListController {
@Autowired
private SangpumAnnoInter inter;

private int tot; // 전체 레코드 수
private int plist = 10; // 페이지 당 행의 수
private int pagesu; // 전체 페이지 수

@RequestMapping("clientBoardList/{cname}")
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
	
	List<BoardDto> list = inter.selectDataAll(String.valueOf(cno));
	//ArrayList<ClientBoardDto> result = new ArrayList<ClientBoardDto>();
	//result = getList(list, page);
	mv.setViewName("clientBoardList");
	mv.addObject("data", list);
	//mv.addObject("pagesu",getPageSu());
	//mv.addObject("page",page);
	
	
	//ArrayList<ClientBoardDto> result = new ArrayList<ClientBoardDto>();

	return mv;
}

//public int getPageSu() {  //총 페이지 수
//	pagesu = tot / plist;
//	if(tot % plist > 0) pagesu += 1; // 자투리 페이지 꼐산
//	return pagesu;
//}
//
//public ArrayList<ClientBoardDto> getList(ArrayList<ClientBoardDto> list, int page){
//	ArrayList<ClientBoardDto> result = new ArrayList<ClientBoardDto>();
//	int start = (page - 1) * plist; // 0, 5 , 10 , 15 ....
//	int size = plist <= list.size() - start?plist:list.size() - start;
//	System.out.println("start:" + start + ",size:" + size);
//	
//	for(int i = 0; i < size; i ++) {
//		result.add(i,list.get(start + i));
//	} 
//	
//	
//	
//	return result;
//	
//}
//
//private ArrayList<ClientBoardDto> getList(ArrayList<ClientBoardDto> list, int page) {
//	// TODO Auto-generated method stub
//	return null;
//}

}
