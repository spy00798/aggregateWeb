const menuButton = document.getElementById('menuButton');
const closeButton = document.getElementById('closeButton');
const sideMenu = document.getElementById('sideMenu');

menuButton.addEventListener('click', () => {
    sideMenu.style.width = '650px';
});

closeButton.addEventListener('click', () => {
    sideMenu.style.width = '0';
});


const accordionContents = document.querySelectorAll('.accordion-content');

document.querySelectorAll('li').forEach((li, index) => {
    li.addEventListener('click', () => {
        if (accordionContents[index].style.display === 'block') {
            accordionContents[index].style.display = 'none';
        } else {
            accordionContents.forEach(content => {
                content.style.display = 'none';
            });
            accordionContents[index].style.display = 'block';
        }
    });
});