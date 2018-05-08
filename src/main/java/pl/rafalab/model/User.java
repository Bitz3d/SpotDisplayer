package pl.rafalab.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.mindrot.jbcrypt.BCrypt;
import pl.rafalab.Validators.EmailConfirmator;
import pl.rafalab.Validators.UserNameContirmator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @UserNameContirmator
    @Column(unique = true)
    private String userName;


    @NotBlank
    @NotNull
    @Size(min = 5)
    private String password;


    @NotBlank
    @NotNull
    @Transient
    private String confirmPassword;

    @Email
    @NotNull
    @EmailConfirmator
    @Column(unique = true)
    private String email;

    public User() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {

        if (password.length() < 5) {
            this.password = "";


        } else {
            this.password = password;

            checkPassword();
            hashPassword();
        }


    }

    public String getConfirmPassword() {

        return confirmPassword;

    }

    public void setConfirmPassword(String confirmPassword) {

        this.confirmPassword = confirmPassword;
        checkPassword();

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private void checkPassword() {
        if (this.password == null || this.confirmPassword == null) {
            return;
        } else if (!this.password.equals(this.confirmPassword)) {
            this.confirmPassword = null;
        }

    }

    private void hashPassword() {

        this.password = BCrypt.hashpw(this.password, BCrypt.gensalt());


    }

}
