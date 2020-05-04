$('#add_button').click(function () {
    let frame = $('#name').val();
    $.ajax({
        method: "POST",
        dataType: "json",
        contentType: 'application/json',
        url: "http://www.localhost:8080/news/add",
        data: JSON.stringify({
            frame: frame
        })
    }).done(function (msg) {
        console.log(msg);
    });
});