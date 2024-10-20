document.querySelector('form').addEventListener('submit', function (e) {
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;

    if (!name || !email) {
        alert('All fields are required');
        e.preventDefault();
    }
});
