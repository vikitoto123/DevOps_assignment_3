package com.arcada.devops.viki.app;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    public String[] getFriendList(String FBProfile) {
        if (FBProfile == null || FBProfile.isEmpty()) {
            throw new IllegalArgumentException("Invalid profile link");
        }

        if (FBProfile.equals("valid-profile")) {
            return new String[]{"Niraj", "Fredde", "Dennis"};
        } else {
            return new String[]{};
        }
    }

    @Test
    public void GetFriendList() {
        String profileLink = "valid-profile";
        String[] expectedFriends = {"Niraj", "Fredde", "Dennis"};
        
        assertArrayEquals(expectedFriends, getFriendList(profileLink));
    }
}
