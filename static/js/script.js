document.getElementById('drawing-order-form').addEventListener('submit', function(e) {
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const description = document.getElementById('description').value;

    if (!name || !email || !description) {
        alert('All fields are required');
        e.preventDefault();
    }
});
