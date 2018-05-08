//
// TODO
//
//
//package pl.rafalab.configuration;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
//import pl.rafalab.repositories.UserRepository;
//
//@Configuration
//@EnableWebMvcSecurity
//@ComponentScan(value="pl.rafalab.repositories")
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    UserRepository userRepository;
//
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin().and()
//                .httpBasic();
//    }
//
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http
////                .authorizeRequests()
////                .antMatchers("/user/registration").authenticated()
////                .antMatchers(HttpMethod.POST, "/user").authenticated()
////                .anyRequest().permitAll();
////    }
//
//
//
//    @Override protected void configure(AuthenticationManagerBuilder auth)
//            throws Exception {
//        auth.
//                inMemoryAuthentication()
//                .withUser("user").password("password").roles("USER").and()
//                .withUser("admin").password("password").roles("USER", "ADMIN");
//
//    }
//
//
//    @Override protected void configure(AuthenticationManagerBuilder auth)
//            throws Exception {
//        auth
//                .jdbcAuthentication()
//                .dataSource(userRepository);
//    }
//
//
//
//
//
//}
