/* Program: Milestone 2
 * File: NFLPlayer.java
 * Summary: Create and test a player object
 * Author: Nick Ferriss
 * Date: December 9, 2018
 * I certify this work is my own.
 */
public class NFLPlayer {

	// Common player variables
	private String name = null;
	private double touchdowns = 0;
	private String position = null;

	// Quarterback variables
	private static double passCompleted = 0;
	private static double passAttempts = 0;
	private static double passPercentage = 0.0;
	private double passingYards = 0;
	private double passingYardAvg = 0.0;
	private double interceptions = 0;
	private double sacked = 0;

	// Running Back variables
	private double rushAttempts = 0;
	private double rushPerGame = 0.0;
	private double rushingYards = 0;
	private double rushYardsAvg = 0.0;
	private double rushYardsPerGame = 0.0;
	private double rush20Yds = 0;
	private double rush40Yds = 0;

	// Receiving player variables
	private double recReceptions = 0;
	private double recYards = 0;
	private double recAvgYard = 0.0;
	private double recYardsPerGame = 0.0;
	private double rec20Yds = 0;
	private double rec40Yds = 0;
	private double recFumbles = 0;

	// Defensive player variables
	private double combTackles = 0;
	private double totalTackles = 0;
	private double defAssists = 0;
	private double defSacks = 0.0;
	private double defSafeties = 0;
	private double defInterceptions = 0;
	private double fumbleRecovers = 0;

	// Kickoff Kicker variables
	private double kickoffTotal = 0;
	private double kickoffYards = 0;
	private double kickoffYdsAvg = 0.0;
	private double kickoffTouchbacks = 0;
	private double touchbackPercentage = 0.0;
	private double kickoffReturns = 0;
	private double kickoffReturnAvg = 0.0;

	// Kick Returner variables
	private double kickReturns = 0;
	private double returnYards = 0;
	private double returnYdsAvg = 0.0;
	private double returnFairCatches = 0;
	private double puntReturns = 0;
	private double puntReturnYds = 0;
	private double fumbles = 0;

	// Punter variables
	private double punts = 0;
	private double puntYards = 0;
	private double puntNetYds = 0;
	private double puntYdsAvg = 0.0;
	private double puntsBlocked = 0;
	private double puntsOOB = 0;
	private double puntTouchbacks = 0;
	private double puntsFairCaught = 0;

	// Field Goal Kicker variables
	private static double fieldGoalsMade = 0;
	private static double fieldGoalsAttempted = 0;
	private static double fieldGoalPercentage = 0.0;
	private double fieldGoalsBlocked = 0;
	private double fg40YdsAttempts = 0;
	private double fg40YdsMade = 0;
	private double fg50YdsAttempts = 0;
	private double fg50YdsMade = 0;

	// variables for toString() method
	private String stat3 = null;
	private String value3 = null;
	private String stat4 = null;
	private String value4 = null;
	private String stat5 = null;
	private String value5 = null;
	private String stat6 = null;
	private String value6 = null;
	private String stat7 = null;
	private String value7 = null;
	private String stat8 = null;
	private String value8 = null;
	private String stat9 = null;
	private String value9 = null;
	private String stat10 = null;
	private String value10 = null;

	// main method
	public static void main(String[] args) {

		// testing constructor
		NFLPlayer playerTest = new NFLPlayer();
		System.out.println("Tested no arg constructor, testing constructor with preset arguments:");
		NFLPlayer player2 = new NFLPlayer("Adam Thielen", "Wide Receiver", 103.0, 1236.0, 12.0, 95.1, 9.0, 16.0, 2.0,
				1.0);

		// test toString() method
		player2.toString();

		// test a few setters and getters
		System.out.println("Testing getters and setters:");
		System.out.println("Calling setPassAttempts(10)");
		setPassAttempts(10);
		System.out.println("Calling setPassCompleted(5)");
		setPassCompleted(5);
		System.out.println("Calling getPassPercentage():");
		System.out.println(getPassPercentage() + "%");

		System.out.println("Calling setFieldGoalsAttempted(100)");
		setFieldGoalsAttempted(100);
		System.out.println("Calling setFieldGoalsMade(80);");
		setFieldGoalsMade(80);
		System.out.println("Calling getFieldGoalPercentage():");
		System.out.println(getFieldGoalPercentage() + "%");
	}

