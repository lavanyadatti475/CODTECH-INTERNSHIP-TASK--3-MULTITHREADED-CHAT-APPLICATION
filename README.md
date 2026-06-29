# 💬 MULTITHREADED CHAT APPLICATION

**COMPANY**: CODTECH IT SOLUTIONS PRIVATE LIMITED

**NAME**: DATTI LAVANYA

**INTERN ID**: CTIS9772

**DOMAIN**: JAVA PROGRAMMING

**DURATION**: 8 WEEKS

**MENTOR**: NEELA SANTOSH

---

# 📌 Project Overview

The **Multithreaded Chat Application** is a client-server application developed using Java Socket Programming and Multithreading. It enables multiple clients to connect to a central server and communicate with each other in real time.

The server listens for incoming client connections, creates a separate thread for each connected client, and broadcasts messages to all connected users simultaneously.

---

# 🎯 Objective

Develop a Java-based client-server chat application that:

* Uses Java Sockets for communication
* Supports multiple clients simultaneously
* Implements multithreading for concurrent communication
* Broadcasts messages in real time

---

# 🚀 Features

* Client-Server Architecture
* Multiple Client Support
* Real-Time Communication
* Multithreading using Java Threads
* Message Broadcasting
* Socket Programming
* Console-Based Interface
* Exception Handling

---

# 🛠️ Technologies Used

* Java
* Java Socket Programming
* Multithreading
* ServerSocket
* Socket
* BufferedReader
* PrintWriter
* Threads
* Exception Handling

---

# 📂 Project Structure

```text
MultithreadedChatApplication
│
├── ChatServer.java
├── ChatClient.java
├── ClientHandler.java
├── README.md
└── output.png
```

---

# ▶️ How to Compile

Open the terminal in the project folder and compile the Java files:

```bash
javac ChatServer.java

javac ChatClient.java
javac ClientHandler.java
```

Or compile all at once:

```bash
javac *.java
```

---

# ▶️ How to Run

### Step 1: Start the Server

```bash
java ChatServer
```

---

### Step 2: Open a New Terminal and Start Client 1

```bash
java ChatClient
```

---

### Step 3: Open Another Terminal and Start Client 2

```bash
java ChatClient
```

Now all connected clients can exchange messages in real time.

---

# 🖥️ Sample Output

## Server

```text
Chat Server Started...

New client connected.
New client connected.

Received: Hello everyone!
Received: Hi Lavanya
```

## Client 1

```text
Connected to Chat Server

Hello everyone!

Message: Hello everyone!
Message: Hi Lavanya
```

## Client 2

```text
Connected to Chat Server

Hi Lavanya

Message: Hello everyone!
Message: Hi Lavanya
```

---
# OUTPUTS:







# 🔄 Project Workflow

```text
Start Server
      │
      ▼
Wait for Client Connections
      │
      ▼
Client Connects
      │
      ▼
Create Separate Thread
      │
      ▼
Receive Message
      │
      ▼
Broadcast Message
      │
      ▼
Display Message to All Clients
      │
      ▼
Continue Until Client Disconnects
```

---

# 📚 Concepts Used

* Java Socket Programming
* Client-Server Architecture
* TCP Communication
* Multithreading
* Threads
* BufferedReader
* PrintWriter
* ServerSocket
* Socket
* Exception Handling

---

# 🎓 Learning Outcomes

Through this project, I learned:

* Socket Programming in Java
* Building Client-Server Applications
* Implementing Multithreading
* Managing Multiple Client Connections
* Broadcasting Messages
* Network Communication
* Concurrent Programming

---

# 💡 Future Enhancements

* User Login System
* Usernames for Clients
* Private Messaging
* Group Chat
* GUI using Java Swing or JavaFX
* Message Encryption
* Chat History Storage
* File Sharing Support

---

# 👨‍💻 Author

**Datti Lavanya**

Java Internship Project

---

# 📄 License

This project is created for educational and internship purposes.
