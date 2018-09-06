package societyu.kyle.com.societyu_signinpages_redesigned_942018;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment_Two extends Fragment {
    private String Header;
    private String SubHeader;


    @Override
    public void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
    }

    public static fragment_Two newInstance() {
        fragment_Two fragment = new fragment_Two();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle SavedInstanceState){
        View view = inflater.inflate(R.layout.activity_fragment__two, container, false);
        return view;
    }
}
