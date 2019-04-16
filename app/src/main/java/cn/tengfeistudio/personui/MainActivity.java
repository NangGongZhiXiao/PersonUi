package cn.tengfeistudio.personui;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{


    ListView lvMineFunctionList;
    ImageView icon;
    TextView account,studentNumber,name;

    private static final int[] icons = new int[]{
            R.drawable.ic_favorite_white_12dp,
            R.drawable.ic_palette_black_24dp,
            R.drawable.ic_settings_24dp,
            R.drawable.ic_menu_share_24dp,
            R.drawable.ic_info_24dp,
            R.drawable.ic_autorenew_black_24dp,
            R.drawable.ic_lab_24dp,
            R.drawable.ic_autorenew_black_24dp,
    };

    private static final String[] titles = new String[]{
            "账号管理",
            "支付管理",
            "我的闲置",
            "我的资料",
            "我的问题",
            "我的快递",
            "切换账号",
            "退出",
    };

    List<Map<String, Object>> getMenuList() {
        List<Map<String, Object>> list = new ArrayList<>();
        for (int i = 0; i < icons.length; i++) {
            Map<String, Object> ob = new HashMap<>();
            ob.put("icon", icons[i]);
            ob.put("title", titles[i]);
            list.add(ob);
        }
        return list;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        icon=(ImageView)findViewById(R.id.touxiang);
        name=(TextView)findViewById(R.id.name);
        account=(TextView)findViewById(R.id.account);
        studentNumber=(TextView)findViewById(R.id.student_number);


        lvMineFunctionList=(ListView)findViewById(R.id.lv_mine_function_list);
        lvMineFunctionList.setAdapter(new SimpleAdapter(this, getMenuList(),
                R.layout.item_function, new String[]{"icon", "title"},
                new int[]{R.id.icon, R.id.title}));
        lvMineFunctionList.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        switch (position) {
            case 0:
                Toast.makeText(this, "账号管理" , Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(this, "支付管理" , Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "我的闲置" , Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this, "我的资料" , Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(this, "我的问题" , Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(this, "我的快递" , Toast.LENGTH_SHORT).show();
                break;
            case 6:
                Toast.makeText(this, "切换账号" , Toast.LENGTH_SHORT).show();
                break;
            case 7:
                Toast.makeText(this, "退出" , Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