	// getters and setters for player objects variables
	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private double getTouchdowns() {
		return touchdowns;
	}

	private void setTouchdowns(double touchdowns) {
		this.touchdowns = touchdowns;
	}

	private String getPosition() {
		return position;
	}

	private void setPosition(String position) {
		this.position = position;
	}

	private double getPassCompleted() {
		return passCompleted;
	}

	private static void setPassCompleted(double tempPassCompleted) {
		passCompleted = tempPassCompleted;
	}

	private double getPassAttempts() {
		return passAttempts;
	}

	private static void setPassAttempts(double tempPassAttempts) {
		passAttempts = tempPassAttempts;
	}

	private static double getPassPercentage() {
		double result = (passCompleted / passAttempts) * 100;
		return result;
	}

	private void setPassPercentage(double passPercentage) {
		passPercentage = (passCompleted / passAttempts) * 100;
	}

	private double getPassingYards() {
		return passingYards;
	}

	private void setPassingYards(double passingYards) {
		this.passingYards = passingYards;
	}

	private double getPassingYardAvg() {
		return passingYardAvg;
	}

	private void setPassingYardAvg(double passingYardAvg) {
		this.passingYardAvg = passingYardAvg;
	}

	private double getInterceptions() {
		return interceptions;
	}

	private void setInterceptions(double interceptions) {
		this.interceptions = interceptions;
	}

	private double getSacked() {
		return sacked;
	}

	private void setSacked(double sacked) {
		this.sacked = sacked;
	}

	private double getRushAttempts() {
		return rushAttempts;
	}

	private void setRushAttempts(double rushAttempts) {
		this.rushAttempts = rushAttempts;
	}

	private double getRushPerGame() {
		return rushPerGame;
	}

	private void setRushPerGame(double rushPerGame) {
		this.rushPerGame = rushPerGame;
	}

	private double getRushingYards() {
		return rushingYards;
	}

	private void setRushingYards(double rushingYards) {
		this.rushingYards = rushingYards;
	}

	private double getRushYardsAvg() {
		return rushYardsAvg;
	}

	private void setRushYardsAvg(double rushYardsAvg) {
		this.rushYardsAvg = rushYardsAvg;
	}

	private double getRushYardsPerGame() {
		return rushYardsPerGame;
	}

	private void setRushYardsPerGame(double rushYardsPerGame) {
		this.rushYardsPerGame = rushYardsPerGame;
	}

	private double getRush20Yds() {
		return rush20Yds;
	}

	private void setRush20Yds(double rush20Yds) {
		this.rush20Yds = rush20Yds;
	}

	private double getRush40Yds() {
		return rush40Yds;
	}

	private void setRush40Yds(double rush40Yds) {
		this.rush40Yds = rush40Yds;
	}

	private double getRecReceptions() {
		return recReceptions;
	}

	private void setRecReceptions(double recReceptions) {
		this.recReceptions = recReceptions;
	}

	private double getRecYards() {
		return recYards;
	}

	private void setRecYards(double recYards) {
		this.recYards = recYards;
	}

	private double getRecAvgYard() {
		return recAvgYard;
	}

	private void setRecAvgYard(double recAvgYard) {
		this.recAvgYard = recAvgYard;
	}

	private double getRecYardsPerGame() {
		return recYardsPerGame;
	}

	private void setRecYardsPerGame(double recYardsPerGame) {
		this.recYardsPerGame = recYardsPerGame;
	}

	private double getRec20Yds() {
		return rec20Yds;
	}

	private void setRec20Yds(double rec20Yds) {
		this.rec20Yds = rec20Yds;
	}

	private double getRec40Yds() {
		return rec40Yds;
	}

	private void setRec40Yds(double rec40Yds) {
		this.rec40Yds = rec40Yds;
	}

	private double getRecFumbles() {
		return recFumbles;
	}

	private void setRecFumbles(double recFumbles) {
		this.recFumbles = recFumbles;
	}

	private double getCombTackles() {
		return combTackles;
	}

	private void setCombTackles(double combTackles) {
		this.combTackles = combTackles;
	}

	private double getTotalTackles() {
		return totalTackles;
	}

	private void setTotalTackles(double totalTackles) {
		this.totalTackles = totalTackles;
	}

