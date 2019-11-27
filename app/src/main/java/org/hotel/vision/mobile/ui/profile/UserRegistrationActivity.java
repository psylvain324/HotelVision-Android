package org.hotel.vision.mobile.ui.profile;

import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import org.hotel.vision.mobile.R;
import org.hotel.vision.mobile.ui.home.HomeViewModel;

public class UserRegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);

        ViewModel mViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
    }


}
