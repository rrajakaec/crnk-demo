# crnk-demo
1. To build the project:
  mvn clean package
2. Run the project:
  mvn spring-boot:run
3. Launch http://localhost:8080 in the browser
4. To create a Project:
POST http://localhost:8080/projects
RequestBody: 
{
  "data": {
    "name": "CRNK Demo",
    "age": 1
  }
}
