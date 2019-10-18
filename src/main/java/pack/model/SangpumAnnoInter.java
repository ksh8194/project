package pack.model;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface SangpumAnnoInter {
	@Select("select b_num,c_name,b_title,m_name,b_sdate,b_views from board,member,category where board.b_mno = member.m_num and board.b_con =category.c_num and c_num=#{num}")
	public List<ClientBoardDto> selectDataAll(String num);
	
//	@Select("select code,sang,su,dan from sangdata where sang like concat('%',#{searchValue} ,'%')")
//	public List selectSearch();
}



//resource/DataMapper에 sql문들을 적어주는 (의존성)을 없애기 위해서 => DataMapper가 없으므로  Configuration도 삭제