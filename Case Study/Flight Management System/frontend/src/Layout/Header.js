import React, { useContext } from "react";
import { NavLink, Link, useNavigate } from "react-router-dom";
import { AuthContext } from "../Context/AuthContext";
import toast from "react-hot-toast";

const Header = () => {
  const { auth, clearAuthInfo } = useContext(AuthContext);
  const navigate = useNavigate();

  const handleLogout = () => {
    alert("Logout Sucessful!");
    toast.success("Logout Successfully");
    clearAuthInfo();
    navigate("/login");
  };

  return (
    <nav className="navbar navbar-expand-lg bg-body-tertiary fixed-top">
      <div className="container-fluid">
        <button
          className="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarTogglerDemo01"
          aria-controls="navbarTogglerDemo01"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-icon" />
        </button>
        <div className="collapse navbar-collapse" id="navbarTogglerDemo01">
          <Link to="/" className="navbar-brand">
            SkyTrip
          </Link>
          <ul className="navbar-nav ms-auto mb-2 mb-lg-0">
            <li className="nav-item">
              <NavLink
                to="/"
                className="nav-link"
                style={{ fontWeight: "bold", textTransform: "none" }}
              >
                Home
              </NavLink>
            </li>
            {auth.token ? (
              <>
                <li className="nav-item">
                  <NavLink
                    to="/profile"
                    className="nav-link"
                    style={{ fontWeight: "bold", textTransform: "none" }}
                  >
                    Profile
                  </NavLink>
                </li>
                <li className="nav-item">
                  <NavLink
                    to="/search"
                    className="nav-link"
                    style={{ fontWeight: "bold", textTransform: "none" }}
                  >
                    Search
                  </NavLink>
                </li>
                <li className="nav-item">
                  <NavLink
                    to="/bookings"
                    className="nav-link"
                    style={{ fontWeight: "bold", textTransform: "none" }}
                  >
                    Bookings
                  </NavLink>
                </li>
                {auth.role === "ADMIN" && (
                  <li className="nav-item">
                    <NavLink
                      to="/addFlight"
                      className="nav-link"
                      style={{ fontWeight: "bold", textTransform: "none" }}
                    >
                      AddFlight
                    </NavLink>
                  </li>
                )}
                <li className="nav-item">
                  <button
                    className="nav-link btn btn-link"
                    style={{ fontWeight: "bold", textDecoration: "none" }}
                    onClick={handleLogout}
                  >
                    Logout
                  </button>
                </li>
              </>
            ) : (
              <li className="nav-item">
                <NavLink
                  to="/login"
                  className="nav-link"
                  style={{ fontWeight: "bold" }}
                >
                  Login
                </NavLink>
              </li>
            )}
          </ul>
        </div>
      </div>
    </nav>
  );
};

export default Header;
