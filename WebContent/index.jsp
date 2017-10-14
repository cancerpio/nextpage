<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- import js -->
<script src="js/jquery-3.1.1.js"></script>
<script src="js/messageHandler.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nextpage</title>
<!-- initialize -->
<script type="text/javascript">
    var $j = $.noConflict();
    $j(document).ready(function() {
	console.log('hihi');
	MessageHandler.init();
    });
</script>
</head>
<body>
haha
<form>
<input id = 'inputText1' type="text" name="inputText" >
<input id = 'inputButton1' type="button" name="inputButton" value='insert! '>
</form>
</body>
</html>