	private double getDefAssists() {
		return defAssists;
	}

	private void setDefAssists(double defAssists) {
		this.defAssists = defAssists;
	}

	private double getDefSacks() {
		return defSacks;
	}

	private void setDefSacks(double defSacks) {
		this.defSacks = defSacks;
	}

	private double getDefSafeties() {
		return defSafeties;
	}

	private void setDefSafeties(double defSafeties) {
		this.defSafeties = defSafeties;
	}

	private double getDefInterceptions() {
		return defInterceptions;
	}

	private void setDefInterceptions(double defInterceptions) {
		this.defInterceptions = defInterceptions;
	}

	private double getFumbleRecovers() {
		return fumbleRecovers;
	}

	private void setFumbleRecovers(double fumbleRecovers) {
		this.fumbleRecovers = fumbleRecovers;
	}

	private double getKickoffTotal() {
		return kickoffTotal;
	}

	private void setKickoffTotal(double kickoffTotal) {
		this.kickoffTotal = kickoffTotal;
	}

	private double getKickoffYards() {
		return kickoffYards;
	}

	private void setKickoffYards(double kickoffYards) {
		this.kickoffYards = kickoffYards;
	}

	private double getKickoffYdsAvg() {
		return kickoffYdsAvg;
	}

	private void setKickoffYdsAvg(double kickoffYdsAvg) {
		this.kickoffYdsAvg = kickoffYdsAvg;
	}

	private double getKickoffTouchbacks() {
		return kickoffTouchbacks;
	}

	private void setKickoffTouchbacks(double kickoffTouchbacks) {
		this.kickoffTouchbacks = kickoffTouchbacks;
	}

	private double getTouchbackPercentage() {
		return touchbackPercentage;
	}

	private void setTouchbackPercentage(double touchbackPercentage) {
		this.touchbackPercentage = touchbackPercentage;
	}

	private double getKickoffReturns() {
		return kickoffReturns;
	}

	private void setKickoffReturns(double kickoffReturns) {
		this.kickoffReturns = kickoffReturns;
	}

	private double getKickoffReturnAvg() {
		return kickoffReturnAvg;
	}

	private void setKickoffReturnAvg(double kickoffReturnAvg) {
		this.kickoffReturnAvg = kickoffReturnAvg;
	}

	private double getKickReturns() {
		return kickReturns;
	}

	private void setKickReturns(double kickReturns) {
		this.kickReturns = kickReturns;
	}

	private double getReturnYards() {
		return returnYards;
	}

	private void setReturnYards(double returnYards) {
		this.returnYards = returnYards;
	}

	private double getReturnYdsAvg() {
		return returnYdsAvg;
	}

	private void setReturnYdsAvg(double returnYdsAvg) {
		this.returnYdsAvg = returnYdsAvg;
	}

	private double getReturnFairCatches() {
		return returnFairCatches;
	}

	private void setReturnFairCatches(double returnFairCatches) {
		this.returnFairCatches = returnFairCatches;
	}

	private double getPuntReturns() {
		return puntReturns;
	}

	private void setPuntReturns(double puntReturns) {
		this.puntReturns = puntReturns;
	}

	private double getPuntReturnYds() {
		return puntReturnYds;
	}

	private void setPuntReturnYds(double puntReturnYds) {
		this.puntReturnYds = puntReturnYds;
	}

	private double getPunts() {
		return punts;
	}

	private void setPunts(double punts) {
		this.punts = punts;
	}

	private double getPuntYards() {
		return puntYards;
	}

	private void setPuntYards(double puntYards) {
		this.puntYards = puntYards;
	}

	private double getPuntNetYds() {
		return puntNetYds;
	}

	private void setPuntNetYds(double puntNetYds) {
		this.puntNetYds = puntNetYds;
	}

	private double getPuntYdsAvg() {
		double result = puntYards / punts;
		return result;
	}

	private void setPuntYdsAvg(double puntYdsAvg) {
		this.puntYdsAvg = puntYdsAvg;
	}

	private double getPuntsBlocked() {
		return puntsBlocked;
	}

	private void setPuntsBlocked(double puntsBlocked) {
		this.puntsBlocked = puntsBlocked;
	}

	private double getPuntsOOB() {
		return puntsOOB;
	}

