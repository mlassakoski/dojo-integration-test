package com.mlassakoski.dojointegrationtest;

import com.mlassakoski.dojointegrationtest.entity.model.User;
import com.mlassakoski.dojointegrationtest.entity.repository.UserRepository;
import com.mlassakoski.dojointegrationtest.fixture.UserFixture;
import com.mlassakoski.dojointegrationtest.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@IntegrationTestInterface()
@RunWith(SpringRunner.class)
public class UserServiceIT {

    @Autowired
    private UserService service;

    @Autowired
    private UserRepository repository;

    @Before
    public void build(){
        final User user = UserFixture.build();

        repository.save(user);
    }

    @Test
    public void shouldReturnAllUsersFromDbTest() {

        final List<User> users = service.getUsers();

        assertNotNull(users);
        assertTrue(users.size() > 0);
    }
}
