$('#add_button').click(function () {
    let address = $('#address').val();
    let phone1 = $('#phone1').val();
    let phone2 = $('#phone2').val();
    let frame = $('#frame').val();

    $.ajax({
        method: "POST",
        dataType: "json",
        contentType: 'application/json',
        url: "http://www.localhost:8080/gyms/add",
        data: JSON.stringify({
            address: address,
            phone1: phone1,
            phone2: phone2,
            frame: frame
        })
    }).done(function (msg) {
        console.log(msg);
    });
});