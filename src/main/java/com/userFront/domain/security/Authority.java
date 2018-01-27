package com.userFront.domain.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthoritiesContainer;

public class Authority implements GrantedAuthority {
    private  final String authority;

    public Authority(String authority){
        this.authority = authority;
    }

    @Override
    public String getAuthority(){
        return authority;
    }
}
