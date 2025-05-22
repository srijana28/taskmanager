
# 📱 Task Manager Android App

A modern Android task management application built with Jetpack Compose and Room Database, following MVVM architecture and best practices.

## ✨ Features

- **Task Management**
  - Create, edit, and delete tasks
  - Mark tasks as complete/incomplete
  - Priority levels (High/Medium/Low)
  - Sorting by priority/date

- **Technical Highlights**
  - 100% Jetpack Compose UI
  - Room Database with Flow for real-time updates
  - Dependency Injection with Hilt
  - Dark/Light theme support
  - Clean MVVM architecture

## 🛠 Tech Stack

| Category       | Technologies Used                         |
|----------------|-------------------------------------------|
| Language       | Kotlin                                    |
| UI Framework   | Jetpack Compose                           |
| Architecture   | MVVM                                      |
| Local Database | Room                                      |
| DI             | Hilt                                      |
| Async          | Coroutines + Flow                         |
| Navigation     | Compose Navigation                        |

## 🚀 Getting Started

### Prerequisites
- Android Studio Flamingo or newer
- Android SDK 24+

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/srijana28/taskmanager
2. Open project in Android Studio

3. Build and run on emulator/device

### 🏗 Project Structure
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/taskmanager/
│   │   │   ├── data/              # Room Entities, DAO
│   │   │   ├── di/                # Hilt Modules
│   │   │   ├── ui/                # Composable Screens
│   │   │   ├── viewmodel/         # ViewModels
│   │   │   └── repository/        # Data layer
│   │   └── res/                   # Resources
├── build.gradle                   # Dependency configs

### 📚 Learning Outcomes
1. Implemented declarative UI with Jetpack Compose

2. Mastered state management in Compose

3. Applied clean architecture principles

4. Gained experience with modern Android libraries

5. Learned effective use of Coroutines/Flow

### 🔮 Future Improvements
1. Add Firebase sync for cloud backup

2. Implement task categories/tags

3. Add reminder notifications

4. Widget support for quick access
