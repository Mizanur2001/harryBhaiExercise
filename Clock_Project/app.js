console.log("This is Clock Project Console.log");
const timeHeading = document.getElementById('timeHeading');
function clock() {
    const time = new Date();
    let getSeconds, getMinutes, getHours, amPm;
    time.getSeconds() < 10 ? getSeconds = `0${time.getSeconds()}` : getSeconds = time.getSeconds();
    time.getMinutes() < 10 ? getMinutes = `0${time.getMinutes()}` : getMinutes = time.getMinutes();
    time.getHours() <= 12 ? amPm = " PM" : amPm = " AM";
    getHours = time.getHours() % 12;
    getHours == 0 ? getHours = 12 : getHours = time.getHours() % 12;
    let nowTime = getHours + ':' + getMinutes + ':' + getSeconds + amPm;
    timeHeading.innerText = nowTime;
}
setInterval(clock, 1000);
