$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/thcode/clientes"
    }).then(function(data) {
        $('.clientes-nombre').append(data.nombre);
        $('.clientes-apellido').append(data.apellido);
    });
});