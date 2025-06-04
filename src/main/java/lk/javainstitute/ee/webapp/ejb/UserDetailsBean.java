package lk.javainstitute.ee.webapp.ejb;

import jakarta.ejb.Stateless;
import lk.javainstitute.ee.webapp.remote.UserDetails;


@Stateless
public class UserDetailsBean implements UserDetails {
    @Override
    public String getName() {
        return "vimukthi";
    }

    @Override
    public String getEmail() {
        return "vimukthi@gmail.com";
    }

    @Override
    public String getContact() {
        return "0776840371";
    }
}
