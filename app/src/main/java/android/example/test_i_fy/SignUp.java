package android.example.test_i_fy;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.example.test_i_fy.Sql.DBHelper;

public class SignUp extends AppCompatActivity {
    EditText name , number , email,pass;
    TextView login;
    DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        name=findViewById(R.id.textName);
        number=findViewById(R.id.textNumber);
        email=findViewById(R.id.textEmail);
        pass=findViewById(R.id.textPass);
        Button signUpAcc = findViewById(R.id.btnSignUpAcc);
        dbHelper = new DBHelper(this);
        signUpAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name1 = name.getText().toString();
                String number1 = number.getText().toString();
                String email1 = email.getText().toString();
                String pass1 = pass.getText().toString();
                boolean b =dbHelper.insetUserData(name1,number1,email1,pass1);
                if (b){
                    Toast.makeText(SignUp.this,"Registration successful.Please login now.",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(SignUp.this, android.example.test_i_fy.Login.class);
                    startActivity(i);
                }else {
                    Toast.makeText(SignUp.this,"Already registered. Please login with your credentials.",Toast.LENGTH_SHORT).show();
                }
            }
        });
        login=findViewById(R.id.loginAcc);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignUp.this, android.example.test_i_fy.Login.class);
                startActivity(i);
            }
        });
    }
}