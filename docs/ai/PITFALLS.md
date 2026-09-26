# Pitfalls

Things that do not work, subtle bugs, and non-obvious constraints.
Read this file carefully before making changes in affected areas.

- Die `GeltendeFassung.wxe`-Seite des RIS (Gesetzesnummer) liefert das ganze
  Lehrplanpaket (>10 MB) — nie per `webfetch` laden; `curl` + lokal parsen.
- Der konsolidierte HTML-Text ist eine flache Tag-Entfernung: Tabellenzellen
  (Stundentafeln) geraten durcheinander — Spaltenwerte nicht ungeprüft übernehmen.
- Exceptions (z. B. `IllegalArgumentException`) sind im offiziellen Lehrplan
  nicht als Stoff genannt, werden im Unterricht aber als gute Praxis verwendet.
- Das Skriptum existiert zweimal (Fachgruppen-Repo und Repo-Kopie) — bei
  Aktualisierung Quelle und Kopie abgleichen.
- **Terminologie Leistungsfeststellung:** In formellen Texten „praktische
  Leistungsfeststellung" (PLF) verwenden, nicht „(Leistungs-)Überprüfung" —
  letzteres ist kein LBVO-Begriff und riskiert die Einordnung als Test (§ 8
  LBVO, mit 25/80-Min-Kappen). Details: `lehrplan/RECHT-KOLLOQUIUM.md`.
