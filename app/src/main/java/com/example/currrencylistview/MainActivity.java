package com.example.currrencylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<Bean> mDatas;
    private ListViewAdapterWithViewHolder listViewAdapterWithViewHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }

    private void initView() {
        listView = (ListView) findViewById(R.id.listView);
    }

    private void initData() {
        mDatas = new ArrayList<Bean>();

        Bean bean = new Bean("Android新技能1", "Android为ListView和GridView打造万能适配器", "2015-05-04", "10086");
        mDatas.add(bean);

        bean = new Bean("Android新技能2", "Android为ListView和GridView打造万能适配器", "2015-05-04", "10086");
        mDatas.add(bean);

        bean = new Bean("Android新技能3", "Android为ListView和GridView打造万能适配器", "2015-05-04", "10086");
        mDatas.add(bean);

        bean = new Bean("Android新技能4", "Android为ListView和GridView打造万能适配器", "2015-05-04", "10086");
        mDatas.add(bean);

        listViewAdapterWithViewHolder = new ListViewAdapterWithViewHolder(this, mDatas);
        listView.setAdapter(listViewAdapterWithViewHolder);
    }
}
