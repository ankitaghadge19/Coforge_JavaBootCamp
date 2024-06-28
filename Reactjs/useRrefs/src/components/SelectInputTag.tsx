import React, { useState, useRef } from 'react';
import './SelectInputTag.css'; 

const SelectInputTag = () => {
  const [name, setName] = useState('');
  const inputRef = useRef(null);

  const focus = () => {
    inputRef.current.focus();
    inputRef.current.value = "Name cannot be empty!";
  };

  return (
    <div className="input-container">
      <label>Enter your name:</label>
      <input
        ref={inputRef}
        className="input-field"
        value={name}
        onChange={(e) => setName(e.target.value)}
      />
      <button className="submit-button" onClick={focus}>Submit</button>
    </div>
  );
};

export default SelectInputTag;
