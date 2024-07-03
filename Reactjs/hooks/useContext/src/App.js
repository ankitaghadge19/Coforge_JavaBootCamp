import React from 'react';
import { UserProvider } from './Components/UserContext'; 
import Profile from './Components/Profile'; 

const App = () => {
  return (
    <UserProvider>
      <Profile />
    </UserProvider>
  );
};

export default App;
