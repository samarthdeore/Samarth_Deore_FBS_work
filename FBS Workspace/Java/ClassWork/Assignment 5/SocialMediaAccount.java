import java.time.LocalDate;

class SocialMediaAccount {
	String userName;
	String email;
	boolean isPublic;
	boolean isVerified;
	String countryOrigin;
	int noOfPosts;
	int noOfLikes;
	int noOfComments;
	LocalDate createDate;
	int noOfImpresion;
	SocialMediaAccount() {
		super();
		this.userName = "not given";
		this.email = "not given";
		this.isPublic = false;
		this.isVerified = false;
		this.countryOrigin = "not given";
		this.noOfPosts = 0;
		this.noOfLikes = 0;
		this.noOfComments = 0;
		this.createDate = LocalDate.now();;
		this.noOfImpresion = 0;
	}
	SocialMediaAccount(String userName, String email, boolean isPublic, boolean isVerified, String countryOrigin,
			int noOfPosts, int noOfLikes, int noOfComments, LocalDate createDate, int noOfImpresion) {
		super();
		this.userName = userName;
		this.email = email;
		this.isPublic = isPublic;
		this.isVerified = isVerified;
		this.countryOrigin = countryOrigin;
		this.noOfPosts = noOfPosts;
		this.noOfLikes = noOfLikes;
		this.noOfComments = noOfComments;
		this.createDate = createDate;
		this.noOfImpresion = noOfImpresion;
	}
	String getUserName() {
		return userName;
	}
	void setUserName(String userName) {
		this.userName = userName;
	}
	String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}
	boolean isPublic() {
		return isPublic;
	}
	void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}
	boolean isVerified() {
		return isVerified;
	}
	void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}
	String getCountryOrigin() {
		return countryOrigin;
	}
	void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}
	int getNoOfPosts() {
		return noOfPosts;
	}
	void setNoOfPosts(int noOfPosts) {
		this.noOfPosts = noOfPosts;
	}
	int getNoOfLikes() {
		return noOfLikes;
	}
	void setNoOfLikes(int noOfLikes) {
		this.noOfLikes = noOfLikes;
	}
	int getNoOfComments() {
		return noOfComments;
	}
	void setNoOfComments(int noOfComments) {
		this.noOfComments = noOfComments;
	}
	LocalDate getCreateDate() {
		return createDate;
	}
	void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	int getNoOfImpresion() {
		return noOfImpresion;
	}
	void setNoOfImpresion(int noOfImpresion) {
		this.noOfImpresion = noOfImpresion;
	}
	
	void display() {
	    System.out.println("\n--- Social Media Account Details ---");
	    System.out.println("Username: " + this.userName);
	    System.out.println("Email: " + this.email);
	    System.out.println("Is Public: " + this.isPublic);
	    System.out.println("Is Verified: " + this.isVerified);
	    System.out.println("Country of Origin: " + this.countryOrigin);
	    System.out.println("Number of Posts: " + this.noOfPosts);
	    System.out.println("Number of Likes: " + this.noOfLikes);
	    System.out.println("Number of Comments: " + this.noOfComments);
	    System.out.println("Account Creation Date: " + this.createDate);
	    System.out.println("Number of Impressions: " + this.noOfImpresion);
	}


}
//class socialmediaaccount ends here

class Instagram extends SocialMediaAccount{
	int noOfFollowers;
	int noOfFollowings;
	int noOfHighlights;
	int noOfPostArchives;
	int noOfStoryArchives;
	int noOfAudioSaved;
	Instagram() {
		super();
		this.noOfFollowers = 0;
		this.noOfFollowings = 0;
		this.noOfHighlights = 0;
		this.noOfPostArchives = 0;
		this.noOfStoryArchives = 0;
		this.noOfAudioSaved = 0;
	}
	Instagram(String userName, String email, boolean isPublic, boolean isVerified, String countryOrigin,
			int noOfPosts, int noOfLikes, int noOfComments, LocalDate createDate, int noOfImpresion,int noOfFollowers, int noOfFollowings, int noOfHighlights, int noOfPostArchives, int noOfStoryArchives,
			int noOfAudioSaved) {
		super(userName,email,isPublic,isVerified,countryOrigin,noOfPosts,noOfLikes,noOfComments,createDate,noOfImpresion);
		this.noOfFollowers = noOfFollowers;
		this.noOfFollowings = noOfFollowings;
		this.noOfHighlights = noOfHighlights;
		this.noOfPostArchives = noOfPostArchives;
		this.noOfStoryArchives = noOfStoryArchives;
		this.noOfAudioSaved = noOfAudioSaved;
	}
	int getNoOfFollowers() {
		return noOfFollowers;
	}
	void setNoOfFollowers(int noOfFollowers) {
		this.noOfFollowers = noOfFollowers;
	}
	int getNoOfFollowings() {
		return noOfFollowings;
	}
	void setNoOfFollowings(int noOfFollowings) {
		this.noOfFollowings = noOfFollowings;
	}
	int getNoOfHighlights() {
		return noOfHighlights;
	}
	void setNoOfHighlights(int noOfHighlights) {
		this.noOfHighlights = noOfHighlights;
	}
	int getNoOfPostArchives() {
		return noOfPostArchives;
	}
	void setNoOfPostArchives(int noOfPostArchives) {
		this.noOfPostArchives = noOfPostArchives;
	}
	int getNoOfStoryArchives() {
		return noOfStoryArchives;
	}
	void setNoOfStoryArchives(int noOfStoryArchives) {
		this.noOfStoryArchives = noOfStoryArchives;
	}
	int getNoOfAudioSaved() {
		return noOfAudioSaved;
	}
	void setNoOfAudioSaved(int noOfAudioSaved) {
		this.noOfAudioSaved = noOfAudioSaved;
	}
	void display() {
	    super.display();  // Display details from SocialMediaAccount
	    System.out.println("\n--- Instagram Specific Details ---");
	    System.out.println("Number of Followers: " + this.noOfFollowers);
	    System.out.println("Number of Followings: " + this.noOfFollowings);
	    System.out.println("Number of Highlights: " + this.noOfHighlights);
	    System.out.println("Number of Post Archives: " + this.noOfPostArchives);
	    System.out.println("Number of Story Archives: " + this.noOfStoryArchives);
	    System.out.println("Number of Audio Saved: " + this.noOfAudioSaved);
	}

}
//class instagram ends here

