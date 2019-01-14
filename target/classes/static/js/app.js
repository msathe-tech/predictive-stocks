function get(theUrl, callback)
{
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.onreadystatechange = function() {
        if (xmlHttp.readyState == 4 && xmlHttp.status == 200)
            callback(xmlHttp.responseText);
    }
    xmlHttp.open("GET", theUrl, true); // true for asynchronous
    xmlHttp.send(null);
}

function nameAndStock() {
    var name = document.getElementById("name").value;
    get("/service/greet/"+name, function (response) {
        document.getElementById("hello").innerText = response;
    })
    get("/service/quote", function (response) {
        document.getElementById("stock").innerText = response;
    })
}

function clearNameAndStock() {
    document.getElementById("name").value = "";
    document.getElementById("hello").innerText = "";
    document.getElementById("stock").innerText = "";
}