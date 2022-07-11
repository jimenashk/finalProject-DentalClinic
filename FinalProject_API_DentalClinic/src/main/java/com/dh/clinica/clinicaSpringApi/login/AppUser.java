package com.dh.clinica.clinicaSpringApi.login;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Data
@Entity
public class AppUser implements UserDetails {
        @Id
        @SequenceGenerator(name="user_seq",sequenceName="user_seq")
        @GeneratedValue(strategy = GenerationType.IDENTITY, generator="user_seq")

        private Integer id;

        private String name;
        private String username;
        private String email;
        private String password;

        @Enumerated(EnumType.STRING)
        private AppUserRoles roles;

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            SimpleGrantedAuthority grantedAuthority = new SimpleGrantedAuthority(roles.name());
            return Collections.singletonList(grantedAuthority);
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }

    public AppUser() {
    }

    public AppUser(String name, String username, String email, String password, AppUserRoles roles) {

            this.name = name;
            this.username = username;
            this.email = email;
            this.password = password;
            this.roles = roles;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AppUserRoles getRoles() {
        return roles;
    }

    public void setRoles(AppUserRoles roles) {
        this.roles = roles;
    }
}

