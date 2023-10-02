let menuDesktop = document.getElementById("menuDesktop");
window.addEventListener("scroll",() =>{
    if (window.pageYOffset > 40) {
        menuDesktop.classList.add("active")

    } else {
        menuDesktop.classList.remove("active")
    }
})
