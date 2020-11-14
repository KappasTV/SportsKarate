$.ajax({
    method: "GET",
    dataType: "json",
    contentType: 'application/json',
    url: "http://sportskarate-union.com:8080/server/news/getAll"
}).done(function (news) {
    news.forEach(n => {
        let g = $(n.frame).css("width", "-webkit-fill-available");
        console.log(g);
        $('#news-section').append(`
            <div class="col-lg-6 col-md-12 col-sm-12 col-xs-12">
                ${g[0].outerHTML}
            </div>
        `);
    })
});

