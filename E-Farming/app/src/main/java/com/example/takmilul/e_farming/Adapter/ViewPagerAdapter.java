package com.example.takmilul.e_farming.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
   private List<Fragment> fragmentList = new ArrayList<>();
   private List<String> fragmentTitleList = new ArrayList<>();

   public ViewPagerAdapter(FragmentManager fm) {
      super(fm);
   }

   @Override
   public Fragment getItem(int position) {
      return fragmentList.get(position);
   }

   @Override
   public int getItemPosition(Object object) {
      return super.getItemPosition(object);
   }

   @Override
   public int getCount() {
      return fragmentList.size();
   }

   @Override
   public CharSequence getPageTitle(int position) {
      return fragmentTitleList.get(position);
   }

   public void addFragment(Fragment fragment, String title){
      fragmentList.add(fragment);
      fragmentTitleList.add(title);
   }
}
