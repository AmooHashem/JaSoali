package mobile.sharif.hw2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ModalFragment extends Fragment {

    private static final String ARG_PARAM1 = "location-string";

    private String location_string;

    public ModalFragment() {
        // Required empty public constructor
    }

    public static ModalFragment newInstance(String param1) {
        ModalFragment fragment = new ModalFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            location_string = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_modal, container, false);
        TextView tv = view.findViewById(R.id.LocTv);
        tv.setText(location_string);
        return view;
    }
}