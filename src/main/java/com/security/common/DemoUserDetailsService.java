package com.security.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Created by Teo on 2018/12/19.
 */
public class DemoUserDetailsService implements UserDetailsService {

    private static final Logger logger = LoggerFactory.getLogger(DemoUserDetailsService.class);
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info("用户的用户名:{}", username);
        User user = new User(username, "123456", AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
        return user;
    }
}
