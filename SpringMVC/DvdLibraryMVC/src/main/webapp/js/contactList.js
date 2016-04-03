/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function(){
    loadDvds();
});

function loadDvds() {
    clearDataTable();

    var cTable = $('#contentRows');

    $.each(testDvdData, function (index, dvd) {
        cTable.append($('<tr>')
                .append($('<td>').append($('<a>')
                        .attr({
                            'data-dvd-id': dvd.dvdId,
                            'data-toggle': 'modal',
                            'data-target': '#detailsModal'
                        })
                        .text(dvd.title)

                        )
                        )
                .append($('<td>').text(dvd.director))
                .append($('<td>').append($('<a>')
                        .attr({
                            'data-contact-id': dvd.dvdId,
                            'data-toggle': 'modal',
                            'data-target': '#editModal'
                        })
                        .text('Edit')
                        ))
                .append($('<td>').text('Delete'))
                );
    });

}

function clearDataTable()
{
    $('#contentRows').empty();
}

$('#detailsModal').on('show.bs.modal',function(event){
    var element = $(event.relatedTarget);
    
    var dvdId = element.data('dvd-id');
    
    var modal = $(this);
    modal.find('#dvd-id').text(dummyDetailsDvd.dvdId);
    modal.find('#dvd-title').text(dummyDetailsDvd.title);
    modal.find('#dvd-director').text(dummyDetailsDvd.director);
    modal.find('#dvd-studio').text(dummyDetailsDvd.studio);
    modal.find('#dvd-ratings').text(dummyDetailsDvd.ratings);
    modal.find('#dvd-release-date').text(dummyDetailsDvd.releaseDate);
    modal.find('#dvd-notes').text(dummyDetailsDvd.notes);
});

$('#editModal').on('show.bs.modal', function(event){
    var element = $(event.relatedTarget);
    var dvdId = element.data('dvd-id');
    var modal = $(this);
    modal.find('#edit-id').text(dummyEditDvd.dvdId);
    modal.find('#edit-title').val(dummyEditDvd.title);
    modal.find('#edit-director').val(dummyEditDvd.director);
    modal.find('#edit-studio').val(dummyEditDvd.studio);
    modal.find('#edit-release-date').val(dummyEditDvd.releaseDate);
    modal.find('#edit-ratings').val(dummyEditDvd.ratings);
    modal.find('#edit-notes').val(dummyEditDvd.notes);
});