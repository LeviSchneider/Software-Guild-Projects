/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
    loadAddresses();
});

function loadAddresses() {
    clearAddressTable();

    var aTable = $('#contentRows');

    $.each(testAddressData, function (index, address) {
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
                .append($('<td>').text('Delete'))
                );
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
    modal.find('#address-id').text(dummyDetailsAddress.addressId);
    modal.find('#address-name').text(dummyDetailsAddress.name);
    modal.find('#address-address-line-1').text(dummyDetailsAddress.addressLine1);
    modal.find('#address-address-line-2').text(dummyDetailsAddress.addressLine2);
    modal.find('#address-city').text(dummyDetailsAddress.city);
    modal.find('#address-state').text(dummyDetailsAddress.state);
    modal.find('#address-zip-code').text(dummyDetailsAddress.zipCode);
});

$('#editModal').on('show.bs.modal', function (event) {
    var element = $(event.relatedTarget);
    var addressId = element.data('address-id');
    var modal = $(this);
    modal.find('#address-id').text(dummyEditAddress.addressId);
    modal.find('#edit-name').val(dummyEditAddress.name);
    modal.find('#edit-address-line-1').val(dummyEditAddress.addressline1);
    modal.find('#edit-address-line-2').val(dummyEditAddress.addressline2);
    modal.find('#edit-city').val(dummyEditAddress.city);
    modal.find('#edit-state').val(dummyEditAddress.state);
    modal.find('#edit-zip-code').val(dummyEditAddress.zipCode);
});