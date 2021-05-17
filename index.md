# Ein Mensaprogramm
## das leider nicht so gut ist wie erhofft

### Allgemein
Dieses Programm ist keine reine Eigenleistung. [Ich (U1finator)](https://github.com/U1finator) hatte dabei Hilfe von zwei Kommilitonen.
Zum einen von [Shreki182](https://github.com/Shreki182) und von [Felodd](https://github.com/Felodd).

Dieses Programm ist sehr simpel in seiner Darstellung und seinen Funktionen.
Es erstellt bei Aufruf einen Mensaplan, also welche Gerichte es für die Woche gibt. 
Desweiteren hat es eine Anmeldefunktion. Diese wird durch eine SQLite Datenbank im Hintergrund realisiert.
Die Datenbank enthält dabei nicht nur die Nutzer mit den dazugehörigen Daten (Nutzername, Vor- und Nachname, Passwort, Kontostand und Ernähungsart), sondern auch Vegetarische und nicht Vegetarische Gerichte.

### Ablauf des Programms
Als erstes kommt das Login Fenster:

 Abgefragt werden Benutzername und Passwort, welche der Benutzer vorher der Mensa in einer Mail erhalten hat.
 
Nach erfolgreichem Login: 

Ein Wochenplan wird, mithilfe der Datenbank, automatisch generiert und angezeigt. Somit hat man eine Übersicht über die Gerichte und die dazugehörigen Preise. Pro Tag gibt es immer zwei Fleischgerichte und ein vegetarisches Gericht, welches auch farblich gekennzeichnet ist. Man kann mit der Maus über die Gerichte gehen und diese werden dann kurz ausgewählt. 
Wenn man auf die Gerichte mit der Maus klickt, werden diese dauerhaft ausgewählt und erst nach erneutem klicken wieder nicht ausgewählt. Diese Funktion ermöglicht in der Zukunft eine einfachere Einbindung eines Bestellsystems. Über ein Menu in der oberen linken Ecke kann man dann zunächst auf Einstellungen klicken und es öffnet sich ein neues Fenster, wo der Benutzer seinen aktuellen Kontostand sehen kann (auch für ein zukünftiges Bestellsystem relevant). 
Außerdem kann der Benutzer seine Ernährungsform einstellen, aktuell gibt es nur die Ernährungsform vegetarisch und wenn der Benutzer diese auswählt, wird seine Ernährung in der Datenbank geändert und alle Fleischgerichte werden ausgeblendet und sind auch nicht mehr auswählbar. Desweiteren gibt noch einen zweiten Menupunkt namens Benutzerdaten. 
Hier kann der Benutzer seinen Benutzernamen und sein Passwort sehen. Außerdem gibt es einen Button, mit dem der Benutzer sein Passwort ändern kann. 

Zum Beenden des Programms kann der Benutzer einfach auf das X oben rechts in der Login Seite oder dem Wochenplan drücken.


## Wichtig
  - Bitte vor Programmstart die Punkte Wichtig in der [REAME.MD](https://github.com/U1finator/HSPV-Projekt/blob/main/README.md) durchlesen
  - bei Verwendung des Codes oder Auszügen davon für kommerzielle Zwecke oder die Weiterentwicklung in anderen Projekten melden Sie sich bitte bei mir über GitHub
