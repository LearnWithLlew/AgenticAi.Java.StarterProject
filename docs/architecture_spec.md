# Architecture Specification: 3D FPS Desktop App

```mermaid
classDiagram
    class MainApp {
        +main(String[] args)
        +initializeWindow()
        +gameLoop()
    }
    class Renderer {
        +initOpenGL()
        +renderScene()
    }
    class Camera {
        +position: Vector3
        +direction: Vector3
        +update(input)
    }
    MainApp --> Renderer : uses
    MainApp --> Camera : controls
    Renderer --> Camera : uses
```

## Description
- **MainApp**: Entry point, sets up the window and main game loop.
- **Renderer**: Handles all OpenGL rendering.
- **Camera**: Manages first person camera position and orientation.

*This architecture is intentionally minimal to support the MVP: an empty 3D world with first person camera controls.*
