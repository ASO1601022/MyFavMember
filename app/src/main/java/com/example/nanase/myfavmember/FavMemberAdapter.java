package com.example.nanase.myfavmember;

import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import io.realm.OrderedRealmCollection;
import io.realm.RealmBaseAdapter;

/**
 * Created by nanase on 2017/11/10.
 */

public class FavMemberAdapter extends RealmBaseAdapter<FavMember> {

    private static class ViewHolder{
        TextView team;
        TextView leader;
    }

    public FavMemberAdapter(@Nullable OrderedRealmCollection<FavMember> data) {
        super(data);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_2, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.team = (TextView) convertView.findViewById(android.R.id.text1);
            viewHolder.leader = (TextView) convertView.findViewById(android.R.id.text2);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder)convertView.getTag();
        }

        FavMember favMember = adapterData.get(position);
        viewHolder.team.setText(favMember.getTeam());
        viewHolder.leader.setText(favMember.getLeader());
        return convertView;
    }
}
