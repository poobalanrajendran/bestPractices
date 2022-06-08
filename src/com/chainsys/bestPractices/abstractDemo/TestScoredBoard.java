package com.chainsys.bestPractices.abstractDemo;

public class TestScoredBoard {

	public static void main (String args[]) {
        ScoreBoard s1 =ScoreBoard.createObject();
        System.out.println(s1.TargetScore);
        s1.TargetScore=190;
        System.out.println(s1.TargetScore);
        
    }

}