import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [showCourses, setShowCourses] = useState(true);
  const [showBooks, setShowBooks] = useState(true);
  const [showBlogs, setShowBlogs] = useState(true);

  const books = [
    { id: 1, bname: 'Master React', price: 670 },
    { id: 2, bname: 'Deep Dive into Angular 11', price: 800 },
    { id: 3, bname: 'Mongo Essentials', price: 450 },
  ];

  const blogs = [
    { id: 1, title: 'React Learning', author: 'Stephen Biz', body: 'Welcome to learning React!' },
    { id: 2, title: 'Installation', author: 'Schewzdenier', body: 'You can install React from npm.' },
  ];

  const courses = [
    { id: 1, name: 'Angular', date: '4/5/2021' },
    { id: 2, name: 'React', date: '6/3/20201' },
  ];

  // Styling objects
  const appStyle = {
    padding: '20px',
    fontFamily: 'Arial, sans-serif',
  };

  const containerStyle = {
    display: 'flex',
    justifyContent: 'space-around',
    alignItems: 'flex-start',
    gap: '40px',
    paddingTop: '30px',
  };

  const sectionStyle = {
    flex: 1,
    padding: '10px',
    borderLeft: '3px solid green',
    marginLeft: '20px',
  };

  return (
    <div style={appStyle}>
      <h1 style={{ textAlign: 'center' }}>Blogger App</h1>
      <div style={containerStyle}>
        {showCourses && (
          <div style={sectionStyle}>
            <CourseDetails courses={courses} />
          </div>
        )}
        {showBooks ? (
          <div style={sectionStyle}>
            <BookDetails books={books} />
          </div>
        ) : (
          <p>No books to show</p>
        )}
        {showBlogs && (
          <div style={sectionStyle}>
            <BlogDetails blogs={blogs} />
          </div>
        )}
      </div>
    </div>
  );
}

export default App;
