const images = [
    "https://api.slingacademy.com/public/sample-photos/1.jpeg",
    "https://api.slingacademy.com/public/sample-photos/2.jpeg",
    "https://api.slingacademy.com/public/sample-photos/3.jpeg",
    "https://api.slingacademy.com/public/sample-photos/4.jpeg",
    "https://api.slingacademy.com/public/sample-photos/5.jpeg",
    "https://api.slingacademy.com/public/sample-photos/6.jpeg",
    "https://api.slingacademy.com/public/sample-photos/7.jpeg",
    "https://api.slingacademy.com/public/sample-photos/8.jpeg",
    "https://api.slingacademy.com/public/sample-photos/9.jpeg",
    "https://api.slingacademy.com/public/sample-photos/10.jpeg"
];

let currentIndex = 0;
const sliderImage = document.getElementById("sliderImage");
const prevBtn = document.getElementById("prevBtn");
const nextBtn = document.getElementById("nextBtn");

// Function to update the image
function updateImage() {
    sliderImage.src = images[currentIndex];
}

// Event listener for Next button
nextBtn.addEventListener("click", function () {
    currentIndex = (currentIndex + 1) % images.length;
    updateImage();
});

// Event listener for Previous button
prevBtn.addEventListener("click", function () {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    updateImage();
});

// Initialize the slider with the first image
updateImage();
