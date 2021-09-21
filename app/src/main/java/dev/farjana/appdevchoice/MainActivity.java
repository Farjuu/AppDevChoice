package dev.farjana.appdevchoice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Item> itemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        additem();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(itemList,this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(recyclerAdapter);
    }

    private void additem() {
        itemList =  new ArrayList<>();
        itemList.add(new Item(R.mipmap.android_robot_head,"Android Developers","https://developer.android.com/guide/"));
        itemList.add(new Item(R.mipmap.colortools,"Color Tools", "https://material.io/resources/color/#!/?view.left=1&view.right=0"));

        itemList.add(new Item(R.mipmap.stack_overfolw,"Stack OverFlow","https://stackoverflow.com/"));
        itemList.add(new Item(R.drawable.ic_index_logo,"Vogella","https://www.vogella.com/tutorials/android.html"));
        itemList.add(new Item(R.mipmap.ray_transparent,"RayWenderlich","https://www.raywenderlich.com/"));
        itemList.add(new Item(R.mipmap.javacode_transparent,"JavaCodeGeeks","https://www.javacodegeeks.com/android-tutorials"));
        itemList.add(new Item(R.drawable.ic_azure_devops_server,"Azure DevOps Server","https://azure.microsoft.com/en-us/services/devops/server/"));
        itemList.add(new Item(R.drawable.ic_aws_code,"Aws CodeCommit","https://aws.amazon.com/codecommit/"));
        itemList.add(new Item(R.drawable.ic_gitlab,"GitLab","https://about.gitlab.com/"));

        itemList.add(new Item(R.mipmap.git_transparent_circle,"Github","https://github.com/"));
        itemList.add(new Item(R.mipmap.upworkl_transparent,"Upwork","https://upwork.com/"));
        itemList.add(new Item(R.mipmap.fiverr_transparent_circle,"Fiverr","https://fiverr.com/"));
        itemList.add(new Item(R.mipmap.freelancer_transparent,"FREELANCER ","https://www.freelancer.com/signup"));
        itemList.add(new Item(R.mipmap.android_transparent,"Android Central","https://www.androidcentral.com/"));
        itemList.add(new Item(R.mipmap.app_dev_magazine,"App Developer Magazine","https://appdevelopermagazine.com/Android"));


    }
}