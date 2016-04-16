package Fragments;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.text.SimpleDateFormat;
import java.util.Date;

import application.first.ant.antdeveloperapplication.R;

import weeklyfragments.Day1Fragment;
import weeklyfragments.Day2Fragment;
import weeklyfragments.Day3Fragment;
import weeklyfragments.Day4Fragment;
import weeklyfragments.Day5Fragment;
import weeklyfragments.Day6Fragment;
import weeklyfragments.Day7Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThisWeekFragment extends Fragment {

    public static TabLayout tabLayout;
    public static ViewPager viewPager;
    public static int int_items = 7 ;


    public ThisWeekFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View x =  inflater.inflate(R.layout.tab_layout,null);
        tabLayout = (TabLayout) x.findViewById(R.id.tabs);
        viewPager = (ViewPager) x.findViewById(R.id.viewpager);

        viewPager.setAdapter(new MyAdapter(getChildFragmentManager()));

        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });

        return x;
    }

    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        /**
         * Return fragment with respect to Position .
         */

        @Override
        public Fragment getItem(int position)
        {
            switch (position){
                case 0 : return new Day1Fragment();
                case 1 : return new Day2Fragment();
                case 2 : return new Day3Fragment();
                case 3 : return new Day4Fragment();
                case 4 : return new Day5Fragment();
                case 5 : return new Day6Fragment();
                case 6 : return new Day7Fragment();
            }
            return null;
        }

        @Override
        public int getCount() {

            return int_items;

        }

        /**
         * This method returns the title of the tab according to the position.
         */

        @Override
        public CharSequence getPageTitle(int position) {

            SimpleDateFormat sdf = new SimpleDateFormat("EEE");
            Date d = new Date();
            String dayOfTheWeek = sdf.format(d);
            int date = d.getDate();


            switch (position){
                case 0 :
                    return sdf.format(d) + date;
                case 1 :
                    return sdf.format(d.getTime()+ 1 * 24 * 60 * 60 * 1000) + (date + 1);
                case 2 :
                    return sdf.format(d.getTime()+ 2 * 24 * 60 * 60 * 1000) + (date + 2);
                case 3 :
                    return sdf.format(d.getTime()+ 3 * 24 * 60 * 60 * 1000) + (date + 3);
                case 4 :
                    return sdf.format(d.getTime()+ 4 * 24 * 60 * 60 * 1000) + (date + 4);
                case 5 :
                    return sdf.format(d.getTime()+ 5 * 24 * 60 * 60 * 1000) + (date + 5);
                case 6 :
                    return sdf.format(d.getTime()+ 6 * 24 * 60 * 60 * 1000) +" " + (date + 6);
            }
            return null;
        }
    }

}
