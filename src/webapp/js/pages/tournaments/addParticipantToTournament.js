$.ajax({
    method: "GET",
    dataType: "json",
    contentType: 'application/json',
    url: "http://sportskarate-union.com:8080/server/participants/getAll"
}).done(function (data) {
    data.forEach(participant => {
        $('#participants').append(`<option value="${participant.id}">${participant.name + ' ' + participant.surname + ' (' + participant.category.name +')' }</option>`);
    });
    $('#participants').selectpicker();
});

$.ajax({
    method: "GET",
    dataType: "json",
    contentType: 'application/json',
    url: "http://sportskarate-union.com:8080/server/tournaments/getAll"
}).done(function (data) {
    data.forEach(tournament => {
        $('#tournament').append(`<option value="${tournament.id}">${tournament.name}</option>`);
    });
    $('#tournament').selectpicker();
});

$('#add_button').click(function () {
    let name = $('#name').val();
    let surname = $('#surname').val();
    let category = $('#category').val();
    // $.ajax({
    //     method: "POST",
    //     dataType: "json",
    //     contentType: 'application/json',
    //     url: "http://sportskarate-union.com:8080/server/participants/add",
    //     data: JSON.stringify({
    //         name: name,
    //         surname: surname,
    //         category: {
    //             id: category
    //         }
    //     })
    // }).done(function (msg) {
    //     console.log(msg);
    // });
});
