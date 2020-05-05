$.ajax({
    method: "GET",
    dataType: "json",
    contentType: 'application/json',
    url: "http://www.localhost:8080/participants/getAll"
}).done(function (msg) {
    fillTable(msg);
    $('.dataTable').DataTable({
        responsive: true
    });
    $('.dataTable span').click(event => {
        let id = $(event.currentTarget).data('id');

        $.ajax({
            method: "DELETE",
            dataType: "json",
            contentType: 'application/json',
            url: "http://www.localhost:8080/participants/delete",
            data: JSON.stringify({
                id: id,
                participants: null,
                name: null,
                surname: null
            })
        }).done(function (msg) {
            window.location.reload();
        });
    });
});


function fillTable(rows) {
    rows.forEach(row => {
        let button = $(`<span class="material-icons" style="cursor: pointer" data-id="${row.id}">delete</span>`);
        $('.dataTable > tbody').append(`<tr><td>${row.name}</td><td>${row.surname}</td><td>${row.category.name}</td><td>${button[0].outerHTML}</td></tr>`);
    });
}