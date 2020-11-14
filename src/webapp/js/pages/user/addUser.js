$('#add_button').click(function () {
    let name = $('#name').val();
    let surname = $('#surname').val();
    let category = $('#category').val();
    $.ajax({
        method: "POST",
        dataType: "json",
        contentType: 'application/json',
        url: "http://sportskarate-union.com:8080/server/addParticipant",
        data: JSON.stringify({
            name: name,
            surname: surname,
            category: {
                name: category
            }
        })
    }).done(function (msg) {
        console.log(msg);
    });
});