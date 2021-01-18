$(document).on('click', '#button-modal-upload', function (e) {
	$('#modal-upload-imagem').modal('show');
});

$(document).on('change', '#input-carregar-imagem', function (e) {
	lerInput(this);
});

$(document).on('click', '#anexar-imagem', function (e) {
	$('#div-salvar-imagem').removeClass('invisible');
	
	let src = $('#vizualizar-imagem-modal').attr('src');
	$('#vizualizar-imagem-anexada').attr('src', src);
	
	$('#codigoBase64').val(src);
})

function lerInput(input) {
	if (input.files && input.files[0]) { 
		var reader = new FileReader();
		
		reader.onload = function(e) {
			$('#vizualizar-imagem-modal').attr('src', e.target.result);
			$('#anexar-imagem').prop('disabled', false);
			$('#vizualizar-imagem-modal').show();
		}
		
		reader.readAsDataURL(input.files[0]); //converte a imagem para base64
	}
}