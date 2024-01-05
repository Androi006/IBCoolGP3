package com.example.ibcool.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.ibcool.Model.DayInWeek;
import com.example.ibcool.R;

import java.util.ArrayList;
import java.util.List;

public class adt_rv_cardview extends RecyclerView.Adapter<adt_rv_cardview.ViewHolder> {
    List<DayInWeek> lst;
    public adt_rv_cardview(){
        lst = new ArrayList<DayInWeek>();
        DayInWeek d=new DayInWeek();
        d.setNameInLao("Mobile Transaction");
        d.setNameInEng("Qr Pay SmartVAT. 1234568 | 213456897SAMFLD");
        d.setDayColor(R.drawable.ins);
        lst.add(d);
        d=new DayInWeek();
        d.setNameInLao("Mobile Transaction");
        d.setNameInEng("Qr Pay SmartVAT. 1234568 | 213456897SAMFLD");
        d.setDayColor(R.drawable.ins);
        lst.add(d);
        d=new DayInWeek();
        d.setNameInLao("Mobile Transaction");
        d.setNameInEng("Qr Pay SmartVAT. 1234568 | 213456897SAMFLD");
        d.setDayColor(R.drawable.outs);
        lst.add(d);
        d=new DayInWeek();
        d.setNameInLao("Mobile Transaction");
        d.setNameInEng("Qr Pay SmartVAT. 1234568 | 213456897SAMFLD");
        d.setDayColor(R.drawable.ins);
        lst.add(d);
        d=new DayInWeek();
        d.setNameInLao("Mobile Transaction");
        d.setNameInEng("Qr Pay SmartVAT. 1234568 | 213456897SAMFLD");
        d.setDayColor(R.drawable.outs);
        lst.add(d);
        d=new DayInWeek();
        d.setNameInLao("Mobile Transaction");
        d.setNameInEng("Qr Pay SmartVAT. 1234568 | 213456897SAMFLD");
        d.setDayColor(R.drawable.outs);
        lst.add(d);
        d=new DayInWeek();
        d.setNameInLao("Mobile Transaction");
        d.setNameInEng("Qr Pay SmartVAT. 1234568 | 213456897SAMFLD");
        d.setDayColor(R.drawable.ins);
        lst.add(d);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv_item,
                viewGroup,false);
        ViewHolder viewHolder=new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder( ViewHolder viewHolder, int i) {
        DayInWeek d= lst.get(i);
        viewHolder.img.setImageResource(d.getDayColor());
        viewHolder.txtLao.setText(d.getNameInLao());
        viewHolder.txtEng.setText(d.getNameInEng());

    }

    @Override
    public int getItemCount() {
        return lst.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView img;
        public TextView txtLao;
        public TextView txtEng;
        public ViewHolder( View v) {
            super(v);
            img=(ImageView) v.findViewById(R.id.img);
            txtLao=(TextView) v.findViewById(R.id.txtLao);
            txtEng=(TextView) v.findViewById(R.id.txtEng);
        }
    }
}
