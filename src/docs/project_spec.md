# Basic FPS Game – Project Specification

## Overview

This project aims to create a simple, browser-based First-Person Shooter (FPS) game using JavaScript for the front end and Java for any future backend needs (e.g., multiplayer, score tracking, or data persistence). The initial focus will be on core FPS mechanics: player movement and shooting.

## Planned Features

### 1. Player Movement
- **Controls:** WASD keys for movement, mouse for looking around.
- **Mechanics:** Smooth, continuous movement in a 3D environment.
- **Mouse Look:** Pointer lock API for immersive mouse-based camera control.

### 2. Shooting
- **Action:** Left mouse button fires a projectile or hitscan shot.
- **Visuals:** Simple bullet representation (e.g., circle or line).
- **Feedback:** Visual indication of shooting (e.g., muzzle flash, sound, or bullet trail).

### 3. Game Environment
- **Rendering:** HTML5 Canvas for drawing the player, bullets, and environment.
- **Boundaries:** Player and bullets remain within the visible play area.

### 4. (Optional, Future) Backend Integration
- **Java Backend:** Placeholder for future features such as multiplayer, high scores, or persistent player data.
- **Communication:** REST API or WebSocket for real-time features.

## Implementation Steps

1. **Project Structure**
   - Create a `web` directory for front-end files (`index.html`, `main.js`).
   - Set up a basic HTML page with a full-window canvas and control instructions.

2. **Front-End Logic**
   - Implement player movement (WASD + mouse look).
   - Implement shooting (mouse click spawns bullet).
   - Render player and bullets on the canvas.

3. **(Optional) Backend Preparation**
   - Set up a basic Java backend (Spring Boot or similar) for future multiplayer or persistence.


