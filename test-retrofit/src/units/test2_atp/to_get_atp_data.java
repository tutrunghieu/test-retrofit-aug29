package units.test2_atp;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class to_get_atp_data {

	public static void main(String[] args) throws Exception 
	{
		Retrofit retrofit = new Retrofit.Builder()
			    .baseUrl("http://103.200.20.217:8080/atp/api/")
			    .addConverterFactory(GsonConverterFactory.create())
			    .build();

		AtpService service = retrofit.create(AtpService.class);
		Call<ProductGroupResults> call = service.listProductGroup();
		
		call.enqueue(new Callback<ProductGroupResults>() {

			@Override
			public void onResponse(Call<ProductGroupResults> call, Response<ProductGroupResults> response) {
				ProductGroupResults items = response.body();
				for(ProductGroup ik: items.data) System.out.println(ik.autoId);
				
				System.out.println("--- called back");
				System.exit(0);
			}

			@Override
			public void onFailure(Call<ProductGroupResults> call, Throwable t) {
				System.out.println("--- called back failure");
				t.printStackTrace();
				System.exit(0);
				// TODO Auto-generated method stub
				
			}

	    });

		System.out.println("---- the end");
		return;
	}

}
