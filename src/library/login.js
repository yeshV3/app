import React, { useState } from 'react';
import './login.css'; 

const LoginPage = () => {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [email, setEmail] = useState('');
  const [isNewUser, setIsNewUser] = useState(false);
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleUsernameChange = (e) => {
    setUsername(e.target.value);
  };

  const handlePasswordChange = (e) => {
    setPassword(e.target.value);
  };

  const handleEmailChange = (e) => {
    setEmail(e.target.value);
  };

  const handleSignIn = () => {
    if (username && password) {
      setIsLoggedIn(true);
      alert('Login successful!');
    } else {
      alert('Please enter a username and password.');
    }
  };

  const handleSignUp = () => {
    if (username && password && email) {
      setIsNewUser(false);
      setIsLoggedIn(true);
      alert('Sign-up successful! You are now logged in.');
    } else {
      alert('Please enter a username, password, and email.');
    }
  };

  if (isLoggedIn) {
    return <div>You are logged in!</div>;
  }

  return (
    <div className="login-page">
      <h2>{isNewUser ? 'Sign Up' : 'Login'}</h2>
      <form>
        <div>
          <label htmlFor="username">Username:</label>
          <input
            type="text"
            id="username"
            value={username}
            onChange={handleUsernameChange}
          />
        </div>
        <div>
          <label htmlFor="password">Password:</label>
          <input
            type="password"
            id="password"
            value={password}
            onChange={handlePasswordChange}
          />
        </div>
        {isNewUser && (
          <div>
            <label htmlFor="email">Email:</label>
            <input
              type="text"
              id="email"
              value={email}
              onChange={handleEmailChange}
            />
          </div>
        )}
        {isNewUser ? (
          <button type="button" onClick={handleSignUp}>Sign Up</button>
        ) : (
          <button type="button" onClick={handleSignIn}>Log In</button>
        )}
        <div>
          {isNewUser ? (
            <p>Already have an account? <button type="button" onClick={() => setIsNewUser(false)}>Log In</button></p>
          ) : (
            <p>Don't have an account? <button type="button" onClick={() => setIsNewUser(true)}>Sign Up</button></p>
          )}
        </div>
      </form>
    </div>
  );
};

export default LoginPage;
