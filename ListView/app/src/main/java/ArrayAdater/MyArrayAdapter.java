package ArrayAdater;

import java.util.ArrayList;
import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.hoangquoc.listview.R;

import model.Job;

/**
 * Created by Hoang Quyen on 9/27/2016.
 */
public class MyArrayAdapter extends ArrayAdapter<Job> {
    Activity context=null;
    ArrayList<Job> myArray=null;
    int layout;
    public MyArrayAdapter(Activity  context, int layout, ArrayList<Job> myArray) {
        super(context, layout, myArray);
        this.context=context;
        this.layout=layout;
        this.myArray=myArray;
    }

    public View getView(int position, View convertView,
                        ViewGroup parent) {

        LayoutInflater inflater= context.getLayoutInflater();
        convertView=inflater.inflate(layout, null);

        if(myArray.size()>0 && position>=0)
        {

            final TextView txtdisplay=(TextView) convertView.findViewById(R.id.txtitem);

            final Job job =myArray.get(position);

            txtdisplay.setText(job.toString());

        }

        return convertView;
    }
}

