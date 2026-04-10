package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("s26-12", t.getName());
    }

     @Test
    public void getTeam_returns_team_with_correct_members() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Lorenzo"),"Team should contain Lorenzo");
        assertTrue(t.getMembers().contains("Arjun S"),"Team should contain Arjun S");
        assertTrue(t.getMembers().contains("Jay"),"Team should contain Jay");
        assertTrue(t.getMembers().contains("Pengyu"),"Team should contain Pengyu");
        assertTrue(t.getMembers().contains("Arjun M"),"Team should contain Arjun M");
        assertTrue(t.getMembers().contains("Pau"),"Team should contain Pau");

    }

}
