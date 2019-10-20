<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="client_top.jsp" %>
    <!-- **********************************************************************************************************************************************************
        MAIN CONTENT
        *********************************************************************************************************************************************************** -->
    <!--main content start-->
    <section id="main-content">
      <section class="wrapper">
        <h3><i class="fa fa-angle-right"></i>게시판 이름</h3>
        
        <div class="row mt">
          <div class="col-lg-12">
            <div class="form-panel">
              <form class="form-horizontal style-form" method="post" action="clientBoardCreate">
                  <div class="form-group">
                      <div class="col-sm-2">
                        <select class="form-control">
                            <option>카테고리</option>
                            <option>스터디게시판</option>
                            <option>공모전게시판</option>
                            <option>친목게시판</option>
                        </select>
                      </div>
                      <label class="col-sm-1 control-label">제목</label>
                      <div class="col-sm-9">
                        <input type="text" class="form-control" name="b_title"  placeholder="제목을 입력해 주세요">
                      </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-12 control-label">글 내용</label>
                    <div class="col-sm-12">
                      <textarea class="form-control" name="b_content" id="contact-message" rows="5" style="height: 500px;"  placeholder="내용을 입력해 주세요"></textarea>
                    </div>
                  </div>
                  <div class="form-group">
                      <div class="pull-right">
                          <div class="col-lg-12">
                          <input type="hidden" name="b_ip" value="<%=request.getRemoteAddr()%>">
                              <button type="submit" class="btn btn-theme" name="saveBoard">글 작성</button>
                              <button type="submit" class="btn btn-theme" onclick="location.href ='clientBoardCreate'">리스트</button>
                            </div>
                      </div>    
                  </div>
              </form>
            </div>
          </div>
        </div>
        <!-- /row -->
        </section>
      </section>
      <!-- /wrapper -->
    <!--main content end-->
    
    <script>
							$(function(){
								$('#saveBoard').on("click",function(event){
									event.preventDefault();
									//유효성검사
									var title = $("#b_title").val();
									if(title==''){
										alert("제목을 입력해주세요...")
										$("#b_title").focus();
										return;
									}
									let content =$("#b_content").val();
									if(content==''){
										alert("내용을 입력해주세요..")
										$('#b_content').focus();
										return;
									}
									
									
									f.submit();
								});
							});
						</script>
<%@ include file="client_bottom.jsp" %>
