# LEHRPLAN — Programmieren und Software Engineering (POS, Erwachsenenbildung)

> **Dreischichtig:** ① **offizieller Extrakt** (RIS, verbindlich) · ② **Schuladaption**
> (Fachgruppen-Lehrstoffverteilung) · ③ **Didaktik** (Java-Skriptum).
> Rechtsstand & Fundstellen: [`RIS.md`](RIS.md) · Metadaten/Stundentafeln/Klassen:
> [`METADATA.md`](METADATA.md) · Lehrplan-Entscheidungen: [`DECISIONS.md`](DECISIONS.md).
>
> **Geltungsbereich:** POS in der **Erwachsenenbildung** (Aufbaulehrgang AIF +
> Kolleg KIF/CIF, Abendform) an der HTL Spengergasse. Lehrstoff von **Anlage 1.9,
> BGBl. II Nr. 368/2022** (Varianten I.3 und I.4 — lehrstoffgleich), daher
> **form-übergreifend** in diesem `lehrplan/`-Root abgelegt (Ausnahme, DECISIONS).

---

# ① Offizieller Extrakt (RIS)

## Rechtsrahmen

| Feld | Wert |
|------|------|
| **Verordnung** | **BGBl. II Nr. 368/2022** — „Lehrpläne der Sonderformen der Höheren technischen und gewerblichen Lehranstalten sowie Lehrplan des Vorbereitungslehrganges für Berufstätige für technische Fachrichtungen" |
| **Anlage** | Anlage 1 (allgemeiner Teil) + **Anlage 1.9 (Informatik)**, Varianten **I.3** (Aufbaulehrgang, 7 Semester) und **I.4** (Kolleg, 6 Semester) |
| **Gegenstand** | Programmieren und Software Engineering (POS) |
| **Quelle des Wortlauts** | konsolidierte Fassung (Gesetzesnummer 20012030), abgerufen 2026-09-26 |

## Kompetenzmodul-Zuordnung (Anlage 1.9)

POS hat **sechs Kompetenzmodule**. Sie werden semesterweise aufsteigend den
Semestern zugeordnet, in denen POS laut Stundentafel vorgesehen ist
(Stundentafel-Fußnote 1). Die Bildungs- und Lehraufgaben sowie der Lehrstoff
sind für die Varianten I.3 (AIF) und I.4 (Kolleg) **identisch**.

---

## Kompetenzmodul 1

