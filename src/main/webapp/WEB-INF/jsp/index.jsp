<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link type="text/css" href="${contextPath}/assets/css/css.css"
	rel="stylesheet" />
<script type="text/javascript" src="${contextPath}/assets/js/jquery.js"></script>
<script type="text/javascript" src="${contextPath}/assets/js/js.js"></script>
</head>
<body>
	<div class="hrader">
		<a href="${contextPath}/login"
			style="color: #FD7306; margin-left: 20px;">请登录</a> <a
			href="${contextPath}/reg">注册</a>
		<div class="topNav">
			<a href="${contextPath}/index" style="color: #FD7306;">首页</a> <a
				href="${contextPath}/buy">买家</a> <a href="${contextPath}/sell">卖家</a>
			<a href="${contextPath}/vip">会员中心</a> <a
				href="${contextPath}/xuanshang">悬赏榜</a> <a
				href="${contextPath}/luntan" class="luntan">论坛</a> <a
				href="${contextPath}/help">帮助</a> <a href="#">&nbsp;</a> <a href="#"
				class="lan">中文</a> <a href="#" class="lan">English</a>
		</div>
		<!--topNav/-->
	</div>
	<!--hrader/-->
	<div class="inCont">
		<h1 class="logo">
			<a href="${contextPath}/index"><img src="${contextPath}/assets/images/logo.png" width="304"
				height="74" /></a>
		</h1>
		<form class="select" action="prolist" method="get">
			<div>
				<input type="text" value="请输入你需要的产品" class="selName"
					onFocus=OnEnter(this) onBlur=OnExit(this) /> <input type="image"
					src="${contextPath}/assets/images/sub.png" width="99" height="36" class="sel" />
			</div>
		</form>
		<!--select/-->
		<div class="ban">
			<a href="${contextPath}/prolist"><img src="${contextPath}/assets/images/phone.png" /></a>
		</div>
		<!--ban/-->
	</div>
	<!--inCont/-->
	<div class="footer">
		<a href="#">关于我们</a> <a href="#">友情链接</a> <a href="#">版权声明</a> <a
			href="#">网站地图</a> <br /> <span>&copy; 2014 Unqezi 使用前必读 沪ICP备
			12007626号-1</span>
	</div>
	<!--footer/-->
</body>
</html>