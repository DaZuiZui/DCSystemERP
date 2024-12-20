package com.gsxy.core.util;


import com.gsxy.core.pojo.Users;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Jwt工具类主要功能有生成密钥和解析密钥
 */
public class JwtUtil {

    /**
     * @author Bryan yang 2023-10-10
     *      生成密钥
     * @param user User.class
     * @return String.class
     */
    public static String createJWT(Users user){
        //构建jwt令牌
        JwtBuilder builder = Jwts.builder();
        builder.setIssuer("qdsqdq"); //颁发者
        builder.setIssuedAt(new Date()); //颁发时间
        builder.setSubject("asdqwsdqs");   //主题
        builder.setExpiration(new Date(System.currentTimeMillis()+3600000*24*7));  //过期时间 设置3600秒

        //自定义信息 自定义载荷
        Map<String,Object> map = new HashMap<>();
        //防止不能存储Long
        String idString = String.valueOf(user.getId());
        map.put("id",idString);
        builder.addClaims(map); //添加载荷

        //1.算法 2.密钥
        builder.signWith(SignatureAlgorithm.HS256, "ASDInqidbuiaB12312");

        //生成密文
        String jstString = builder.compact();


        return jstString;
    }

    /**
     * @author Bryan yang 2023-10-10
     * 解析密钥
     * @param token
     * @return
     */
    public static Map<String,Object> analysis(String token){
        Claims body = Jwts.parser()
                //密钥
                .setSigningKey("ASDInqidbuiaB12312")
                //要解析的令牌
                .parseClaimsJws(token)
                //获取解析后的数据
                .getBody();
        return body;
    }
}
