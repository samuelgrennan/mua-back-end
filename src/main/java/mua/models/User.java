package mua.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {

    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User(){
        userId = UUID.randomUUID().toString();
    }

}
