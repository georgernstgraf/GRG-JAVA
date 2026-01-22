# AGENTS.md - Parkhaus-Leitsystem

## Project Setup
- Language: Java 21
- Build Tool: Maven
- Default Package: `at.spengergasse`
- Testing Framework: JUnit 5.10.1

## Build, Lint, Test Commands

### Build Project
```bash
mvn clean compile
```

### Run All Tests
```bash
mvn test
```

### Run Single Test Class
```bash
mvn test -Dtest=ClassName
```

### Run Single Test Method
```bash
mvn test -Dtest=ClassName#testMethodName
```

### Package Application
```bash
mvn clean package
```

### Clean Build Artifacts
```bash
mvn clean
```

## Code Style Guidelines

### Package Structure
- All classes must be in `at.spengergasse` package or subpackages
- Main classes: `src/main/java/at/spengergasse/`
- Test classes: `src/test/java/at/spengergasse/`

### Import Ordering
1. Java standard library (java.*)
2. Third-party libraries
3. Application imports (at.spengergasse.*)
- Sort alphabetically within groups
- No wildcard imports (*)

### Naming Conventions
- Classes: PascalCase (e.g., `Parkplatz`, `Auto`)
- Methods: camelCase (e.g., `findeFreienPlatz`, `berechneAuslastung`)
- Variables: camelCase (e.g., `parkplaetze`, `freierPlatz`)
- Constants: UPPER_SNAKE_CASE (e.g., `MAX_PLAETZE`)

### Array and Null Handling
- Arrays represent parking spots: `Auto[] parkplaetze`
- `null` values indicate free parking spots
- Always check for null before accessing Auto objects
- Use linear search to find free spots or specific vehicles

### Error Handling
- Use `IllegalArgumentException` for invalid arguments
- Use `NullPointerException` checks explicitly where appropriate
- Provide descriptive error messages

### Javadoc
- Document all public methods with `/** */`
- Include @param and @return tags
- Keep comments concise and in English

### Code Formatting
- Indentation: 4 spaces (no tabs)
- Line length: Max 120 characters
- Opening braces on same line
- One statement per line

## Domain-Specific Guidelines

### Parking Spot Array Representation
- Index 0: Nearest to exit (highest priority)
- Last index: Farthest from exit
- Search strategy: Linear from index 0 upwards

### Key Classes
- `Auto`: Represents a parked vehicle
- `Parkhaus`: Manages parking spots array
- `Parkplatz`: Optional wrapper for parking spot metadata

### Testing Best Practices
- Use `@BeforeEach` for test setup
- Use `@DisplayName` for descriptive test names
- Test null scenarios explicitly
- Use `assertThrows` for exception testing