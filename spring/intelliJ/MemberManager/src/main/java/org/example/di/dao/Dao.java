package org.example.di.dao;


import org.example.di.domain.Member;

public interface Dao {
    // selectByEmail -> update -> insert

    Member selectByEmail(String email);

    void update(Member member);

    void insert(Member newMember);

}
