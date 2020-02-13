package temple.edu.coloradapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ColorAdapter extends BaseAdapter {

    private String[] colors;

    public ColorAdapter()
    {
        super();
        colors = new String[]{"Red", "Orange", "Yellow", "Green", "Blue", "Violet"};
    }

    @Override
    public int getCount(){
        return colors.length;
    }

    @Override
    public Object getItem(int position)
    {
        return null;
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        return null;
    }
}
