package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    // Case 1: These are the same object
    @Test
    public void equals_same_object() {
        assertTrue(team.equals(team));
    }

    // Case 2: The other object isn't even an instance of this class
    @Test
    public void equals_different_class() {
        Object other = new Object();
        assertFalse(team.equals(other));
    }

    // Case 3: Comparing all fields (True/True)
    @Test
    public void equals_same_name_and_members() {
        Team otherTeam = new Team("test-team");
        assertTrue(team.equals(otherTeam)); 
    }

    // Case 3: Comparing all fields (True/False)
    @Test
    public void equals_different_members() {
        Team otherTeam = new Team("test-team");
        otherTeam.addMember("foo");
        assertFalse(team.equals(otherTeam)); 
    }

    // Case 3: Comparing all fields (False/True or False/False)
    @Test
    public void equals_different_name() {
        Team otherTeam = new Team("different-team");
        assertFalse(team.equals(otherTeam)); 
    }

    @Test
    public void hashCode_returns_specific_value() {
        Team t = new Team("test-team");
        
        // Temporarily set to 0 to force a failure and find the real hash code
        int expectedResult = -1226298695; 
        assertEquals(expectedResult, t.hashCode());
    }
    
}
