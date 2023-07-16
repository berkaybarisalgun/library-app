package com.berkaybarisalgun.library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Table(name="user")
public class User extends BaseEntity{
    @Id


}
