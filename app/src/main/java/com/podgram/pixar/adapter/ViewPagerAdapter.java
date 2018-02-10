package com.podgram.pixar.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.podgram.pixar.R;

import java.util.ArrayList;

/**
 * Created by password
 * on 2/10/18.
 * Pixar
 */

public class ViewPagerAdapter extends PagerAdapter {

    ArrayList<GameData> gameData;
    LayoutInflater inflater;
    Context context;

    public ViewPagerAdapter(ArrayList<GameData> gameData, Context context) {
        this.gameData = gameData;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View layout = inflater.inflate(R.layout.stuff, container, false);
        ImageView imageView = layout.findViewById(R.id.image);
        imageView.setImageResource(gameData.get(position));
        container.addView(imageView, 0);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return gameData.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }
}
