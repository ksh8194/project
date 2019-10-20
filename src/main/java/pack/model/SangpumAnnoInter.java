package pack.model;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import pack.controller.BoardBean;

public interface SangpumAnnoInter {
	
	//ListController
	@Select("select b_num,c_name,b_title,m_name,b_sdate,b_views from board,member,category where board.b_mno = member.m_num and board.b_con =category.c_num and c_num=#{num}")
	public List<BoardDto> selectDataAll(String num);
	
	
	//ViewController
	@Select("select b_mno,b_sdate,b_title,b_content,b_views from board where b_num=#{num}")
	public List<BoardDto> selectListView(int num);
	int readcnt = 0;
	
	
	//Create(Write)Controller
	@Insert("insert into board(b_con,b_title,b_content,b_mno,b_ip,b_sdate,b_udate,b_views) values(#{b_con},#{b_title},#{b_content},#{b_mno},#{b_ip},#{b_sdate},#{b_udate},0")
	 int boardWrite(BoardBean bean);
}



//resource/DataMapper�뿉 sql臾몃뱾�쓣 �쟻�뼱二쇰뒗 (�쓽議댁꽦)�쓣 �뾾�븷湲� �쐞�빐�꽌 => DataMapper媛� �뾾�쑝誘�濡�  Configuration�룄 �궘�젣