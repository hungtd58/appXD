package trhung1710.appxd.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import trhung1710.appxd.R;
import trhung1710.appxd.model.Node;

/**
 * Created by hungl on 07-03-2017.
 */

public class NodeAdapter extends RecyclerView.Adapter<NodeAdapter.NodeViewHolder> {

    Context context;
    ArrayList<Node> mListNode;
    LayoutInflater layoutInflater;

    public NodeAdapter(Context context, ArrayList<Node> mListNode) {
        this.context = context;
        this.mListNode = mListNode;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public NodeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = layoutInflater.inflate(R.layout.node_item, parent, false);
        return new NodeViewHolder(item);
    }

    @Override
    public void onBindViewHolder(NodeViewHolder holder, int position) {
        Node node = mListNode.get(position);
        holder.name.setText(node.name);

        if (position % 2 == 1) {
            holder.avatar.setImageResource(R.drawable.avatar1);
        }else {
            holder.avatar.setImageResource(R.drawable.avatar2);
        }
    }

    @Override
    public int getItemCount() {
        return mListNode.size();
    }

    class NodeViewHolder extends RecyclerView.ViewHolder {
        ImageView avatar;
        TextView name;

        public NodeViewHolder(View itemView) {
            super(itemView);
            avatar = (ImageView) itemView.findViewById(R.id.avatar);
            name = (TextView) itemView.findViewById(R.id.name);
        }
    }
}