	private void setPuntsOOB(double puntsOOB) {
		this.puntsOOB = puntsOOB;
	}

	private double getPuntTouchbacks() {
		return puntTouchbacks;
	}

	private void setPuntTouchbacks(double puntTouchbacks) {
		this.puntTouchbacks = puntTouchbacks;
	}

	private double getPuntsFairCaught() {
		return puntsFairCaught;
	}

	private void setPuntsFairCaught(double puntsFairCaught) {
		this.puntsFairCaught = puntsFairCaught;
	}

	private double getFieldGoalsMade() {
		return fieldGoalsMade;
	}

	private static void setFieldGoalsMade(double tempFieldGoalsMade) {
		fieldGoalsMade = tempFieldGoalsMade;
	}

	private double getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	}

	private static void setFieldGoalsAttempted(double tempFieldGoalsAttempted) {
		fieldGoalsAttempted = tempFieldGoalsAttempted;
	}

	private static double getFieldGoalPercentage() {
		double result = (fieldGoalsMade / fieldGoalsAttempted) * 100;
		fieldGoalPercentage = result;
		return result;
	}

	private void setFieldGoalPercentage(double fieldGoalPercentage) {
		fieldGoalPercentage = (fieldGoalsMade / fieldGoalsAttempted) * 100;
	}

	private double getFieldGoalsBlocked() {
		return fieldGoalsBlocked;
	}

	private void setFieldGoalsBlocked(double fieldGoalsBlocked) {
		this.fieldGoalsBlocked = fieldGoalsBlocked;
	}

	private double getFg40YdsAttempts() {
		return fg40YdsAttempts;
	}

	private void setFg40YdsAttempts(double fg40YdsAttempts) {
		this.fg40YdsAttempts = fg40YdsAttempts;
	}

	private double getFg40YdsMade() {
		return fg40YdsMade;
	}

	private void setFg40YdsMade(double fg40YdsMade) {
		this.fg40YdsMade = fg40YdsMade;
	}

	private double getFg50YdsAttempts() {
		return fg50YdsAttempts;
	}

	private void setFg50YdsAttempts(double fg50YdsAttempts) {
		this.fg50YdsAttempts = fg50YdsAttempts;
	}

	private double getFg50YdsMade() {
		return fg50YdsMade;
	}

	private void setFg50YdsMade(double fg50YdsMade) {
		this.fg50YdsMade = fg50YdsMade;
	}

	private double getFumbles() {
		return fumbles;
	}

	private void setFumbles(double fumbles) {
		this.fumbles = fumbles;
	}

	// no-arg constructor for player objects
	NFLPlayer() {

	}

	// constructor for player objects
	NFLPlayer(String tempName, String tempPosition, double temp3, double temp4, double temp5, double temp6,
			double temp7, double temp8, double temp9, double temp10) {
		name = tempName;
		position = tempPosition;
		value3 = String.valueOf(temp3);
		value4 = String.valueOf(temp4);
		value5 = String.valueOf(temp5);
		value6 = String.valueOf(temp6);
		value7 = String.valueOf(temp7);
		value8 = String.valueOf(temp8);
		value9 = String.valueOf(temp9);
		value10 = String.valueOf(temp10);

	}

	// toString method to print player name and applicable stats
	@Override
	public String toString() {

		switch (position) {

		case "Quarterback":
			stat3 = "passes completed: ";
			value3 = String.valueOf(passCompleted);
			stat4 = "passes attempted: ";
			value4 = String.valueOf(passAttempts);
			stat5 = "passes percentage: ";
			value5 = String.valueOf(passPercentage);
			stat6 = "passing yards: ";
			value6 = String.valueOf(passingYards);
			stat7 = "passing yards average: ";
			value7 = String.valueOf(passingYardAvg);
			stat8 = "touchdowns: ";
			value8 = String.valueOf(touchdowns);
			stat9 = "interceptions: ";
			value9 = String.valueOf(interceptions);
			stat10 = "sacked: ";
			value10 = String.valueOf(sacked);
			break;

		case "Running Back":
			stat3 = "rush attempts: ";
			stat4 = "rush attempts per game: ";
			stat5 = "rushing yards: ";
			stat6 = "rushing yards average: ";
			stat7 = "rushing yards per game: ";
			stat8 = "touchdowns: ";
			stat9 = "20-39 Yard rushes: ";
			stat10 = "40+ Yard rushes: ";
			break;

		case "Wide Receiver":
			stat3 = "receptions: ";
			stat4 = "receiving yards: ";
			stat5 = "receiving yards average: ";
			stat6 = "receiving yards per game: ";
			stat7 = "touchdowns: ";
			stat8 = "20+ yards received: ";
			stat9 = "40+ yards received: ";
			stat10 = "fumbles: ";
			break;

		case "Tight End":
			stat3 = "receptions: ";
			stat4 = "receiving yards: ";
			stat5 = "receiving yards average: ";
			stat6 = "receiving yards per game: ";
			stat7 = "touchdowns: ";
			stat8 = "20+ yards received: ";
			stat9 = "40+ yards received: ";
			stat10 = "fumbles: ";
			break;

		case "Defensive Lineman":
			stat3 = "combined tackles: ";
			stat4 = "total tackles: ";
			stat5 = "defensive assists: ";
			stat6 = "sacks: ";
			stat7 = "safeties: ";
			stat8 = "interceptions: ";
			stat9 = "fumbles recovered: ";
			stat10 = "touchdowns: ";
			break;

		case "Linebacker":
			stat3 = "combined tackles: ";
			stat4 = "total tackles: ";
			stat5 = "defensive assists: ";
			stat6 = "sacks: ";
			stat7 = "safeties: ";
			stat8 = "interceptions: ";
			stat9 = "fumbles recovered: ";
			stat10 = "touchdowns: ";
			break;

		case "Defensive Back":
			stat3 = "combined tackles: ";
			stat4 = "total tackles: ";
			stat5 = "defensive assists: ";
			stat6 = "sacks: ";
			stat7 = "safeties: ";
			stat8 = "interceptions: ";
			stat9 = "fumbles recovered: ";
			stat10 = "touchdowns: ";
			break;

		case "Kickoff Kicker":
			stat3 = "total kickoffs: ";
			stat4 = "kickoff yards: ";
			stat5 = "kickoff yards average: ";
			stat6 = "touchbacks: ";
			stat7 = "touchback percentage: ";
			stat8 = "kickoff returns: ";
			stat9 = "returns average: ";
			stat10 = "touchdowns: ";
			break;

		case "Kick Returner":
			stat3 = "kick returns: ";
			stat4 = "kick return yards: ";
			stat5 = "kick return yards average: ";
			stat6 = "touchdowns: ";
			stat7 = "fair catches: ";
			stat8 = "fumbles: ";
			stat9 = "punt returns: ";
			stat10 = "punt return yards: ";
			break;

		case "Punter":
			stat3 = "punts: ";
			stat4 = "punting yards: ";
			stat5 = "punting net yards: ";
			stat6 = "punting yards average: ";
			stat7 = "punts blocked: ";
			stat8 = "punts out of bounds: ";
			stat9 = "touchbacks: ";
			stat10 = "fair catches: ";
			break;

		case "Punt Returner":
			stat3 = "kick returns: ";
			stat4 = "kick return yards: ";
			stat5 = "kick return yards average: ";
			stat6 = "touchdowns: ";
			stat7 = "fair catches: ";
			stat8 = "fumbles: ";
			stat9 = "punt returns: ";
			stat10 = "punt return yards: ";
			break;

		case "Field Goal Kicker":
			stat3 = "field goals made: ";
			stat4 = "field goals attempted: ";
			stat5 = "field goal percentage: ";
			stat6 = "field goals blocked: ";
			stat7 = "40-49 yard field goal attempts: ";
			stat8 = "40-49 yard percentage: ";
			stat9 = "50+ yard field goal attempts: ";
			stat10 = "50+ yard percentage: ";
			break;

		default:
			System.out.println("Invalid position for switch statement");

		}

		String output = "Player: " + name + ", position: " + position + ", " + stat3 + value3 + ", " + stat4 + value4
				+ ", " + stat5 + value5 + ", " + stat6 + value6 + ", " + stat7 + value7 + ", " + stat8 + value8 + ", "
				+ stat9 + value9 + ", " + stat10 + value10 + ".";
		System.out.println(output);
		return output;
	}

}
