package com.security.securityorder.dto;

import java.util.List;

public class UserDTO {
    private String principal;
    private String client_id;
    private List<String> authorities;

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public List<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<String> authorities) {
        this.authorities = authorities;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "principal='" + principal + '\'' +
                ", client_id='" + client_id + '\'' +
                ", authorities=" + authorities +
                '}';
    }
}
