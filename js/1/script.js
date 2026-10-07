const greetingForm = document.querySelector("#greetingForm");
const nameInput = document.querySelector("#name");
const output = document.querySelector("#output");

greetingForm.addEventListener("submit", (event) => {
  event.preventDefault();

  const name = nameInput.value.trim() || "there";
  output.textContent = `Hello, ${name}! Welcome to JavaScript.`;
});
