$.ajax({
    method: "GET",
    dataType: "json",
    contentType: 'application/json',
    url: "http://www.localhost:8080/category/getAll"
}).done(function (msg) {
    fillTable(msg);
    $('.dataTable').DataTable({
        responsive: true,
        columns: [
            {
                data: msg
            },
            {
                data: null,
                defaultContent: "<button>Delete</button>"
            }
        ]
    });
});


function fillTable(rows) {
    rows.forEach(row => {
        console.log(row);
        $('.dataTable > tbody').append(`<tr><td>${row.name}</td><td></td></tr>`);
    })
}