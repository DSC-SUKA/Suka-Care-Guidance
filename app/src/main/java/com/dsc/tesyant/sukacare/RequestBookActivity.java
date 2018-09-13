package com.dsc.tesyant.sukacare;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.Objects;

import com.dsc.tesyant.sukacare.fragment.TabAllBook;
import com.dsc.tesyant.sukacare.fragment.tabMyBook;
import com.dsc.tesyant.sukacare.fragment.tabRequest;


public class RequestBookActivity extends AppCompatActivity {

    Toolbar toolbar;
    ViewPager pager;
    TabLayout tabs;

    private String[] tabTitle = {
            "Records", "My BookModel", "All BookModel"
    };

    private int[] icons = {
            R.drawable.ic_keyboard_voice_black_24dp,
            R.drawable.ic_collections_bookmark_black_24dp,
            R.drawable.ic_library_books_black_24dp
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_book);

        toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
//        setupToolbarTitle();
//        Objects.requireNonNull(getSupportActionBar()).setTitle(setupToolbarTitle());

        pager = (ViewPager)findViewById(R.id.pager);
        pager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));

        tabs = (TabLayout)findViewById(R.id.tabs);
        tabs.setupWithViewPager(pager);
        setupTabIcons();

        tabs.setTabGravity(TabLayout.GRAVITY_FILL);

    }

    private void setupTabIcons() {
        Objects.requireNonNull(tabs.getTabAt(0)).setIcon(icons[0]);
        Objects.requireNonNull(tabs.getTabAt(1)).setIcon(icons[1]);
        Objects.requireNonNull(tabs.getTabAt(2)).setIcon(icons[2]);
    }

//    private void setupToolbarTitle() {
//        toolbar.setTitle(tabTitle[0]);
//        toolbar.setTitle(tabTitle[1]);
//        toolbar.setTitle(tabTitle[2]);
//    }


    class ViewPagerAdapter extends FragmentPagerAdapter {

        private String[] title = {
                "Records", "My BookModel", "All BookModel"
        };

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position) {
                case 0 :
                    fragment = new tabRequest();
                    break;
                case 1 :
                    fragment = new tabMyBook();
                    break;
                case 2 :
                    fragment = new TabAllBook();
                    break;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return title.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return null;
        }
    }
}
