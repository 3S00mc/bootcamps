# Educational Keylogger Simulation

## Overview

This folder contains a **non-invasive, educational keylogger simulation** designed for security training as part of the Riachuelo Cyber bootcamp. This simulation is **intentionally safe**—it does NOT monitor real keyboard input or interact with actual system input devices.

**IMPORTANT**: This code is for **educational purposes only**. Do NOT use this against systems without explicit permission. Unauthorized keylogging is illegal in most jurisdictions.

## Educational Purpose

This simulation teaches:

- **What keyloggers do**: How keystroke logging works conceptually
- **Data capture mechanics**: What information could be captured and stored
- **Pattern analysis**: How attackers might analyze captured keystroke data
- **Security awareness**: Why endpoint protection and security monitoring matter
- **Defensive measures**: How to protect against malicious keyloggers

## What's Included

```
keylogger/
├── keylogger_sim.py          # Main keylogger simulation module
├── run_test_keylogger.py     # Test runner with examples
├── requirements.txt           # Python dependencies (if any)
├── README_KEYLOGGER.md        # This file
└── test_logs/                 # Generated during testing
    ├── keystroke_log.json
    ├── pattern_analysis.json
    └── KEYLOGGER_SIMULATION_NOTE.txt
```

## Quick Start

### Installation

```powershell
cd riachuelo-cyber/keylogger
python -m pip install -r requirements.txt  # If needed
```

### Run the Test Suite

```powershell
python run_test_keylogger.py
```

## Understanding the Simulation

### How It Works

The simulation demonstrates keylogger behavior through:

1. **Keystroke Capture** - Simulating the collection of individual keystrokes
2. **Data Storage** - Saving captured keystrokes to a JSON log file
3. **Pattern Analysis** - Analyzing frequency patterns in captured data
4. **Data Reconstruction** - Recovering the original typed text from captured keystrokes

### Example: What Gets Captured

When you simulate typing `admin@example.com`, the system captures:

```json
{
  "keystroke_data": [
    {
      "timestamp": "2026-02-17T10:30:45.123456",
      "key": "a",
      "char_code": 97,
      "sequence_number": 1
    },
    {
      "timestamp": "2026-02-17T10:30:45.145678",
      "key": "d",
      "char_code": 100,
      "sequence_number": 2
    }
    // ... more keystrokes
  ]
}
```

### Key Classes and Methods

#### `KeyloggerSimulation`

Main class for simulating keystroke logging.

**Methods:**

- `simulate_keystroke(key, timestamp=None)` - Log a single keystroke
- `simulate_input(text)` - Log a block of text
- `get_statistics()` - Get statistics about captured keystrokes
- `analyze_patterns()` - Analyze frequency patterns
- `save_log(output_file=None)` - Save log to JSON
- `load_log(input_file)` - Load a previously saved log
- `clear_log()` - Clear all stored keystrokes

**Example:**

```python
from keylogger_sim import KeyloggerSimulation

# Create a simulation
keylogger = KeyloggerSimulation()

# Simulate typing
keylogger.simulate_input("secret_password_123")

# Get statistics
stats = keylogger.get_statistics()
print(f"Captured {stats['total_keys']} keystrokes")

# Analyze patterns
patterns = keylogger.analyze_patterns()
print(f"Most common bigrams: {patterns['top_bigrams']}")

# Save the log
keylogger.save_log("my_log.json")
```

## Test Results Example

Running `run_test_keylogger.py` demonstrates:

### Test 1: Basic Keystroke Logging
```
✓ Keylogger simulation initialized
✓ Simulating keystroke capture for: 'admin@company.com'

Capture Statistics:
  - Total keys captured: 17
  - Printable characters: 17
  - Session duration: 0.001 seconds
  - Capture rate: 17000.0 keys/second
```

### Test 2: Pattern Analysis
```
Simulating keystroke capture for multiple inputs:
  → username=alice
  → password=SecurePass123!
  → email=user@domain.com
  → phone=555-1234-5678

Pattern Analysis Results:
  - Total characters captured: 75
  - Unique characters: 22
  
Most Common Bigrams:
  - 's ': 2 times
  - 'e ': 2 times
  - ' u': 1 times
```

### Test 3: Log Loading and Verification
```
✓ Original log saved
  - Original keystroke count: 11
✓ Log successfully loaded
  - Loaded keystroke count: 11
  - Match: YES ✓
  - Reconstructed: Test@12345
  - Content match: YES ✓
```

## Security Lessons

### Why This Matters

1. **Keystroke Logging is a Real Threat**
   - Malware can log sensitive information (passwords, credit cards, messages)
   - Often deployed silently without user awareness
   - Particularly dangerous on public/shared computers

