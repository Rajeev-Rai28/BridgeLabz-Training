package com.Collections.MapInterface.DesignaVotingSystem;

public class VotingSystemMain {

    public static void main(String[] args) {

        VotingSystem system = new VotingSystem();

        system.castVote("Alice");
        system.castVote("Bob");
        system.castVote("Alice");
        system.castVote("Carol");
        system.castVote("Bob");
        system.castVote("Alice");

        system.displayRawVotes();
        system.displayVoteOrder();
        system.displaySortedResults();
    }
}