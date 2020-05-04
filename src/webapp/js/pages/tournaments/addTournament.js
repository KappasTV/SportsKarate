$('#add_button').click(function () {
    let name = $('#name').val();
    $.ajax({
        method: "POST",
        dataType: "json",
        contentType: 'application/json',
        url: "http://www.localhost:8080/tournaments/add",
        data: JSON.stringify({
            name: name,
            participants: null
        })
    }).done(function (msg) {
        console.log(msg);
    });
});