package com.example.currrencylistview;

import android.content.Context;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class ListViewAdapterWithViewHolder extends ListViewAdapter<Bean> {

    public ListViewAdapterWithViewHolder(Context context, List<Bean> datas) {
        super(context, datas, R.layout.item_listview);
    }

    @Override
    public void convert(ViewHolder holder, Bean bean) {
        ((TextView)holder.getView(R.id.titleTv)).setText(bean.getTitle());
        ((TextView)holder.getView(R.id.descTv)).setText(bean.getDesc());
        ((TextView)holder.getView(R.id.timeTv)).setText(bean.getTime());
        ((TextView)holder.getView(R.id.phoneTv)).setText(bean.getPhone());
    }
}
