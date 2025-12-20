  # Restaurant Management System
  
  ## Team Members
  
  | Name | Student ID | Email |
  |------|------------|-------|
  | Ahmed Abdulmordy Abdulghany | 191900340 | 191900340@ecu.edu.eg |
  | Belal Fathy Ali | 192200283 | 192200283@ecu.edu.eg |
  | Mahmoud Galal Gomaa | 192100124 | 192100124@ecu.edu.eg |
  | Ahmed Essam Abdallah | 192100088 | 192100088@ecu.edu.eg |
  | Amr Ehab | 192100136 | 192100136@ecu.edu.eg |
  | Abdelshafy Ayamn | 192100092 | 192100092@ecu.edu.eg |
  | Ahmed Amr | 122100001 | 122100001@ecu.edu.eg |
  
  
  
  **University**: Egyptian Chinese University  
  **Department**: Software Engineering & IT  
  **Course**: [SET412: Software Design Patterns]  
  
  ---
  
  ## About This Project
  
  We built this restaurant management system to learn and demonstrate how design patterns work in real applications. Instead of just reading about patterns in textbooks, we wanted to see how they actually solve problems you'd face when building software.
  
  The system handles typical restaurant operations - managing menus, processing orders, handling payments, and sending notifications to customers. We implemented 9 different design patterns throughout the project, and each one solves a specific problem.
  
  ### What It Does
  
  - Manages restaurant menus with categories (appetizers, main courses, desserts)
  - Handles customer orders from start to finish
  - Lets customers build custom meals with their choice of ingredients
  - Processes payments through different payment systems
  - Sends notifications via email or SMS
  - Validates orders before they go through
  - Supports different cuisine types (Italian, Asian, Fast Food)
  
  ---
  
  ## Why We Built It This Way
  
  The main goal was to understand design patterns by actually using them. We wanted to:
  
  - See how patterns make code more organized and easier to maintain
  - Learn when to use each pattern (and when not to)
  - Build something that could actually scale if needed
  - Practice writing clean, professional Java code
  
  Each pattern we used solves a real problem. We didn't just throw them in to check boxes - they're there because they made the code better
  
  ---
## Demo evidence

https://drive.google.com/file/d/1wqjbv0PKr16M455HtDuYjd1fpKQduQZf/view?usp=sharing

This link contains:
  - Video demonstration
  - Screen recording showing the project running
    
  ---
  
  ## The Design Patterns We Used
  
  We implemented 9 different patterns. Here's what each one does and why we needed it:
  
  ### 1. Singleton Pattern
  **Where**: `RestaurantManager` class  
  **Why**: We only want one manager running the restaurant. Having multiple managers would create chaos with orders getting mixed up.  
  **What it does**: Makes sure there's only ever one RestaurantManager instance in the whole system.
  
  ### 2. Factory Pattern
  **Where**: `MenuItemFactory` class  
  **Why**: Creating menu items (drinks, main dishes, desserts) requires different setup code. The factory keeps all that logic in one place.  
  **What it does**: Takes a type and details, returns the right kind of menu item.
  
  ### 3. Abstract Factory Pattern
  **Where**: Italian, Asian, and FastFood meal families  
  **Why**: When a customer orders an Italian meal, all the courses should be Italian. This pattern keeps meal components consistent.  
  **What it does**: Creates complete sets of related items (appetizer + main + dessert) that go together.
  
  ### 4. Builder Pattern
  **Where**: `CustomMealBuilder` class  
  **Why**: Some customers want to customize everything - extra garlic, no salt, specific sauce. Building these custom orders step by step is cleaner than a constructor with 20 parameters.  
  **What it does**: Lets you build a custom meal piece by piece, adding ingredients and special requests.
  
  ### 5. Command Pattern
  **Where**: Order commands (Place, Modify, Cancel)  
  **Why**: We need to track what happened to orders and be able to undo changes. Commands let us treat operations as objects.  
  **What it does**: Wraps order actions so we can execute them, undo them, and keep a history.
  
  ### 6. Chain of Responsibility Pattern
  **Where**: Order validation handlers  
  **Why**: Orders need multiple checks (is the status valid? is the price reasonable? are items available?). Each validator handles one concern.  
  **What it does**: Passes an order through a chain of validators, each checking one thing.
  
  ### 7. Composite Pattern
  **Where**: Menu structure (categories and items)  
  **Why**: Menus are hierarchical - Main Menu > Appetizers > Spring Rolls. We needed a way to treat both categories and items the same way.  
  **What it does**: Lets us organize menu items in a tree structure where categories can contain items or other categories.
  
  ### 8. Adapter Pattern
  **Where**: Payment processing  
  **Why**: External payment systems have their own interfaces. We need to make them work with our payment system.  
  **What it does**: Translates between our payment interface and external payment systems.
  
  ### 9. Bridge Pattern
  **Where**: Order types and notification methods  
  **Why**: We have different order types (dine-in, delivery) and different ways to notify customers (email, SMS). We don't want to create a class for every combination.  
  **What it does**: Separates "what kind of order" from "how to notify" so we can mix and match them.
  
  ---
  
  ## Project Structure
  
  ```
  RestaurantManagementSystem/
  ├── src/
  │   └── com/restaurant/
  │       ├── main/                      # Main.java - runs everything
  │       ├── singleton/                 # Restaurant Manager
  │       ├── factory/                   # Menu Item Factory
  │       ├── abstractfactory/           # Meal Families
  │       ├── builder/                   # Custom Meal Builder
  │       ├── command/                   # Order Commands
  │       ├── chainofresponsibility/     # Validation Chain
  │       ├── composite/                 # Menu Hierarchy
  │       ├── adapter/                   # Payment Adapter
  │       └── bridge/                    # Orders & Notifications
  └── out/                               # Compiled .class files
  ```
  
  ---
  
  ## How to Run It
  
  You'll need Java 8 or newer installed. That's it.
  
  **Compile everything:**
  ```bash
  cd RestaurantManagementSystem/src
  javac com/restaurant/*/*.java com/restaurant/main/*.java
  ```
  
  **Run the program:**
  ```bash
  java com.restaurant.main.Main
  ```
  
  The program will run through all 9 patterns and show you what each one does with example output.
  
  ---
  
  ## What You'll See
  
  When you run it, you'll see demonstrations of each pattern:
  
  ```
  === Restaurant Management System ===
  
  SINGLETON PATTERN - Restaurant Manager
  Restaurant: Grand Restaurant
  Same instance: true
  Orders in system: 2
  
  ==================================================
  
  FACTORY PATTERN - Menu Item Creation
  Drink: Cappuccino - $4.99 (Italian Coffee)
  Main Dish: Grilled Salmon - $22.99 (Fresh Atlantic Salmon)
  ...
  ```
  
  It goes through all 9 patterns showing how each one works with actual examples.
  
  ---
  
  ## What We Could Add Later
  
  If we had more time (or this was a real product), here's what would make sense to add:
  
  - A database to actually store orders and menu items
  - A real UI (web or mobile app)
  - User accounts and authentication
  - Inventory tracking
  - Analytics and reports
  - Table reservations
  - Loyalty programs
  
  ---
  
  ## Tech Stack
  
  - Java (any version 8+)
  - No external libraries or frameworks
  - Just pure Java and the patterns
  
  ---
  
  ## References
  - Course materials and lectures
  
  ---
  
  ## Thanks
  
  Thanks to Dr. Hossam Hawas for the guidance on this project.
  
  ---
  
  **Status**: Completed
