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
    ├── malware/
    │   ├── ransomware_sim.py    [Ransomware Simulation Script]
    │   ├── run_test_sim.py      [Test Runner with Sample Data]
    │   ├── requirements.txt     [Python Dependencies]
    │   └── README_SIMULATION.md [Detailed Documentation]
    │
    └── keylogger/
        ├── keylogger_sim.py     [Keylogger Simulation Module]
        ├── run_test_keylogger.py [Test Suite with Examples]
        ├── requirements.txt     [Python Dependencies]
        └── README_KEYLOGGER.md  [Detailed Documentation]
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
  - **Malware**: Safe ransomware simulation with encryption/decryption
  - **Keylogger**: Educational keystroke logging simulation with pattern analysis
  - **Both**: Non-destructive simulations, suitable for learning

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

For detailed information, see [riachuelo-cyber/malware/README_SIMULATION.md](riachuelo-cyber/malware/README_SIMULATION.md).

### Running the Keylogger Simulation Test

```powershell
cd riachuelo-cyber/keylogger
python run_test_keylogger.py
```

**What the test demonstrates:**
1. **Keystroke Capture** - Simulating the logging of individual keystrokes
2. **Pattern Analysis** - Analyzing frequency patterns in captured data (bigrams)
3. **Data Persistence** - Saving and loading keystroke logs from JSON files
4. **Data Reconstruction** - Recovering original typed text from captured keystrokes

**Generated Output:**
- `keystroke_log.json` - Log of captured keystrokes
- `pattern_analysis.json` - Bigram frequency analysis
- `saved_session.json` - Saved session example
- `KEYLOGGER_SIMULATION_NOTE.txt` - Educational marker

For detailed information, see [riachuelo-cyber/keylogger/README_KEYLOGGER.md](riachuelo-cyber/keylogger/README_KEYLOGGER.md).

---

## Test Results Summary

### Ransomware Simulation

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

### Keylogger Simulation

The test demonstrates keystroke capture and pattern analysis:

**Test 1: Basic Keystroke Logging**
```
✓ Simulating keystroke capture for: 'admin@company.com'

Capture Statistics:
  - Total keys captured: 17
  - Session duration: 0.000 seconds
  - Capture rate: 17.0 keys/second
```

**Test 2: Pattern Analysis**
```
Simulating keystroke capture for multiple inputs:
  → username=alice
  → password=SecurePass123!
  → email=user@domain.com
  → phone=555-1234-5678

Pattern Analysis Results:
  - Total characters captured: 77
  - Unique characters: 30

Most Common Bigrams:
  - 'us': 2 times
  - 'se': 2 times
  - 'er': 2 times
```

**Test 3: Log Verification**
```
✓ Original input: Test@12345
✓ Reconstructed: Test@12345
✓ Content match: YES ✓
```

---

## 🎓 Learning Objectives

These simulations teach security professionals about:

- **Ransomware**: Encryption mechanisms, file operations, data exfiltration
- **Keyloggers**: Input monitoring, data capture, pattern analysis, forensics

Both are implemented **safely**: no system files are affected, outputs are clearly marked as educational simulations, and all operations are reversible.

## ⚠️ Important Notes

- All security simulations are **for educational purposes only**
- No destructive operations are performed - all files are safely copied
- Original files are never modified or deleted
- Always use dedicated test directories for experimentation
- Review documentation before running any scripts
- **NEVER** use these simulations against systems without explicit permission
- Unauthorized access to computer systems is illegal

## 🔐 Ethical & Legal Considerations

These educational materials teach about cybersecurity threats. Remember:

✓ **Legitimate Uses:**
- Learning security fundamentals
- Understanding threat vectors
- Building defensive strategies
- Career development in cybersecurity

✗ **Illegal Uses:**
- Unauthorized system access
- Monitoring without consent
- Malicious code deployment
- Data theft or espionage

All code is provided for learning within a bootcamp environment. Users are responsible for complying with all applicable laws and regulations.

---

**Last Updated**: February 2026
