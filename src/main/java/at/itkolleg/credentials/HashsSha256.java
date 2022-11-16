package at.itkolleg.credentials;

import java.util.List;

/**
 * In dieser KLasse wird das Passwort aus der Liste heraus gesucht und mit sha256 verschlüsselt.
 */

public class HashsSha256 extends Hashdecorator {
    /**
     * Es muss ein Objekt mitgegeben werden-
     *
     * @param credencials - Objekt
     */
    public HashsSha256(ExportCredentials credencials) {
        super(credencials);
    }

    /**
     * In dieser Methode wird das Passwort dezidiert heraus gesucht und mit dem sha256Schlüssel gehasht.
     * Anschließend wird die Liste mit dem veschlüsselten Passwort zurückgegeben.
     *
     * @param credentialsList Liste mit den Daten muss angegeben sein.
     */
    @Override
    public void export(List<Credentials> credentialsList) {
        System.out.println("Veschlüsselung mit sha256hex: ");
        String sha256hex = "--Verschlüsselt mit sha256hex--";

        for (int i = 0; i < credentialsList.size(); i++) {
            Credentials credentials = credentialsList.get(i);
            credentials.setPwd(sha256hex);
        }
        super.export(credentialsList);

    }
}
