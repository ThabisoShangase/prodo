package za.co.thecompany.config.user;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.co.thecompany.dao.CommonDao;
import za.co.thecompany.mapping.UserInfo;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    CommonDao commonDao;

    public UserDetailsServiceImpl(CommonDao commonDao) {
        this.commonDao = commonDao;
    }

    @Transactional
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo user = commonDao.findUserByUsername(username);
        UserDetails userDetails = null;
        if(user != null) {
            userDetails = buildSpringUser(user);
        }
        return userDetails;
    }

    public UserDetails buildSpringUser(UserInfo userInfo) {
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        String username = userInfo.getUsername();
        String password = userInfo.getUserPassword();

        authorities.add(new SimpleGrantedAuthority(userInfo.getUserRole()));

        UserDetails currentUser = new User(username, password, authorities);
        return currentUser;
    }

}
