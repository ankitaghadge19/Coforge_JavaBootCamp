import React from 'react';
import { BrowserRouter as Router, Routes, Route, Navigate } from 'react-router-dom';
import Navbar from './Components/Navbar';
import withAuth from './Components/AuthHOC';
import Profile from './Components/Profile';
import Login from './Components/Login';

const ProfileWithAuth = withAuth(Profile);

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Navbar/>} />
        <Route path="/login" element={<Login />} />
        <Route path="/profile" element={<ProfileWithAuth />} />
      </Routes>
    </Router>
  );
}

export default App;
