$(document).ready(function() {
    debugger;
    var origin = window.location.origin;
    $.ajax({
        url: origin + '/greeting'
    }).then(function(data) {
        $('.greeting-id').append(data.id);
        $('.greeting-content').append(data.name);
    });
});