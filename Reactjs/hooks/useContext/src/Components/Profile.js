import React, { useContext } from 'react';
import { UserContext } from './UserContext'; // Adjust the path according to your file structure

const Profile = () => {
  const { userId } = useContext(UserContext);

  return (
    <div>
      <h2>Your Profile:</h2>
      {userId ? <p>User ID: {userId}</p> : <p>Please log in to see your profile!</p>}
    </div>
  );
};

export default Profile;
