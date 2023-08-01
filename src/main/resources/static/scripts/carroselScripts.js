const img1 = [...document.getElementsByClassName("img1")];
let c = 1;
document.getElementById("btn1").classList.add("active");
const mudarCarrosel = () => {
    document.getElementById("btn1").classList.remove("active");
    document.getElementById("btn2").classList.remove("active");
    document.getElementById("btn3").classList.remove("active");
  if (c == 3) {
    c = 1;
    document.getElementById("btn1").classList.add("active");
    document.getElementById("btn3").classList.remove("active");
    img1.map(ele => ele.style.marginLeft = "-0%")
  } else {
    document.getElementById("btn" + c).classList.remove("active");
    c++;
    document.getElementById("btn" + c).classList.add("active");
    img1.map(ele => ele.style.marginLeft = `-${c - 1}00%`)
  }
};
const intervaloCarrosel = setInterval(mudarCarrosel, 3000);

document.getElementById("btn1").addEventListener("click",()=>{
    img1.map(ele => ele.style.marginLeft = `-0%`)
    document.getElementById("btn1").classList.add("active");
    document.getElementById("btn2").classList.remove("active");
    document.getElementById("btn3").classList.remove("active");
    c = 1
})

document.getElementById("btn2").addEventListener("click",()=>{
    img1.map(ele => ele.style.marginLeft = `-100%`)
    document.getElementById("btn1").classList.remove("active");
    document.getElementById("btn2").classList.add("active");
    document.getElementById("btn3").classList.remove("active");
    c = 2
})

document.getElementById("btn3").addEventListener("click",()=>{
    img1.map(ele => ele.style.marginLeft = `-200%`)
    document.getElementById("btn1").classList.remove("active");
    document.getElementById("btn2").classList.remove("active");
    document.getElementById("btn3").classList.add("active");
    c = 3
})