#!/usr/bin/env python3
import sys
import os
import re
import pyperclip

def convert_to_pascal_case(text):
    # Replace hyphens with spaces
    text = text.replace('-', ' ')
    # Capitalize each word and join them without spaces
    return ''.join(word.capitalize() for word in text.split())

def extract_class_name_from_url(url):
    # Extract the relevant part from the URL using regex
    match = re.search(r'/([^/]+)/[^/]+$', url)
    if match:
        # Get the part before the last slash
        return convert_to_pascal_case(match.group(1))
    return None

def is_valid_codetree_url(url):
    return url.startswith('https://www.codetree.ai/')

def format_number(num):
    # Convert number to string and pad with leading zeros
    return f"{int(num):02d}"

def create_java_class(trail_num, chapter_num, lesson_num, url):
    if not is_valid_codetree_url(url):
        print("Error: Clipboard does not contain a valid CodeTree URL")
        sys.exit(1)
        
    class_name = extract_class_name_from_url(url)
    if not class_name:
        print(f"Could not extract class name from URL: {url}")
        return
    
    # Define the package path and directory with formatted numbers
    package_name = f"org.imjihye.trail{format_number(trail_num)}.chapter{format_number(chapter_num)}.lesson{format_number(lesson_num)}"
    package_dir = os.path.join("src", "main", "java", *package_name.split("."))
    
    # Ensure the directory exists
    os.makedirs(package_dir, exist_ok=True)
    
    # Create the file path
    java_file = os.path.join(package_dir, f"{class_name}.java")
    
    # Write the Java class file
    with open(java_file, 'w') as f:
        f.write(f"package {package_name};\n\n")
        f.write(f"/**\n * @see <a href=\"{url}\">LINK</a>\n */\n")
        f.write(f"public class {class_name} {{\n\n")
        f.write("  public static void main(String[] args) {\n")
        f.write("    \n")
        f.write("  }\n")
        f.write("}\n")
    
    print(f"Created Java class at: {java_file}")

def main():
    if len(sys.argv) != 4:
        print("Usage: python program.py <trail_number> <chapter_number> <lesson_number>")
        sys.exit(1)
    
    trail_num = sys.argv[1]
    chapter_num = sys.argv[2]
    lesson_num = sys.argv[3]
    url = pyperclip.paste().strip()
    
    create_java_class(trail_num, chapter_num, lesson_num, url)

if __name__ == "__main__":
    main() 