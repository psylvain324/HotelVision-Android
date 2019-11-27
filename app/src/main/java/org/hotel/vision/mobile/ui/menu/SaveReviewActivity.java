package org.hotel.vision.mobile.ui.menu;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import org.hotel.vision.mobile.R;
import androidx.fragment.app.FragmentActivity;

public class SaveReviewActivity extends FragmentActivity {
    private final static String imageUrl = "";
    private final static String menuItemName = "";
    private final static String categoryPrice = "";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.save_review_activity);

        ImageView imageView = findViewById(R.id.imgMenu);
        Picasso.get().load(imageUrl).into(imageView);
        TextView txtDishName = findViewById(R.id.txtDishName);
        txtDishName.setText(menuItemName);
        TextView txtCategoryPrice = findViewById(R.id.txtDishPrice);
        txtCategoryPrice.setText(categoryPrice);
    }

}
