package com.josecanqueb.android.criminalintent;

import android.app.Fragment;

/**
 * Created by JoseArmando on 13/04/2018.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected android.support.v4.app.Fragment createFragment() {
        return new CrimeListFragment();
    }
}