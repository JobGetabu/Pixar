package com.podgram.pixar.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by password
 * on 2/10/18.
 * Pixar
 */

public class ViewPagerAdapter extends PagerAdapter {
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
