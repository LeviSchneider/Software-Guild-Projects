/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
    loadAddresses();

    $('#add-button').click(function (event) {
        event.preventDefault();

        $.ajax({
            type: 'POST',
            url: 'address',
            data: JSON.stringify({
                name: $('#add-name').val(),
                addressLine1: $('#add-address-line-1').val(),
                addressLine2: $('#add-address-line-2').val(),
                city: $('#add-city').val(),
                state: $('#add-state').val(),
                zipCode: $('#add-zip-code').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            $('#add-name').val('');
            $('#add-address-line-1').val('');
            $('#add-address-line-2').val('');
            $('#add-city').val('');
            $('#add-state').val('');
            $('#add-zip-code').val('');
            loadAddresses();
        });
    });

    $('#edit-button').click(function (event) {
        event.preventDefault();

        $.ajax({
            type: 'PUT',
            url: 'address/' + $('#edit-address-id').val(),
            data: JSON.stringify({
                name: $('#edit-name').val(),
                addressLine1: $('#edit-address-line-1').val(),
                addressLine2: $('#edit-address-line-2').val(),
                city: $('#edit-city').val(),
                state: $('#edit-state').val(),
                zipCode: $('#edit-zip-code').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            loadAddresses();
        });
    });
});

function loadAddresses() {
    clearAddressTable();

    var aTable = $('#contentRows');

    $.ajax({
        url: 'addresses'
    }).success(function (data, status) {
        $.each(data, function (index, address) {
            aTable.append($('<tr>')
                    .append($('<td>').append($('<a>')
                            .attr({
                                'data-address-id': address.addressId,
                                'data-toggle': 'modal',
                                'data-target': '#detailsModal'
                            })
                            .text(address.name)
                            )
                            )
                    .append($('<td>').text(address.state))
                    .append($('<td>').append($('<a>')
                            .attr({
                                'data-address-id': address.addressId,
                                'data-toggle': 'modal',
                                'data-target': '#editModal'
                            })
                            .text('Edit')
                            ))
                    .append($('<td>')
                    .append($('<a>').attr({
                        'onclick': 'deleteAddress(' + address.addressId + ')'
                    }).text('Delete')))
                    );
        });
    });
}

function clearAddressTable()
{
    $('#contentRows').empty();
}

$('#detailsModal').on('show.bs.modal', function (event) {
    var element = $(event.relatedTarget);
    var addressId = element.data('address-id');
    var modal = $(this);

    $.ajax({
        url: 'address/' + addressId
    }).success(function (address) {
        modal.find('#address-id').text(address.addressId);
        modal.find('#address-name').text(address.name);
        modal.find('#address-address-line-1').text(address.addressLine1);
        modal.find('#address-address-line-2').text(address.addressLine2);
        modal.find('#address-city').text(address.city);
        modal.find('#address-state').text(address.state);
        modal.find('#address-zip-code').text(address.zipCode);
    });

});

$('#editModal').on('show.bs.modal', function (event) {
    var element = $(event.relatedTarget);
    var addressId = element.data('address-id');
    var modal = $(this);

    $.ajax({
        url: 'address/' + addressId
    }).success(function (address) {
        modal.find('#address-id').text(address.addressId);
        modal.find('#edit-name').val(address.name);
        modal.find('#edit-address-line-1').val(address.addressLine1);
        modal.find('#edit-address-line-2').val(address.addressLine2);
        modal.find('#edit-city').val(address.city);
        modal.find('#edit-state').val(address.state);
        modal.find('#edit-zip-code').val(address.zipCode);
        modal.find('#edit-address-id').val(address.addressId);
    });
});

function deleteAddress(id){
    var answer = confirm("Do you really want to delete this contact?");
    
    if(answer === true)
    {
        $.ajax({
            type: 'DELETE',
            url: 'address/' + id
        }).success(function(){
            loadAddresses();
        });
    }
}
