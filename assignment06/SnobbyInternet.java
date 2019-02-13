package exam01;
import java.util.*;
public class SnobbyInternet extends Internet{
	private double threshold;
	public SnobbyInternet(List<Website> Website,double athreshold) {
		super(Website);
		this.threshold = athreshold;
	}
	public void Trim() {
		List<Website> sitesToRemove = new ArrayList<>();

        for (Website website : super.getSites())
        {
            if (website.getPop() < threshold)
            {
                sitesToRemove.add(website);
            }
        }

        for (Website siteToRemove : sitesToRemove)
        {
            super.remSite(siteToRemove);
        }
	}
}
