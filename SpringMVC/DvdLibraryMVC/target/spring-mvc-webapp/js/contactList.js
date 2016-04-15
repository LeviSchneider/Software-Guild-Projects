/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
    loadDvds();

    $('#add-button').click(function (event) {
        event.preventDefault();

        $.ajax({
            type: 'POST',
            url: 'dvd',
            data: JSON.stringify({
                title: $('#add-title').val(),
                director: $('#add-director').val(),
                studio: $('#add-studio').val(),
                ratings: $('#add-ratings').val(),
                releaseDate: $('#add-release-date').val(),
                notes: $('#add-notes').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            $('#add-title').val('');
            $('#add-director').val('');
            $('#add-studio').val('');
            $('#add-ratings').val('');
            $('#add-release-date').val('');
            $('#add-notes').val('');
            loadDvds();
        });
    });

    $('#edit-button').click(function (event) {
        event.preventDefault();

        $.ajax({
            type: 'PUT',
            url: 'dvd/' + $('#edit-dvd-id').val(),
            data: JSON.stringify({
                title: $('#edit-title').val(),
                director: $('#edit-director').val(),
                studio: $('#edit-studio').val(),
                ratings: $('#edit-ratings').val(),
                releaseDate: $('#edit-release-date').val(),
                notes: $('#edit-notes').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            loadDvds();
        });
    });
});

function loadDvds() {
    clearDataTable();

    var cTable = $('#contentRows');

    $.ajax({
        url: 'dvds'
    }).success(function (data, status) {
        fillDataTable(data, status);
    });
}

function clearDataTable()
{
    $('#contentRows').empty();
}

$('#detailsModal').on('show.bs.modal', function (event) {
    var element = $(event.relatedTarget);
    var dvdId = element.data('dvd-id');
    var modal = $(this);

    $.ajax({
        url: 'dvd/' + dvdId
    }).success(function (dvd) {
        modal.find('#dvd-id').text(dvd.dvdId);
        modal.find('#dvd-title').text(dvd.title);
        modal.find('#dvd-director').text(dvd.director);
        modal.find('#dvd-studio').text(dvd.studio);
        modal.find('#dvd-ratings').text(dvd.ratings);
        modal.find('#dvd-release-date').text(dvd.releaseDate);
        modal.find('#dvd-notes').text(dvd.notes);
    });
});

$('#editModal').on('show.bs.modal', function (event) {
    var element = $(event.relatedTarget);
    var dvdId = element.data('dvd-id');
    var modal = $(this);

    $.ajax({
        url: 'dvd/' + dvdId
    }).success(function (dvd) {
        modal.find('#dvd-id').text(dvd.dvdId);
        modal.find('#edit-title').val(dvd.title);
        modal.find('#edit-director').val(dvd.director);
        modal.find('#edit-studio').val(dvd.studio);
        modal.find('#edit-release-date').val(dvd.releaseDate);
        modal.find('#edit-ratings').val(dvd.ratings);
        modal.find('#edit-notes').val(dvd.notes);
        modal.find('#edit-dvd-id').val(dvd.dvdId);
    });
});

function deleteDvd(id) {
    var answer = confirm("Do you really want to delete this?");

    if (answer === true)
    {
        $.ajax({
            type: 'DELETE',
            url: 'dvd/' + id
        }).success(function () {
            loadDvds();
        });
    }
}

function fillDataTable(dvdLibrary, status) {
    clearDataTable();

    var dTable = $('#contentRows');

    $.each(dvdLibrary, function (index, dvd) {
        dTable.append($('<tr>')
                .append($('<td>')
                        .append($('<a>')
                                .attr({
                                    'data-dvd-id': dvd.dvdId,
                                    'data-toggle': 'modal',
                                    'data-target': '#editModal'
                                })
                                .text(dvd.title)
                                )
                        )
                .append($('<td>').text(dvd.director))
                .append($('<td>')
                        .append($('<a>')
                                .attr({
                                    'data-dvd-id': dvd.dvdId,
                                    'data-toggle': 'modal',
                                    'data-target': '#editModal'
                                })
                                .text('Edit')
                                )
                        )
                .append($('<td>')
                        .append($('<a>')
                                .attr({
                                    'onClick': 'deleteDvd(' + dvd.dvdId + ')'
                                })
                                .text('Delete')
                                )
                        )
                );
    });
}

$('#search-button').click(function (event) {
    event.preventDefault();

    $.ajax({
        type: 'POST',
        url: 'search/dvds',
        data: JSON.stringify({
            title: $('#search-title').val(),
            director: $('#search-director').val(),
            studio: $('#search-studio').val(),
            ratings: $('#search-ratings').val(),
            releaseDate: $('#search-release-date').val(),
            notes: $('#search-notes').val()
        }),
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        'dataType': 'json'
    }).success(function (data, status) {
        $('#search-title').val('');
        $('#search-director').val('');
        $('#search-studio').val('');
        $('#search-ratings').val('');
        $('#search-release-date').val('');
        $('#search-notes').val('');
        loadDvds();
    });
});