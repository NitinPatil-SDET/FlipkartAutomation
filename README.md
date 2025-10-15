
---

# 🛒 Flipkart Automation Testing Project

## 📘 Overview

This project automates product search and filtering on **Flipkart** using **Selenium WebDriver**, **TestNG**, and **BrowserStack Automate**. It demonstrates UI automation, filtering validation, and cross-browser testing in a real-world e-commerce scenario.

---

## 🎯 Problem Statement

Automate the following steps on Flipkart’s desktop site:

1. Search for **“Samsung Galaxy S10”**.
2. Select **“Mobiles”** under categories.
3. Apply filters:

   * **Brand:** Samsung
   * **Flipkart Assured**
4. Sort results by **Price → High to Low**.
5. Extract and print the following details for all products on the first page:

   * 🏷 Product Name
   * 💰 Display Price
   * 🔗 Product Link

The same test is configured for **parallel execution** across multiple browsers using **BrowserStack Automate**.

---

## ⚙️ Tech Stack

| Component          | Technology              |
| ------------------ | ----------------------- |
| Language           | Java                    |
| Build Tool         | Maven                   |
| Test Framework     | TestNG                  |
| Automation         | Selenium WebDriver      |
| Parallel Execution | BrowserStack Automate   |
| Design Pattern     | Page Object Model (POM) |
| IDE                | Eclipse                 |

---

## 📂 Project Structure

```
FlipkartAutomation/
├── src/test/java/
│   ├── PageObject/
│   ├── TestBase/
│   └── TestCases/
├── src/test/resources/
│   └── browserstack.properties
├── Reports/
├── Screenshots/
├── Parallel.xml
└── pom.xml
```

---

## 🌐 BrowserStack Integration

Tests run in parallel across various browser/OS combinations using BrowserStack Automate.
📊 [View Public Report](https://automate.browserstack.com/projects/Flipkart+Automation/suite_health/tests?public_token=da9c691a0af12b0b702002ba824de9eba4761dea0a21683615b1e7af89fc9b73)

---

## 🚀 How to Run

```bash
# Clone the repository
git clone https://github.com/NitinPatil-SDET/FlipkartAutomation.git

# Navigate to the project folder and run tests
mvn clean test -DsuiteXmlFile=Parallel.xml
```

> Update your BrowserStack credentials in `browserstack.properties` before execution.

---

## 🧠 Key Highlights

* Automated **UI search, filter, and sort** verification.
* Designed using **Page Object Model** for scalability.
* **Parallel cross-browser execution** via BrowserStack.
* Generates **logs, screenshots, and reports** automatically.

---

## 👨‍💻 Author

**Nitin Patil**
🔗 [GitHub Profile](https://github.com/NitinPatil-SDET)

---

## 🏁 Summary

A modular, cross-browser **Flipkart automation** project showcasing Selenium WebDriver, TestNG, and BrowserStack integration with clean, reusable POM-based design.

---
