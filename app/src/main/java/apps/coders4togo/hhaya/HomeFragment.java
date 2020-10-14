package apps.coders4togo.hhaya;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class HomeFragment extends Fragment {
    private RecyclerView recyclerView;
    private DatabaseReference databaseReference;

    public HomeFragment() {
        // Required empty public constructor
        databaseReference = FirebaseDatabase.getInstance().getReference().child("Global");
        databaseReference.keepSynced(true);

        recyclerView = recyclerView.findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

}