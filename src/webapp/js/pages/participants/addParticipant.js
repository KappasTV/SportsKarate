$.ajax({
    method: "GET",
    dataType: "json",
    contentType: 'application/json',
    url: "http://sportskarate-union.com:8080/server/categories/getAll"
}).done(function (data) {
    console.log(data);
    data.forEach(category => {
       $('#category').append(`<option value="${category.id}">${category.name}</option>`);
       console.log(category);
       console.log($('#category').val());
    });
    $('#category').selectpicker();
});


$('#add_button').click(function () {
    let name = $('#name').val();
    let surname = $('#surname').val();
    let category = $('#category').val();
    $.ajax({
        method: "POST",
        dataType: "json",
        contentType: 'application/json',
        url: "http://sportskarate-union.com:8080/server/participants/add",
        data: JSON.stringify({
            name: name,
            surname: surname,
            category: {
                id: category
            }
        })
    }).done(function (msg) {
        console.log(msg);
    });
});
