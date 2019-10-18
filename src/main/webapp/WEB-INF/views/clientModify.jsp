<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="client_top.jsp" %>
    <!-- **********************************************************************************************************************************************************
        MAIN CONTENT
        *********************************************************************************************************************************************************** -->
    <!--main content start-->
    <section id="main-content">
        <section class="wrapper">
          <h3><i class="fa fa-angle-right"></i>회원 수정</h3>
          <!-- BASIC FORM ELELEMNTS -->
          <div class="row mt">
            <div class="col-lg-12">
              <div class="form-panel">
                <form class="form-horizontal style-form" method="get">
                  <div class="form-group">
                    <label class="col-sm-2 control-label">이름</label>
                    <div class="col-sm-10">
                      <input type="text" class="form-control">
                    </div>
                  </div>

                  <div class="form-group">
                    <div>
                      <label class="col-sm-2 control-label">핸드폰 번호</label>
                      <div class="col-sm-10">
                        <input type="text">&nbsp;<b>-</b>
                        <input type="text">&nbsp;<b>-</b>
                        <input type="text">
                        <div id="phoneErrorMsg" class="text-danger" style="font-size: 14px;"></div>
                      </div>
                    </div>  
                  </div>

                  <div class="form-group">
                      <label class="col-sm-2 control-label">기존 비밀번호</label>
                      <div class="col-sm-10">
                        <input type="password" class="form-control">
                      </div>
                  </div>
                  <div class="form-group">
                      <label class="col-sm-2 control-label">새 비밀번호</label>
                      <div class="col-sm-10">
                        <input type="password" class="form-control">
                      </div>
                  </div>
                  <div class="form-group">
                      <label class="col-sm-2 control-label">새 비밀번호 확인</label>
                      <div class="col-sm-10">
                        <input type="password" class="form-control">
                      </div>
                  </div>

                  <div class="form-group">
                      <div class="pull-right">
                          <div class="col-lg-12">
                              <button type="submit" class="btn btn-theme">회원 정보 수정</button>
                            </div>
                      </div>    
                  </div>
                </form>
              </div>
            </div>
          </div>
        </section>
      </section>  
    <!--main content end-->
<%@ include file="client_bottom.jsp" %>
