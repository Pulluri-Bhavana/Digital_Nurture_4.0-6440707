import React from 'react';

const BlogDetails = ({ blogs }) => {
  return (
    <div>
      <h2>Blog Details</h2>
      <hr />
      {blogs.map((blog) => (
        <div key={blog.id}>
          <h3>{blog.title}</h3>
          <b>{blog.author}</b>
          <p>{blog.body}</p>
        </div>
      ))}
    </div>
  );
};

export default BlogDetails;
