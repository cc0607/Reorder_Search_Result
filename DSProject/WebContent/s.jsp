
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="UTF-8">
<title>GoogleSearch</title>

<style type="text/css">

		.search{
			margin: 0;
			text-align: center;

		}

		.search img{

			padding: 50px 0px 0px 0px;
		}
		.search h4{

			margin: 50px 0px 20px 0px;
		}

		.search input{

			width: 60%;
			border-radius: 30px;
			outline: none;
			padding-left: 10px ;
			padding-top: 10px ;
			padding-bottom: 10px ;
			border:  solid 1px darkgray;

		}

		.search button{

			padding: 10px 0px 0px 0px;
		}
		
		text{
			
			padding : 10px 0px 0px 10px;
		}
		
		suggest{
		
			
		}
		
		.suggest img{
		
			
		}
		buttonGroup{
		
			width: 600px;
  			height: 300px;
  			position: absolute;
  			top: 50%;
  			left: 50%;
		
		}
		
		.buttonGroup button{
		
			background-color:#E2CBAC;
			color:white;
			display: table-cell;
  			horizontal-align: middle;
			
			
		
		}
		
		
</style>

</head>


	<body>
	
		<form action='${requestUri}' method='get'>
	
			<div class="search">
				<img src="./image/chocoholic.jpg" class="rounded mx-auto d-block" alt="chocolate">
				<input type="text" placeholder="Search..."id="keyword" name="keyword"><br>
				
			</div>
		</form>
		
		<div class='buttonGroup' style='padding-top: 20px; padding-bottom:20px'>
				
					<button type="button" class="btn btn-secondary" onclick='click20()' value='<%=request.getParameter("searchNum")%>'>20</button>
					<button type='button' class="btn btn-secondary" onclick='click40()' value='<%=request.getParameter("searchNum")%>'>40</button>
					<button type='button' class="btn btn-secondary" onclick='click60()' value='<%=request.getParameter("searchNum")%>'>60</button>
					<button type='button' class="btn btn-secondary" onclick='click80()' value='<%=request.getParameter("searchNum")%>'>80</button>
					
					<button type='button' class="btn btn-secondary" onclick='languageChin()' value='<%=request.getParameter("languages")%>'>Show result in Chinese</button>
					
					
			</div>
			
			
		
			<div class="suggest">
				<a href="http://www.google.com/search?q=福灣巧克力&oe=utf8&num=20"><img src="./image/福灣.png"></a>
			</div>
	
	
	
		<script>
	
	
		</script>
	
</body>
	

</html>