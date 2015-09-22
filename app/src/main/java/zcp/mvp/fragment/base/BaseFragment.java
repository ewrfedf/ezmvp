/*
 * Copyright 2014 Chris Banes
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package zcp.mvp.fragment.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.View;

import zcp.mvp.Display;

import zcp.mvp.R;
import zcp.mvp.activity.base.BaseActivity;


public abstract class BaseFragment extends Fragment {

    private Toolbar mToolbar;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mToolbar = (Toolbar) view.findViewById(R.id.toolbar);

        if (mToolbar != null) {
            setSupportActionBar(mToolbar);
        }
    }

    protected void setSupportActionBar(Toolbar toolbar) {
        setSupportActionBar(toolbar, true);
    }

    protected final void setSupportActionBar(Toolbar toolbar, boolean handleBackground) {
        ((BaseActivity)getActivity()).setSupportActionBar(toolbar, handleBackground);
    }

    protected Toolbar getToolbar() {
        return mToolbar;
    }

    protected Display getDisplay() {
        return ((BaseActivity) getActivity()).getDisplay();
    }

}
