$('#add_button').click(function () {
    let name = $('#name').val();
    $.ajax({
        method: "POST",
        dataType: "json",
        contentType: 'application/json',
        url: "http://sportskarate-union.com:8080/server/categories/add",
        data: JSON.stringify({
            name: name
        })
    }).done(function (msg) {
        console.log(msg);
    });
});