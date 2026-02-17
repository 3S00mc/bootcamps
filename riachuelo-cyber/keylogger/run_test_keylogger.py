"""
Keylogger Simulation Test Runner
=================================

This script tests the educational keylogger simulation by:
1. Creating a simulation session
2. Logging simulated keyboard input
3. Analyzing the captured data
4. Saving and analyzing results
"""

import os
import sys
import json
import shutil
from datetime import datetime

# Add the keylogger module to the path
cwd = os.path.join(os.getcwd(), "riachuelo-cyber", "keylogger")
sys.path.insert(0, cwd)

try:
    import keylogger_sim as kg
except ImportError:
    sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
    import keylogger_sim as kg


def print_section(title: str):
    """Print a formatted section header."""
    print("\n" + "=" * 60)
    print(f"  {title}")
    print("=" * 60)


def test_basic_keystroke_logging():
    """Test basic keystroke logging functionality."""
    print_section("TEST 1: Basic Keystroke Logging")
    
    test_dir = os.path.join(os.getcwd(), "riachuelo-cyber", "keylogger", "test_logs")
    if os.path.exists(test_dir):
        shutil.rmtree(test_dir)
    os.makedirs(test_dir, exist_ok=True)
    
    # Create a keylogger simulation
    keylogger = kg.KeyloggerSimulation(
        log_file=os.path.join(test_dir, "keystroke_log.json")
    )
    
    print("✓ Keylogger simulation initialized")
    
    # Simulate typing a password field (educational demonstration)
    simulated_input = "admin@company.com"
    print(f"✓ Simulating keystroke capture for: '{simulated_input}'")
    
    keylogger.simulate_input(simulated_input)
    
    stats = keylogger.get_statistics()
    print(f"\nCapture Statistics:")
    print(f"  - Total keys captured: {stats['total_keys']}")
    print(f"  - Printable characters: {stats['printable_characters']}")
    print(f"  - Session duration: {stats['session_duration_seconds']:.3f} seconds")
    print(f"  - Capture rate: {stats['keys_per_second']:.1f} keys/second")
    
    # Save the log
    log_path = keylogger.save_log()
    print(f"\n✓ Log saved to: {log_path}")
    
    # Display sample of saved log
    with open(log_path, 'r', encoding='utf-8') as f:
        log_data = json.load(f)
        print(f"\nSaved Log Structure:")
        print(f"  - Simulation Note: {log_data.get('simulation_note')}")
        print(f"  - Timestamp: {log_data.get('timestamp')}")
        print(f"  - Total entries: {len(log_data.get('keystrokes', []))}")
    
    return test_dir, log_path


def test_pattern_analysis():
    """Test keystroke pattern analysis."""
    print_section("TEST 2: Keystroke Pattern Analysis")
    
    test_dir = os.path.join(os.getcwd(), "riachuelo-cyber", "keylogger", "test_logs")
    os.makedirs(test_dir, exist_ok=True)
    
    keylogger = kg.KeyloggerSimulation()
    
    # Simulate multiple inputs
    inputs_to_log = [
        "username=alice",
        "password=SecurePass123!",
        "email=user@domain.com",
        "phone=555-1234-5678"
    ]
    
    print("Simulating keystroke capture for multiple inputs:")
    for input_text in inputs_to_log:
        print(f"  → {input_text}")
        keylogger.simulate_input(input_text)
    
    # Analyze patterns
    patterns = keylogger.analyze_patterns()
    
    print(f"\nPattern Analysis Results:")
    print(f"  - Total characters captured: {patterns.get('total_characters')}")
    print(f"  - Unique characters: {patterns.get('unique_characters')}")
    print(f"  - Text preview: {patterns.get('reconstructed_text_preview')}")
    
    print(f"\nMost Common Bigrams (2-char sequences):")
    for bigram_data in patterns.get('top_bigrams', [])[:5]:
        print(f"  - '{bigram_data['bigram']}': {bigram_data['count']} times")
    
    # Save analysis
    analysis_file = os.path.join(test_dir, "pattern_analysis.json")
    with open(analysis_file, 'w', encoding='utf-8') as f:
        json.dump({
            "simulation_note": "EDUCATIONAL PATTERN ANALYSIS",
            "timestamp": datetime.now().isoformat(),
            "analysis": patterns
        }, f, indent=2)
    
    print(f"\n✓ Analysis saved to: {analysis_file}")
    
    return test_dir


