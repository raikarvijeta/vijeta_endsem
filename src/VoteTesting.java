class VoteTesting {

	Candidate c1,c2;
	CastVote v1;  

	@BeforeEach
	void setUp() throws Exception {
		c1 = new Candidate ("alfran","Mapusa","100",0);
		c2 = new Candidate ("yogeta","Margao","100",0);
		v1 = new CastVote("SELF");
		v1.addVote(new VoteClass(c1));
		v1.addVote(new VoteClass(c2));
		System.out.println(v1.vote_result());

		
	}

	
	@Test
	void test() {
		//fail("Not yet implemented");
	}
	

}
