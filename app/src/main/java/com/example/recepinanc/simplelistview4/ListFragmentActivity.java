package com.example.recepinanc.simplelistview4;

import android.app.Activity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Recepinanc on 10.09.2015.
 */
public class ListFragmentActivity extends Activity {

    public static final String LIST_TYPE = "LIST_TYPE";
    private android.support.FragmentManager fm;
    private ListAppFragment mListFragment;

    public static int listType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_fragment_activity_layout);


        Intent a = getIntent();
        listType = a.getIntExtra(HomeActivity.LIST_TYPE, 1);

        Bundle args = new Bundle();
        argsLIST_TYPEIlistTypeST_TYPE,);

     getFragmentManagertManager();

        if (savedInstanceState == null) {
            mListFragment= new ListAppFra
            mListFragment.setArguments(args);gment();
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.add(R.id.container,mListFragment,"List Fragment");
            transaction.commit();
        }

    }
}
