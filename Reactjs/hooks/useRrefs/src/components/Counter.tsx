import React, { useState, useEffect, useRef } from 'react';

const Counter = () => {
  const [count, setCount] = useState(0);
  const prevCountRef = useRef(0);

  useEffect(() => {
    prevCountRef.current = count;
  }, [count]);

  const prevCount = prevCountRef.current;

  return (
    <div style={{ maxWidth: '300px', margin: '20px', padding: '10px', border: '1px solid #ccc', borderRadius: '5px' }}>
      <p style={{ fontWeight: 'bold' }}>Current count: {count}</p>
      <p>Previous count: {prevCount}</p>
      <button
        style={{
          backgroundColor: '#28a745',
          color: 'white',
          border: 'none',
          padding: '10px 20px',
          cursor: 'pointer',
          borderRadius: '4px'
        }}
        onClick={() => setCount(count + 1)}
      >
        +
      </button>
    </div>
  );
};

export default Counter;