2. **What Attackers Seek**
   - Login credentials
   - Banking information
   - Credit card numbers
   - Sensitive conversations
   - Personal information

3. **Real-World Attack Scenario**
   - User downloads seemingly legitimate software
   - Keylogger installs silently in background
   - All keyboard input is captured and sent to attacker
   - User is unaware their keystrokes are being monitored

### Defensive Measures

1. **Endpoint Protection**
   - Use reputable antivirus/anti-malware software
   - Keep security software updated
   - Perform regular scans

2. **Awareness & Best Practices**
   - Only download from official sources
   - Be cautious with email attachments and links
   - Keep operating system and software updated
   - Use strong, unique passwords
   - Enable two-factor authentication

3. **Technical Protections**
   - Use password managers (encrypted storage)
   - Consider using on-screen keyboards for sensitive input
   - Monitor running processes and installed software
   - Use encrypted communication channels

4. **Monitoring & Detection**
   - Monitor CPU/network activity for suspicious processes
   - Check for unauthorized system modifications
   - Review installed programs regularly
   - Use security monitoring tools

## Ethical Considerations

### When Is Keylogging Legitimate?

- **Employee monitoring**: With explicit written consent and knowledge
- **Parental controls**: For minor children's safety
- **Personal security testing**: On your own devices with proper controls
- **Device recovery**: Law enforcement with proper warrants (jurisdiction-specific)

### When Is Keylogging Illegal?

- **Without consent**: Monitoring anyone without explicit permission
- **Malicious intent**: Installing keyloggers on others' systems
- **Privacy violations**: Violating wiretap laws (varies by jurisdiction)
- **Corporate espionage**: Stealing proprietary information

## Learning Resources

This simulation teaches:

1. **Security Fundamentals**
   - Attack vectors and threat modeling
   - Data exfiltration techniques
   - System monitoring concepts

2. **Python Programming**
   - File I/O operations
   - JSON data handling
   - Data analysis and pattern recognition
   - Object-oriented design

3. **Cybersecurity Career Path**
   - Understanding malware behavior
   - Forensic analysis techniques
   - Defensive security strategies

## File Structure

### keylogger_sim.py

Core module containing:
- `KeyloggerSimulation` class - Main simulation engine
- `create_simulation_note()` function - Creates educational marking

### run_test_keylogger.py

Test runner demonstrating:
- Test 1: Basic keystroke logging
- Test 2: Pattern analysis
- Test 3: Log loading and verification
- Documentation creation

### test_logs/ (Generated)

Contains output files:
- `keystroke_log.json` - Sample captured keystrokes
- `pattern_analysis.json` - Pattern analysis results
- `saved_session.json` - Saved session example
- `KEYLOGGER_SIMULATION_NOTE.txt` - Educational marker

## Important Warnings

⚠️ **DO NOT:**
- Use this code to create a real keylogger
- Modify this code to actually monitor system input
- Deploy this against systems you don't own
- Use for unauthorized surveillance
- Ignore the ethical and legal implications

✓ **DO:**
- Use this for educational learning only
- Understand the security concepts it demonstrates
- Apply these lessons to building defenses
- Document your learning and observations
- Keep this code in a version-controlled repository clearly marked as educational

## Comparison with Real Keyloggers

### This Simulation

- ✗ Does NOT hook into system keyboard input
- ✗ Does NOT run in background
- ✗ Does NOT communicate over network
- ✗ Does NOT persist system-wide
- ✓ Educational demonstration of concepts
- ✓ Non-invasive and safe

### Real Malicious Keyloggers

- ✓ Hook into system-level input mechanisms
- ✓ Run invisibly in background
- ✓ Exfiltrate data to remote servers
- ✓ Persist across reboots
- ✓ Bypass user awareness
- ✗ Illegal without authorization

## Next Steps for Learning

1. **Understand the Code**
   - Review the implementation in detail
   - Trace through the test cases
   - Understand the JSON data structures

2. **Modify and Experiment**
   - Add new analysis functions
   - Create different simulation scenarios
   - Compare pattern analysis methods

3. **Study Real Defenses**
   - Learn how antivirus detects keyloggers
   - Study endpoint detection & response (EDR) tools
   - Understand behavioral analysis

4. **Career Development**
   - Apply to security operations (SOC) roles
   - Explore threat analysis positions
   - Consider incident response specialization

## Legal Notice

This educational material is provided for learning purposes only. Users are responsible for using this code in compliance with all applicable laws and regulations. Unauthorized access to computer systems or surveillance without consent is illegal in most jurisdictions.

---

**Created**: February 2026  
**Purpose**: Educational cybersecurity training  
**License**: For bootcamp coursework only

⚠️ **REMEMBER: This is a SIMULATION for LEARNING. Do NOT use for unauthorized monitoring.**
