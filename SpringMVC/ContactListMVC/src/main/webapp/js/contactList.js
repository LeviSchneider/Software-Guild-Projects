/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
    if ($('home'))
    {
        loadContacts();
    }

    $('#add-button').click(function (event) {

        event.preventDefault();

        $.ajax({
            type: 'POST',
            url: 'contact',
            data: JSON.stringify({
                firstName: $('#add-first-name').val(),
                lastName: $('#add-last-name').val(),
                company: $('#add-company').val(),
                email: $('#add-email').val(),
                phone: $('#add-phone').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            $('#add-first-name').val('');
            $('#add-last-name').val('');
            $('#add-company').val('');
            $('#add-email').val('');
            $('#add-phone').val('');
            loadContacts();
        });
    });

    $('#edit-button').click(function (event) {
        event.preventDefault();

        $.ajax({
            type: 'PUT',
            url: 'contact/' + $('#edit-contact-id').val(),
            data: JSON.stringify({
                firstName: $('#edit-first-name').val(),
                lastName: $('#edit-last-name').val(),
                company: $('#edit-company').val(),
                email: $('#edit-email').val(),
                phone: $('#edit-phone').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            loadContacts();
        });
    });
});


function loadContacts() {
    clearContactTable();

    var cTable = $('#contentRows');

    $.ajax({
        url: 'contacts'
    }).success(function (data, status) {
        fillContactTable(data, status);
    });
}

function clearContactTable()
{
    $("#contentRows").empty();
}

$('#detailsModal').on('show.bs.modal', function (event) {
    var element = $(event.relatedTarget);
    var contactId = element.data('contact-id');
    var modal = $(this);

    $.ajax({
        url: 'contact/' + contactId
    }).success(function (contact) {
        modal.find('#contact-id').text(contact.contactId);
        modal.find('#contact-firstName').text(contact.firstName);
        modal.find('#contact-lastName').text(contact.lastName);
        modal.find('#contact-company').text(contact.company);
        modal.find('#contact-phone').text(contact.phone);
        modal.find('#contact-email').text(contact.email);
    });

});

$('#editModal').on('show.bs.modal', function (event) {
    var element = $(event.relatedTarget);
    var contactId = element.data('contact-id');
    var modal = $(this);

    $.ajax({
        url: 'contact/' + contactId
    }).success(function (contact) {
        modal.find('#contact-id').text(contact.contactId);
        modal.find('#edit-first-name').val(contact.firstName);
        modal.find('#edit-last-name').val(contact.lastName);
        modal.find('#edit-company').val(contact.company);
        modal.find('#edit-phone').val(contact.phone);
        modal.find('#edit-email').val(contact.email);
        modal.find('#edit-contact-id').val(contact.contactId);
    });
});

function deleteContact(id) {
    var answer = confirm("Do you really want to delete this contact?");

    if (answer === true)
    {
        $.ajax({
            type: 'DELETE',
            url: 'contact/' + id
        }).success(function () {
            loadContacts();
        });
    }
}

function fillContactTable(contactList, status) {
    clearContactTable();

    var cTable = $('#contentRows');

    $.each(contactList, function (index, contact) {
        cTable.append($('<tr>')
                .append($('<td>')
                        .append($('<a>')
                                .attr({
                                    'data-contact-id': contact.contactId,
                                    'data-toggle': 'Modal',
                                    'data-target': '#detailsModal'
                                })
                                .text(contact.firstName + ' ' + contact.lastName)
                                )
                        )
                .append($('<td>').text(contact.company))
                .append($('<td>')
                        .append($('<a>')
                                .attr({
                                    'data-contact-id': contact.contactId,
                                    'data-toggle': 'modal',
                                    'data-target': '#editModal'
                                })
                                .text('Edit')
                                )
                        )
                .append($('<td>')
                        .append($('<a>')
                                .attr({
                                    'onClick': 'deleteContact(' + contact.contactId + ')'
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
        url: 'search/contacts',
        data: JSON.stringify({
            firstName: $('#search-first-name').val(),
            lastName: $('#search-last-name').val(),
            company: $('#search-company').val(),
            phone: $('#search-phone').val(),
            email: $('#search-email').val()
        }),
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        'dataType': 'json'
    }).success(function (data, status) {
        $('#search-first-name').val('');
        $('#search-last-name').val('');
        $('#search-company').val('');
        $('#search-email').val('');
        $('#search-phone').val('');

        fillContactTable(data, status);
    });
});