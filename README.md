# 🔐 Secure CI/CD Pipeline – Java + Docker + SonarCloud + Jenkins

This project demonstrates a **secure CI/CD pipeline** for a Java-based application using **Jenkins**, **Docker**, **GitHub Actions**, and **SonarCloud**. The pipeline integrates **static code analysis**, **unit testing**, **threat modeling (STRIDE)** principles, and secure container practices.

---

## 🧱 Stack & Tools

- **Language:** Java 11  
- **CI/CD:** Jenkins, GitHub Actions  
- **Code Quality:** SonarCloud, JUnit  
- **Containerization:** Docker  
- **Threat Modeling:** STRIDE principles  
- **Pipeline Orchestration:** AWS CodeCatalyst (optional)

---


## ⚙️ How It Works

1. **Code is pushed to GitHub.**
2. GitHub Actions or Jenkins triggers the pipeline:
   - Pulls latest code
   - Builds Docker image
   - Runs JUnit tests inside Docker
   - Sends code to **SonarCloud** for static analysis
3. **SonarCloud** scans for:
   - Bugs
   - Vulnerabilities
   - Code smells
   - Coverage
4. Jenkins marks the build as ✅ pass / ❌ fail.
5. Pipeline results are shown in Jenkins UI and GitHub.

---

## 🔒 Security Focus

- **STRIDE threat modeling** used during pipeline design
- **Secrets** never stored in code (use Jenkins/GitHub secrets)
- **Docker** containers run with least privilege (`--rm`, no root)
- **Static code analysis** via SonarCloud
- **Audit-ready** logs via Jenkins and GitHub Actions

---



<img width="951" alt="image" src="https://github.com/user-attachments/assets/b5bc3405-d1cd-4c25-bc31-5a2724f96dfa" />
<img width="935" alt="image" src="https://github.com/user-attachments/assets/e7dba897-ecfe-4e0a-938e-96bc52f6e5a8" />
<img width="945" alt="image" src="https://github.com/user-attachments/assets/2858a58e-323d-4a9d-afeb-0342bb0a4323" />
<img width="941" alt="image" src="https://github.com/user-attachments/assets/4a0a0f50-c353-46f0-8d01-8284b93a56b2" />
