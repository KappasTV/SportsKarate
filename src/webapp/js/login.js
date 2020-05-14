$('#login').click(e => {
   let username = $('#username').val();
   let password = $('#password').val();
    $.ajax({
        method: "POST",
        dataType: "json",
        contentType: 'application/json',
        url: "http://www.localhost:8080/login",
        data: JSON.stringify({
            username: username,
            password: password
        })
    }).done(function (msg) {
        if (msg) {
            window.localStorage.setItem('loggedIn', true);
            window.location.href = "http://localhost:63342/SportsKarate/src/webapp/pages/admin.html"
        }
    });
});