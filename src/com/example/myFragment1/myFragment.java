package com.example.myFragment1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by William on 2015/10/23.
 */
public class myFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //layout�����ļ�ת����view����
        /*
        resource:fragment���صĲ����ļ�
        root:����layout�ĸ�viewgroup
        attachtoroot:false������
         */

        View inflate = inflater.inflate(R.layout.fragment2,container, false);
        TextView textView = (TextView) inflate.findViewById(R.id.text);



        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
