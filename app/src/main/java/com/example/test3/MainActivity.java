package com.example.test3;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton mLinearFriend ;
    private ImageButton mLinearGroup ;
    private ImageButton a ;
    private ImageButton b ;
    private FriendFragment mFriend;
    private GroupFragment mGroup ;
    private AFragment mA;
    private BFragment mB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        mLinearFriend = (ImageButton) findViewById(R.id.id_Imagebtn_friend);
        mLinearGroup = (ImageButton) findViewById(R.id.id_Imagebtn_group);
        a=(ImageButton)findViewById(R.id.a);
        b=(ImageButton)findViewById(R.id.b);
        mLinearFriend.setOnClickListener(this);
        mLinearGroup.setOnClickListener(this);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        setDefaultFragment();
    }

    private void setDefaultFragment() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        mFriend = new FriendFragment();
        transaction.replace(R.id.id_content,mFriend);
        transaction.commit();
    }

    @Override
    public void onClick(View v) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        switch (v.getId()){
            case R.id.id_Imagebtn_friend:
                if(mFriend==null){
                    mFriend = new FriendFragment();
                }
                transaction.replace(R.id.id_content,mFriend);
                transaction.commit();
                break;
            case R.id.id_Imagebtn_group:
                if (mGroup==null){
                    mGroup = new GroupFragment();
                }
                transaction.replace(R.id.id_content,mGroup);
                transaction.commit();
                break;
            case R.id.a:
                if (mA==null){
                    mA = new AFragment();
                }
                transaction.replace(R.id.id_content,mA);
                transaction.commit();
                break;
            case R.id.b:
                if (mB==null){
                    mB = new BFragment();
                }
                transaction.replace(R.id.id_content,mB);
                transaction.commit();
                break;
        }
    }
}
