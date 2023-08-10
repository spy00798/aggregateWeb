const menuButton = document.getElementById("menuButton");
const closeButton = document.getElementById("closeButton");
const sideMenu = document.getElementById("sideMenu");

menuButton.addEventListener("click", () => {
  sideMenu.style.width = "50%";
});

closeButton.addEventListener("click", () => {
  sideMenu.style.width = "0";
});

const accordionContents = document.querySelectorAll(".accordion-content");

document.querySelectorAll("li").forEach((li, index) => {
  li.addEventListener("click", () => {
    if (accordionContents[index].style.display === "block") {
      accordionContents[index].style.display = "none";
    } else {
      accordionContents.forEach((content) => {
        content.style.display = "none";
      });
      accordionContents[index].style.display = "block";
    }
  });
});

const searchBar = document.getElementById("searchBar");
const popup = document.getElementById("searchPopup");
const popupSearchBar = document.getElementById("popupSearchBar");
const closePopup = document.getElementById("closePopup");
