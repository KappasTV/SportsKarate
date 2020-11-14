$('#login').click(e => {
   let username = $('#username').val();
   let password = $('#password').val();
    $.ajax({
        method: "POST",
        dataType: "json",
        contentType: 'application/json',
        url: "http://sportskarate-union.com:8080/server/login",
        data: JSON.stringify({
            username: username,
            password: password
        })
    }).done(function (msg) {
        if (msg) {
            window.localStorage.setItem('loggedIn', true);
            window.location.href = "http://sportskarate-union.com/pages/admin.html"
        }
    });
});