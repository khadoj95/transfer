/**
 *$.gat(href, function(c,status) {
 $('#ide').val(c.id);
	$('#nome').val(c.nom);
	$('#prenome').val(c.prenom);
	$('#Tele').val(c.Tel);
	
	
});
 */
$('document').ready(function(){	
	
	
	
$('.table #deleteButton').on('click',function(event){
	event.preventDefault();		
	var href = $(this).attr('href');
	$('#deleteModal #delRef').attr('href', href);		
	$('#deleteModal').modal();
});

});