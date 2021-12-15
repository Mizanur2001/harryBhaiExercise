console.log("this is Alarm clock console.log");

const audio = new Audio('ring.mp3');
const inputTime = document.getElementById('intupTime');
const btn = document.getElementById('btn');
const stopBtn = document.getElementById('stopBtn');
btn.addEventListener('click', functime);

function functime() {
    let time = new Date();
    //add 0 the hours portion 
    if (time.getHours() < 10) {
        var getHours = `0${time.getHours()}`
    }
    else {
        getHours = time.getHours();
    }
    //add 0 the Minutes portion 
    if (time.getMinutes() < 10) {
        var getMinutes = `0${time.getMinutes()}`
    }
    else {
        getMinutes = time.getMinutes();
    }
    //checking The vaule with real time
    if (inputTime.value == getHours + ':' + getMinutes) {
        audio.play();
        let html = ` <button type="submit" onclick="funcStop()" class="btn btn-primary" id="btn">Stop</button>`;
        stopBtn.innerHTML = html;
    }
    else {
        audio.pause();
        html = ``;
        stopBtn.innerHTML = html;
    }
}
setInterval(functime, 1000);

function funcStop() {
    inputTime.value = ``;
    audio.pause();
    html = ``;
    stopBtn.innerHTML = html;
}
