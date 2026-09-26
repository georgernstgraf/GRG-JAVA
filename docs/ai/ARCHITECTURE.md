# Architecture

Living structural map of the system as of 2026-09-26.

## Overview

`GRG-JAVA` ist ein Unterrichts-Repo für den Gegenstand **POS** (Erwachsenenbildung,
HTL Spengergasse). Es bündelt (a) die aktuellen Kohorten-Inhalte, (b) das
Java-Skriptum, (c) die Lehrplan-Ebene (lehrplan-Skill-Konvention) und (d) das
Knowledge-Persistent-Directory für Agenten.

## Verzeichnisse

| Pfad | Zweck |
|------|-------|
| `3aaif/` | Kohorten-Einstiegspunkt (Root-Klassenordner) |
| `zz_Unterlagen/` | Zusatzmaterialien; Skriptum-Kopie |
| `lehrplan/` | Lehrplan: LEHRPLAN.md, METADATA.md, RIS.md, RIS/, DECISIONS.md, kompetenzmodule/ |
| `unterricht/POS/` | Lehrstoffverteilung Jahr 1 (Skriptum-Verweis) |
| `docs/ai/` | Knowledge-Persistent-Directory |

## Knowledge Files (`docs/ai/`)

| File | Purpose | Update mode |
|------|---------|------------|
| HANDOFF.md | Open tasks for next session | Overwrite |
| DECISIONS.md | Active decisions still in force | Append; prune → HISTORY.md |
| ARCHITECTURE.md | Living structural map | Overwrite |
| CONVENTIONS.md | Ongoing rules to follow | Append |
| PITFALLS.md | Hard-won failure knowledge | Append |
| DOMAIN.md | Business/domain rules | Append |
| STATE.md | Current project status | Overwrite |
| HISTORY.md | Superseded entries archive | Append-only |

## Data Flows

- RIS (bundesrecht) → `lehrplan/RIS/` + `lehrplan/LEHRPLAN.md` ①.
- Fachgruppen-Repo (LSV, Skriptum) → `lehrplan/LEHRPLAN.md` ②/③ bzw. Skriptum-Kopie.
- `lehrplan/` → `unterricht/POS/` (Lehrstoffverteilung).
