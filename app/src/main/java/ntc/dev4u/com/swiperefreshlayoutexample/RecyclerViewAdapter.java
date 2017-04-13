package ntc.dev4u.com.swiperefreshlayoutexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * IDE: Android Studio
 * Created by Nguyen Trong Cong  - 2DEV4U.COM
 * Name packge: ntc.dev4u.com.swiperefreshlayoutexample
 * Name project: SwipeRefreshLayoutExample
 * Date: 4/13/2017
 * Time: 20:43
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    List<String> mCatNames;
    private Context mContext;

    public RecyclerViewAdapter(Context context) {
        mContext = context;
        randomizeCatNames();
    }

    public void randomizeCatNames() {
        mCatNames = Arrays.asList(getCatNamesResource());
        Collections.shuffle(mCatNames);
    }

    private String[] getCatNamesResource() {
        return mContext.getResources().getStringArray(R.array.cat_names);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflatedView = LayoutInflater.from(mContext).inflate(R.layout.cat_name_item, viewGroup, false);
        return new ViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        String catName = getItem(i);
        viewHolder.mCatNameTextView.setText(catName);
    }

    public String getItem(int position) {
        return mCatNames.get(position);
    }

    @Override
    public int getItemCount() {
        return mCatNames.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mCatNameTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            mCatNameTextView = (TextView) itemView.findViewById(R.id.tvCatName);
        }
    }
}
