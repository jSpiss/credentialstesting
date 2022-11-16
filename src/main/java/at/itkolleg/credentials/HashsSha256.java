package at.itkolleg.credentials;

import java.util.List;

public class HashsSha256 extends Hashdecorator{

    public HashsSha256(ExportCredentials credencials) {
        super(credencials);
    }

    @Override
    public void export(List<Credentials> credentialsList) {
        System.out.println("Veschlüsselung: ");
        String sha256hex = "--Verschlüsseltmit sha256hex--";

        for(int i = 0;i<credentialsList.size();i++) {
            Credentials credentials = credentialsList.get(i);
            credentials.setPwd(sha256hex);
        }
            super.export(credentialsList);

    }
}
