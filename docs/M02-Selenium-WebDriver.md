## M02: Selenium WebDriver

### 1. What is Selenium WebDriver?
Selenium WebDriver is a web automation framework that allows you to execute your tests against different browsers. Unlike the older Selenium RC (Remote Control), WebDriver provides a simpler, more concise programming interface and does not require a standalone server to be running.
* **Direct Communication:** It talks directly to the browser natively, exactly as a real user would, making it faster and more stable.
* **W3C Standardization:** Modern WebDriver (Selenium 4) operates on the W3C (World Wide Web Consortium) standard, ensuring cross-browser compatibility without needing API encoding/decoding.

### 2. The WebDriver Java Interface Hierarchy
In Java, `WebDriver` is not a class; it is an **Interface**. Understanding its inheritance tree is crucial for writing robust code and answering technical questions.

* **`SearchContext` (Super Interface):** The topmost interface that defines two fundamental methods: `findElement()` and `findElements()`.
* **`WebDriver` (Interface):** Extends `SearchContext`. It contains all the core browser-level methods like `get()`, `getTitle()`, `quit()`, and `manage()`.
* **`RemoteWebDriver` (Fully Implemented Class):** This class implements the `WebDriver` interface. It contains the actual logic to communicate with the browser drivers.
* **Browser-Specific Classes:** Classes like `ChromeDriver`, `FirefoxDriver`, `EdgeDriver`, and `SafariDriver` inherit from `RemoteWebDriver`.

*Note: This is why we write `WebDriver driver = new ChromeDriver();` (Upcasting). We create an object of the specific browser class but restrict it to the standard methods defined by the `WebDriver` interface.*

### 3. Key WebDriver Capabilities
* **Cross-Browser Testing:** A single script can be executed on Chrome, Firefox, Edge, or Safari just by changing the driver instantiation.
* **Multiple OS Support:** Scripts run seamlessly on Windows, macOS, and Linux.
* **Headless Execution:** WebDriver supports running browsers in the background without a UI (headless mode), which drastically reduces memory consumption and speeds up CI/CD pipeline execution.
* **Dynamic Handling:** Interacts with dynamic web elements, handles drop-downs, manages multiple tabs/windows, and processes JavaScript alerts natively.

