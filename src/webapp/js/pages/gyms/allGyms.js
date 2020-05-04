$.ajax({
    method: "GET",
    dataType: "json",
    contentType: 'application/json',
    url: "http://www.localhost:8080/gyms/getAll"
}).done(function (gyms) {
    gyms.forEach(gym => {
        let frame = $(gym.frame).css('width', '-webkit-fill-available');
        $('#gyms-section').append(`
        <div class="col-md-6 col-lg-4 mb-4 mb-lg-4">     
            ${frame[0].outerHTML}
            <div class="unit-4 d-block">
                <div class="unit-4-icon m b-3">
                    <span class="icon-wrap">
                        <span class="text-primary  icon-map-marker"></span>
                    </span>
                </div>
                <div>
                    <h3>${gym.address}</h3>
                    <p>${gym.phone1}<br>${gym.phone2}</p>
                </div>
            </div>
        </div>`);
    });
});

