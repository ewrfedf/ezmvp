package zcp.mvp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import zcp.mvp.App;
import zcp.mvp.R;
import zcp.mvp.controllers.AboutController;

/**
 */
public class AboutFragment extends BaseFragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false);
    }

    AboutController getController() {
        return App.from(getActivity()).getMainController().getAboutController();
    }

}
