package fragments;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.abdullah_onlineclothingshopping.DashboardActivity;
import com.abdullah_onlineclothingshopping.R;

import static android.content.Context.MODE_PRIVATE;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    EditText etUsername,etPassword;
    Button btnLogin;



    View view;
    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view= inflater.inflate(R.layout.fragment_login, container, false);

        etUsername=view.findViewById(R.id.etUsername);
        etPassword=view.findViewById(R.id.etPassword);

        btnLogin=view.findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkUser();
            }
        });

        return view;
    }

    private void checkUser(){
        SharedPreferences sharedPreferences= getContext().getSharedPreferences("User",MODE_PRIVATE);
        String username=sharedPreferences.getString("username","");
        String password=sharedPreferences.getString("password","");
        if (username.equals(etUsername.getText().toString()) &&
          password.equals(etPassword.getText().toString())){
            Toast.makeText(getContext(), "Successfully Logged In", Toast.LENGTH_SHORT).show();

            Intent intent=new Intent(getContext(), DashboardActivity.class);
            intent.putExtra("myMessage","Welcome to the DashBoard");
            startActivity(intent);
        }
        else{
            Toast.makeText(getContext(), "Either Username or password is incorrect", Toast.LENGTH_SHORT).show();
        }

    }

}
