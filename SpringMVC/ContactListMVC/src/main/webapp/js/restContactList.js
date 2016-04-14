/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function(){
   
    loadContacts();
    
    $('#add-button').click(function(event){
        
        event.preventDefault();
        
        $.ajax({
            type: 'POST',
            url: 'http://localhost:8080/ContactListMVC/contact',
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
        }).success(function(data, status){
            $('#add-first-name').val('');
            $('#add-last-name').val('');
            $('#add-company').val('');
            $('#add-email').val('');
            $('#add-phone').val('');
            loadContacts();
        }).error(function(data, status){
            $.each(data.responseJSON.fieldErrors, function(index, validationError){
                var errorDiv = $('#validationErrors');
                errorDiv.append(validationError.message).append($('<br>'));
            });
        });
    });
    
    $('#edit-button').click(function(event){
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
        }).success(function(data, status){
            hideEditForm();
            loadContacts();
        })    
    })
    
});

function loadContacts(){
    clearContactTable();
    
    var contentRows = $('#contentRows');
    
    $.ajax ({
        type: 'GET',
        url: 'http://localhost:8080/ContactListMVC/contacts'
    }).success(function(data, status){
       $.each(data, function(index, contact){
           var name = contact.firstName + " " + contact.lastName;
           var company = contact.company;
           var id = contact.contactId;
           
           var row = '<tr>';
           row += '<td>' + name + '</td>';
           row += '<td>' + company + '</td>';
           row += '<td><a onclick="showEditForm(' + id + ')">Edit</a></td>';
           row += '<td><a onclick="deleteContact(' + id + ')">Delete</a></td>';
           row += '</td>';
           contentRows.append(row);
       });
    });
};

function clearContactTable(){
    $('#contentRows').empty();
};

function deleteContact(contactId){
    $.ajax({
        type: 'DELETE',
        url: 'http://localhost:8080/ContactListMVC/contact/' + contactId
    }).success(function(){
        hideEditForm();
        loadContacts();
    });
};

function showEditForm(contactId){
    $.ajax({
        type: 'GET',
        url: 'contact/' + contactId
    }).success(function(contact, status){
       $('#edit-first-name').val(contact.firstName);
       $('#edit-last-name').val(contact.lastName);
       $('#edit-company').val(contact.company);
       $('#edit-email').val(contact.email);
       $('#edit-phone').val(contact.phone);
       $('#edit-contact-id').val(contact.contactId);
       $('#editFormDiv').show();
       $('#addFormDiv').hide();
    });
}
function hideEditForm(){
       $('#edit-first-name').val('');
       $('#edit-last-name').val('');
       $('#edit-company').val('');
       $('#edit-email').val('');
       $('#edit-phone').val('');
       $('#edit-contact-id').val('');
       $('#addFormDiv').show();
       $('#editFormDiv').hide();

};