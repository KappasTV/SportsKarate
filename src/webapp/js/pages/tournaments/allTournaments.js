$.ajax({
    method: "GET",
    dataType: "json",
    contentType: 'application/json',
    url: "http://sportskarate-union.com:8080/server/tournaments/getAll"
}).done(function (msg) {
    fillTable(msg);
    $('.dataTable').DataTable({
        responsive: true,

    });
    $('.dataTable span').click(event => {
        let id = $(event.currentTarget).data('id');

        $.ajax({
            method: "DELETE",
            dataType: "json",
            contentType: 'application/json',
            url: "http://sportskarate-union.com:8080/server/tournaments/delete",
            data: JSON.stringify({
                id: id,
                participants: null,
                name: null
            })
        }).done(function (msg) {
            window.location.reload();
        });
    });
});


function fillTable(rows) {
    rows.forEach(row => {
        let button = $(`<span class="material-icons" style="cursor: pointer" data-id="${row.id}">delete</span>`);
        $('.dataTable > tbody').append(`<tr><td>${row.name}</td><td>${button[0].outerHTML}</td></tr>`);
    })
}