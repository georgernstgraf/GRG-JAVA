# AGENTS.md — GRG-JAVA

Unterrichtsmaterialien für **Programmieren und Software Engineering (POS)** an
der HTL Spengergasse (Erwachsenenbildung: Aufbaulehrgang AIF + Kolleg KIF/CIF,
Abendform). Sprache des Repos: Deutsch.

## Knowledge Bootstrap

Before starting any task, read the following files in order:

1. `docs/ai/HANDOFF.md` ← **read first, act on it**
2. `docs/ai/CONVENTIONS.md`
3. `docs/ai/DECISIONS.md`
4. `docs/ai/ARCHITECTURE.md`
5. `docs/ai/PITFALLS.md`
6. `docs/ai/STATE.md`
7. `docs/ai/DOMAIN.md` (if task involves business logic)
8. `docs/ai/HISTORY.md` (reference only — read last, as needed)

If `HANDOFF.md` contains open tasks, complete them before starting any new work
unless the user explicitly says otherwise.

> Das **Knowledge-Persistent-Directory** dieses Repos ist [`docs/ai/`](docs/ai/).

## Projektstruktur

- **`3aaif/`** — Kohorten-Einstiegspunkt (Root-Klassenordner, kleingeschrieben),
  aktueller Unterrichtsinhalt pro Klasse; beim Semesterwechsel umbenannt.
- **`zz_Unterlagen/`** — Zusatzmaterialien; u. a. die Kopie des Java-Skriptums
  unter `zz_Unterlagen/skriptum-java-grundlagen/` (Quelle `skriptum.adoc` + PDF).
- **`lehrplan/`** — Lehrplan-Ebene (lehrplan-Skill-Konvention): `LEHRPLAN.md`
  (dreischichtig: ① RIS-Extrakt · ② Schuladaption · ③ Didaktik), `METADATA.md`,
  `RIS.md`, `RIS/` (Gesetzestext-PDFs), `DECISIONS.md`, `kompetenzmodule/`.
  **Form-übergreifend** im Root (Anlage 1.9, AIF/KIF/CIF — DECISIONS).
- **`unterricht/POS/`** — Lehrstoffverteilung (Jahr 1, form-übergreifend).
- **`docs/ai/`** — Knowledge-Persistent-Directory (siehe Bootstrap oben).

## Konventionen (Kurzfassung)

- Deutsche Inhalte, korrekte UTF-8-Umlaute.
- Gesetzestext nie aus dem Gedächtnis zitieren — nur aus gefetchtem RIS-Inhalt.
- Änderungen an `lehrplan/` folgen dem `lehrplan`-Skill; Entscheidungen in
  `lehrplan/DECISIONS.md`.
