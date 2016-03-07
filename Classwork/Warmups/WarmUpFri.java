import java.util.HashMap;
import java.util.Set;

public class WarmUpFri
{
	public static void main(String[] args)
	{
		HashMap<String, String> teams = new HashMap<>();
		teams.put("Cleveland", "Browns");
		teams.put("Pittsburgh", "Steelers");
		teams.put("Cincinnati", "Bengals");
		teams.put("Minneapolis", "Vikings");
		teams.put("Kansas City", "Chiefs");

		Set<String> keys = teams.keySet();
		for(teams.Entry<String, String> entry: teams.entrySet())
		{
			String key = entry.getKey();
			String value = entry.getValue();
		}
	}
}