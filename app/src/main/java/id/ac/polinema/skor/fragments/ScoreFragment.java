package id.ac.polinema.skor.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

<<<<<<< HEAD
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.navigation.Navigation;
=======
import androidx.fragment.app.Fragment;
>>>>>>> 2cc6dd83fc75315d1b0454ba1857fe05c308706c

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
import id.ac.polinema.skor.R;
import id.ac.polinema.skor.databinding.FragmentScoreBinding;
=======
>>>>>>> 2cc6dd83fc75315d1b0454ba1857fe05c308706c
import id.ac.polinema.skor.models.GoalScorer;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScoreFragment extends Fragment {

	public static final String HOME_REQUEST_KEY = "home";
	public static final String AWAY_REQUEST_KEY = "away";
	public static final String SCORER_KEY = "scorer";

<<<<<<< HEAD
	//var array list
=======
>>>>>>> 2cc6dd83fc75315d1b0454ba1857fe05c308706c
	private List<GoalScorer> homeGoalScorerList;
	private List<GoalScorer> awayGoalScorerList;

	public ScoreFragment() {
		// Required empty public constructor
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.homeGoalScorerList = new ArrayList<>();
		this.awayGoalScorerList = new ArrayList<>();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
<<<<<<< HEAD
		final FragmentScoreBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_score, container, false);
		binding.setHomeGoalScorerList(homeGoalScorerList);
		binding.setAwayGoalScorerList(awayGoalScorerList);
		binding.setFragment(this);

		//menampung data kembalian dari fragment
		getParentFragmentManager().setFragmentResultListener(HOME_REQUEST_KEY, this, new FragmentResultListener() {
			@Override
			public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
				//Menambahkan data ke homeGoalScorerList yang dikirim dari fragment
				GoalScorer goalScorer = result.getParcelable(SCORER_KEY);
				homeGoalScorerList.add(goalScorer);
			}
		});

		getParentFragmentManager().setFragmentResultListener(AWAY_REQUEST_KEY, this, new FragmentResultListener() {
			@Override
			public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
				//Menambahkan data ke awayGoalScorerList yang dikirim dari fragment
				GoalScorer goalScorer = result.getParcelable(SCORER_KEY);
				awayGoalScorerList.add(goalScorer);
			}
		});
		return binding.getRoot();
	}

	public void onAddHomeClick(View view) {
		ScoreFragmentDirections.GoalScorerAction action = ScoreFragmentDirections.goalScorerAction(HOME_REQUEST_KEY);
		Navigation.findNavController(view).navigate(action);
	}

	public void onAddAwayClick(View view) {
		ScoreFragmentDirections.GoalScorerAction action = ScoreFragmentDirections.goalScorerAction(AWAY_REQUEST_KEY);
		Navigation.findNavController(view).navigate(action);

	}

	public String getHomeScorer() {
		StringBuilder result = new StringBuilder();
		for (GoalScorer g : homeGoalScorerList) {
			result.append(g.getName())
					.append(" ")
					.append(g.getMinute())
					.append("\" ");
		}
		return result.toString();
	}

	public String getAwayScorer() {
		StringBuilder result = new StringBuilder();
		for (GoalScorer g : awayGoalScorerList) {
			result.append(g.getName())
					.append(" ")
					.append(g.getMinute())
					.append("\" ");
		}
		return result.toString();
	}
=======
		return null;
	}

	public void onAddHomeClick(View view) {

	}

	public void onAddAwayClick(View view) {

	}

>>>>>>> 2cc6dd83fc75315d1b0454ba1857fe05c308706c
}