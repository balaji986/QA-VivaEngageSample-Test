package azure;

import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.security.keyvault.secrets.SecretClient;
import com.azure.security.keyvault.secrets.SecretClientBuilder;
import com.azure.security.keyvault.secrets.models.KeyVaultSecret;

public class KeyValut {

	public static void main(String[] args) {
		
        String keyVaultName = "DemoBalaji";
		String keyVaultUrl = "https://" + keyVaultName + ".vault.azure.net";
 
		SecretClient secretClient = new SecretClientBuilder().vaultUrl(keyVaultUrl)
				.credential(new DefaultAzureCredentialBuilder().build()).buildClient();
		KeyVaultSecret retrievedSecret = secretClient.getSecret("UserName");
 
		System.out.println(retrievedSecret.getValue());
	}

}
