# System Design for SAAQclic Alternative Site

## Overview
This document outlines the technical architecture and technology choices for the SAAQclic alternative site, based on the requirements and incremental MVP features.

## 1. Application Architecture
- **Type:** Server-rendered web application
- **Framework:** Spring Boot (Java)

## 2. Database
- **Database:** PostgreSQL
- **Rationale:** Robust, open-source, well-supported by Spring Boot, and suitable for transactional data.

## 3. User Authentication & Security
- **Library:** Spring Security (Java, integrated)
- **Rationale:** Seamlessly integrates with Spring Boot, supports modern authentication standards, and is highly configurable.

## 4. Templating Engine
- **Engine:** Mustache (Java, simple, logic-less)
- **Rationale:** Lightweight, easy to use, and encourages separation of logic and presentation.

## 5. Notifications (Email/SMS)
- **Service:** Twilio (SMS/email, popular)
- **Rationale:** Reliable, widely adopted, and supports both SMS and email notifications with good Java SDK support.

## 6. Admin Interface
- **Tool:** JHipster Admin (Java, scaffolding)
- **Rationale:** Provides ready-to-use admin features and scaffolding, speeds up development and maintenance.

## 7. Bilingual Support
- **Solution:** Self-hosted (open-source, e.g., LibreTranslate)
- **Rationale:** Enables control over translation, avoids external service costs, and supports both French and English.

## 8. Accessibility
- **Approach:** Follow WCAG guidelines and use Spring Boot/Mustache best practices for accessible web design.

---

## Next Steps
- Detail deployment and CI/CD strategy.
- Define API contracts and data models.
- Specify monitoring, logging, and error handling solutions.

*This document will be iteratively refined as the system evolves and more details are finalized.*
