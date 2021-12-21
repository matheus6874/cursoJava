package hashCodeEequals.application.entities;

import java.util.UUID;

public class GeradorCodigoAleatorio {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();
        System.out.println("Your UUID is: " + uuidAsString);
    }
}
