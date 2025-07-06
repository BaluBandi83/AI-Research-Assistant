# AI-Research-Assistant

<img width="1920" alt="Smart AI Research Assistant Screenshot" src="https://github.com/user-attachments/assets/9c5cd818-4a6a-4077-af02-2e485a755cdb" />

## 📌 Project Overview

**Smart AI Research Assistant** is an intelligent web service designed to efficiently summarize selected text passages. Built with Spring Boot and Spring AI, it provides high-performance, AI-driven text summarization through a RESTful API.

This project aims to help students, researchers, and professionals quickly generate concise summaries of lengthy texts, saving time and enhancing productivity.

---

## 🚀 Features

✅ AI-powered text summarization  
✅ RESTful API built with Spring Boot  
✅ Integration with Spring AI for natural language processing  
✅ Scalable and efficient backend architecture  

---

## 🛠️ Technologies Used

- Java 17  
- Spring Boot  
- Spring AI  
- WebClient (for API calls)  
- Maven (for dependency management)  
- PostgreSQL/MySQL (optional for persistence)

---

## 🔧 Installation & Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/BaluBandi83/Smart-AI-Research-Assistant.git
   cd Smart-AI-Research-Assistant
Ensure you have Java 17+ and Maven installed.

Configure your application properties:

properties

spring.application.name=research-assistant
gemini.api.url=https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash:generateContent?key=
gemini.api.key=${GEMINI_API_KEY}
Build and run the project:
mvn clean install
mvn spring-boot:run
📡 API Endpoints
Method	Endpoint	Description
POST	/api/research/process	Summarizes the provided text

Example request:
{
  "content": "Artificial Intelligence is transforming industries...",
  "operation": "summarize"
}
🤝 Contributing
Contributions are welcome! Feel free to open an issue or submit a pull request.

📄 License
This project is licensed under the MIT License.

📩 Contact
For questions or suggestions, feel free to reach out at balubandi83@gmail.com.
