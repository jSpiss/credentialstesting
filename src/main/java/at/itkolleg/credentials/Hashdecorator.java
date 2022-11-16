package at.itkolleg.credentials;

import java.util.List;

/**
 * Diese abstrakte Decorator- KLasse wird erstellt, um mehrere Verschlüsselungsmethoden durchühren zu können.
 */
public abstract class Hashdecorator implements ExportCredentials{

    ExportCredentials credentials;

    /**
     * ZUmm Erstellen eines Objekts;muss ein CredentialsObjekt mitgegeben werden.
     * @param credencials _ Objekt, welches mitgegeben wird.
     */
    public Hashdecorator (ExportCredentials credencials){
        this.credentials = credencials;
    }

    /**
     * Export der Daten innerhalb der Liste, wird weiter gegeben
     * @param credentialsList Liste mit den Daten muss angegeben sein.
     */
    @Override
    public void export(List<Credentials> credentialsList) {

        credentials.export(credentialsList);
    }

}
