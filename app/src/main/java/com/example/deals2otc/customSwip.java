package com.example.deals2otc;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Seedo1 on 6/12/2017.
 */

public class customSwip extends PagerAdapter {
    private int [] imageResources ={R.drawable.diabetic_supplies,R.drawable.weight_loss,R.drawable.banner23,R.drawable.banner_bg,R.drawable.s01,R.drawable.s03};
    private Context ctx;
    private LayoutInflater layoutInflater;

    public customSwip(Context c) {
        ctx=c;
    }

    @Override
    public int getCount() {

        return imageResources.length;
    }



    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater= (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView=layoutInflater.inflate(R.layout.activity_custom_swip,container,false);
        ImageView imageView=(ImageView) itemView.findViewById(R.id.swip_image_view);
        //TextView textView=(TextView) itemView.findViewById(R.id.imageCount);
        imageView.setImageResource(imageResources[position]);
        //textView.setText("Image Counter :"+position);
        container.addView(itemView);
        return itemView;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return  (view==object);
    }
}
