# Spring Data Redis Example

This repository contains an example project showcasing the usage of Spring Data Redis. It demonstrates how to integrate Redis with a Spring Boot application and perform common operations using Spring Data Redis.

## Prerequisites

Before running this example, ensure that you have the following installed:

- Java Development Kit (JDK) 8 or later
- Maven
- Redis Server

## Getting Started

To get started with this example, follow these steps:

1. Clone the repository:

   ```shell
   git clone https://github.com/peirisabhi/spring-data-redis-example.git
   ```

2. Navigate to the project directory:

   ```shell
   cd spring-data-redis-example
   ```

3. Build the project using Maven:

   ```shell
   mvn clean package
   ```

4. Run the application:

   ```shell
   mvn spring-boot:run
   ```

5. The application should now be running locally at `http://localhost:8081`. You can access the endpoints defined in the example to perform Redis operations.

## Configuration

The Redis configuration for this example can be found in the `RedisConfig.java` file. Make sure to update the configuration settings according to your Redis server setup.

```properties
# Redis connection properties
configuration.setHostName("localhost");  
configuration.setPort(6379); 

```

## Usage

This example demonstrates the following Redis operations using Spring Data Redis:

- Adding and retrieving data from Redis
- Using Redis hash operations
- Using Redis list operations
- Using Redis set operations
- Using Redis sorted set operations

Feel free to explore the code and modify it to suit your needs. The code is extensively documented to help you understand each step and the purpose of different components.

## Contributing

Contributions to this project are welcome. If you find any issues or have ideas for improvements, please open an issue or submit a pull request.

## Contact

For any questions or feedback, please contact:

Abhishek Peiris
- Email: abhishekpeiris9@gmail.com
- GitHub: [@peirisabhi](https://github.com/peirisabhi)
