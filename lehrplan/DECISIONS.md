# Lehrplan-Entscheidungen — GRG-JAVA

Dokumentierte Entscheidungen zur Anlage und Pflege der Lehrplan-Ebene
(`lehrplan/`). Jeder Eintrag nennt WHAT und WHY.

## 2026-09-26: Form-übergreifendes `lehrplan/` (Shared-Root-Ausnahme)

- **Choice**: `LEHRPLAN.md`, `RIS.md` und `kompetenzmodule/` liegen flach im
  `lehrplan/`-Root — **keine** getrennten Zweig-Ordner `pos-aif/`, `pos-kif/`,
  `pos-cif/`.
- **Reason**: Der POS-Lehrstoff der Anlage 1.9 ist für die Varianten I.3 (AIF)
  und I.4 (Kolleg/KIF/CIF) **identisch** (RIS-verifiziert am 2026-09-26); nur
  die Stundentafeln unterscheiden sich. Pro-Form-Duplikate wären
  drift-gefährdete Kopien.
- **Covered by**: lehrplan-Skill, dokumentierte Ausnahme (vgl. `GRG-WMC`
  „Shared-Dateien form-übergreifend im Root").

## 2026-09-26: Keine Klassenordner / Kohorten-Extrakte

- **Choice**: Im `lehrplan/`-Verzeichnis werden **keine** Klassenordner
  (`3AAIF`, `3AKIF`, …) und keine Klassen-Extrakte angelegt.
- **Reason**: Nutzer-Vorgabe 2026-09-26; der Lehrstoff ist form-übergreifend
  identisch, die Klassen-Extrakte wären reine Redundanz.
- **Reversibel**: Bei Bedarf nachrüstbar (Jahrgang ↔ KM aus `METADATA.md`).

## 2026-09-26: ② Schuladaption = Fachgruppen-LSV, ③ Didaktik = Java-Skriptum

- **Choice**: Die Fachgruppen-Lehrstoffverteilung
  (`pos/lsv/KIF_BIF_AIF_CIF_POS_Theorie.xlsx` u. a.) ist die verbindliche
  Schuladaption (②); das **Java-Skriptum** (`skriptum.adoc`, Kopie unter
  `zz_Unterlagen/skriptum-java-grundlagen/`) ist die Didaktik-Schicht (③).
- **Reason**: Die LSV ist mit der Fachgruppe akkreditiert; das Skriptum ist das
  etablierte Unterrichtsmaterial.

## 2026-09-26: Schularbeiten-Befund (POS)

- **Choice**: Festhalten, dass POS in Anlage 1.9 **keine lehrplanmäßigen
  Schularbeiten** hat.
- **Reason**: Entscheidend für die Kolloquiumsform nach § 23 Abs 4 SchUG-BKV
  (schriftlich nur bei lehrplanmäßig vorgesehenen Schularbeiten).