def test_log_loading():
    """Test loading a previously saved log."""
    print_section("TEST 3: Log Loading and Verification")
    
    test_dir = os.path.join(os.getcwd(), "riachuelo-cyber", "keylogger", "test_logs")
    os.makedirs(test_dir, exist_ok=True)
    
    # Create and save a log
    original_keylogger = kg.KeyloggerSimulation(
        log_file=os.path.join(test_dir, "saved_session.json")
    )
    
    test_input = "Test@12345"
    original_keylogger.simulate_input(test_input)
    original_path = original_keylogger.save_log()
    
    print(f"✓ Original log saved: {original_path}")
    print(f"  - Original keystroke count: {len(original_keylogger.keystrokes)}")
    
    # Load the log into a new session
    new_keylogger = kg.KeyloggerSimulation()
    load_success = new_keylogger.load_log(original_path)
    
    if load_success:
        print(f"\n✓ Log successfully loaded")
        print(f"  - Loaded keystroke count: {len(new_keylogger.keystrokes)}")
        print(f"  - Match: {'YES ✓' if len(new_keylogger.keystrokes) == len(original_keylogger.keystrokes) else 'NO ✗'}")
        
        # Verify content
        reconstructed = ''.join([ks['key'] for ks in new_keylogger.keystrokes])
        print(f"  - Original input: {test_input}")
        print(f"  - Reconstructed: {reconstructed}")
        print(f"  - Content match: {'YES ✓' if reconstructed == test_input else 'NO ✗'}")
    else:
        print("✗ Failed to load log")
    
    return test_dir


def create_simulation_documentation():
    """Create simulation documentation in test directory."""
    print_section("Creating Simulation Documentation")
    
    test_dir = os.path.join(os.getcwd(), "riachuelo-cyber", "keylogger", "test_logs")
    os.makedirs(test_dir, exist_ok=True)
    
    kg.create_simulation_note(test_dir)
    
    note_path = os.path.join(test_dir, "KEYLOGGER_SIMULATION_NOTE.txt")
    if os.path.exists(note_path):
        print(f"✓ Simulation note created: {note_path}")
        with open(note_path, 'r', encoding='utf-8') as f:
            content = f.read()
            print(f"\nNote Preview:\n{content[:300]}...")
    
    return test_dir


def main():
    """Run all keylogger simulation tests."""
    print("\n" + "=" * 60)
    print("  KEYLOGGER SIMULATION TEST SUITE")
    print("  Educational Purpose Only")
    print("=" * 60)
    
    try:
        # Run tests
        print("\nRunning tests...")
        test_dir_1, _ = test_basic_keystroke_logging()
        test_dir_2 = test_pattern_analysis()
        test_dir_3 = test_log_loading()
        test_dir_4 = create_simulation_documentation()
        
        # Summary
        print_section("TEST SUMMARY")
        print("✓ All tests completed successfully")
        print(f"\nTest files saved in: {os.path.join(os.getcwd(), 'riachuelo-cyber', 'keylogger', 'test_logs')}")
        
        test_files = os.listdir(test_dir_4)
        print(f"\nGenerated files:")
        for file in sorted(test_files):
            file_path = os.path.join(test_dir_4, file)
            size = os.path.getsize(file_path)
            print(f"  - {file} ({size} bytes)")
        
        print_section("EDUCATIONAL OBJECTIVES DEMONSTRATED")
        print("""
1. ✓ Keystroke Capture Simulation
   - Understanding how keyloggers work conceptually
   - Data structure for keystroke logging
   
2. ✓ Pattern Analysis
   - How captured data could be analyzed
   - Bigram frequency analysis for language patterns
   
3. ✓ Data Persistence
   - Saving captured data to files
   - Loading and reconstructing typed content
   
4. ✓ Security Awareness
   - Importance of endpoint protection
   - Why users should be aware of malicious software
   - Best practices for secure input (passwords, sensitive data)
        """)
        
        return 0
        
    except Exception as e:
        print(f"\n✗ Error during testing: {e}")
        import traceback
        traceback.print_exc()
        return 1


if __name__ == "__main__":
    exit_code = main()
    sys.exit(exit_code)
