//コメント追加

package com.circleci.demojavaspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quote {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private Integer quote;

    public Integer getId() {
        return id;
    }

    public Integer getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}