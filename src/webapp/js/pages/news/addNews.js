$('#add_button').click(function () {
    let frame = $('#name').val();
    $.ajax({
        method: "POST",
        dataType: "json",
        contentType: 'application/json',
        url: "http://sportskarate-union.com:8080/server/news/add",
        data: JSON.stringify({
            frame: frame
        })
    }).done(function (msg) {
        console.log(msg);
    });
});