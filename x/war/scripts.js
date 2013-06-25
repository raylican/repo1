// Fix iPhone viewport scaling bug on orientation change
(function(doc) {
	
	var addEvent = 'addEventListener',
	    type = 'gesturestart',
	    qsa = 'querySelectorAll',
	    scales = [1, 1],
	    meta = qsa in doc ? doc[qsa]('meta[name=viewport]') : [];
	
	function fix() {
		meta.content = 'width=device-width,minimum-scale=' + scales[0] + ',maximum-scale=' + scales[1];
		doc.removeEventListener(type, fix, true);
	}
	
	if ((meta = meta[meta.length - 1]) && addEvent in doc) {
		fix();
		scales = [.25, 1.6];
		doc[addEvent](type, fix, true);
	}

}(document));

// Dropdown menu
$(document).ready(function(){
	
 // Create the dropdown base
	$("<select />").appendTo("header nav");
	
 // Create default option "Go to..."
	$("<option />", {
		"selected": "selected",
		"value"   : "",
		"text"    : "Menu..."
		}).appendTo("nav select");
		
 // Populate dropdown with menu items
	$("header nav a").each(function() {
		var el = $(this);
		$("<option />", {
			"value"   : el.attr("href"),
			"text"    : el.text()
			}).appendTo("header nav select");
		});
		
  // To make dropdown actually work
	$("header nav select").change(function() {
		window.location = $(this).find("option:selected").val();
	});
	
});