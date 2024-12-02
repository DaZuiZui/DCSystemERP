package com.gsxy.core.pojo.bo;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@ToString
public class UpdateUserBo implements Serializable {

    private Long id;
    private String username;
    private String password;

}
