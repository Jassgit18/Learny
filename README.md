# 📚 Learny — Java Interview Question Generator

A console-based Java application that helps students and developers prepare for technical interviews by generating randomized Q&A sessions across Core Java and OOP topics.

---

## 🚀 Features

- **5 question modes** — Core Java, OOP, Easy, Medium, and Hard levels
- **Randomized question selection** — 6 unique questions per session, no repeats
- **On-demand answers** — choose to reveal the answer after each question
- **Lightweight** — pure Java, no external dependencies

---

## 🛠️ Tech Stack

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

- Language: **Java**
- Concepts used: OOP, Collections (`HashSet`, `Random`, `Scanner`), Switch-case, Array handling

---

## 📁 Project Structure

```
Learny/
├── Main.java          # Entry point — displays menu and takes user input
├── Generator.java     # Picks 6 random questions and handles Q&A flow
├── QuestionBank.java  # Contains QA class and all question sets
└── README.md
```

---

## ▶️ How to Run

**Prerequisites:** Java JDK 8 or above installed.

```bash
# Step 1: Clone the repository
git clone https://github.com/Jassgit18/Learny.git
cd Learny

# Step 2: Compile
javac Main.java Generator.java QuestionBank.java

# Step 3: Run
java Main
```

---

## 🎮 Usage

```
=== Interview Question Generator ===
1. Common Repeated Java Questions
2. Common Repeated OOPS Questions
3. Easy Level (Mixed)
4. Medium Level (Mixed)
5. Hard Level (Mixed)
Enter your choice: 1

Your Questions:

1. What is Java and why is it platform independent?
Do you want the answer? (y/n): y
Answer: Java is a programming language that runs on any OS because it compiles into bytecode...
```

---

## 📌 Question Categories

| Mode | Topics Covered |
|------|---------------|
| Core Java | JVM, JDK, JRE, Constructors, Exceptions, Threads, GC |
| OOP | Encapsulation, Inheritance, Polymorphism, SOLID, Binding |
| Easy | Basic definitions and concepts |
| Medium | Comparisons and moderate-depth topics |
| Hard | JIT, Deadlock, Synchronization, Memory Leaks |

---

## 🔮 Future Improvements

- [ ] Add more question categories (DSA, DBMS, OS)
- [ ] Score tracking per session
- [ ] GUI version using JavaFX or Swing
- [ ] Import questions from external JSON/CSV file

---

## 👨‍💻 Author

**Jasel Respin**
[LinkedIn](https://linkedin.com/in/jaselrespin)
[GitHub](https://github.com/Jassgit18)
