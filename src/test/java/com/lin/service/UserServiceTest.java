package com.lin.service;

import org.apache.log4j.Logger;  
import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;  
  
import com.lin.baseTest.SpringTestCase;  
import com.lin.domain.User;  
  
/** 
 * ���ܸ�Ҫ��UserService��Ԫ���� 
 *  
 * @author linbingwen 
 * @since  2015��9��28��  
 */  
public class UserServiceTest extends SpringTestCase {  
    @Autowired  
    private UserService userService;  
    Logger logger = Logger.getLogger(UserServiceTest.class);  
      
    @Test  
    public void selectUserByIdTest(){  
        User user = userService.getUserById(1);
        logger.debug("���ҽ��" + user);  
    }  
      
  
} 
