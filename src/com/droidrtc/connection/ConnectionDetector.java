package com.droidrtc.connection;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.droidrtc.util.RtcLogs;

public class ConnectionDetector {
	private final String TAG = "ConnectionDetector";
	private Context context;
    
    public ConnectionDetector(Context context){
        this.context = context;
    }
	public boolean isConnectedToInternet(){
        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
          if (connectivity != null) 
          {
              NetworkInfo[] info = connectivity.getAllNetworkInfo();
              if (info != null) 
                  for (int i = 0; i < info.length; i++) 
                      if (info[i].getState() == NetworkInfo.State.CONNECTED)
                      {
                    	  RtcLogs.e(TAG, "Connected");
                          return true;
                      }
 
          }
          return false;
    }
}
