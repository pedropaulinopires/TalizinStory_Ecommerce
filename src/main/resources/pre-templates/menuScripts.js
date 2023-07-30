/*menu mobile*/
const btnSessao = document.getElementById("btnSessao");
const listaSessoesMobile = document.getElementById("listaSessoesMobile")
const tabelaSessao = document.getElementById("tabelaSessao")
const main = [...document.getElementsByTagName("main")]

/*menu desktop*/
const btnBuscaDesktop = document.getElementById("btnBuscaDesktop")
const sessaoDesktop = document.getElementById("sessaoDesktop")
const listaSessaoDesktop = document.getElementById("listaSessaoDesktop")


function resetComponents(){
    if(btnBuscaDesktop.classList.contains("active")){
        btnBuscaDesktop.classList.remove("active")
        sessaoDesktop.classList.remove("active")
    }
    if(btnSessao.classList.contains("active")){
        btnSessao.classList.remove("active")
        listaSessoesMobile.classList.remove("active")
    }
}

function sessaoDesktopEvents(){
    btnBuscaDesktop.classList.toggle("active")
    if(btnBuscaDesktop.classList.contains("active")){
        sessaoDesktop.classList.add("active")
    } else {
        sessaoDesktop.classList.remove("active")
    }
}


btnSessao.addEventListener("click",()=>{
    btnSessao.classList.toggle("active")
    if(btnSessao.classList.contains("active")){
        listaSessoesMobile.classList.add("active")
    } else {
        listaSessoesMobile.classList.remove("active")
    }
})

main.map(ele => ele.addEventListener("click",resetComponents));

[...tabelaSessao.children].map(ele => ele.addEventListener("click",resetComponents));
[...listaSessaoDesktop.children].map(ele => ele.addEventListener("click",resetComponents))




btnBuscaDesktop.addEventListener("click",sessaoDesktopEvents)



window.addEventListener("resize",resetComponents)
