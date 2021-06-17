//package com.pay.incomingcall;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.app.ProgressDialog;
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.os.AsyncTask;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.ImageView;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//public class MainActivity2 extends AppCompatActivity {
//
//    URL ImageUrl = null;
//    InputStream is = null;
//    Bitmap bmImg = null;
//    ImageView imageView= null;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AsyncTaskExample asyncTask=new AsyncTaskExample();
//                asyncTask.execute("https://www.tutorialspoint.com/images/tp-logo-diamond.png");
//            }
//        });is
//    }
//    private class AsyncTaskExample extends AsyncTask<String, String, Bitmap> {
//        @Override
//        protected void onPreExecute() {
//            super.onPreExecute();
//            p = new ProgressDialog(MainActivity.this);
//            p.setMessage("Please wait...It is downloading");
//            p.setIndeterminate(false);
//            p.setCancelable(false);
//            p.show();
//        }
//        @Override
//        protected Bitmap doInBackground(String... strings) {
//            try {
//                ImageUrl = new URL(strings[0]);
//                HttpURLConnection conn = (HttpURLConnection) ImageUrl.openConnection();
//                conn.setDoInput(true);
//                conn.connect();
//                 = conn.getInputStream();
//                BitmapFactory.Options options = new BitmapFactory.Options();
//                options.inPreferredConfig = Bitmap.Config.RGB_565;
//                bmImg = BitmapFactory.decodeStream(is, null, options);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            return bmImg;
//        }
//        @Override
//        protected void onPostExecute(Bitmap bitmap) {
//            super.onPostExecute(bitmap);
//            if(imageView!=null) {
//                p.hide();
//                imageView.setImageBitmap(bitmap);
//            }else {
//                p.show();
//            }
//        }
//    }