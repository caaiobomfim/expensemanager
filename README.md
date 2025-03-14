# 📊 Expense Manager

Welcome to **Expense Manager**! 🚀 This is a full-stack application built with **Vue.js (Frontend)** and **Spring Boot (Backend)** to help you track and manage your expenses efficiently.

## 🌟 Features

✅ Add expenses 💰
✅ Categorize expenses 🏷️
✅ Responsive and user-friendly UI 🎨
✅ REST API integration 🔗
✅ Persistent storage with a database 📦
✅ Docker support 🐳

---

## 🏗️ Project Structure

```bash
expensemanager/
│── expensemanager-backend/
│── expensemanager-frontend/
│── README.md
│── .gitignore
```

---

## 🚀 Technologies Used

### **Frontend (Vue.js + Bootstrap)**
- Vue.js 3 🟢
- Bootstrap 5 🎨
- Axios for API calls 🔄

### **Backend (Spring Boot)**
- Java 17 ☕
- Spring Boot 3 🌱
- Maven (Build tool) 🛠️
- MongoDB 🗄️

---

## ⚙️ Installation & Setup

### **1️⃣ Clone the Repository**
```sh
git clone https://github.com/caaiobomfim/expensemanager.git
cd expensemanager
```

### **2️⃣ Setup the Backend**
```sh
cd expensemanager-backend
./mvnw spring-boot:run  # Linux/macOS
mvnw.cmd spring-boot:run  # Windows
```

Backend will be running at: `http://localhost:8080`

### **3️⃣ Setup the Frontend**
```sh
cd expensemanager-frontend
npm install
npm run serve
```

Frontend will be running at: `http://localhost:8081`

---

## 🐳 Running with Docker (Optional)

### **1️⃣ Build and Run the Containers**
```sh
docker-compose up --build
```

### **2️⃣ Stop the Containers**
```sh
docker-compose down
```

---

## 📸 Screenshots

| Expense Form 📝 | Expense List 📊 |
|---------------|----------------|
| ![Form](https://via.placeholder.com/400x300) | ![List](https://via.placeholder.com/400x300) |

---

## 🎯 API Endpoints (Backend)

### **Expenses API**
| Method | Endpoint | Description |
|--------|---------|-------------|
| `GET` | `/expenses` | Get all expenses |
| `POST` | `/expenses` | Add a new expense |

---

## 💡 Contribution

Want to contribute? Follow these steps:

1. Fork the project 🍴
2. Create a new branch (`git checkout -b feature-branch`) 🌱
3. Make your changes and commit (`git commit -m "✨ Added new feature"`) 🔥
4. Push to your fork (`git push origin feature-branch`) 🚀
5. Open a Pull Request 🛠️

---

## 📜 License

This project is licensed under the **MIT License** 📜

---

## 📞 Contact

💬 **Created by:** [Caio Bomfim](https://github.com/caaiobomfim)  
📧 **Email:** caaiobomfim@gmail.com  

---

Made with ❤️ by [Caio] 🚀