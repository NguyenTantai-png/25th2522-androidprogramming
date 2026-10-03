package till.edu.congdongian;

import android.widget.editText;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // gắn layout cho file name này
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // đây là bộ lắng nghe và sử lý sự kiện click lên nút tính tổng

        public void XuLyCong(View view) {
            // tìm ,tham chiếu đến điều khiển trên tệp XML, mapping sang java
             editText   editTextSoA = findViewById(R.id.edtA)
             editText   editTextSoB = findViewById(R.id.edtB)
             editText   editTextKetqua = findViewById(R.id.editKQ)
        }

    }
}