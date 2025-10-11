# Java-Level-1
# <svg xmlns="http://www.w3.org/2000/svg" width="520" height="120" viewBox="0 0 520 120">

  <defs>
    <linearGradient id="g" x1="0" x2="1">
      <stop offset="0" stop-color="#f99"/>
      <stop offset="1" stop-color="#f06"/>
    </linearGradient>
  </defs>
  <rect width="520" height="120" rx="12" fill="#0f172a" />
  <text x="30" y="70" font-family="Segoe UI, Roboto, Arial" font-size="36" fill="url(#g)">Java — Level 1</text>
  <text x="30" y="96" font-family="Segoe UI, Roboto, Arial" font-size="12" fill="#94a3b8">Beginner-friendly introduction to Java programming</text>
</svg>

---

## About

A compact, beginner-oriented README for **Java — Level 1**. This guide covers the essentials: setup, a tiny example, a short syllabus and expected outcomes. Embedded SVGs provide lightweight graphics you can reuse in documentation or a website.

## Quick Start

**Prerequisites**

* Java JDK 11+ installed (or OpenJDK)
* A text editor or IDE (VS Code, IntelliJ, Eclipse)
* Terminal / Command Prompt

**Compile & Run**

```bash
# compile
javac HelloWorld.java

# run
java HelloWorld
```

**HelloWorld.java**

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java Level 1!");
    }
}
```

---

## Syllabus (short)

1. Java basics: types, variables, operators
2. Control flow: if, switch, loops (for/while)
3. Methods and parameter passing
4. Arrays & basic String handling
5. Simple I/O and File reading
6. Intro to OOP: classes, objects, constructors

---

## Learning Outcomes

* Write, compile and run simple Java programs.
* Use basic data types and control structures.
* Create simple classes and instances.
* Read/write basic text files.

---

## SVG: Module Flow Diagram

Below is a small SVG showing the high-level flow between core modules.

```html
<svg xmlns="http://www.w3.org/2000/svg" width="700" height="160" viewBox="0 0 700 160">
  <style> .box{fill:#fff;stroke:#0f172a;stroke-width:1.5;rx:8;}</style>
  <rect x="8" y="8" width="684" height="144" rx="10" fill="#f8fafc" stroke="#e2e8f0"/>
  <rect class="box" x="36" y="36" width="140" height="52" rx="8"/>
  <text x="106" y="66" font-family="sans-serif" font-size="12" text-anchor="middle">Basics</text>

  <rect class="box" x="220" y="36" width="140" height="52" rx="8"/>
  <text x="290" y="66" font-family="sans-serif" font-size="12" text-anchor="middle">Control Flow</text>

  <rect class="box" x="404" y="36" width="140" height="52" rx="8"/>
  <text x="474" y="66" font-family="sans-serif" font-size="12" text-anchor="middle">Data & IO</text>

  <rect class="box" x="288" y="100" width="140" height="36" rx="8"/>
  <text x="358" y="123" font-family="sans-serif" font-size="12" text-anchor="middle">OOP Intro</text>

  <path d="M176 62 L220 62" stroke="#0f172a" stroke-width="1.5" fill="none" marker-end="url(#arrow)"/>
  <path d="M360 62 L404 62" stroke="#0f172a" stroke-width="1.5" fill="none" marker-end="url(#arrow)"/>
  <path d="M360 88 L360 100" stroke="#0f172a" stroke-width="1.5" fill="none"/>

  <defs>
    <marker id="arrow" markerWidth="10" markerHeight="7" refX="10" refY="3.5" orient="auto">
      <polygon points="0 0, 10 3.5, 0 7" fill="#0f172a" />
    </marker>
  </defs>
</svg>
```

---

## Tips & Resources

* Practice small programs daily (30–60 minutes).
* Use an IDE with auto-complete (helps beginners).
* Refer to Oracle/OpenJDK docs for API reference.

---

## License

MIT — feel free to reuse and adapt.

---

*Generated for a concise Java Level-1 README with embedded SVG graphics.*
