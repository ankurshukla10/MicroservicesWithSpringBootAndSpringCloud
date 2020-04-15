# Service Definition for this REST Aplication
##Social Media Application
 user ->  Posts (1 to m)

# Getting Started
- Retrieve all users - GET - /users
- Create a user      - POST - /users
- Retrieve one user  - GET - /users/{id} - /user/1
- Delete a user      - DELETE - /users/{id} - /user/1


- Retrieve all posts for a user - GET - /users/{id}/posts
- Create a post for a user - POST - /users/{id}/posts
- Retrieve details of a post - GET - /users/{id}/posts/{post_id}

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

