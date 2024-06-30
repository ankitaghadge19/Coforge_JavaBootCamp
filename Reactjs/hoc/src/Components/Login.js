import React from 'react';

class Login extends React.Component {
  handleLogin = () => {
    alert('Login logic is not implemented yet!');
  };

  render() {
    return (
      <div>
        <h1>Login Page!</h1>
        <p>Please login to access your profile!</p>
        <button onClick={this.handleLogin}>Login</button>
      </div>
    );
  }
}

export default Login;
