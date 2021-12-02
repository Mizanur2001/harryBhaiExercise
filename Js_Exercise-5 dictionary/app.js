console.log("This is my Dictionary console.log()");

let searchBtn = document.getElementById('searchBtn');
let input = document.getElementById('input');
let ulList = document.getElementById('ulList');
let wordHead = document.getElementById('wordHead');
let para = document.getElementById('para');

searchBtn.addEventListener('click', clickBtnSerach);
function clickBtnSerach(e) {
    e.preventDefault();
    const xhr = new XMLHttpRequest();
    xhr.open('GET', '/dictionary.json', true);
    xhr.onprogress = function () {
        html = `<h3>Loading....</h3>`;
        ulList.innerHTML = html;
    }
    xhr.onload = function () {
        let obj = JSON.parse(this.responseText);
        wordHead.innerText = `Search resutl for "${input.value}"`;
        let html = ``;
        if (input.value == obj.word) {
            para.innerHTML = "<u>definition</u>"
            obj.results.forEach(function (element) {
                html += `<li>${element.definition}</li>`;
                console.log(element.definition);
            });
            ulList.innerHTML = html;
            console.log(obj.results);
        }
        else {
            html = `<h3>Sorry No data fount in JSON file Sorry :(</h3>`;
            ulList.innerHTML = html;
        }
    }
    xhr.send();
}