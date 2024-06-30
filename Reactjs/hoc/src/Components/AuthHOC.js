import React from 'react';
import { Navigate } from 'react-router-dom';

function withAuth(WrappedComponent) {
  return class extends React.Component {
    render() {
      const isAuthenticated = false;

      if (!isAuthenticated) {
        alert("Please log in to access this page!");
        return <Navigate to="/login" />;
      }
      return <WrappedComponent {...this.props} />;
    }
  };
}

export default withAuth;
