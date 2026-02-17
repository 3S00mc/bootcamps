"""
Educational Keylogger Simulation
==================================

This module demonstrates keylogging concepts for EDUCATIONAL PURPOSES ONLY.
This is a simplified, non-invasive simulation designed for security training.

WARNING: This code is for understanding security vulnerabilities only.
Do NOT use against real systems or without explicit permission.
"""

import json
import os
from datetime import datetime
from typing import List, Dict, Optional


class KeyloggerSimulation:
    """A safe, educational keylogger simulation for understanding keystroke logging."""
    
    def __init__(self, log_file: str = "keystroke_log.json"):
        """
        Initialize the keylogger simulation.
        
        Args:
            log_file: Path to save keylogged data (JSON format for analysis)
        """
        self.log_file = log_file
        self.keystrokes: List[Dict] = []
        self.session_start = datetime.now()
        self.char_count = 0
        
    def simulate_keystroke(self, key: str, timestamp: Optional[datetime] = None) -> None:
        """
        Simulate capturing a keystroke.
        
        Args:
            key: The character/key being logged
            timestamp: Optional timestamp (defaults to now)
        """
        if timestamp is None:
            timestamp = datetime.now()
            
        self.char_count += 1
        
        keystroke_data = {
            "timestamp": timestamp.isoformat(),
            "key": key,
            "char_code": ord(key) if len(key) == 1 else None,
            "sequence_number": self.char_count
        }
        
        self.keystrokes.append(keystroke_data)
    
    def simulate_input(self, text: str) -> None:
        """
        Simulate logging a block of text (simulating keyboard input).
        
        Args:
            text: The text being typed
        """
        for char in text:
            self.simulate_keystroke(char)
    
    def get_statistics(self) -> Dict:
        """
        Generate statistics about captured keystrokes.
        
        Returns:
            Dictionary with keystroke analysis
        """
        if not self.keystrokes:
            return {"total_keys": 0, "session_duration": 0}
        
        session_end = datetime.fromisoformat(self.keystrokes[-1]["timestamp"])
        duration = (session_end - self.session_start).total_seconds()
        
        # Count by character type
        printable_chars = sum(1 for ks in self.keystrokes if ks["char_code"] is not None)
        special_keys = len(self.keystrokes) - printable_chars
        
        return {
            "total_keys": len(self.keystrokes),
            "printable_characters": printable_chars,
            "special_keys": special_keys,
            "session_duration_seconds": duration,
            "keys_per_second": len(self.keystrokes) / max(duration, 1),
            "session_start": self.session_start.isoformat(),
            "session_end": session_end.isoformat()
        }
    
    def save_log(self, output_file: Optional[str] = None) -> str:
        """
        Save the keystroke log to a JSON file.
        
        Args:
            output_file: Path to save log (defaults to self.log_file)
            
        Returns:
            Path to the saved file
        """
        if output_file is None:
            output_file = self.log_file
        
        log_data = {
            "simulation_note": "THIS IS AN EDUCATIONAL SIMULATION",
            "timestamp": datetime.now().isoformat(),
            "statistics": self.get_statistics(),
            "keystrokes": self.keystrokes
        }
        
        with open(output_file, 'w', encoding='utf-8') as f:
            json.dump(log_data, f, indent=2, ensure_ascii=False)
        
        return output_file
    
    def load_log(self, input_file: str) -> bool:
        """
        Load a previously saved keystroke log.
        
        Args:
            input_file: Path to the log file
            
        Returns:
            True if successfully loaded
        """
        try:
            with open(input_file, 'r', encoding='utf-8') as f:
                data = json.load(f)
                self.keystrokes = data.get("keystrokes", [])
                self.char_count = len(self.keystrokes)
                return True
        except Exception as e:
            print(f"Error loading log: {e}")
            return False
    
    def analyze_patterns(self) -> Dict:
        """
        Analyze patterns in captured keystrokes (for educational understanding).
        
        Returns:
            Dictionary with pattern analysis
        """
        if not self.keystrokes:
            return {}
        
        # Reconstruct typed text
        reconstructed_text = ''.join([ks["key"] for ks in self.keystrokes])
        
        # Find common sequences
        bigrams = {}
        for i in range(len(reconstructed_text) - 1):
            bigram = reconstructed_text[i:i+2]
            bigrams[bigram] = bigrams.get(bigram, 0) + 1
        
        # Sort by frequency
        top_bigrams = sorted(bigrams.items(), key=lambda x: x[1], reverse=True)[:5]
        
        return {
            "total_characters": len(reconstructed_text),
            "unique_characters": len(set(reconstructed_text)),
            "top_bigrams": [{"bigram": bg, "count": count} for bg, count in top_bigrams],
            "reconstructed_text_preview": reconstructed_text[:100] + "..." if len(reconstructed_text) > 100 else reconstructed_text
        }
    
    def clear_log(self) -> None:
        """Clear all logged keystrokes."""
        self.keystrokes = []
        self.char_count = 0
        self.session_start = datetime.now()


def create_simulation_note(directory: str) -> None:
    """
    Write a simulation note to the directory.
    
    Args:
        directory: Path where to write the note
    """
    note_path = os.path.join(directory, "KEYLOGGER_SIMULATION_NOTE.txt")
    content = """EDUCATIONAL KEYLOGGER SIMULATION
=================================

This is a SIMULATION for SECURITY TRAINING PURPOSES ONLY.

This simulation demonstrates:
- How keystroke logging works conceptually
- What data a keylogger might capture
- How to analyze and pattern-match keystroke data
- Why security awareness and endpoint protection matter

IMPORTANT:
- This is NOT a real keylogger and does NOT work on actual systems
- This code is for learning about security vulnerabilities
- Do NOT use this code to monitor anyone without explicit permission
- Do NOT modify this code to create a real keylogger
- Unauthorized keylogging is ILLEGAL in most jurisdictions

Learning Goals:
1. Understand keystroke logging as a security threat
2. Learn about data capture and analysis techniques
3. Appreciate the importance of security monitoring and endpoint protection
4. Develop defensive security awareness

For more information, see README_KEYLOGGER.md
"""
    with open(note_path, 'w', encoding='utf-8') as f:
        f.write(content)


if __name__ == "__main__":
    # Simple example usage
    print("Keylogger Simulation Module")
    print("This module is designed for educational use only.")
    print("Use run_test_keylogger.py for examples.")
