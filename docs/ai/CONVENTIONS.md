# Conventions

Coding patterns, naming rules, and style agreements for this project.
Follow these without question. Do not deviate unless explicitly told.

## Sprache & Format

- Inhalte auf Deutsch, korrekte UTF-8-Umlaute (ä, ö, ü, ß).
- Gesetzestext nie aus dem Gedächtnis zitieren — nur aus gefetchtem RIS-Inhalt.

## Datei-Layout

- Kohorten-Ordner am Root: kleingeschrieben (`3aaif/`, `4aaif/` …).
- `lehrplan/<fach>-<zweig>/`: klein — hier **nicht** verwendet (form-übergreifend
  im Root, DECISIONS).
- `unterricht/<ZWEIG>-<FACH>/`: GROSSBUCHSTABEN — hier `unterricht/POS/`.
- RIS-PDFs: `lehrplan/RIS/YYYY-MM-DD_<name>.pdf` (ISO-Kundmachungsdatum).
- Einheiten/Semesterpläne: `jg<N>-einheiten.md`, `jg<N>-semesterplan-{ws,ss}.md`.

## Lehrplan-Ebene

- `lehrplan/` folgt dem lehrplan-Skill; Entscheidungen in `lehrplan/DECISIONS.md`.
- Erläuterungen immer als Blockquote (`> **Überblick:**` / `> **Erläuterung:**`)
  getrennt vom Gesetzestext.

## Testing / Werkzeuge

- POS: BlueJ (Einstieg) → IntelliJ IDEA; JUnit für Tests.
