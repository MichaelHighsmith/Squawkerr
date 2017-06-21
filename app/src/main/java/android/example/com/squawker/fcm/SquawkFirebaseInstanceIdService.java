package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by mhigh on 6/21/2017.
 */

public class SquawkFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static String LOG_TAG = SquawkFirebaseInstanceIdService.class.getSimpleName();

    @Override
    public void onTokenRefresh(){
        //Get updated InstanceID token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(LOG_TAG, "Refreshed token: " + refreshedToken);

        //If we wanted to send messages to this application instance or manage app subscriptions on the server side, we would send the Instance ID token to the app server.  For now this is useless though
        sendRegistrationToServer(refreshedToken);
    }

    private void sendRegistrationToServer(String token){
        //This would be used if we built a server that stores user token info.  This is where we would send the token to the server
    }
}
