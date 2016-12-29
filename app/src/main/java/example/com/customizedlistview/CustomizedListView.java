package example.com.customizedlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by BloodyFire on 29.12.2016.
 */

public class CustomizedListView extends BaseAdapter {

    Context context;
    LayoutInflater layoutInflater;
    ArrayList<Product> products;


    public CustomizedListView(Context context, ArrayList<Product> products) {
        this.context = context;
        this.layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        this.products = new ArrayList<>(products);
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int position) {
        return products.get(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        view = layoutInflater.inflate(R.layout.customized_list_view, null);

        TextView protein = (TextView) view.findViewById(R.id.textView6);
        TextView carbo = (TextView) view.findViewById(R.id.textView7);
        TextView fat = (TextView) view.findViewById(R.id.textView8);
        TextView calories = (TextView) view.findViewById(R.id.textView5);

        protein.setText(String.valueOf(products.get(position).getProtein()));
        carbo.setText(String.valueOf(products.get(position).getCarbo()));
        fat.setText(String.valueOf(products.get(position).getFat()));
        calories.setText(String.valueOf(products.get(position).getCalories()));

        return view;
    }
}
