<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="client_top.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <!-- **********************************************************************************************************************************************************
        MAIN CONTENT
        *********************************************************************************************************************************************************** -->
    <!--main content start-->
    <section id="main-content">
      <section class="wrapper">
          <h3><i class="fa fa-angle-right"></i>공지사항</h3>
        <div class="row">
          <div class="col-md-12">
            <div class="content-panel">
              <table class="table">
                <colgroup>
                  <col width="10%"/>
                  <col width="60%"/>
                  <col width="10%"/>
                  <col width="10%"/>
                  <col width="10%"/>
                </colgroup>
                <thead>
                  <tr>
                    <th style="text-align: center">번호</th>
                    <th>제목</th>
                    <th style="text-align: center">작성자</th>
                    <th style="text-align: center">작성 날짜</th>
                    <th style="text-align: center">조회 수</th>
                  </tr>
                </thead>
                <tbody>
                     <c:forEach var="b" items="${data}">
						<tr>
							<td>${b.b_num}</td>
							<td>${b.b_title}</td>
							<td>${b.b_name}</td>
							<td>${b.b_sdate}</td>
							<td>${b.b_views}</td>
						</tr>
					</c:forEach>
                   
                  
                </tbody>
              </table>
              <div style="text-align: center">
                  <nav aria-label="Page navigation example">
                      <ul class="pagination pagination-lg">
                        <li class="page-item disabled">
                          <a class="page-link" href="#" tabindex="-1">&laquo;</a>
                        </li>
                        <li class="page-item active"><a class="page-link" href="#">1</a></li>
                        <li class="page-item"><a class="page-link" href="#">2</a></li>
                        <li class="page-item"><a class="page-link" href="#">3</a></li>
                        <li class="page-item"><a class="page-link" href="#">4</a></li>
                        <li class="page-item"><a class="page-link" href="#">5</a></li>
                        <li class="page-item"><a class="page-link" href="#">6</a></li>
                        <li class="page-item"><a class="page-link" href="#">7</a></li>
                        <li class="page-item"><a class="page-link" href="#">8</a></li>
                        <li class="page-item"><a class="page-link" href="#">9</a></li>
                        <li class="page-item"><a class="page-link" href="#">10</a></li>
                        <li class="page-item">
                          <a class="page-link" href="#">&raquo;</a>
                        </li>
                      </ul>
                  </nav>
              </div> 
            </div>
          </div>
      </div>
    </section>
    </section>  
    <!--main content end-->
<%@ include file="client_bottom.jsp" %>
