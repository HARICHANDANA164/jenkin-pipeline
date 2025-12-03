# CVE ML Project  

[![Python](https://img.shields.io/badge/Python-3.8+-blue.svg)](https://www.python.org/)  
[![Machine Learning](https://img.shields.io/badge/Machine%20Learning-Logistic%20Regression-brightgreen)]()  
[![MongoDB](https://img.shields.io/badge/Database-MongoDB-green)](https://www.mongodb.com/)  
[![AWS](https://img.shields.io/badge/Cloud-AWS-orange)](https://aws.amazon.com/)  
[![SonarQube](https://img.shields.io/badge/Code%20Analysis-SonarQube-yellow)](https://www.sonarqube.org/)  

##  Overview  
This project focuses on **automated static code analysis, vulnerability data processing, and machine learning–based classification of CVEs (Common Vulnerabilities and Exposures)**.  

It integrates **DevOps practices (CI/CD, SonarQube, Jenkins)** with **data science (logistic regression, NLP processing of CVE descriptions)** to create a scalable security analysis pipeline.  

---

##  Features  
- **CI/CD Pipeline**  
  - Implemented a Jenkins pipeline integrating **SonarQube** for automated static code analysis.  
  - Stored processed vulnerability data in **MongoDB** for structured analysis.  

- **Automation & Synchronization**  
  - Built a **Python-based synchronization script** to parse SonarQube reports and ingest results into MongoDB.  

- **Machine Learning Model**  
  - Developed and evaluated a **Logistic Regression model** for CVE classification.  
  - Used processed vulnerability descriptions as input features for classification tasks.  

- **Cloud Deployment**  
  - Deployed the entire system on **AWS EC2**, ensuring scalability and real-world applicability.  

---

##  Tech Stack  
- **Languages & Libraries**: Python, scikit-learn, pandas, NumPy  
- **DevOps Tools**: Jenkins, SonarQube  
- **Database**: MongoDB  
- **Cloud**: AWS EC2  

---

##  Outcome  
The project demonstrates how combining **CI/CD workflows with machine learning** can improve security pipelines by:  
✔️ Automating vulnerability data ingestion  
✔️ Structuring static code analysis results  
✔️ Applying ML models to classify CVEs for faster decision-making  




