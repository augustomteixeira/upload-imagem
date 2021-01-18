$(document).on('click', '#button-modal-upload', function (e) {
	$('#modal-upload-imagem').modal('show');
});

$(document).on('change', '#input-carregar-imagem', function (e) {
	lerInput(this);
});



function lerInput(input) {
	if (input.files && input.files[0]) { 
		var reader = new FileReader();
		
		reader.onload = function(e) {
			$('#vizualizar-imagem-modal').attr('src', e.target.result);
			$('#vizualizar-imagem-modal').show();
		}
		
		reader.readAsDataURL(input.files[0]); //converte a imagem para base64
	}
}