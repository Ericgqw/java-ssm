<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	String path= request.getContextPath();
 	request.setAttribute("path", path);
 %> 
<!DOCTYPE html>
<html lang="en">
<head>
	<title>KOIDE</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="../../${path}/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../../${path}/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../../${path}/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../../${path}/vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="../../${path}/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../../${path}/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../../${path}/vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="../../${path}/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../../${path}/css/util.css">
	<link rel="stylesheet" type="text/css" href="../../${path}/css/main.css">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100" style="background-image: url('images/bg-01.jpg');">
			
			<div class="img-logo" ></div>
			<div class="wrap-login100 p-b-50">
				<div style="height:160px"></div>
				<form action="insert_user"  method="post" class="login100-form validate-form p-b-33">
					<input type="hidden" name = "action" value="form">
					<div class="wrap-input100 validate-input" data-validate = "不能为空">
						<input class="input100 workid" type="text" name="WORKID" placeholder="工卡号">
						<span class="focus-input100" data-placeholder="&#xe636;"></span>
					</div>
					<div class="wrap-input100 validate-input" data-validate = "不能为空">
						<input class="input100 name" type="text" name="NAME" placeholder="姓名">
						<span class="focus-input100" data-placeholder="&#xe7f7;"></span>
					</div>
					<div class="wrap-input100 validate-input" data-validate="不能为空">
						<input class="input100 pwd" type="password" name="PASSWORD" placeholder="密码">
						<span class="focus-input100" data-placeholder="&#xe654;"></span>
					</div>
					<div class="wrap-input100 validate-input" data-validate="不能为空">
						<input class="input100 confpwd" type="password" name="confirmPWD" placeholder="确认密码">
						<span class="focus-input100" data-placeholder="&#xe654;"></span>
					</div>
					<div class="container-login100-form-btn m-t-32">
						<input class="login100-form-btn register" type="submit" value="注册">
					</div>
					
				</form>
			</div>
		</div>
	</div>
	
<!--===============================================================================================-->
	<script src="../../${path}/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="../../${path}/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="../../${path}/vendor/bootstrap/js/popper.js"></script>
	<script src="../../${path}/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="../../${path}/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="../../${path}/vendor/daterangepicker/moment.min.js"></script>
	<script src="../../${path}/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="../../${path}/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="../../${path}/js/main.js"></script>
	<script type="text/javascript">
		$(function(){
		//验证工卡号是否被注册
			$(".workid").blur(function(){
				//获取工卡号文本框的值
				var workid = $(".workid").val();
				if(workid.trim()!=''){
					$.ajax({
							url:"staff",
							type:"post",data:{WORKID:workid},
							success:function(data){
						   if(data.data=="fail"){
							var thisalert = $(".workid").parent();
							$(thisalert).addClass('alert-validate');
							$($(".workid").parent()).attr("data-validate","该帐号已被注册");
						}
						else
						{
							$(".name").val(data.data);
						}
					
					}
				})
			 }
				else{
					$($(".workid").parent()).attr("data-validate","不能为空");
				}
			})
			
			//验证两次密码是否相等
			$(".validate-form").on("submit",function(){
				var check = true;
				var pwd = $(".pwd").val().trim();
				
				var confpwd = $(".confpwd").val().trim();
					if(pwd != confpwd){
					check = false;
					var thisalert = $(".confpwd").parent();
					$(thisalert).addClass('alert-validate');
					$($(".confpwd").parent()).attr("data-validate","两次密码不一致");
				}
				
				if(confpwd==''){
					$($(".confpwd").parent()).attr("data-validate","不能为空");
				}
				return check;
			})
			
		})
		
		
	</script>
</body>
</html>