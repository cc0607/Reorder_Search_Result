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
		.buttonGroup{
		
			width: 600px;
  			height: 300px;
  			position: relative;
  			top: 60%;
  			left: 60%;
		
		}
		
		.buttonGroup button{
		
			background-color:#6F4849;
			color:white;
			display: table-cell;
  			horizontal-align: middle;

		}
		
		
</style>
<script type="text/javascript">

function click60() {
	document.getElementsByName("searchNum")[0].value = 60;
	
}
function click20() {
	document.getElementsByName("searchNum")[0].value = 20;
	
}
function click40() {
	document.getElementsByName("searchNum")[0].value = 40;
	
}
function click80() {
	document.getElementsByName("searchNum")[0].value = 80;
}

function languageChin(){
	
	document.getElementsByName("languages")[0].value= 'chinese';
	document.getElementsByName("languageDrop")[0].innerHTML= 'Show result in Chinese';
	
}

function languageAny(){
	
	document.getElementsByName("languages")[0].value= 'any';
	document.getElementsByName("languageDrop")[0].innerHTML = 'Any language';
	
}

</script>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>


</head>


	<body>
	
		<form action='${requestUri}' method='get'>
	
			<div class="search">
				<img src="./image/chocoholic.jpg" class="rounded mx-auto d-block" alt="chocolate">
				<input type="text" placeholder="Search..."id="keyword" name="keyword" style='width: 60%;
			border-radius: 30px;
			outline: none;
			padding-left: 10px ;
			padding-top: 10px ;
			padding-bottom: 10px ;
			border:  solid 1px darkgray;'><br>
				
				<input type='image' src="images/loupe-2.png" style='position:relative; padding-left:70%;width:37px;height:37px;margin-top:-55px;
				margin-left:368px;'/>
				
			</div>
			
			
			<div class='buttonGroup' style='padding-top: 20px; padding-bottom:20px'>
				
					
					<div class="btn-group" role="group" aria-label="Button group with nested dropdown">
  						<button type="button" name="20result" class="btn btn-secondary" onclick='click20()' >20</button>
  						<button type="button" name="40result" class="btn btn-secondary" onclick='click40()' >40</button>
  						<button type="button" name="60result" class="btn btn-secondary" onclick='click60()' >60</button>
  						<button type="button" name="80result" class="btn btn-secondary" onclick='click80()' >80</button>

  						<div class="btn-group" role="group">
    						<button id="languageDrop" name="languageDrop" type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
      								Language
    						</button>
    						<div class="dropdown-menu" aria-labelledby="btnGroupDrop1">
      							<a class="dropdown-item" onclick='languageChin()'>Show result in Chinese</a>
      							<a class="dropdown-item" onclick='languageAny()'>Any language</a>
    						</div>
  						</div>
					</div>
			</div>
			
			
			
			<div>
				<input type="text" value=20 id="searchNum" name="searchNum" style='visibility:hidden'>
				<input type='text' value='any' id="languages" name="languages" style='visibility:hidden'>
			</div>
			
			
			
		</form>
		
	
	
		
	
</body>
	

</html>
