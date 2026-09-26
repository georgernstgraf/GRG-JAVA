# Decisions

Active architectural and technical decisions still in force.
Superseded decisions are relocated to HISTORY.md.

## 2026-09-26: Lehrplan-Ebene form-übergreifend

- **Choice**: `lehrplan/LEHRPLAN.md`, `RIS.md`, `kompetenzmodule/` liegen flach
  im `lehrplan/`-Root (keine `pos-aif/-kif/-cif`).
- **Reason**: Anlage 1.9 POS ist für I.3 (AIF) und I.4 (Kolleg) lehrstoffgleich.
- **Considered**: Getrennte Ordner pro Form.
- **Tradeoff**: Form-spezifische Details brauchen Markierung im Text.
- **Siehe auch**: `lehrplan/DECISIONS.md`.

## 2026-09-26: Java-Skriptum als Repo-Kopie

- **Choice**: Das Java-Skriptum (AsciiDoc + PDF + Quellen) liegt als Kopie unter
  `zz_Unterlagen/skriptum-java-grundlagen/`.
- **Reason**: Self-contained Repo; Didaktik-Schicht ③ des Lehrplans.
- **Tradeoff**: Kopie kann gegenüber der Fachgruppen-Quelle driften.

## 2026-09-26: AGENTS.md verweist auf Knowledge-Persistent-Directory

- **Choice**: `AGENTS.md` mit Knowledge Bootstrap → `docs/ai/`.
- **Reason**: Einheitlicher Einstieg für Agenten; `docs/ai/` als
  Knowledge-Persistent-Directory.