> **Überblick:** KM1 legt das Fundament der Programmierung: Denken im
> Stellenwertsystem (wie „rechnet" ein Rechner überhaupt?), Grundbegriffe der
> Softwareentwicklung und der Einstieg in die Umsetzung einfacher
> Problemstellungen in Programme. Es verbindet damit mathematisches
> Grundlagenwissen mit dem ersten praktischen Programmieren.

**Bildungs- und Lehraufgabe:** Die Studierenden können

**im Bereich Theoretische Informatik**

- in verschiedenen Zahlensystemen Grundrechenoperationen ausführen, zwischen
  Zahlensystemen konvertieren, Fehler analysieren und diese programmtechnisch
  anwenden.
> **Erläuterung:** Zahlensysteme (Binär, Dezimal, Hexadezimal) sind die
> „Muttersprache" der Hardware. Wer versteht, wie 13 im Binärsystem zu `1101`
> wird, versteht auch, warum Datentypen begrenzt sind, warum es Rundungsfehler
> gibt und warum Gleitkommazahlen nie exakt sind. Konversionsalgorithmen
> (z. B. Divisions-/Multiplikationsverfahren) werden direkt als Schleifen in
> Programme übertragen — die Brücke von der Theorie zum Code. In der Praxis
> begegnet einem das beim Debuggen von Bitmasken, Farbwerten (`#FF8800`),
> Netzadressen oder Speicherauszügen. Zur Theoretischen Informatik gehören auch
> die einfachen Rechenoperationen in Fest- und Gleitkommaarithmetik sowie die
> Fehleranalyse (Rundung, Überlauf).

**im Bereich Softwareentwicklung und -design**

- Zusammenhänge eines Problems erfassen und mit metasprachlichen Methoden
  darstellen;
> **Erläuterung:** Bevor programmiert wird, muss das Problem verstanden und
> beschrieben werden — etwa mit Pseudocode, Struktogrammen oder einfachen
> Modellen. Diese „metasprachliche" Beschreibung ist bewusst noch keine
> Programmiersprache; sie zwingt dazu, die Logik zu durchdenken, bevor man sich
> in Syntaxdetails verliert. Im Beruf ist genau das der Unterschied zwischen
> sauberer Planung und stundenlangem Nachbessern.

- einfache Problemstellungen in Programme umsetzen.
> **Erläuterung:** Der Kern des ersten Moduls: aus einer Beschreibung lauffähigen
> Code machen — Variablen, Datentypen, Anweisungen, Verzweigungen und erste
> Kontrollstrukturen. Das ist die Fertigkeit, auf der alle weiteren Module
> aufbauen; ohne sie lässt sich später nichts von Datenstrukturen bis zu
> Frameworks verstehen.

**Lehrstoff:** *Bereich Theoretische Informatik:* Zahlentheorie:
Stellenwertsysteme, Konversionsalgorithmen, einfache Rechenoperationen in Fest-
und Gleitkommaarithmetik, Grundzüge der Computernumerik, Fehleranalyse.
*Bereich Softwareentwicklung und -design:* Metasprachliche Problembeschreibung;
Anweisungen, Kontrollstrukturen, Datentypen; Funktionen, Prozeduren, Methoden,
Parameter, Rückgabewert; Integrierte Entwicklungsumgebungen, Teststrategien.
> **Erläuterung:** Der Lehrstoff bündelt die Werkzeuge des Einstiegs: Zahlensysteme
> und Numerik als theoretisches Rückgrat, dazu die elementaren Bausteine des
> Programmierens (Anweisungen, Kontrollstrukturen, Datentypen) sowie das
> Aufteilen von Code in Funktionen/Methoden mit Parametern und Rückgabewerten.
> „Integrierte Entwicklungsumgebungen" meint den professionellen Werkzeugkasten
> (IntelliJ, BlueJ) und „Teststrategien" den früh geübten Umgang mit
> Testfällen — beides sind in der Praxis Standardfertigkeiten von
> Softwareentwickler:innen.

---

## Kompetenzmodul 2

> **Überblick:** KM2 führt von der Logik zu den Daten: formal-logisches Denken
> (Prädikatenlogik) und der bewusste Umgang mit Datenstrukturen und einfachen
> Algorithmen. Im Mittelpunkt steht die Frage „Wie speichere und organisiere ich
> Daten sinnvoll?"

**Bildungs- und Lehraufgabe:** Die Studierenden können

**im Bereich Theoretische Informatik**

- umgangssprachliche Sätze in prädikatenlogische Formeln oder eine mehrwertige
  Logik übertragen und umgekehrt.
> **Erläuterung:** Prädikatenlogik ist die formale Sprache, in der Bedingungen
> präzise ausgedrückt werden — „Alle x gilt: wenn x ein Produkt ist, dann ist
> sein Preis > 0". Genau solche Aussagen werden später zu `if`-Bedingungen,
> Datenbankabfragen oder Validierungsregeln. Quantoren (`∀`, `∃`) und
> Operatoren zu beherrschen heißt, Anforderungen widerspruchsfrei zu formulieren,
> statt sie umgangssprachlich schwammig zu lassen.

**im Bereich Softwareentwicklung und -design**

- Informationen in vorgegebenen Datenstrukturen darstellen;
> **Erläuterung:** Daten müssen in passende Behälter: Arrays, Listen, Mengen,
> Objekte. Die Wahl der Struktur bestimmt, wie schnell man sucht, einfügt oder
> löscht. Diese Entscheidung ist eine der häufigsten und folgenreichsten beim
> Programmieren.

- die Effizienz unterschiedlicher Datenstrukturen bezüglich Datenumfang,
  Sicherheit und Aufwand beurteilen;
> **Erläuterung:** „Effizienz" heißt hier: Wie verhält sich Laufzeit und
> Speicherbedarf, wenn die Datenmenge wächst? Eine lineare Suche über eine
> Million Einträge ist praktisch unbrauchbar, ein Zugriff über einen Schlüssel
> sofort. Das Bewusstsein für Aufwandsklassen (später „O-Notation") trennt
> Anfänger-Code von tragfähigem Code.

- einfache Datenstrukturen und Algorithmen implementieren.
> **Erläuterung:** Die Studierenden bauen diese Strukturen selbst (z. B. Liste,
> Suche, Sortieren), statt nur fertige Bibliotheksklassen zu verwenden — dadurch
> verstehen sie, was intern passiert, und können später fundiert entscheiden,
> wann man die Standardbibliothek nutzt.

**Lehrstoff:** *Bereich Theoretische Informatik:* Prädikatenlogik:
prädikatenlogische Operatoren, Quantoren und Funktoren, Interpretationen und
Modellbildung, mehrwertige Logik. *Bereich Softwareentwicklung und -design:*
Anweisungen, Kontrollstrukturen; Skalare und zusammengesetzte Datentypen,
Datenstrukturen; Funktionen, Prozeduren, Methoden; Basisalgorithmen.
> **Erläuterung:** Der Lehrstoff vertieft Kontrollstrukturen und führt skalare
> (z. B. `int`, `boolean`) und zusammengesetzte Datentypen (Arrays, Objekte)
> zusammen. „Basisalgorithmen" meint die klassischen Grundmuster — Suchen,
> Zählen, Minimum/Maximum, Summieren, Vertauschen —, die als wiederverwendbare
> Bausteine in fast jedem Programm auftauchen.

---

## Kompetenzmodul 3

> **Überblick:** KM3 hebt die Programmierung auf das Niveau von Objektorientierung
> und strukturierten Daten: Vererbung, Collections, Graphen und externe
> Datenzugriffe. Kurz: von einzelnen Werten zu vernetzten, wiederverwendbaren
> Strukturen.

**Bildungs- und Lehraufgabe:** Die Studierenden können

**im Bereich Theoretische Informatik**

- Graphen in geeigneter Form darstellen sowie analysieren und Probleme
  graphentheoretisch modellieren sowie geeignete Strategien zu deren Lösung
  angeben und diese implementieren;
> **Erläuterung:** Graphen (Knoten + Kanten) sind das universelle Modell für
> Beziehungen: Straßennetze, soziale Netzwerke, Abhängigkeiten von
> Software-Paketen, Zustandsautomaten. „Graphentheoretisch modellieren" heißt,
> ein reales Problem als Knoten-und-Kanten-Problem zu erkennen, um bekannte
> Lösungsverfahren (z. B. kürzeste Wege, Durchläufe) anwenden zu können.

- Standardalgorithmen für eine konkrete Problemstellung auswählen.
> **Erläuterung:** Statt alles selbst neu zu erfinden, den passenden bekannten
> Algorithmus wählen (z. B. Tiefen-/Breitensuche, Dijkstra) und an die Aufgabe
> anpassen. Diese Auswahlkompetenz ist zentral — in der Praxis wird selten ein
> Algorithmus „erfunden", aber ständig der richtige ausgewählt und kombiniert.

**im Bereich Softwareentwicklung und -design**

- vorgegebene Vererbungshierarchien entwickeln und gemeinsam mit grundlegenden
  Klassen der Bibliotheken zu Lösungen von Aufgaben einsetzen;
> **Erläuterung:** Vererbung erlaubt, Gemeinsames in eine Oberklasse zu ziehen
> und Spezielles in Unterklassen — das Grundprinzip von Wiederverwendung und
> Polymorphie. Zusammen mit Bibliotheksklassen (z. B. `List`, `Map`) entstehen
> damit flexible, erweiterbare Lösungen.

- Informationen in vorgegebenen Datenstrukturen darstellen;

- in Programmen externe Datenzugriffe realisieren und mit anderen Programmen
  kommunizieren;
> **Erläuterung:** Programme sind selten Inseln: Sie lesen und schreiben Dateien,
> greifen auf Datenbanken zu oder tauschen Daten mit anderen Programmen aus
> (Persistenz, Schnittstellen, Serialisierung). Das ist die Voraussetzung
> dafür, dass eine Anwendung nach dem Beenden noch Daten „behalten" kann.

- die Effizienz unterschiedlicher Datenstrukturen bezüglich Datenumfang,
  Sicherheit und Konvertierungsaufwand beurteilen.

**Lehrstoff:** *Bereich Theoretische Informatik:* Algorithmen:
Standardalgorithmen, Rekursion; Graphentheorie: Strukturen und Eigenschaften von
Graphen, Speicherung von Graphen, Algorithmen in Graphen, Anwendungen und
Problemlösungen. *Bereich Softwareentwicklung und -design:* Objektorientierte
Programmierung; Polymorphie und Collections; Persistenz, Dateizugriffe,
Datenbankzugriffe und Serialisierung; Speicherklassen und Speicherverwaltung.
> **Erläuterung:** Hier wird Objektorientierung (Kapselung, Vererbung,
> Polymorphie) mit den Collections der Standardbibliothek verbunden. Rekursion
> und Graphenalgorithmen liefern das algorithmische Handwerkszeug, Persistenz
> und Serialisierung die Fähigkeit, Daten dauerhaft zu speichern. Dieses
> Kompetenzmodul ist die Brücke zwischen „Sprache beherrschen" und „echte
> Anwendungen bauen".

---

## Kompetenzmodul 4

> **Überblick:** KM4 verbindet Theorie der Berechenbarkeit (formale Sprachen,
> Automaten, Compilerbau-Grundlagen) mit der Entwicklung von Anwendungen mit
> grafischer Oberfläche. Es zeigt, dass „Sprache verstehen" und „Interfaces
> bauen" zwei Seiten derselben Medaille sind.

**Bildungs- und Lehraufgabe:** Die Studierenden können

**im Bereich Theoretische Informatik**

- formale Sprachen, Grammatiken und Syntaxanalyseverfahren anwenden;
> **Erläuterung:** Eine formale Sprache ist eine Menge von Zeichenketten, die
> durch eine Grammatik erzeugt werden; Automaten erkennen, ob eine Zeichenkette
> dazugehört. Das ist die Theorie hinter Compilern, JSON-/XML-Parsern,
> regulären Ausdrücken und Konfigurationsdateien — also hinter fast jedes
> Werkzeugs, das Text strukturiert verarbeitet.

- Algorithmen verstehen und diese in einer Programmiersprache umsetzen sowie
  für komplexe Aufgabenstellungen Algorithmen kombinieren und adaptieren.
> **Erläuterung:** Komplexität und Optimierung stehen hier im Vordergrund:
> abschätzen, wie teuer ein Verfahren wird, und bestehende Algorithmen
> kombinieren, statt isoliert zu denken.

**im Bereich Softwareentwicklung und -design**

- vorgegebene Userinterfaces mit Hilfe fertiger Controls erstellen und auf
  Benutzereingaben angemessen reagieren;
> **Erläuterung:** GUI-Programmierung: Formulare mit Textfeldern, Buttons,
> Tabellen aus fertigen Bausteinen zusammenstellen und auf Ereignisse
> (Eventhandling) reagieren. Genau das erleben Nutzer:innen als „die
> Anwendung".

- neue Userinterfaces für Client-Anwendungen designen und unter Verwendung
  angemessener Programmiertechniken die Kommunikation mit der Datenschicht
  implementieren.
> **Erläuterung:** Über das Zusammenklicken hinaus: ein Interface entwerfen und
> sauber mit der Datenschicht verbinden (Design, Layout, Usability, Trennung
> von Darstellung und Daten). In der Praxis ist diese Trennung die Grundlage
> wartbarer Software.

**Lehrstoff:** *Bereich Theoretische Informatik:* Algorithmen: Komplexität von
Algorithmen, Optimierung, Anwendungen und Problemlösungen; Formale Sprachen und
Automaten: Notationen von Sprachen, Metasprachen, Grammatiken, Klassifikation
von Sprachen, Reguläre Ausdrücke, Syntaxanalyse, Semantik, Endliche Automaten,
Kellerautomaten, Grundlagen des Compilerbaus. *Bereich Softwareentwicklung und
-design:* Userinterfaces, Elemente graphischer Benutzeroberflächen,
Eventhandling, Design, Layout, Usability; Design Patterns für verteilte
Anwendungen; Statische und Dynamische Strukturen.
> **Erläuterung:** Der Lehrstoff verbindet die theoretische Tiefe (Automaten,
> Grammatiken, Compilerbau) mit der praktischen Frontend-Entwicklung (Controls,
> Eventhandling, Layout). „Design Patterns für verteilte Anwendungen" führt
> erstmals über die Einzelanwendung hinaus auf Architekturmuster.

---

## Kompetenzmodul 5

> **Überblick:** KM5 ist das Modul des professionellen Softwareprojekts:
> Architektur, Modellierung, Tests, Versionsverwaltung und Nebenläufigkeit.
> Hier wird aus „Programmieren" das, was man in der Branche unter
> Softwareentwicklung versteht.

**Bildungs- und Lehraufgabe:** Die Studierenden können

**im Bereich Softwareentwicklung und -design**

- Problemlösungen für konkrete Aufgabenstellungen analysieren sowie Programme
  selbstständig entwerfen und mittels geeigneter Methoden moderner
  Softwaretechnologien realisieren;
> **Erläuterung:** Eigenständig von der Analyse über den Entwurf zur
> funktionierenden Lösung kommen — mit den Werkzeugen, die die Branche nutzt.
> Das ist die zentrale Ingenieurskompetenz dieses Moduls.

- geeignete Entwicklungswerkzeuge und -systeme für eine Aufgabe auswählen, und
  konfigurieren;
> **Erläuterung:** Baukastensysteme, Bibliotheken, Build-Werkzeuge und
> Versionsverwaltung (Git) gezielt auswählen und einrichten, statt im
> Einheitswerkzeug zu verharren. Werkzeugwahl ist eine bewusste
> Architekturentscheidung.

- Systeme modellieren und dokumentieren;
> **Erläuterung:** Modelle (z. B. UML-Klassendiagramme) und Dokumentation machen
> Systeme für andere verständlich und über die Zeit wartbar. Code allein ist
> selten ausreichend.

- für die jeweilige Phase einer Softwareentwicklung die geeigneten Tests
  erkennen und beurteilen sowie Testfälle für konkrete Problemstellungen
  konzipieren und umsetzen;
> **Erläuterung:** Tests sind kein Anhängsel, sondern Teil des Entwurfs. Unit
> Tests, Testfälle, Validierung: Fehler früh finden ist billiger, als sie im
> Betrieb zu beheben.

- nebenläufige Anwendungen auf Basis von Entwurfsmustern und Frameworks planen
  und entwickeln.
> **Erläuterung:** Nebenläufigkeit (Threads, Synchronisation) und Frameworks
> sind die Realität moderner Anwendungen; Entwurfsmuster geben dafür erprobte
> Lösungsvorlagen.

**Lehrstoff:** *Bereich Softwareentwicklung und -design:* Modellierung,
Softwarearchitektur, Design Patterns. Versionsverwaltung, Plug-ins,
Bibliotheken, Dokumentationstools. Unit Tests, Erweiterte Teststrategien,
Validierung. Prozesse, Threads, Kommunikation und Synchronisation.
> **Erläuterung:** Der Lehrstoff ist der professionelle Werkzeugkasten: sauber
> modellieren und architektieren, Bibliotheken und Versionsverwaltung
> einsetzen, systematisch testen und Nebenläufigkeit beherrschen. In der
> Praxis bildet genau dieses Bündel die Grundlage für teamfähige,
> industrienahe Softwareentwicklung.

---

## Kompetenzmodul 6

> **Überblick:** KM6 schließt den Bogen: Weiterentwicklung der Tests, Einsatz
> von Frameworks und Muster, und die Fähigkeit, für große Anwendungen
> programmiertechnische Vorgaben zu konzipieren — also selbst Architektur- und
> Konventionsentscheidungen zu treffen.

**Bildungs- und Lehraufgabe:** Die Studierenden können

**im Bereich Softwareentwicklung und -design**

- für die jeweilige Phase einer Softwareentwicklung die geeigneten Tests
  erkennen und beurteilen sowie Testfälle für konkrete Problemstellungen
  entwickeln;
> **Erläuterung:** KM5 führte Tests ein, KM6 vertieft sie: Teststrategien an den
> Projektphasen ausrichten und Testfälle selbst entwickeln, statt nur
> vorgegebene auszuführen.

- Anwendungen auf Basis von Entwurfsmustern und Frameworks entwickeln;
> **Erläuterung:** Bekannte Muster und Frameworks sind der Beschleuniger für
> robuste Anwendungen — wer sie kennt, löst Standardprobleme nicht jedes Mal
> neu.

- für große Applikationen programmiertechnologische Konzepte ausarbeiten und
> Programmiervorgaben konzipieren.
> **Erläuterung:** In größeren Teams müssen technische Vorgaben existieren
> (Coding-Konventionen, Architekturvorgaben). Diese selbst auszuarbeiten ist
> die höchste Stufe der Programmierkompetenz — sie geht über das Schreiben
> einzelner Programme hinaus.

**Lehrstoff:** *Bereich Softwareentwicklung und -design:* Modellierung,
Softwarearchitektur, Design Patterns. Aktuelle Trends der Softwareentwicklung
und Programmiertechniken. Entwicklung von Anwendungen in Abstimmung mit
fachtheoretischen Pflichtgegenständen.
> **Erläuterung:** Der Lehrstoff betont aktuelle Trends und die Abstimmung mit
> den anderen Fachgegenständen (z. B. Datenbanken, WMC) — echte Systeme
> entstehen immer im Zusammenspiel mehrerer Fachgebiete.

---

## Schularbeiten-Befund (LBVO-relevant)

Im offiziellen POS-Abschnitt der Anlage 1.9 ist **kein** `Schularbeiten:`-Block
enthalten (anders als bei Deutsch, Englisch, Angewandter Mathematik, die ihre
Schularbeiten ausdrücklich ausweisen). Damit hat **POS keine lehrplanmäßig
vorgesehenen Schularbeiten**.

**Rechtsfolge für Kolloquien (§ 23 Abs 4 SchUG-BKV):** Beim Kolloquium ist die
Form der **schriftlichen** Prüfung neben der mündlichen nur zulässig, wenn der
Lehrplan für den Gegenstand **Schularbeiten vorsieht**. Da POS keine
Schularbeiten vorsieht, ist das Kolloquium in POS **mündlich** zu führen (eine
schriftliche Angabe kann als Grundlage/Vorbereitung dienen, nicht aber alleinige
schriftliche Benotung sein). Im Zweifel schulintern (Rechtsauskunft) bestätigen
lassen.

---

# ② Schuladaption (Fachgruppe)

Verbindliche Lehrstoffverteilung (LSV) der Fachgruppe POS/WMC, mit der
Fachgruppe vereinbart und akkreditiert:

- `hoa-spg/pos-wmc-fachgruppe-inf-erw/pos/lsv/KIF_BIF_AIF_CIF_POS_Theorie.xlsx`
  (form-übergreifend) sowie die jahresspezifischen Dateien
  `BIF_POS_<N>_Jahr_Java.xlsx`.
- Sitzungsprotokolle: `hoa-spg/pos-wmc-fachgruppe-inf-erw/protokolle/`.

> **Hinweis:** Die LSV konkretisiert die Verteilung des ①-Lehrstoffs auf die
> Semester. Sie ersetzt den ①-Lehrstoff nicht.

---

# ③ Didaktik / Stack

Umsetzung im Unterricht (dieses Repo):

- **Java-Skriptum:** [`../zz_Unterlagen/skriptum-java-grundlagen/skriptum.adoc`](../zz_Unterlagen/skriptum-java-grundlagen/skriptum.adoc)
  (Quelle, AsciiDoc) und `…/skriptum.pdf`.
- **Werkzeuge:** BlueJ (Einstieg) → IntelliJ IDEA (Umstieg nach Weihnachten),
  JUnit als Testframework.
- **Didaktische Steckbriefe:** [`kompetenzmodule/`](kompetenzmodule/) (km1–km6).
- **Lehrstoffverteilung Jahr 1:** [`../unterricht/POS/jg1-einheiten.md`](../unterricht/POS/jg1-einheiten.md).