class LikedIn extends SocialMediaAccount{
	int noOfConnections;
	int noOfProfileViewed;
	int noOfJobsApplied;
	LikedIn() {
		super();
		this.noOfConnections = 0;
		this.noOfProfileViewed = 0;
		this.noOfJobsApplied = 0;
	}
	LikedIn(String userName, String email, boolean isPublic, boolean isVerified, String countryOrigin,
			int noOfPosts, int noOfLikes, int noOfComments, LocalDate createDate, int noOfImpresion,
			int noOfConnections, int noOfProfileViewed, int noOfJobsApplied) {
		super(userName,email,isPublic,isVerified,countryOrigin,noOfPosts,noOfLikes,noOfComments,createDate,noOfImpresion);
		this.noOfConnections = noOfConnections;
		this.noOfProfileViewed = noOfProfileViewed;
		this.noOfJobsApplied = noOfJobsApplied;
	}
	int getNoOfConnections() {
		return noOfConnections;
	}
	void setNoOfConnections(int noOfConnections) {
		this.noOfConnections = noOfConnections;
	}
	int getNoOfProfileViewed() {
		return noOfProfileViewed;
	}
	void setNoOfProfileViewed(int noOfProfileViewed) {
		this.noOfProfileViewed = noOfProfileViewed;
	}
	int getNoOfJobsApplied() {
		return noOfJobsApplied;
	}
	void setNoOfJobsApplied(int noOfJobsApplied) {
		this.noOfJobsApplied = noOfJobsApplied;
	}
	void display() {
	    super.display();  // Display base class (SocialMediaAccount) details
	    System.out.println("\n--- LinkedIn Specific Details ---");
	    System.out.println("Number of Connections: " + this.noOfConnections);
	    System.out.println("Number of Profile Views: " + this.noOfProfileViewed);
	    System.out.println("Number of Jobs Applied: " + this.noOfJobsApplied);
	}
}
//class likedin ends here
class YouTube extends SocialMediaAccount{
	int noOfSubcribers;
	double watchTime;
	boolean isMonetized;
	double estimatedRevenue;
	YouTube() {
		super();
		this.noOfSubcribers = 0;
		this.watchTime = 0;
		this.isMonetized = false;
		this.estimatedRevenue = 0;
	}
	YouTube(String userName, String email, boolean isPublic, boolean isVerified, String countryOrigin,
			int noOfPosts, int noOfLikes, int noOfComments, LocalDate createDate, int noOfImpresion,
			int noOfSubcribers, double watchTime, boolean isMonetized, double estimatedRevenue) {
		super(userName,email,isPublic,isVerified,countryOrigin,noOfPosts,noOfLikes,noOfComments,createDate,noOfImpresion);
		this.noOfSubcribers = noOfSubcribers;
		this.watchTime = watchTime;
		this.isMonetized = isMonetized;
		this.estimatedRevenue = estimatedRevenue;
	}
	int getNoOfSubcribers() {
		return noOfSubcribers;
	}
	void setNoOfSubcribers(int noOfSubcribers) {
		this.noOfSubcribers = noOfSubcribers;
	}
	double getWatchTime() {
		return watchTime;
	}
	void setWatchTime(double watchTime) {
		this.watchTime = watchTime;
	}
	boolean isMonetized() {
		return isMonetized;
	}
	void setMonetized(boolean isMonetized) {
		this.isMonetized = isMonetized;
	}
	double getEstimatedRevenue() {
		return estimatedRevenue;
	}
	void setEstimatedRevenue(double estimatedRevenue) {
		this.estimatedRevenue = estimatedRevenue;
	}
	
}
//class YouTube ends here


class TestSocialMediaAccount {
    public static void main(String[] args) {

        SocialMediaAccount s1 = new SocialMediaAccount();
        SocialMediaAccount s2 = new SocialMediaAccount("john_doe", "john@gmail.com", true, true, "USA", 120, 1500, 300, LocalDate.of(2020, 5, 10), 5000);
        
        s1.display();
        s2.display();

        Instagram i1 = new Instagram();
        Instagram i2 = new Instagram("insta_queen", "queen@insta.com", true, true, "India", 500, 10000, 2500, LocalDate.of(2019, 3, 15), 250000,
                                     20000, 500, 15, 200, 100, 350);
        
        i1.display();
        i2.display();

        LikedIn l1 = new LikedIn();
        LikedIn l2 = new LikedIn("tech_guru", "guru@linkedin.com", true, true, "Canada", 50, 800, 120, LocalDate.of(2018, 8, 25), 15000,
                                 1200, 300, 40);
        
        l1.display();
        l2.display();

        YouTube y1 = new YouTube();
        YouTube y2 = new YouTube("tech_channel", "tech@youtube.com", true, true, "UK", 300, 50000, 7000, LocalDate.of(2017, 11, 20), 1000000,
                                 500000, 10000.5, true, 25000.75);
        
        y1.display();
        y2.display();
    }
}
