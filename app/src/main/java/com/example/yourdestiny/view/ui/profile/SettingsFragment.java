package com.example.yourdestiny.view.ui.profile;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.yourdestiny.R;
import com.example.yourdestiny.view.MainActivity;

import java.util.Objects;


public class SettingsFragment extends Fragment {

    ImageView back, logout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_settings, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SettingsViewModel settingsViewModel = new SettingsViewModel(getActivity().getApplicationContext());
        back = getView().findViewById(R.id.imageView43);
        logout = getView().findViewById(R.id.imageView37);
        TextView name_id = getView().findViewById(R.id.textView50);
        name_id.setText(settingsViewModel.getName());
        TextView mail_id = getView().findViewById(R.id.textView60);
        mail_id.setText(settingsViewModel.getMail());
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_navigation_settings_to_navigation_profile);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                settingsViewModel.deleteProfile();
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        EditText change_name = getView().findViewById(R.id.editTextTextPersonName7);
        Button change_name_b = getView().findViewById(R.id.button8);
        change_name_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name_ = change_name.getText().toString();
                if(TextUtils.isEmpty(name_)){
                    Toast.makeText(getActivity(), "Введите новое имя", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(Objects.equals(settingsViewModel.getName(), name_)){
                    Toast.makeText(getActivity(), "У вас данный никнейм", Toast.LENGTH_SHORT).show();
                    return;
                }
                settingsViewModel.repository.setName_p(name_);
                settingsViewModel.changeName(name_);
                name_id.setText(settingsViewModel.getName());
                change_name.setText("");
            }
        });

        EditText change_mail = getView().findViewById(R.id.editTextTextPersonName8);
        Button change_mail_b = getView().findViewById(R.id.button12);
        change_mail_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail_ = change_mail.getText().toString();
                Log.d("MEOWWW", mail_);
                if(TextUtils.isEmpty(mail_)){
                    Toast.makeText(getActivity(), "Введите новую почту", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(Objects.equals(settingsViewModel.getMail(), mail_)){
                    Toast.makeText(getActivity(), "У вас эта почта", Toast.LENGTH_SHORT).show();
                    return;
                }

                settingsViewModel.repository.setMail_p(mail_);
                int result = settingsViewModel.changeMail(mail_);
                System.out.println(result);
                if(result == 0) {
                    mail_id.setText(settingsViewModel.getMail());
                }
                else{
                    settingsViewModel.repository.setMail_p(String.valueOf(mail_id));
                }
                change_mail.setText("");
            }
        });

        EditText change_pass = getView().findViewById(R.id.editTextTextPersonName11);
        Button change_pass_b = getView().findViewById(R.id.button13);
        change_pass_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pass_ = change_pass.getText().toString();
                if(TextUtils.isEmpty(pass_)){
                    Toast.makeText(getActivity(), "Введите новый пароль", Toast.LENGTH_SHORT).show();
                    return;
                }
                settingsViewModel.changePass(pass_);
                settingsViewModel.changePass(pass_);
                change_pass.setText("");
            }
        });
    }
}