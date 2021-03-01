package com.longcai.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.longcai.service.MemberUserDetailsService;
import com.longcai.util.MD5Util;

/**
 * springsecurity配置类
 * 
 * @author Administrator
 *
 */
@Component
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private MemberUserDetailsService memberUserDetailsService;
	
	/**
	 * 添加授权用户
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//longcai用户全部可以访问
//		auth.inMemoryAuthentication().withUser("longcai").password("123456").authorities("userInsert","/");
//		//wyb用户只能访问insert
//		auth.inMemoryAuthentication().withUser("wyb").password("123456").authorities("userInsert");
		auth.userDetailsService(memberUserDetailsService).passwordEncoder(new PasswordEncoder() {
			
			/**
			 * rawPassword:用户输入密码 encodedPassword：数据库中加密好的密码
			 */
			@Override
			public boolean matches(CharSequence rawPassword, String encodedPassword) {
				String rawPass =  MD5Util.md5password((String)rawPassword);
				boolean result = rawPass.equals(encodedPassword);
				return result;
			}
			
			@Override
			public String encode(CharSequence rawPassword) {
				// TODO Auto-generated method stub
				return null;
			}
			
		});
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//配置httpBasic http协议认证
//		http.authorizeRequests().antMatchers("/**").fullyAuthenticated().and().formLogin();
		http.authorizeRequests().antMatchers("/user/insert").hasAnyAuthority("userInsert").antMatchers("/login").permitAll().
		antMatchers("/").fullyAuthenticated().and().formLogin().loginPage("/login").and().csrf().disable();
		//antMatchers("/user/insert")配置/user/insert请求权限userInsert
	}
	
	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}

}
