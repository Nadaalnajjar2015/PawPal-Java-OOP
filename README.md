# PawPal – Object-Oriented Java Animal Rescue Platform

## 🌟 Project Overview
**PawPal** is an Object-Oriented Java application that simulates an online platform for **animal rescue, adoption, lost & found reporting, and mating services**.  
The system is designed to connect pet owners, rescuers, and adopters by allowing users to post animal cases and browse available pets.

This project demonstrates strong OOP principles including **Inheritance, Polymorphism, Abstraction, Interfaces, Composition, and Aggregation**, and follows a clean modular structure.

---

## 🐾 Features
### 🔸 User Features
- Create posts for:
  - **Animals needing rescue**
  - **Lost pets**
  - **Found pets**
  - **Pets available for adoption**
  - **Pets available for mating**
- View and search all available animal posts.
- Search animals using specific criteria (age, breed, gender, location, etc.)

### 🔸 System Features
- Fully object-oriented class structure.
- Organized post hierarchy using inheritance:
  - `Post` (abstract)
    - `AdoptionPost`
    - `RescuePost`
    - `LostPetPost`
    - `FoundPetPost`
    - `MatingPost`
- `Animal` and `Location` classes for structured data.
- `Platform` class manages all posts and system logic.
- Parameterized constructors & clean encapsulation.

---

## 🧱 Object-Oriented Concepts Used
- **Abstraction:**  
  `Post` is an abstract class for all post types.

- **Inheritance:**  
  All post types extend from the base `Post` class.

- **Polymorphism:**  
  The platform stores all posts in a single list and processes them polymorphically.

- **Composition:**  
  `Post` contains an `Animal` and `Location` object.

- **Aggregation:**  
  `Platform` aggregates multiple `Post` objects.

- **Encapsulation:**  
  Private attributes with public getters and setters.

---

## 📂 Project Structure
└── PawPal/
├── User.java
├── Post.java // abstract
├── AdoptionPost.java
├── RescuePost.java
├── LostPetPost.java
├── FoundPetPost.java
├── MatingPost.java
├── Animal.java
├── Location.java
├── Platform.java
└── Main.java // application entry point


---

## ▶️ How to Run the Project
1. Open the project in **NetBeans**, IntelliJ, or any Java IDE.
2. Ensure the JDK is installed (JDK 8+ recommended).
3. Run the **Main.java** file.
4. The platform will execute sample posts or allow user interaction (depending on your implementation).

---

## 📘 Example Functionalities
- Create a new adoption post:
  ```java
  AdoptionPost post = new AdoptionPost(user, animal, location, "Healthy and friendly");
  platform.addPost(post);
