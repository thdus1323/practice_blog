package com.example.project1.user;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Repository
public class UserRepository {
    private final EntityManager em;

    // 부분 조회
    public void findById(){

    }

    // 전체 조회
    public void findAll(){

    }

    // 저장
    @Transactional
    public void save(UserRequest.JoinDTO requestDTO){
        Query query = em.createNativeQuery("insert into user_tb" +
                "(rename, uname,pwd,email, date, addresst) values (?,?,?, ?,?,?)");
        query.setParameter(1,requestDTO.getRename());
        query.setParameter(2,requestDTO.getUname());
        query.setParameter(3,requestDTO.getPwd());
        query.setParameter(4,requestDTO.getEmail());
        query.setParameter(5,requestDTO.getDate());
        query.setParameter(6,requestDTO.getAddress());
        query.executeUpdate();
    }

    // 삭제
    @Transactional
    public void deleteById(){

    }

    // 수정
    @Transactional
    public void update(){

    }
}
