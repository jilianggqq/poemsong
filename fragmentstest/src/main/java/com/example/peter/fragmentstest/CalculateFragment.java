package com.example.peter.fragmentstest;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import peter.itu.util.DensityUtils;
import peter.itu.util.ScreenUtils;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CalculateFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CalculateFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CalculateFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String Tag = "CalculateFragment";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    //    private OnFragmentInteractionListener mListener;
    TextView tvWH;
    TextView tvtvDpi;
    TextView tvWHdp;
    TextView tvRatio;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CalculateFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CalculateFragment newInstance(String param1, String param2) {
        CalculateFragment fragment = new CalculateFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public CalculateFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calculate, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tvWH = (TextView) getActivity().findViewById(R.id.tvWH);
        tvtvDpi = (TextView) getActivity().findViewById(R.id.tvDpi);
        tvWHdp = (TextView) getActivity().findViewById(R.id.tvWHdp);
        float[] wh = ScreenUtils.getWH(getActivity());
        tvWH.setText(String.format("%f * %f", wh[0], wh[1]));
//        tvtvDpi.setText();
        //dpi
        float dpi = DensityUtils.getDpi(getActivity());
        tvtvDpi.setText(String.valueOf(dpi));

        //ratio
        float ratio = DensityUtils.getRatio(getActivity());
        tvRatio = (TextView) getActivity().findViewById(R.id.tvRatio);
        tvRatio.setText(String.valueOf(ratio));
        //wh with dp
        float wDp = wh[0] / ratio;
        float hDp = wh[1] / ratio;
        tvWHdp.setText(String.format("%f * %f", wDp, hDp));

        Log.i(Tag, String.valueOf(ScreenUtils.getStatusHeight(getActivity())));
        Log.i(Tag, String.valueOf(ScreenUtils.getScreenHeight(getActivity())));
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
//        try {
//            mListener = (OnFragmentInteractionListener) activity;
//        } catch (ClassCastException e) {
//            throw new ClassCastException(activity.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
//        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}
