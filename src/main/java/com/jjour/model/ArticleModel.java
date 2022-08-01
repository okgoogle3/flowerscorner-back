package com.jjour.model;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "articles")
public class ArticleModel extends BaseModel {
    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    private Long likes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private CategoryModel category;

}
