package com.jjour.model;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "users")
public class UserModel extends BaseModel {
    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String email;

    private String phoneNumber;

    private String photoLink;

    @Column(nullable = false)
    private String password;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<RoleModel> roles = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
    @JoinTable(
            name = "User_LikedArticles",
            joinColumns = { @JoinColumn(name = "user_id") },
            inverseJoinColumns = { @JoinColumn(name = "article_id") }
    )
    Set<ArticleModel> projects = new HashSet<>();
    public UserModel(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }
    //private Long likedArticles;
}