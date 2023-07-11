import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import './Login.css';

const Login = () => {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [isNewUser, setIsNewUser] = useState(false);
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const navigate = useNavigate();

  const handleUsernameChange = (e) => {
    setUsername(e.target.value);
  };

  const handlePasswordChange = (e) => {
    setPassword(e.target.value);
  };

  const handleSignIn = (e) => {
    e.preventDefault();
    if (username && password) {
      setIsLoggedIn(true);
      alert('Login successful!');
     navigate('/home'); 
    } else {
      alert('Please enter a username and password.');
    }
  };

  const handleSignUp = (e) => {
    e.preventDefault();
    if (username && password) {
      setIsNewUser(false);
      setIsLoggedIn(true);
      alert('Sign-up successful! You are now logged in.');
      navigate('/home'); 
    } else {
      alert('Please enter a username and password.');
    }
  };

  if (isLoggedIn) {
    return <div>You are logged in!</div>;
  }

  return (
    <div className="login-page">
      <h2>{isNewUser ? 'Sign Up' : 'Login'}</h2>
      <form onSubmit={isNewUser ? handleSignUp : handleSignIn}>
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
        <div>
          <label htmlFor="Confirmpassword">Confirm Password:</label>
          <input
            type="password"
            id="password"
            value={password}
            onChange={handlePasswordChange}
          />
        </div>
        
        <button type="submit">{isNewUser ? 'Sign Up' : 'Log In'}</button>
        <div>
          {isNewUser ? (
            <p>
              Already have an account?{' '}
              <button type="button" onClick={() => setIsNewUser(false)}>
                Log In
              </button>
            </p>
          ) : (
            <p>
              Don't have an account?{' '}
              <button type="button" onClick={() => setIsNewUser(true)}>
                Sign Up
              </button>
            </p>
          )}
        </div>
      </form>
    </div>
  );
};

export default Login;