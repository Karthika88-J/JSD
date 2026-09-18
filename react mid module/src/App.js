import './App.css';
import { useState } from 'react';

function App() {
  const [name, setName] = useState('John Doe');

  function handleChange(e) {
    setName(e.target.value);
  }

  return (
    <main className="app-shell">
      <section className="profile-panel" aria-labelledby="page-title">
        <p className="eyebrow">React mid-module assessment</p>
        <h1 id="page-title">User Profile Management</h1>
        <p className="intro">Keep your profile name current with a live preview.</p>

        <UserProfile name={name} />

        <label htmlFor="name">Update your name</label>
        <input
          id="name"
          type="text"
          value={name}
          onChange={handleChange}
          placeholder="Enter your name"
        />
      </section>
    </main>
  );
}

function UserProfile({ name }) {
  return (
    <div className="profile-card">
      <p className="eyebrow">Current profile</p>
      <h2>{name}</h2>
      <p>Your profile name updates as you type.</p>
    </div>
  );
}

export default App;
