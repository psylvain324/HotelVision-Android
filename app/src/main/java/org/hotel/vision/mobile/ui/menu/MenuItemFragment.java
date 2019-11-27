package org.hotel.vision.mobile.ui.menu;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import org.hotel.vision.mobile.R;

public class MenuItemFragment extends Fragment {
    MenuItemViewModel menuItemViewModel;
    private static final String argMenuItemCategory = "Entree";
    private static final String argMenuItemPrice = "$19.99";

    private String menuItemCategory;
    private String menuItemPrice;

    private OnFragmentInteractionListener mListener;

    public MenuItemFragment() {

    }

    public static MenuItemFragment newInstance(String param1, String param2) {
        MenuItemFragment fragment = new MenuItemFragment();
        Bundle args = new Bundle();
        args.putString(argMenuItemCategory, param1);
        args.putString(argMenuItemPrice, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            menuItemCategory = getArguments().getString(argMenuItemCategory);
            menuItemPrice = getArguments().getString(argMenuItemPrice);
        }
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        menuItemViewModel =
                ViewModelProviders.of(this).get(MenuItemViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        menuItemViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
