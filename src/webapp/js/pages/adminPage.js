$.ajax({
    method: "GET",
    dataType: "json",
    contentType: 'application/json',
    url: "http://sportskarate-union.com:8080/server/dashboard/get"
}).done(function (model) {
    $($('.info-box .content')[0]).append(`<div class="number count-to" data-from="0" data-to="${model.participantsAmount}" data-speed="2000" data-fresh-interval="20">${model.participantsAmount}</div>`)
    $($('.info-box .content')[1]).append(`<div class="number count-to" data-from="0" data-to="${model.tournamentsAmount}" data-speed="2000" data-fresh-interval="20">${model.tournamentsAmount}</div>`)
    $($('.info-box .content')[2]).append(`<div class="number count-to" data-from="0" data-to="${model.newsAmount}" data-speed="2000" data-fresh-interval="20">${model.newsAmount}</div>`)
    $($('.info-box .content')[3]).append(`<div class="number count-to" data-from="0" data-to="${model.gymsAmount}" data-speed="2000" data-fresh-interval="20">${model.gymsAmount}</div>`)
    $('.count-to').countTo();
});