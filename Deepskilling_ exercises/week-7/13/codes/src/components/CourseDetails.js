import React from 'react';

const CourseDetails = ({ courses }) => {
  return (
    <div>
      <h2>Course Details</h2>
      <hr />
      {courses.map((course) => (
        <div key={course.id}>
          <h3>{course.name}</h3>
          <p>{course.date}</p>
        </div>
      ))}
    </div>
  );
};

export default CourseDetails;
