/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function(){
   loadContacts(); 
});

function loadContacts(){
    clearContactTable();
    
    var cTable = $('#contentRows');
    
    $.each(testContactData, function(index,contact){
        cTable.append($('<tr>')
                .append($('<td>').append($('<a>')
                        .attr({
                            'data-contact-id': contact.contactId,
                            'data-toggle': 'modal',
                            'data-target': '#detailsModal'
                        })
                        .text(contact.firstName + ' ' + contact.lastName)
                        
                        ) //end of <a> append
                    ) //end of <td> append
                .append($('<td>').text(contact.company))
                .append($('<td>').append($('<a>')
                .attr({
                    'data-contact-id': contact.contactId,
                    'data-toggle': 'modal',
                    'data-target': '#editModal'
                })
                .text('Edit')
                ))
                .append($('<td>').text('Delete'))
                );
    });
}

function clearContactTable()
{
    $("#contentRows").empty();
}

$('#detailsModal').on('show.bs.modal', function(event){
    var element = $(event.relatedTarget);
    
    var contactId = element.data('contact-id');
    
    var modal = $(this);
    modal.find('#contact-id').text(dummyDetailsContact.contactId);
    modal.find('#contact-firstName').text(dummyDetailsContact.firstName);
    modal.find('#contact-lastName').text(dummyDetailsContact.lastName);
    modal.find('#contact-company').text(dummyDetailsContact.company);
    modal.find('#contact-phone').text(dummyDetailsContact.phone);
    modal.find('#contact-email').text(dummyDetailsContact.email);
});

$('#editModal').on('show.bs.modal', function(event){
 var element = $(event.relatedTarget);
 var contactId = element.data('contact-id');
 var modal = $(this);
 //use .text on text display fields like <h3> or <span>
 modal.find('#contact-id').text(dummyEditContact.contactId);
 //use .val on input fields
 modal.find('#edit-first-name').val(dummyEditContact.firstName);
 modal.find('#edit-last-name').val(dummyEditContact.lastName);
 modal.find('#edit-company').val(dummyEditContact.company);
 modal.find('#edit-phone').val(dummyEditContact.phone);
 modal.find('#edit-email').val(dummyEditContact.email);
});