import React, { useState, useEffect } from 'react';

const FetchGitHubProfile = () => {
  const [userData, setUserData] = useState(null);

  useEffect(() => {
    const fetchGitHubData = async () => {
      try {
        const response = await fetch('https://api.github.com/users/ankitaghadge19');
        if (!response.ok) {
          throw new Error('Network response was not ok');
        }
        const result = await response.json();
        setUserData(result);
      } catch (error) {
        console.log(error);;
      }
    };

    fetchGitHubData();
  }, []); 

  return (
    <div>
      <h1>My GitHub Profile : </h1>
      <p>Username: {userData?.login}</p>
      <p>Name: {userData?.name}</p>
      <p>Location: {userData?.location}</p>
      <p>Followers: {userData?.followers}</p>
      <p>Repositories: {userData?.public_repos}</p>
      <p>Profile URL: <a href={userData?.html_url}>{userData?.html_url}</a></p>
    </div>
  );
};

export default FetchGitHubProfile;
