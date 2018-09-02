//package maidul.care.com.myapplication.utility;
//
///**
// * Created by maidulislam on 25/01/2017.
// */
//
//
//import okhttp3.RequestBody;
//import retrofit2.Call;
//import retrofit2.http.Body;
//import retrofit2.http.Field;
//import retrofit2.http.FormUrlEncoded;
//import retrofit2.http.GET;
//import retrofit2.http.Header;
//import retrofit2.http.POST;
//import retrofit2.http.Query;
//import sample.naif.com.nauss2.DetailsPage.BeanComplainDetails;
//import sample.naif.com.nauss2.InputLayoutLogIn.BeanLogIn;
//import sample.naif.com.nauss2.InputLayoutLogIn.BeanLogInProfileImage;
//import sample.naif.com.nauss2.changePassword.BeanChanePassword;
//import sample.naif.com.nauss2.feedback.BeanFeedBack;
//import sample.naif.com.nauss2.feedback.BeanFeedbackSubmit;
//import sample.naif.com.nauss2.forgot.BeanForgotPassword;
//import sample.naif.com.nauss2.makeComplains.BeanBlockCode;
//import sample.naif.com.nauss2.makeComplains.BeanBlocksID;
//import sample.naif.com.nauss2.makeComplains.BeanCategory;
//import sample.naif.com.nauss2.makeComplains.BeanSaveData;
//import sample.naif.com.nauss2.notification.BeanNoficationList;
//import sample.naif.com.nauss2.oldComplainsList.BeanComplainsData;
//import sample.naif.com.nauss2.oldComplainsList.BeanComplainsPendingData;
//import sample.naif.com.nauss2.userProfile.BeanUserProfile;
//
//public interface NaifApiLink {
//    //http://10.0.0.76:8002/api/abilitytest/Login?username=user1&password=user1
////    10.0.0.76:8002/api/AbilityTest/getallcountries
////    @GET("timingsByCity?city=Riyadh&country=SA&method=2")
////    public Call<MPrayerTimeBean> getPrayerTime();
//
//    //    @GET("Login?username=user1&password=user1")
//    @GET("api/lookups/GetBlocks?Id=")
//    public Call<BeanBlocksID> getBlocksID(@Header("Authorization") String token);
//
//    @GET("api/lookups/GetBuildings?")
//    Call<BeanBlockCode> getBlockCode(@Header("Authorization") String token, @Query("BlockId") String username);
//
//    //    http://appdev1:6003/api/lookups/GetCategories?Id=
//    @GET("api/lookups/GetCategories?Id=")
//    Call<BeanCategory> getCategory(@Header("Authorization") String token);
//
//
//    //    Call<ResponseBody> getSubmitComplain(@Field("blockCode") String strBuildingBlocks, @Field("buildingCode") String strBuildingBlockCode, @Field("complainDescription") String strDescription,  @Field("categoryCode") int iCategoryCode,  @Field("employeeNo") int employeeCode);
//    //    http://appdev1:6003/api/Complain/GetMyComplains?EmpNo=445
//    @GET("api/Complain/GetMyComplains?")
//    Call<BeanComplainsData> getComplainList(@Header("Authorization") String token, @Query("EmpNo") int EmpNo);
//
//    //http://maintenancemobiletest.nauss.edu.sa/api/Complain/GetMyComplainsPending?EmpNo=445&Offset=0&RowsCount=5
//    @GET("api/Complain/GetMyComplainsPending?")
//    Call<BeanComplainsPendingData> getMyComplainsPending(@Header("Authorization") String token, @Query("EmpNo") int EmpNo, @Query("Offset") int offset, @Query("RowsCount") int rowCount);
//
//    //    GetMyComplainsInprogress
//    @GET("api/Complain/GetMyComplainsInprogress?")
//    Call<BeanComplainsPendingData> getMyComplainsInprogress(@Header("Authorization") String token, @Query("EmpNo") int EmpNo, @Query("Offset") int offset, @Query("RowsCount") int rowCount);
//
//    //    GetMyComplainsCompleted
//    @GET("api/Complain/GetMyComplainsCompleted?")
//    Call<BeanComplainsPendingData> getMyComplainsCompleted(@Header("Authorization") String token, @Query("EmpNo") int EmpNo, @Query("Offset") int offset, @Query("RowsCount") int rowCount);
//
//
//    //    http://appdev1:6003/api/Complain/GetById?ComplainNo=26865
//    @GET("api/Complain/GetById?")
//    Call<BeanComplainDetails> getComplainDetails(@Header("Authorization") String token, @Query("ComplainNo") int strComplainNo);
//
//    @FormUrlEncoded
//    @POST("api/Complain/Save")
//    Call<BeanSaveData> getSubmitComplain(@Header("Authorization") String token, @Field("blockCode") String blockCode, @Field("buildingCode") String buildingCode, @Field("categoryCode") String categoryCode, @Field("complainDescription") String complainDescription, @Field("employeeNo") String employeeNo, @Field("Image") String encoded);
//
//
////    @GET("token")
////    Call<RequestBody> getLogInData(@Query("username") String username, @Query("password") String password);
//
//    @POST("token")
//    Call<BeanLogIn> getLogData(@Body RequestBody body);
//
//    //    http://10.0.0.91:6003/api/Employee/GetProfile?EmpNo=146
//    @GET("api//Employee/GetProfile?")
//    Call<BeanUserProfile> getUserProfile(@Header("Authorization") String token, @Query("EmpNo") String EmpNo);
//
//    //http://appdev1:6003/api/Complain/GetMyComplainsTofeedback?EmpNo=445
//    @GET("api/Complain/GetMyComplainsTofeedback?")
//    Call<BeanFeedBack> getMyComplainsTofeedback(@Header("Authorization") String token, @Query("EmpNo") int EmpNo, @Query("Offset") int offset, @Query("RowsCount") int rowCount);
//
//    //http://appdev1:6003/api/Complain/SetComplainFeedback
////    Call<BeanFeedBack> setComplainFeedback(String token, int complainNo, int isHappy);
//    @FormUrlEncoded
//    @POST("api/Complain/SetComplainFeedback?")
//    Call<BeanFeedbackSubmit> setComplainFeedback(@Header("Authorization") String token, @Field("ComplainNo") int complainNo, @Field("IsHappy") int isHappy);
//
////    httpPost
////    http://localhost:40198/api/Complain/SetComplainNotification
////    data
////    {ComplainNo:'4424',
////            EmployeeNo:445,
////            Notes:'just try....'}
//
//
////    httpGet
////    http://appdev1:6003/api/Complain/GetNotificationByEmpNo?EmpNo=445
//
////    http://maintenancemobiletest.nauss.edu.sa/api/Complain/GetNotificationByEmpNo?EmpNo=1356&Offset=0&RowsCount=5
//
//    @GET("api/Complain/GetNotificationByEmpNo?")
//    Call<BeanNoficationList> getNotificationByEmpNo(@Header("Authorization") String token, @Query("EmpNo") int EmpNo, @Query("Offset") int offset, @Query("RowsCount") int rowCount);
//
//
//    /*
//        http://appdev1:6003/api/Account/ChangePassword
//        Content-Type: application/json
//        Authorization: bearer XXXX
//        body:
//        {
//        "OldPassword": xxx,
//        "NewPassword":xxx,
//        "ConfirmPassword":xxx,
//        "EmpNum":xxx
//
//        }
//        */
//
//    @FormUrlEncoded
//    @POST("api/Account/ChangePassword")
//    Call<BeanChanePassword> getUserChangePassword(@Header("Authorization") String token, @Field("EmpNum") String empNo, @Field("OldPassword") String oldPassword, @Field("NewPassword") String newPassword, @Field("ConfirmPassword") String confirmPassword);
//
//    @FormUrlEncoded
//    @POST("api/Account/ForgetPassword")
//    Call<BeanForgotPassword> getUseForgotPassword(@Field("EmpNum") String empNum, @Field("IquamaNum") String iquamaNum, @Field("MobileNum") String mobileNum);
//
//    @GET("api/Employee/GetImageAndJobTitle?")
//    Call<BeanLogInProfileImage> getImageAndJobTitle(@Header("Authorization") String token, @Query("EmpNo") String empNo);
//
//
////    http://appdev1:6003/api/Employee/GetImageAndJobTitle?EmpNo=X
//
//}
