const btnSessao = document.getElementById("btnSessao");
const listaSessoesMobile = document.getElementById("listaSessoesMobile")
const tabelaSessao = document.getElementById("tabelaSessao")

const main = [...document.getElementsByTagName("main")]

function fecharSessao(){
    if(btnSessao.classList.contains("active")){
        btnSessao.classList.remove("active")
        listaSessoesMobile.classList.remove("active")
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

main.map(ele => ele.addEventListener("click",fecharSessao));

[...tabelaSessao.children].map(ele => ele.addEventListener("click",fecharSessao))




