# HSPV-Projekt Mensaprogamm

Dieses Programm wurde von Julia Lampe, Felix Lodde und Olaf Werning entwickelt.

Allgemein
-------------------------------
Es geht hierbei um ein Programm zur Darstellung des Essensplanes einer Mensa, welcher mit Benutzerkonten, welche in einer Datenbank gespeichert werden, verknüpft ist.

Die Benutzerkonten enthalten Vorname, Nachname, Kontostand, Passwort und einen Benutzernamen (bestehend aus vorname.nachme) des Benutzers.
Ebenso kann der Benutzer seinen Benutzernamen und sein Passwort und den Kundenstand in dem Programm einsehen.

Die Datenbank enthält hierbei nicht nur die Benutzerkonten, sondern auch Gerichte.

Ablauf des Programms
-----------------------------
Als ertes kommt das Login Fenster:
Abgefragt werden Benutzername und Passwort, welche der Benutzer vorher von der Mensa in einer Mail erhalten hat.

Nach erfolgreichem Login:
Ein Wochenplan wird, mithilfe der Datenbank, automatisch generiert und angezeigt. Somit hat man eine Übersicht über die Gerichte und die dazugehörigen Preise.
Pro Tag gibt es immer zwei Fleischgerichte und ein vegetarisches Gericht, welches auch farblich gekennzeichnet ist. 
Man kann mit der Maus über die Gerichte gehen und diese werden dann kurz ausgewählt. Wenn man auf die Gerichte mit der Maus klickt, werden diese dauerhaft ausgewählt und erst nach erneutem klicken wieder nicht ausgewählt. Diese Funktion ermöglicht in der Zukunft eine einfachere Einbindung eines Bestellsystems.
Über ein Menu in der oberen linken Ecke kann man dann zunächst auf Einstellungen klicken und es öffnet sich ein neues Fenster wo der Benutzer seinen aktuellen Kontostand sehen kann (auch für ein zukünftiges Bestellsystem relevant). Außerdem kann der Benutzer seine Ernährungsform einstellen, aktuell gibt es nur die Ernährungsform vegetarisch und wenn der Benutzer diese auswählt wird seine Ernährung in der Datenbank geändert und alle Fleischgerichte werden ausgeblendet und sind auch nicht mehr auswählbar.
Desweiteren gibt noch einen zweiten Menupunkt namens Benutzerdaten. Hier kann der Benutzer seinen Benutzernamen und sein Passwort sehen. Außerdem gibt es einen Button mit dem der Benutzer sein Passwort ändern kann.
Zum beenden des Programms kann der Benutzer einfach auf das X oben rechts in der Login Seite oder dem Wochenplan drücken.


Noch nicht fertige Funktionen:
-----------------------------------
hier sind Funktionen aufgelistet, bei denen die Backendvorraussetzungen schon gegeben sind
- das generieren des Wochenplans einmal pro Woche
- das Erstellen eines neuen Nutzers
- das dauerhafte ändern des Zustands vegetarisch


Für die Zukunft:
--------------------------------
	- Bilder zu den Gerichten
	- eine Spalte extra für Beilagen und Nachtische
	- Bestellsystem
	- eine Übersicht für die Verwaltung, wie viel Einnahmen gemacht wurden
	- mehr Einstellungsmöglichkeiten für den Benutzer
	
	
	
**Wichtig:**  
-----------------------------
1. Die mitgelieferte Datei sqlite-jdbc-3.23.1.jar muss als externe Libary eingebunden werden.
2. Die Datei Mensadaten.db sollte mit dem [DB Browser for SQLite](https://sqlitebrowser.org/) geöffnet werden.
3. Falls mensaprogramm.jar nicht ausführbar ist, einmal die batchdatei runProgramm ausführen (hierbei öffnet sich leider der logger)
4. Zum Ausführen des Programmes ist das [JDK 16.0.1](https://www.oracle.com/java/technologies/javase-jdk16-downloads.html) oder neuer erforderlich


Falls diese Software zu kommerziellen Zwecken genutzt werden soll, melden sie sich bitte bei dem Inhaber dieses Repositorys. 
Falls diese Software weiter verbreitet werden sollte oder in abgeändeter Form weiter verteilt werden sollte, weisen Sie auf dieses Repository hin.
