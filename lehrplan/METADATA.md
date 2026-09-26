# Metadaten zum Lehrplan — POS (Erwachsenenbildung, HTL Spengergasse)

## Rechtliche Grundlage

| Feld | Wert |
|------|------|
| **Kundmachungsorgan (primär)** | **BGBl. II Nr. 368/2022** |
| **Titel** | Lehrpläne der Sonderformen der Höheren technischen und gewerblichen Lehranstalten sowie Lehrplan des Vorbereitungslehrganges für Berufstätige für technische Fachrichtungen |
| **Anlagen** | Anlage 1 (allgemeiner Teil) + **Anlage 1.9 (Informatik)** — Variante **I.3** (Aufbaulehrgang, 7 Semester) und **I.4** (Kolleg, 6 Semester) |
| **Gegenstand in diesem Repo** | **Programmieren und Software Engineering (POS)** — Pflichtgegenstand der Anlage 1.9, in beiden Varianten (I.3/I.4) identischer Lehrstoff |
| **Kundmachungsdatum** | 4. Oktober 2022 |
| **Inkrafttreten (§ 4)** | semesterweise aufsteigend ab Kundmachung; inzwischen vollständig in Kraft |
| **Geltungs-Check** | **aktuell** — Recherche, Novellen, RIS-Links: [`RIS.md`](RIS.md) |

## Anlage 1.9 — Struktur und Formen

Die Anlage 1.9 enthält vier Stundentafel-Varianten:

| Variante | Dauer | Form | von der Spengergasse geführt? |
|----------|-------|------|-------------------------------|
| I.1 | Aufbaulehrgang, 5 Semester | AIF | nein |
| I.2 | Kolleg, 4 Semester | KIF/CIF | nein |
| **I.3** | **Aufbaulehrgang, 7 Semester** | **AIF** | **ja** |
| **I.4** | **Kolleg, 6 Semester** | **KIF/CIF** | **ja** |

> **Form-übergreifend:** Bildungs- und Lehraufgaben sowie Lehrstoff des POS sind für
> I.3 und I.4 **identisch** (RIS-verifiziert, 2026-09-26). Nur die Stundentafeln
> unterscheiden sich. Deshalb liegt dieses `lehrplan/`-Verzeichnis flach und
> form-übergreifend (bewusste Ausnahme, siehe [`DECISIONS.md`](DECISIONS.md)).

## POS in den Stundentafeln (Anlage 1.9, offiziell)

| Variante | N | Stunden (aus Stundentafel) | Summe |
|----------|---|----------------------------|-------|
| I.3 (AIF, 7 Sem) | 7 | 4 h ab Semester 2 (Stundentafel I.3) | 26 |
| I.4 (Kolleg, 6 Sem) | 6 | 4 / 4 / 4 / 4 / 5 / 5 | 26 |

Quelle: Stundentafel I.3/I.4, BGBl. II Nr. 368/2022 (konsolidierte Fassung,
abgerufen 2026-09-26). Stunden laut Schulstundentafel (②, Schulwebsite): siehe
`GRG-WMC/lehrplan/METADATA.md` — Abendform.

## Klassen-Zuordnung

| Zweig/Form | Klassen-Postfix | Kohorten |
|------------|-----------------|----------|
| AIF (Aufbaulehrgang) | `AIF` | z. B. 3AAIF → 4AAIF … |
| KIF (Kolleg) | `KIF` | z. B. 3AKIF/3BKIF → … |
| CIF (Kolleg, 17:10-Zweig) | `CIF` | z. B. 3CAIF → 4CAIF … |

> Klassen-/Kohorten-/Block-Ordner und Klassen-Extrakte sind in diesem Repo
> **bewusst nicht** angelegt (Vorgabe 2026-09-26). Bei Bedarf nachrüstbar.

## Zeitmodell & Beurteilung

- **POS:** laut Stundentafel (siehe oben); Jahr 1 = Semester, die von der
  jeweiligen Klasse belegt werden.
- **Beurteilung (dieses Repo):** PLF / Hausübungen / Mitarbeit je 1/3
  (Root-[`README.md`](../README.md)).

## Schularbeiten — Befund (LBVO-relevant)

**POS hat laut Anlage 1.9 keine lehrplanmäßig vorgesehenen Schularbeiten.**
Im Gegenstandsabschnitt „Programmieren und Software Engineering" fehlt ein
`Schularbeiten:`-Block; solche Blöcke bestehen nur für Deutsch, Englisch,
Angewandte Mathematik (und in anderen Fachrichtungen z. B. Holzbau).
Konsequenz für Kolloquien: siehe [`LEHRPLAN.md`](LEHRPLAN.md), Abschnitt
„Schularbeiten-Befund".

## RIS-Status

> **RIS-Status abgefragt am 2026-09-26:** konsolidierte Fassung zu BGBl. II
> Nr. 368/2022 (Gesetzesnummer 20012030), Anlagen 1 + 1.9 — Ergebnis:
> **aktuell**; keine spätere inhaltliche Novelle zu Anlage 1.9 gefunden.
> Details/Fundstellen: [`RIS.md`](RIS.md).

## Dateien in diesem Verzeichnis

| Datei | Beschreibung |
|-------|--------------|
| `METADATA.md` | Diese Datei |
| [`LEHRPLAN.md`](LEHRPLAN.md) | Dreischichtig: ① offizieller POS-Extrakt (368/2022, Anlage 1.9) · ② Schuladaption (Fachgruppen-LSV) · ③ Didaktik (Java-Skriptum) — form-übergreifend |
| [`RIS.md`](RIS.md) | Rechtsstand, Fundstellen, Novellen-Historie |
| [`DECISIONS.md`](DECISIONS.md) | Lehrplan-Entscheidungen dieses Repos |
| [`RECHT-KOLLOQUIUM.md`](RECHT-KOLLOQUIUM.md) | Rechtsanalyse: Leistungsfeststellung/Kolloquium in POS (LBVO, SchUG-BKV §§ 19–23) |
| `RIS/` | RIS-Gesetzestext-PDFs (`YYYY-MM-DD_…pdf`) |
| `kompetenzmodule/` | Didaktische KM-Steckbriefe `km1–km6` + README-Matrix (POS) |
| `../unterricht/POS/` | Lehrstoffverteilung Jahr 1 (verweist auf das Skriptum) |
