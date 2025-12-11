# 📚 Book Management System in C

A console-based **Book Management System** implemented in **C**, using  
`struct`, `dynamic memory allocation (malloc/realloc)`, `string handling`, and menu-driven programming.

This project supports adding, removing, updating, searching, sorting books, and displaying top 3 books.

---

## ⭐ Features

### 🔹 Book Operations
- Add new book  
- Remove a book  
- Update book details (price & rating)  
- Search by:
  - Book ID  
  - Book Name  
- Show books by Author  
- Show books by Category  

### 🔹 Sorting & Ranking
- Sort books by **Price** (Descending)  
- Sort books by **Rating** (Descending)  
- Display **Top 3 Books** by:
  - Highest Price
  - Highest Rating  

### 🔹 Miscellaneous
- Display all books  
- Dynamic memory allocation using `malloc()` and `realloc()`  
- Prevent duplicate Book IDs  
- Menu-driven interface  

---

## 🧠 Concepts Used

| Concept | Description |
|--------|-------------|
| **Structure (`struct`)** | To store details of each book |
| **Dynamic Memory (`malloc`, `realloc`)** | To grow/shrink book list dynamically |
| **Functions** | Each operation is separated into modular functions |
| **String Handling (`strcmp`, `strcpy`)** | For comparing & copying strings |
| **Loops & Conditional Statements** | For menu and operations |

---

## 📁 Project Structure

Book_Management_System/
│
├── book_management.c // main source file
├── README.md // project documentation
└── (optional) bin/ // compiled output files


---

## 📜 Menu (User Interface)

1)Add Book
2)Remove Book
3)Search Book
4)Show Author's Books
5)Show Category's Books
6)Update Book
7)Display Sorted Book (Top 3 Price & Rating)
8)Display All Books
9)Exit

---

## ▶️ How to Run

### **Using GCC (Terminal / CMD)**

gcc book_management.c -o bookmgmt
./bookmgmt


### **Using Windows (MinGW)**

gcc book_management.c -o bookmgmt.exe
bookmgmt.exe


---

## 🧪 Initial Preloaded Books

| ID | Name | Author | Category | Price | Rating |
|----|-------|---------|-----------|--------|---------|
| 1 | abc | abc | abc | 100 | 10 |
| 2 | xyz | xyz | xyz | 110 | 15 |

---

## 🔮 Future Enhancements
- Save books to a file  
- Load books from file  
- Support multi-word names using `fgets()`  
- Add category filters  
- Add UI color formatting  

---

## 🤝 Contributing
Pull requests and improvements are welcome!

---

## 📄 License
This project is open-source under the **MIT License**.

