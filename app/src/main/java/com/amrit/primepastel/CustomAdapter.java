package com.amrit.primepastel;

/**
 * Created by amrit on 2/3/17.
 */
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class CustomAdapter extends BaseAdapter{
    private final List<Product> products;
    Context context;
    int [] imageId;
    private static LayoutInflater inflater=null;
    public CustomAdapter(Context context, List<Product> product) {
        this.products =product;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return products.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder {
        TextView tv;
        ImageView img;
        TextView desc;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.custom_listitem, null);
        holder.tv=(TextView) rowView.findViewById(R.id.lvtitle);
        holder.img=(ImageView) rowView.findViewById(R.id.lvicon);
        holder.desc=(TextView) rowView.findViewById(R.id.lvdesc);
        holder.tv.setText(products.get(position).getTitle());
        holder.img.setImageResource(products.get(position).getIcon());
        holder.desc.setText(products.get(position).getDesc());

        rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Log.v("context", "You Clicked "+products.get(position).getTitle());
            }
        });
        return rowView;
    }

}