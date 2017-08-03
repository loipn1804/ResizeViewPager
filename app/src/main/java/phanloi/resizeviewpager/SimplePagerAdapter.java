package phanloi.resizeviewpager;

import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author loiphan <loipn1804@gmail.com>
 * @version 1.0
 * @since August 03, 2017
 */

public class SimplePagerAdapter extends PagerAdapter {

    private final String TAG = "SimplePagerAdapter";

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.item_adapter, container, false);

        view.setTag(TAG + position);
        container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        if (object instanceof View) {
            container.removeView((View) object);
        }
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }
}
