package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity implements itemAdapter.OnNodeListener{
    RecyclerView recycleuudai05, recyclecapnhat05,recycle_lover05;
    itemAdapter itemAdapter05;
    LinearLayout delivery05,tichdiem05,coupon05;
    Button button05;
    ImageView thongbao05;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recycleuudai05=findViewById(R.id.recycle_uudai);
        recycle_lover05=findViewById(R.id.recycle_lover);
        recyclecapnhat05=findViewById(R.id.recycle_capnhat);
        tichdiem05=findViewById(R.id.tichdiem);
        coupon05=findViewById(R.id.coupon);
        coupon05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cp=new Intent(Home.this, coupon.class);
                startActivity(cp);
            }
        });
        tichdiem05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent td=new Intent(Home.this, tichdiem.class);
                startActivity(td);
            }
        });
        thongbao05=findViewById(R.id.thongbao);
        thongbao05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tb=new Intent(Home.this, thongbao.class);
                startActivity(tb);
            }
        });
        delivery05= findViewById(R.id.delivery);
        delivery05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Home.this,orderScreen.class);
                startActivity(intent2);
            }
        });
        button05 =findViewById(R.id.button);
        button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,Login_activity.class);
                startActivity(intent);
            }
        });
        List<item> uudailist = new ArrayList<>();
        uudailist.add(new item("The Coffee House đồng hành cùng bạn \"Go Green\"!","Tại The Coffee House, hành trình \"Go Green\" được lan toả mỗi ngày bằng những hành động thiết thực mang tính cộng đồng. Chúng tôi mong muốn truyền cảm hứng đến thật nhiều bạn trẻ, từ đó cùng nhau hành động để thay đổi và bảo vệ môi trường xanh quanh mình.\n" +
                "\n" +
                "Bằng việc sử dụng bình-ly giữ nhiệt, ly sứ, quai vải,... để thay thế cho ly nhựa, túi nilông đã góp phần giảm thiểu nhựa khó phân huỷ, nhựa dùng một lần, đóng góp tích cực cho việc bảo vệ môi trường.\n" +
                "Để bạn luôn cảm thấy tươi mới, The Coffee House không ngừng sáng tạo và mang đến cho bạn những “người bạn xanh”  vừa thân thiện với môi trường, vừa có \"ngoại hình\" xinh xắn, trẻ trung. Hãy cùng khám phá và chọn cho mình một \"người bạn xanh\" nhé!","Order ngay",R.drawable.item_1));
        uudailist.add(new item("Top 10 cửa hàng The Coffee House bạn nên trải nghiệm tại Hà Nội","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Order ngay",R.drawable.item_2));
        uudailist.add(new item("The Coffee House đồng hành cùng bạn \"Go Green\"!","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Order ngay",R.drawable.item_3));
        uudailist.add(new item("Top 10 cửa hàng The Coffee House bạn nên trải nghiệm tại Hà Nội","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Order ngay",R.drawable.item_4));
        uudailist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Order ngay",R.drawable.item_5));

        List<item> capnhatlist = new ArrayList<>();
        capnhatlist.add(new item("KHÔNG GIAN THE COFFEE HOUSE MỚI: HIỆN ĐẠI, SANG TRỌNG VÀ ẤM ÁP","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.item_1));
        capnhatlist.add(new item("CÂU CHUYỆN SƠ RI THE COFFEE HOUSE \"100% TỰ NHIÊN - TƯƠI NGON MÁT LẠNH\"","Chẳng phải tự nhiên The Coffee House chọn Sơ ri Gò Công - Tiền Giang chứ không phải Sơ ri ở những vùng đất khác để tạo nên bộ đôi Trà Sơ ri Thanh long & Yakult Sơ ri Thanh long trứ danh. Vậy lý do tại sao?\n" +
                "\n" +
                "Câu chuyện về Sơ ri\n" +
                "\n" +
                "Sơ ri là loại trái cây quen thuộc với người Việt. Việc thưởng thức hương vị chua ngọt của loại quả này là sở thích của nhiều người. Vậy nhưng quả Sơ ri - nông sản Việt 100% thường bị nhầm thành trái Cherry nhập khẩu. Sơ ri Gò Công - Tiền Giang\n" +
                "\n" +
                "Quả Sơ ri được trồng nhiều ở Nam Bộ, đặc biệt ở Gò Công - Tiền Giang. Thổ nhưỡng ở vùng đất Gò Công được cho là phù hợp với quả Sơ ri nhất. Những quả Sơ ri được trồng tại vùng đất này có da căng bóng, thịt chắc và vị chua ngọt tự nhiên. Theo USDA (United States Department of Agriculture) - Bộ Nông nghiệp Hoa Kỳ, nhu cầu vitamin C trong một ngày của một người trưởng thành khoảng 50mg, như vậy mỗi ngày một người chỉ cần ăn 4 quả sơ ri chua hoặc 5 quả sơ ri ngọt là có dư nhu cầu vitamin C cho cơ thể.","Chi tiết",R.drawable.item_2));
        capnhatlist.add(new item("CHƯƠNG TRÌNH KHÁCH HÀNG THÂN THIẾT: BẠN CÓ THÊM 3 THÁNG ĐỔI BEAN NHẬN ƯU ĐÃI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.item_3));
        capnhatlist.add(new item("BỘ ĐÔI \"CRUSH QUỐC DÂN\" TRỞ LẠI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.item_4));
        capnhatlist.add(new item("ĐÊM HỘI PHÁ CỖ: NHÀ KỂ CHUYỆN TRĂNG","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.item_5));

        List<item>  loverlist = new ArrayList<>();
        loverlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","ƯU ĐÃI ĐẶC QUYỀN\n" +
                "\n" +
                "Nỗ lực mang đến trải nghiệm tốt nhất cho khách hàng, The Coffee House Rewards liên tục cập nhật ưu đãi để khách hàng có thể thoải mái sử dụng BEAN đổi lấy trải nghiệm mới mẻ.\n" +
                "\n" +
                "Từ những hạt BEAN tích luỹ, giờ đây khách hàng có thêm nhiều lựa chọn quy đổi để sử dụng các dịch vụ giải trí, mua sắm, ăn uống từ những đối tác hàng đầu trên thị trường của The Coffee House Rewards:\n" +
                "\n" +
                "- Ăn uống: San Fu Lou, Gogi House, Kichi Kichi, Sumo BBQ\n" +
                "- Giải trí: CGV, My Kingdom, Kiz Citi, Citigym\n" +
                "- Mua sắm: Tiki, Marc, Bách Hoá Xanh, Circle-K, Family Mart, Klever Fruit, Viettel, Vinafone, Mobifone\n" +
                "- Đặc quyền: thưởng thức thức uống mới, thức uống best-seller tại The Coffee House \n" +
                "\n" +
                "\n" +
                "GIA HẠN THỜI GIAN ĐỔI BEAN\n" +
                "\n" +
                "The Coffee House hiểu rằng chúng ta đã trải qua một khoảng thời gian biến động vì COVID-19. Việc này có thể ảnh hưởng trực tiếp đến thói quen sử dụng dịch vụ, hoạt động chi tiêu của khách hàng.\n" +
                "\n" +
                "Để đảm bảo quyền lợi và trải nghiệm tốt nhất cho khách hàng, The Coffee House quyết định gia hạn thời gian đổi BEAN kéo dài thêm 3 tháng. Điều này có nghĩa là, số BEAN khách hàng tích luỹ sẽ được dùng đến ngày 31/12/2020.","Chi tiết",R.drawable.item_1));
        loverlist.add(new item("TASTE OF XMAS - CHẠM VỊ GIÁNG SINH","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.item_2));
        loverlist.add(new item("GÓI TIẾT KIỆM DÀNH CHO NGƯỜI YÊU TRÀ VÀ CÀ PHÊ - TIẾT KIỆM ĐẾN 160K","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.item_3));
        loverlist.add(new item("KHÁM PHÁ \"CUỘC PHIÊU LƯU\" BÊN TRONG HỘP BÁNH TRUNG THU THE COFFEE HOUSE","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.item_4));
        loverlist.add(new item("THỬ VỊ TRUNG THU CÙNG BỘ SƯU TẬP \"TRĂNG NHÀ SUNG TÚC\"","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.item_5));

        setRecycle_uudai(uudailist);
        setRecyclecapnhat(capnhatlist);
        setRecycle_lover(loverlist);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.news);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.news:
//                        startActivity(new Intent(getApplicationContext(),Home.class));
//                        overridePendingTransition(0,0);
                        return true;
                    case R.id.delivery:
                        startActivity(new Intent(getApplicationContext(),orderScreen.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.store:
                        startActivity(new Intent(getApplicationContext(),store_screen.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.account:
                        startActivity(new Intent(getApplicationContext(), account_screen.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

    }
    public void setRecycle_uudai(List<item> itemList ){
        recycleuudai05=findViewById(R.id.recycle_uudai);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        recycleuudai05.setLayoutManager(layoutManager);
        itemAdapter05 = new itemAdapter(this,itemList);
        recycleuudai05.setAdapter(itemAdapter05);
    }
    public void setRecyclecapnhat(List<item> itemList ){
        recyclecapnhat05=findViewById(R.id.recycle_capnhat);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        recyclecapnhat05.setLayoutManager(layoutManager);
        itemAdapter05 = new itemAdapter(this,itemList);
        recyclecapnhat05.setAdapter(itemAdapter05);
    }
    public void setRecycle_lover(List<item> itemList ){
        recycle_lover05=findViewById(R.id.recycle_lover);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        recycle_lover05.setLayoutManager(layoutManager);
        itemAdapter05 = new itemAdapter(this,itemList);
        recycle_lover05.setAdapter(itemAdapter05);
    }

    @Override
    public void onNodeClick(int position) {
    }
}