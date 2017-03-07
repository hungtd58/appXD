package trhung1710.appxd.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import trhung1710.appxd.R;
import trhung1710.appxd.adapter.NodeAdapter;
import trhung1710.appxd.model.Node;

public class MainActivity extends AppCompatActivity {

    ArrayList<Node> mListNode;
    NodeAdapter nodeAdapter;
    RecyclerView mRecyclerViewNode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerViewNode = (RecyclerView) findViewById(R.id.list_node);

        LinearLayoutManager nodeManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        mRecyclerViewNode.setLayoutManager(nodeManager);

        mListNode = new ArrayList<>();
        mListNode.add(new Node("Hung"));
        nodeAdapter = new NodeAdapter(MainActivity.this, mListNode);

        mRecyclerViewNode.setAdapter(nodeAdapter);
    }
}
