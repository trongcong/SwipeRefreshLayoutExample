package ntc.dev4u.com.swiperefreshlayoutexample;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {

    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mSrlLayout;
    private RecyclerViewAdapter mRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mSrlLayout = (SwipeRefreshLayout) findViewById(R.id.srlLayout);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        setupAdapter();

        mSrlLayout.setColorSchemeResources(R.color.orange, R.color.green, R.color.blue);
        mSrlLayout.setOnRefreshListener(this);
    }

    @Override
    public void onRefresh() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                setupAdapter();
                mSrlLayout.setRefreshing(false);
            }
        }, 2500);
    }

    private void setupAdapter() {
        mRecyclerViewAdapter = new RecyclerViewAdapter(this);
        mRecyclerView.setAdapter(mRecyclerViewAdapter);
    }
}
