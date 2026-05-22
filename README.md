# GRG-JAVA — POS-Unterricht 3AAIF (2025/26)

Unterrichtsmaterialien für das Fach **POS (Programmieren und Softwareentwicklung)** an der **HTL Spengergasse**, Klasse **3AAIF**, Schuljahr 2025/26.

---

## 📁 Ordnerstruktur

### `3aaif/` — Hauptordner mit allen Unterrichtsinhalten

Die Themen sind chronologisch nach Datum sortiert und bauen didaktisch aufeinander auf:

| Datum / Projekt | Thema | Technologien |
|---|---|---|
| **2025-09** — `student` | OOP-Grundlagen: Klasse `Student`, BMI, Konstruktoren, Setter | BlueJ, JUnit |
| **2025-10** — `array` | Arrays (int[], Object[]), Referenzen | BlueJ |
| **2025-10** — `arrays_mit_tests` | Arrays mit JUnit-Tests | BlueJ, JUnit |
| **2025-11-03** — `autobus_bluej_stub` | Teamarbeit: `Autobus`-Klasse mit Personen-Verwaltung (Stub) | BlueJ, JUnit |
| **2025-11-13** — `plf1a_loesung` | PLF 1a: Lösung Autobus | BlueJ |
| **2025-11-13** — `uebung_christbaum` | Schleifen: Christbaum / Torte zeichnen | BlueJ |
| **2025-11-20** — `plf1b_loesung` | PLF 1b: `Lager` / `Artikel` mit Array-Verwaltung | BlueJ, JUnit |
| **2026-01-08** — `arraylist_bluej` | Einführung `ArrayList` (BlueJ) | BlueJ |
| **2026-01-08** — `ArrayList_Intellij` | Umstieg BlueJ → IntelliJ + Maven + JUnit 5 | IntelliJ, Maven, JUnit 5 |
| **2026-01-12** — `autobus_arraylist` | Autobus mit `ArrayList` statt Array umgesetzt | IntelliJ, Maven, JUnit 5 |
| **2026-01-26** — `autobus_hashset` | Autobus mit `HashSet` umgesetzt | IntelliJ, Maven, JUnit 5 |
| **matrizen** | Matrix-Multiplikation, Potenzen (`p(n)`), Distanzmatrix (Graphentheorie) | IntelliJ, Maven |
| **radrundfahrt** | Objekt-Arrays: Etappen-Verwaltung einer Radrundfahrt | IntelliJ, Maven, JUnit 5 |
| **PLFA2** Parksystem | PLF 2: Parkhaus-Leitsystem mit Arrays (`Auto`, `Parkhaus`) | IntelliJ, Maven, JUnit 5 |

Begleitend dazu gibt es:
- `README.md` — detaillierte Stundenbilder und Aufgabenstellungen
- `NOTE.md` — Notenschlüssel: 2 PLFs + Abgaben, beide Teile positiv erforderlich
- `TODO.md` — Vorschau auf kommende Themen

### `zz_Unterlagen/` — Zusatzmaterialien

- `skriptum.pdf` — Begleitskriptum
- `SwitchModern.java` — Syntaxbeispiel für moderne Switch-Expressions (Java 14+)
- `CV_on_github_profile.md` — Tipps zur GitHub-Profilgestaltung

### `zz_Übungen/` — Zusätzliche Übungen

- `Übung_Signatur.odt` — Übungsblatt zu Methodensignaturen

---

## 🧠 Didaktischer Aufbau

1. **OOP-Einstieg** (Sept.): Klasse `Student` mit BMI-Berechnung, Parameterprüfung, Exceptions
2. **Objektreferenzen & Arrays** (Okt.): Array-Grundlagen, Referenzgleichheit, `null`
3. **Testen mit JUnit** (Okt.–Nov.): `assertEquals`, `assertThrows`, `@Before`/`@After`
4. **Teamarbeit** (Nov.): Gemeinsame Entwicklung Autobus (eine Person schreibt Code, die andere Tests)
5. **PLF-Prüfungen** (Nov., Jan.): Eigenständige Implementierung unter Zeitdruck
6. **Collections** (Jan.): Migration von Arrays → `ArrayList` → `HashSet`, Umstieg BlueJ → IntelliJ + Maven
7. **Graphen & Matrizen**: Matrixmultiplikation, Potenzmatrizen, Distanzmatrix (kürzeste Wege)
8. **Vertiefung Objekt-Arrays**: Radrundfahrt (Etappen-Verwaltung), Parkhaus (PLF 2)

---

## 🛠️ Technologien

- **Java 21** (Maven-Projekt: Java 21 Source/Target)
- **BlueJ** (erste Hälfte des Semesters)
- **IntelliJ IDEA + Maven** (ab Jänner)
- **JUnit 5** (junit-jupiter 5.13.1)
- **Git / GitHub Classroom** (Abgaben, PLFs)
