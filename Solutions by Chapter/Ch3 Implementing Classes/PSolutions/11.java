/* 

11.- Implement a VotingMachine class that can be used for a simple election. Have methods to clear the machine state, to vote for a Democrat, to vote for a Republican, and to get the tallies for both parties.

*/

class VotingMachine  {
	
	private int demVotes;
	private int repVotes;
	
	/**
	 * Constructs voting machine with democrats and republicans votes = 0.
	 */
	VotingMachine() {
		demVotes = 0;
		repVotes = 0;
	}
	
	/**
	 * Adds one vote for democrats.
	 */
	void voteDemocrats() {
		demVotes++;
	}
	
	/**
	 * Adds one vote for republicans.
	 */
	void voteRepublicans() {
		repVotes++;
	}
	
	/**
	 * Resets all votes to zero.
	 */
	void resetVotes() {
		demVotes = 0;
		repVotes = 0;
	}
	
	/**
	 * Gets current number of democrats votes.
	 * @return the votes for democrats
	 */
	int getDemVotes() {
		return demVotes;
	}
	
	/**
	 * Gets current number of republicans votes.
	 * @return the votes for republicans
	 */
	int getRepVotes() {
		return repVotes;
	}
	
}

public class VotingMachineCounter {
	public static void main(String[] args) {
		
		VotingMachine votingMachine = new VotingMachine();
		
		votingMachine.voteDemocrats();
		votingMachine.voteDemocrats();
		
		votingMachine.voteRepublicans();
		votingMachine.voteRepublicans();
		votingMachine.voteRepublicans();
		
		System.out.println("*** Count votes ***");
		
		System.out.println("Democrats: " + votingMachine.getDemVotes());
		System.out.println("Republicans: " + votingMachine.getRepVotes());
		
		votingMachine.resetVotes();
		
		System.out.println("*** Reset votes ***");
		
		System.out.println("Democrats: " + votingMachine.getDemVotes());
		System.out.println("Republicans: " + votingMachine.getRepVotes());
		
		System.exit(0);
		
	}
}

