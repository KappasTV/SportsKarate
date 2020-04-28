$.ajax({
    method: "GET",
    dataType: "json",
    contentType: 'application/json',
    url: "http://www.localhost:8080/participants/getAll"
}).done(function (msg) {
    fillTable(msg);
    $('.dataTable').DataTable({
        responsive: true,
        columns: [
            null,
            null,
            null,
            {
                data: null,
                defaultContent: "<button>Edit</button>"
            }
        ]
    });
});


function fillTable(rows) {
    rows.forEach(row => {
        console.log(row);
        $('.dataTable > tbody').append(`<tr><td>${row.name}</td><td>${row.surname}</td><td>${row.category.name}</td><td></td></tr>`);
    })
}