package units.test1_git;


import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;


public class to_access_git {

	public static void main(String[] args) throws Exception 
	{
		Retrofit retrofit = new Retrofit.Builder()
			    .baseUrl("https://api.github.com/")
			    .build();

			GitHubService service = retrofit.create(GitHubService.class);
		
			Call<List<Repo>> repos = service.listRepos("octocat");
	}

}
