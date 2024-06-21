document.addEventListener('DOMContentLoaded', () => {
    const formTitle = document.getElementById('form-title');
    const form = document.getElementById('form');
    const nameField = document.getElementById('name-field');
    const submitButton = document.getElementById('submit-button');
    const toggleForm = document.getElementById('toggle-form');
    let toggleLink = document.getElementById('toggle-link');
    
    let isLoginForm = true;

    function handleToggleLinkClick(e) {
        e.preventDefault();
        isLoginForm = !isLoginForm;
        formTitle.textContent = isLoginForm ? 'Login' : 'Register';
        nameField.classList.toggle('hidden', isLoginForm);
        submitButton.textContent = isLoginForm ? 'Login' : 'Register';
        toggleForm.innerHTML = isLoginForm 
            ? "Don't have an account? <a href='#' id='toggle-link'>Register</a>"
            : "Already have an account? <a href='#' id='toggle-link'>Login</a>";
        // Re-assign the toggle link with a new event listener
        toggleLink = document.getElementById('toggle-link');
        toggleLink.addEventListener('click', handleToggleLinkClick);
    }

    toggleLink.addEventListener('click', handleToggleLinkClick);

    form.addEventListener('submit', (e) => {
        e.preventDefault();
        const email = document.getElementById('email').value;
        const password = document.getElementById('password').value;

        if (isLoginForm) {
            loginUser(email, password);
        } else {
            const name = document.getElementById('name').value;
            registerUser(name, email, password);
        }
    });

    function registerUser(name, email, password) {
        const users = JSON.parse(localStorage.getItem('users')) || [];
        if (users.find(user => user.email === email)) {
            alert('User already exists!');
            return;
        }
        users.push({ name, email, password });
        localStorage.setItem('users', JSON.stringify(users));
        alert('Registration successful! Please login.');
        toggleLink.click();
    }

    function loginUser(email, password) {
        const users = JSON.parse(localStorage.getItem('users')) || [];
        const user = users.find(user => user.email === email && user.password === password);
        if (user) {
            alert(`Welcome, ${user.name}!`);
        } else {
            alert('Invalid email or password!');
        }
    }
});
