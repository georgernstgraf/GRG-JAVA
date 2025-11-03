# sj25-26-34aaif-pos

## 2025-11-03 Teamarbeit Autobus

einer macht den Bus, der andere die Tests!!

### Autobus

- new Autobus (int: plätze) (Parameterprüfung! negativ, <100 o.Ä.)
- einsteigen (Person): boolean (war möglich oder nicht)
- aussteigen (Person): void (Exception wenn P nicht drin war)
- isDrinnen (Person): boolean
- anzahlPassagiere()
- nutzlast(): int .. Gesamtgewicht aller eingestiegenen Passagiere

### AutobusTest

- wird ex geworfen bei falschen Arg in Construktor?
- wird ex geworfen bei aussteigen von nicht anwesender Person?
- kann ich n Personen einsteigen lassen und bei n+1 wird false?
- wird erkannt, ob eine Person schon drin ist oder nicht?
- stimmt die anzahl immer noch, wenn mehrere ein/aussteigevorgänge durchgeführt werden=
- nutzlast: stimmt die?

## Probe PLF

<https://classroom.github.com/a/8EMUtdP8>

## 2025-10-06

Vertiefung einsteigen / aussteigen

HÜ: einsteigen / aussteigen GRÜNDLICH testen UND

@BeforeEach - setup() verwedenden!!


try / catch erklären!!

## 2025-09-29

- git: fetch / remotes / Aufbau / Graph
- String Klasse
- Pyramid of doom

HÜ: Skriptum Kap 5: Objektreferenzen

- Klasse Auto zusätzlich ins bluej übernehmen aus dem Skriptum
- Klasse Student auf Person umbenennen und mit Person weiterarbeiten
- die Auto.einsteigen() und Auto.aussteigen() und andere von der Pyramid of doom ändern auf `throw new Illegal[Argument|State]Exception`
- Tests schreiben

## 2025-09-25

Aufgabe Tests

- ausgehend vom vorhandenen Test: für alle 6 Gewichtsfälle verfassen. (m/f + unter/normal/über)
- das errechnete BMI mit assertEquals und Genauigkeit von 0.1 abzutesten (3 Testfälle erzeugen)
- überprüfen ob der Konstruktor auch tatsächlich Errors wirft (Recherche nötig)

## PLÜs Dauer jeweils 2UE

- 2025-11-10
- 2026-01-12

## 2025-09-22

- Signaturen
- Junit Tests

HÜ:

- weitere bmi_wertungen implemetieren
- Tests für getBMI () schreiben

## 2025-09-15

HÜ Parameterprüfung *für alle* Parameter! (name / kg / cm / gender)

- Parameterprüfung
- (throw)
- if / else nochmal gründlich
- .gitignore!!

## 2025-09-11

- (default) Konstruktor
- setter
- bmi Methode

HÜ:

- attribut "gender": Datentyp char
- im Konstruktor verwenden + setter bauen
- in der Printmethode normal / unter / übergewicht dazuschreiben, zB:
- - "Name: Walter (männlich), 140kg, 110cm (Übergewicht)"
- - "Name: Maria (weiblich), 55kg, 165cm (Normalgewicht)"
- printStudent verbessern

## 2025-09-04s

- .. git intro
- bluej install
- fragen zu add
