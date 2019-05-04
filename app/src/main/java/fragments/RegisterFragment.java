package fragments;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.abdullah_onlineclothingshopping.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment {

    EditText etUsername,etPassword,etCpassword;
    Button btnRegister;


    View view;
    public RegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_register, container, false);

        etUsername=view.findViewById(R.id.etUsername);
        etPassword=view.findViewById(R.id.etPassword);
        etCpassword=view.findViewById(R.id.etCpassword);
        btnRegister=view.findViewById(R.id.btnRegister);


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Register();
            }
        });

       return view;

    }

    private void Register(){
        if (etPassword.getText().toString().equals(etCpassword.getText().toString())){
            SharedPreferences sharedPreferences=getContext().getSharedPreferences("User", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor=sharedPreferences.edit();

            editor.putString("username",etUsername.getText().toString());
            editor.putString("password",etPassword.getText().toString());

            editor.commit();
            Toast.makeText(getContext(),"Successfully Registered",Toast.LENGTH_LONG).show();
        }
    }

}
