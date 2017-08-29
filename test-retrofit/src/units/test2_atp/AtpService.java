package units.test2_atp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AtpService {
  @GET("product/group")
  Call<ProductGroupResults> listProductGroup();
}