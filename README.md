# HSPV-Projekt Mensaprogamm

Dieses Programm wurde von Julia Lampe, Felix Lodde und Olaf Werning entwickelt.

*Allgemein*
Es geht hierbei um ein Programm zur Darstellung des Essensplanes und zu Benuzern gehörige Nutzerkonten, welche in einer Datenbank hinterlegt sind.

Die Benutzerkonten enthalten Vorname, Nachname, Kontostand, Passwort und einen Benutzernamen (bestehend aus vorname.nachme) des Benutzers.
Ebenso kann der Benutzer seinen Benutzernamen und sein Passwort, ebenso wie den Kundenstand in dem Programm einsehen.

Die Datenbank enthält hierbei nicht nur die Benutzerkonten, soondern auch Gerichte.

*Ablauf des Programms*
Als ertes kommt das Login Fenster:
Abgefragt werden Benutzername und Passwort.

Nach erfolgreichem Login:
Ein Wochenplan wird generiert und angezeigt. In diesem Fenster kann der Benutzer auch seine Daten einsehen.

Zum beenden des Programms einfach aus das X oben rechts in der Login Seite oder dem Wochenplan drücken.


*Noch nicht fertige Funktionen:*
hier sind Funktionen aufgelistet, bei denen die Backendvorraussetzungen schon gegeben sind
	- das generieren des Wochenplans einmal pro Woche
	- das ändern des eigenen Passwortes durch den Benutzer
	- das Erstellen eines neuen Nutzers

*Für die Zukunft:*
hier sind Funktionen die noch in Planung sind
	- Bilder zu den Gerichten
	- eine Spalte extra für Beilagen und Nachtische
	- eine Übersicht für die Verwaltung, wie viel Einnahmen gemacht wurden
	- Anhand der Bestellungen die benötigte Menge an Zutaten berechnen
	
	
**Wichtig:** 
	- Die mitgelieferte Datei sqlite-jdbc-3.23.1.jar muss als externe Libary eingebunden werden.
	- Die Datei Mensadaten.db sollte mit dem [DB Browser for SQLite](https://sqlitebrowser.org/) geöffnet werden.


Falls diese Software zu kommerziellen Zwecken genutzt werden soll, melden sie sich bitte bei dem Inhaber dieses Repositorys. 
Falls diese Software weiter verbreitet werden sollte oder in abgeändeter Form weiter verteilt werden sollte, weisen Sie auf dieses Repository hin.
