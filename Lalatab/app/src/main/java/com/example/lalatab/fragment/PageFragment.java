package com.example.lalatab.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lalatab.R;

public class PageFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;

    public static PageFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment pageFragment = new PageFragment();
        pageFragment.setArguments(args);
        return pageFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(mPage == 1){
            View view = inflater.inflate(R.layout.testfragment, container, false);
            /*TextView textView = (TextView) view;
            textView.setText("Fragment #" + mPage);*/
            return view;
        }
        else {
            View view = inflater.inflate(R.layout.testfragram, container, false);
            TextView textView = (TextView) view;
            textView.setText("Success #" + mPage);
            return view;
        }
    }
}
