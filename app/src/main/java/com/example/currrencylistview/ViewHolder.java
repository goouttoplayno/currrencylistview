package com.example.currrencylistview;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
//可以复用
public class ViewHolder {
    private SparseArray<View> mViews;
    private int mPosition;
    private View mConvertView;

    public ViewHolder(Context context, ViewGroup parent, int layoutId, int position){
        this.mPosition = position;
        this.mViews = new SparseArray<>();
        mConvertView = LayoutInflater.from(context).inflate(layoutId, parent, false);//已经绑定好了
        mConvertView.setTag(this);
    }

    public static ViewHolder get(Context context, View convertView, ViewGroup parent, int layoutId, int position){
        if (convertView == null){
            return new ViewHolder(context, parent, layoutId, position);
        }else {
            ViewHolder holder = (ViewHolder)convertView.getTag();
            holder.mPosition = position;
            return holder;
        }
    }
    //通过viewId获取控件
    //使用泛型T，返回View的子类
    public <T extends View> T getView(int viewId){//这里get是为了对子view操作，不是再次绑定
        View view = mViews.get(viewId);
        if (view == null){
            view = mConvertView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return (T)view;
    }
    public View getConvertView(){
        return mConvertView;
    }
}
