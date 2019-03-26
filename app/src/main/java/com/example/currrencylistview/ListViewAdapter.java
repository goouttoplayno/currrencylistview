package com.example.currrencylistview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
//可以复用
import java.util.List;

public abstract class ListViewAdapter<T> extends BaseAdapter {
    protected Context mContext;
    protected List<T> mDatas;
    protected LayoutInflater mInflater;
    private int layoutId;

    public ListViewAdapter(Context context, List<T> datas, int layoutId){
        this.mContext = context;
        this.mDatas = datas;
        this.layoutId = layoutId;
        mInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public T getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = ViewHolder.get(mContext, convertView, parent, layoutId, position);
        convert(holder, getItem(position));
        return holder.getConvertView();
    }
    public abstract void convert(ViewHolder holder, T t);
}
