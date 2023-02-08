document.getElementById("createUser-form").addEventListener("submit", function(event){
    event.preventDefault();

    const formData = new FormData();

    formData.append("inputFirstName", document.querySelector("#inputFirstName").value);
    formData.append("inputLastName", document.querySelector("#inputLastName").value);
    formData.append("inputEmail", document.querySelector("#inputEmail").value);
    formData.append("inputPassword", document.querySelector("#inputPassword").value);
    formData.append("inputStreetAdress", document.querySelector("#inputStreetAdress").value);
    formData.append("StreetNumber", document.querySelector("#StreetNumber").value);
    formData.append("City", document.querySelector("#City").value);
    formData.append("PostalCode", document.querySelector("#PostalCode").value);
    formData.append("Country", document.querySelector("#Country").value);
    

    $.ajax({
        url: 'http://localhost:8080/user',
        method: 'POST',
        dataType: 'json',
        contentType: 'application/json',
        data: JSON.stringify ({

            firstName: document.querySelector("#inputFirstName").value,
            lastName: document.querySelector("#inputLastName").value,
            email: document.querySelector("#inputEmail").value,
            password: document.querySelector("#inputPassword").value,
            streetAdress: document.querySelector("#inputStreetAdress").value,
            streetNumber: document.querySelector("#StreetNumber").value,
            city: document.querySelector("#City").value,
            postalCode: document.querySelector("#PostalCode").value,
            country: document.querySelector("#Country").value
            
        }), 
        success: function (response){console.log("Registration successful")},
        error: function (error){console.log(error)}
    });
});
