# Mobile Automation Test – Demo App

## 📌 Deskripsi Project
Project ini merupakan automation testing untuk aplikasi mobile demo menggunakan **Java, Appium, TestNG, dan Gradle**.  
Automation mencakup proses **login** dan **add product to cart** sebagai end-to-end testing flow.

---

## 🛠 Tools & Technology
- Java  
- Appium  
- TestNG  
- Gradle  
- Android Emulator  
- Appium Inspector  
- IntelliJ IDEA  

---

## 📂 Project Structure
src
├── main
│   └── java
│       └── dibimbing
│           └── pages
├── test
│   └── java
│       └── dibimbing
│           ├── core
│           └── tests
├── evidence
│   └── login_and_add_to_cart.mp4
└── README.md

---

## ✅ Test Scenario

### 1️⃣ Login Test
- Input username dan password valid  
- Klik tombol login  
- Assert user berhasil masuk ke halaman product  

### 2️⃣ Add To Cart Test
- Klik salah satu produk  
- Klik tombol **Add to Cart**  
- Assert product berhasil masuk ke cart  

---

## 🎥 Test Evidence
Screen recording hasil automation test dapat dilihat pada folder:
/evidence/login_and_addcart.mp4

---

## 🧠 Reflection

### 🔹 Analisis Critical Path Automation
Skenario paling kritikal dalam automation ini adalah **Login** dan **Add to Cart**.  
Login merupakan gerbang utama aplikasi karena jika proses login gagal maka seluruh fitur di dalam aplikasi tidak dapat diakses.  
Add to Cart juga sangat krusial karena merupakan inti dari flow bisnis aplikasi e-commerce. Jika fitur ini gagal, user tidak dapat melanjutkan proses pembelian.

---

### 🔹 Analisis Locator & Stabilitas Testing
Beberapa elemen pada aplikasi sulit diidentifikasi karena memiliki locator yang mirip dan bersifat dinamis.  
Oleh karena itu, pemilihan locator dilakukan dengan mempertimbangkan penggunaan **id**, **accessibility id**, dan **Android UIAutomator**.
Pemilihan locator yang stabil sangat berpengaruh terhadap **reliability automation**. Locator yang tidak konsisten dapat menyebabkan test menjadi **flaky** dan sering gagal meskipun aplikasi berjalan normal.

---

## 👤 Author
**Dafit Saputra Utama**

