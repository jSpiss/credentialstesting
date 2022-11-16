package at.itkolleg.credentials;

import java.util.List;

public abstract class Hashdecorator implements ExportCredentials{

    ExportCredentials credentials;

    public Hashdecorator (ExportCredentials credencials){
        this.credentials = credencials;
    }
    @Override
    public void export(List<Credentials> credentialsList) {

        credentials.export(credentialsList);
    }
}
