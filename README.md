# Bootcamps Repository

Repository containing coursework, projects and educational materials from various bootcamp programs.

## 📁 Repository Structure

```
bootcamps/
├── README.md
├── bradesco/
│   ├── exercicios/              [Enunciados de Exercícios]
│   ├── projetos/                [Enunciados de Projetos]
│   ├── src/
│   │   └── main/
│   │       └── java/
│   │           ├── desafios/    [Desafios Práticos]
│   │           ├── exercicios/  [Exercícios de Programação]
│   │           ├── projetos/    [Projetos Integrados]
│   │           └── teoria/      [Código de Referência Teórica]
│   └── pom.xml                  [Maven Configuration]
│
└── riachuelo-cyber/             [Cybersecurity & Malware Analysis]
    └── malware/
        ├── ransomware_sim.py    [Ransomware Simulation Script]
        ├── run_test_sim.py      [Test Runner with Sample Data]
        ├── requirements.txt     [Python Dependencies]
        └── README_SIMULATION.md [Detailed Documentation]
```

## 📚 Programs

### 1. Bradesco Bootcamp  
Java-focused program covering fundamentals, OOP, design patterns, and enterprise applications.

- **Location**: `bradesco/`
- **Language**: Java
- **Build Tool**: Maven

### 2. Riachuelo Cyber  
Cybersecurity training program including malware analysis and safe simulation techniques.

- **Location**: `riachuelo-cyber/`
- **Focus**: Security Training & Educational Simulations
- **Current Content**: 
  - Safe ransomware simulation for educational purposes
  - Non-destructive encryption/decryption demonstration
  - Test suite with sample data

## 🚀 Quick Start

### Running the Ransomware Simulation Test

```powershell
cd riachuelo-cyber/malware
python -m pip install -r requirements.txt
python run_test_sim.py
```

**Expected Output:**
- Original file: `test_ransom/sample.txt`
- Encrypted copy: `test_ransom/sample.txt.enc`
- Decrypted copy: `test_ransom/sample.txt.dec`
- Simulation marker: `test_ransom/SIMULATION_NOTE.txt`

### Test Results Example

The test creates a simulation directory with sample password data:

**Original Content** (sample.txt):
```
alice@example.com: P@ssw0rd_SIM_1
bob@example.com: Tr0ub4dor&3
carol@example.com: S!mulatedP@ss2
dev_team: DevPass_SIM_2026
backup_admin: b@ckup_SIM_#01
```

**Process Output:**
```
Working dir: C:\Users\pedro\OneDrive\Documentos\Carreira\GitHub\bootcamps\riachuelo-cyber\malware
Generating key...
Encrypting copies...
files_after_enc= ['sample.txt', 'sample.txt.enc', 'SIMULATION_NOTE.txt']
Decrypting copies...
files_after_dec= ['sample.txt.dec']
DECRYPTED_CONTENT: alice@example.com: P@ssw0rd_SIM_1
bob@example.com: Tr0ub4dor&3
carol@example.com: S!mulatedP@ss2
dev_team: DevPass_SIM_2026
backup_admin: b@ckup_SIM_#01
```

✅ **Verification**: The decrypted file matches the original 100%

For detailed information, see [riachuelo-cyber/malware/README_SIMULATION.md](riachuelo-cyber/malware/README_SIMULATION.md).

## ⚠️ Important Notes

- All security simulations are **for educational purposes only**
- No destructive operations are performed - all files are safely copied
- Original files are never modified or deleted
- Always use dedicated test directories for experimentation
- Review documentation before running any scripts

---

**Last Updated**: February 2026
