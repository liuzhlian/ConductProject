$(function()
{
	var userInfo=new Vue({
		el : '#login-form',
		data: {
			user:{
			name:'',
			password:''
			}
		},
		methods : {
			showtables : function() {
				if(userInfo.user.name==""){
					alert("用户名不能为空");
					return;
				}
				if(userInfo.user.password==""){
					alert("密码不能为空");
					return;
				}
				var data=JSON.stringify([userInfo.user]);
				$.ajax({
					url:"/userLogin",
				    type: 'POST',
                    dataType: "json",
                    data: JSON.stringify(userInfo.user),
                    contentType: "application/json",
                    success: function (data) {
                    	if(data.status==true){
                    		window.location.href="/reports/index.html";
                    		return;
                    	}
                    	alert("登录失败");
                     },
                    error: function (a, b, c) {
                    }
				});
                
			}
		}
	});
});