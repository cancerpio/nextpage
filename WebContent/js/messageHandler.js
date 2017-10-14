var MessageHandler;
if (MessageHandler == null) {
    MessageHandler = {};
}

MessageHandler.init = function() {
    alert('haha');
    $j.ajax({
	url: 'MessageController/insertRow',
	method: "POST",
	data: {"index":"index1",
	    "document":"document1"},
	success: function(response){
	    printMsg(response);
	},
	
    });
    
    
}

var printMsg = function(data){
    alert('Display you:'+data);
};
