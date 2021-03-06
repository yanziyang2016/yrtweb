<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<table style="width: 100%;">
	<thead>
		<tr>
			<th><span class="text-white">充值时间</span></th>
			<th><span class="text-white">流水号</span> </th>
			<th><span class="text-white">充值金额</span> </th>
			<th><span class="text-white">实得金额</span> </th>
			<th><span class="text-white">状态</span> </th>
		</tr>
	</thead>
	<tbody>
		<c:choose>
			<c:when test="${!empty rf.items}">
					<c:forEach items="${rf.items}" var="pay">
						<tr>
							<fmt:formatDate value="${pay.create_time}" pattern="yyyy.MM.dd  HH:mm:ss" var="date"/>
						<td><span class="text-white">${date}</span> </td>
						<td><span class="text-white">${pay.bank_no}</span></td>
						<fmt:formatNumber value="${pay.amount }" pattern="#0.00" var="amount"/>
						<td><span class="text-white">￥${amount}</span></td>
						<fmt:formatNumber value="${pay.real_amount }" pattern="#0.00" var="real_amount"/>
						<td>
							<span class="text-white">￥${real_amount}</span>
						</td>
						<td>
							<c:choose>
						<c:when test="${pay.status eq 1 }">
							<span class="text-success">充值成功</span> 
						</c:when>
						<c:otherwise>
							<span class="text-red">充值失败</span>
						</c:otherwise>
						</c:choose>
							</td>
						</tr>
					</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="5"><font color="red">暂无充值记录</font></td>
				</tr>
			</c:otherwise>
		</c:choose>
	</tbody>
	</table>
	<!-- 分页start -->
	 <ul class="pagination" style="float:right;margin-top:15px;">
    	<c:choose>
    		<c:when test="${rf.pageCount!=0}">
    			<c:choose>
					<c:when test="${rf.currentPage!=1}"> 
						<li data-command="prev"><a href="javascript:void(0)" onclick="loadListPage(1)">首页</a></li>
						<li data-page-num="${rf.currentPage-1}"> <a href="javascript:void(0)" onclick="loadListPage(${rf.currentPage-1})">${rf.currentPage-1}</a></li>
						<li class="active"><a>${rf.currentPage}</a></li> 
					</c:when>
					<c:when test="${rf.currentPage==1}"> <li data-page-num="1" class="active"><a>1</a></li></c:when>
				</c:choose>
				<c:choose>
				<c:when test="${rf.currentPage!=rf.pageCount}"> <li data-page-num="${rf.currentPage+1}"><a href="javascript:void(0)" onclick="loadListPage(${rf.currentPage+1})">${rf.currentPage+1}</a></li>
				<c:choose>
				<c:when test="${(rf.currentPage+2)<rf.pageCount}"> <li><a>...</a></li> </c:when>
				</c:choose>
				<c:choose>
				<c:when test="${(rf.currentPage+1)!=rf.pageCount}"> <li data-page-num="${rf.pageCount}"><a href="javascript:void(0)"  onclick="loadListPage(${rf.pageCount})">${rf.pageCount}</a></li> </c:when>
				</c:choose>
				<li data-command="next"><a href="javascript:void(0)" onclick="loadListPage(${rf.pageCount})">末页</a></li> </c:when>
				</c:choose>
    		</c:when>
    	</c:choose>
    </ul>	
	<div class="clearit"></div>
    <!-- 分页end -->
    
   